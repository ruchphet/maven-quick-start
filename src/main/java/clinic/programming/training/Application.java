package clinic.programming.training;

import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;

public class Application {

	public Application() {
		ArrayList<String> aa = new ArrayList<>();
		System.out.println("Inside Application");
	}

	public static int countWords(String words) {
		String[] sepWord = StringUtils.split(words, ' ');
		return (sepWord == null) ? 0 : sepWord.length;
	}

	// method main(): ALWAYS the APPLICATION entry point
	public static void main(String[] args) {
		System.out.println("Starting Application");
		Application app = new Application();
		int count = countWords("I have four words.");
	}
}