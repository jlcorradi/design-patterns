package patterns.delegate;

public class BusinessLookup {

	BusinessService getBusinessService(String serviceType) {
		if (serviceType.equalsIgnoreCase(BusinessDelegate.EJB)) {
			return new EJBBusinessService();
		} else {
			return new JMSBusinessService();
		}
	}

}
