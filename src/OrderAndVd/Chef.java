package OrderAndVd;

import java.util.List;

public class Chef {
	Order order;

	public Chef() {

	}
	
	public void chefMakeOrder(Order order) {
		order.prepareOrder();
	}

	public void chefMakeOrderList(List<Order> orderList) {
		for (Order item : orderList) {
			item.prepareOrder();
		}
	}

}
