package patterns.delegate;

public class JMSBusinessService implements BusinessService {

	@Override
	public void doProcessing() {
		System.out.println("JMS :: Doing processing...");
	}

}
