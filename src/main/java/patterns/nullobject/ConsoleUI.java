package patterns.nullobject;

public class ConsoleUI {

	public static void main(String[] args) {
		CustomerFactory factory = new CustomerFactory();
		AbstractCustomer customer1 = factory.getCustomer("Rob");
		AbstractCustomer customer2 = factory.getCustomer("Joe");
		AbstractCustomer customer3 = factory.getCustomer("Julie");
		AbstractCustomer customer4 = factory.getCustomer("Jorge");

		System.out.println(customer1.getName());
		System.out.println(customer2.getName());
		System.out.println(customer3.getName());
		System.out.println(customer4.getName());
	}

}
