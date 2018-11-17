package clinic.programming.training;

import java.util.ArrayList;

public class Application {
    
    public Application() {
		ArrayList<String> aa = new ArrayList<>();
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	Application app = new Application();
    }
}