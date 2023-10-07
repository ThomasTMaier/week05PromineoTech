package week05CodingProject;


public class App {

	public static void main(String[] args) {
		String word = "hello";
		// TODO Auto-generated method stub
		AsteriskLogger asteriskLogger = new AsteriskLogger();
		SpacedLogger spacedLogger = new SpacedLogger();
		
		
		
		asteriskLogger.log(word);
		asteriskLogger.error(word);
		spacedLogger.log(word);
		SpacedLogger.error(word);
	}

}
