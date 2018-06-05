package patterns.delegate;

public class EJBBusinessService implements BusinessService {

	@Override
	public void doProcessing() {
		System.out.println("EJB :: Doing processing...");
	}

}
