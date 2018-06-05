package patterns.frontcontroller;

public class Dispatcher {

	private static final String STUDENT = "Student";
	private static final String HOME = "Home";
	HomeView homeView;
	StudentView studentView;

	public Dispatcher() {
		homeView = new HomeView();
		studentView = new StudentView();
	}

	public void dispatch(String request) {
		if (request.equalsIgnoreCase(HOME)) {
			homeView.show();
		} else if (request.equalsIgnoreCase(STUDENT)) {
			studentView.show();
		}
	}

}
