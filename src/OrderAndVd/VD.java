package OrderAndVd;

class VD implements Observer {
	private String name;

	public VD(String name) {
		this.name = name;
	}

	@Override
	public void update(int orderNum, String orderName) {
		System.out.printf("Order no:%d   %s.%n", orderNum, orderName); // not this.product.name error

	}

	@Override
	public String toString() {
		return "VD [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
