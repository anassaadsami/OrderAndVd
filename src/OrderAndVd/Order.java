package OrderAndVd;

import java.util.ArrayList;
import java.util.List;
/*
 *  Order class implements Subject interface to can send notification to
 *  VD and Customer when we have a new order
 *  Order class implements Command interface to help the cooker 
 *  to prepare the order depends on order's own cooking way
 *  
 */

 abstract class Order implements Subject ,Command{
	private String orderName;
	private static int orderNum = 0;
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Order(String orderName, int id) {
		this.orderName = orderName;
		this.id = id;
		setOrderNum(orderNum);

	}
	List<Observer> observersList = new ArrayList<>();
	
	// order list to send it to chef for preparing
	List<Order> orderList = new ArrayList<>();
	
	public void addOrderList(Order order) {
		this.orderList.add(order);
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public static int getOrderNum() {
		return orderNum;
	}

	public static void setOrderNum(int orderNum) {
		Order.orderNum += 1;
	}
	 

//	public abstract void add(Observer obs);
//
//	public abstract void remove(Observer obs);
//
//	public abstract void notifyMe();

	@Override
	public void add(Observer obs) {
		this.observersList.add(obs);

	}

	@Override
	public void remove(Observer obs) {
		this.observersList.remove(obs);

	}

	@Override
	public void notifyMe() {
		for (Observer item : observersList) {
			item.update(orderNum , orderName);
		}

	}
/*
 *  the same abstract method in Command interface and every meal implements this method
 *  on it's own cooking way 
 */
	@Override
	public abstract void prepareOrder() ;  
	
		
	
	

}
