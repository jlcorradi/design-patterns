package patterns.delegate;

public class BusinessDelegate {

	public static String EJB = "EJB";
	public static String JMS = "JMS";
	
	private BusinessLookup lookup = new BusinessLookup();
	private BusinessService service;
	private String serviceType;

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public void doTask() {
		service = lookup.getBusinessService(serviceType);
		service.doProcessing();
	}

}
