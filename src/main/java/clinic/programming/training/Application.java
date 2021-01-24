package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;

// External Dependencies
import org.apache.commons.lang3.StringUtils;

public class Application{
	public Application(){
		System.out.println("Inside Application");
	}
	
	// method main(): ALWAYS the APPLICATION entry point
	public static void main(String[] args){
		System.out.println("Starting Application");
		Application app = new Application();
		
		app.greet();
		
		int count = app.countWords("I Have Four Words");
		System.out.println("Word Count : " + count);
		
	}
	
	// custom Method - greet
	public void greet(){
		List<String> greetings = new ArrayList<>();
		greetings.add("Hello");
		
		for(String greeting: greetings){
			System.out.println("Greeting " + greeting);
		}
	}
	
	// custom method - countWords
	public int countWords(String words){
		String[] separateWords = StringUtils.split(words, ' ');
		return (separateWords == null) ? 0 : separateWords.length;
	}
	
}