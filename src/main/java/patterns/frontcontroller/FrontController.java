package patterns.frontcontroller;

public class FrontController {

    Dispatcher dispatcher;

    public FrontController() {
        dispatcher = new Dispatcher();
    }

    private boolean isAuthenticatedUser() {
        System.out.println("User is authenticated sucessifully.");
        return true;
    }

    private void trackRequest(String request) {
        System.out.println("Page requested: " + request);
    }

    public void dispatchRequest(String request) {
        // Logging every request
        trackRequest(request);
        // Authenticating
        if (isAuthenticatedUser()) {
            dispatcher.dispatch(request);
        }
    }

}
