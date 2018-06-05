package patterns.nullobject;

public class NullCustomer extends AbstractCustomer {

	private static final String NOT_AVAILABLE_IN_DATABASE = "Not Available in Data Base";

	@Override
	public boolean isNill() {
		return true;
	}

	@Override
	public String getName() {
		return NOT_AVAILABLE_IN_DATABASE;
	}

}
