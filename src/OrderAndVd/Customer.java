package OrderAndVd;

class Customer implements Observer {
	private String name;
//		private Product product ;   // why i need this

	public Customer(String name) {
		this.name = name;
//			this.product = new Product("Iphone-6");   // we don't need it
	}

	/*
	 * in this case the Customer have not connect with product but when Product call
	 * this update() method we access the product name in it
	 */
	@Override
	public void update(int orderNum, String orderName) {
		System.out.printf("welcome: reciept num: %d and your %s will be delivery in 15 min.%n", orderNum, orderName); // not
																														// this.product.name
																														// error

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public Order makeOrder(String orderName) {
//		Order order = new Order(orderName);
//		order.observersList.add(this);
////		order.observersList.add(vd);
//		order.notifyMe();
//		return order;
//	}

}
