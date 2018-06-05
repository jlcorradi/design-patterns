package patterns.delegate;

public class ConsoleUI {

	public static void main(String[] args) {

		BusinessDelegate delegate = new BusinessDelegate();
		delegate.setServiceType(BusinessDelegate.EJB);

		Client client = new Client(delegate);
		client.doTask();

		delegate.setServiceType(BusinessDelegate.JMS);
		client.doTask();

	}

}
