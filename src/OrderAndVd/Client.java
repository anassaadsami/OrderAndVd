package OrderAndVd;

 class Client {

	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.createCustomer("Ali");
		facade.createVD("Anas");
		Chef f1 = facade.createChep();
		Order order1 = facade.makeOrder("prinsesstårta");
		Order order2 = facade.makeOrder("kladdkaka");
		f1.chefMakeOrder(order1);
		f1.chefMakeOrder(order2);
		
		
		
		

	}

}
