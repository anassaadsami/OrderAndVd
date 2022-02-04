package OrderAndVd;

class Facade {
	VD vd;
	Order order;
	Customer customer;
	Chef chef;

//	public Facade(VD vd, Order order, Customer cumstomer) {
//		vd = new VD("Anas");
//		order = new Order("pizz");
//		cumstomer = new Customer("Ali");
//	}

	public Order makeOrder(String orderName) {
		Order order = null;
		if (orderName.equalsIgnoreCase("prinsesstårta")) {
			order = new Prinsesstarta(orderName, 1111);
		} else if (orderName.equalsIgnoreCase("kladdkaka")) {
			order = new Kladdkaka(orderName, 2222);
		} else
			System.out.printf("sorry we dont have this %s.%n", orderName);

		order.observersList.add(customer);
		order.observersList.add(vd);
		order.notifyMe();
		return order;
	}

	public Customer createCustomer(String name) {
		customer = new Customer(name);
		return customer;
	}

	public VD createVD(String name) {
		vd = new VD(name);
		return vd;
	}

	public Chef createChep() {
		chef = new Chef();
		return chef;
	}

}
