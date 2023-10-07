package week05CodingProject;

public class AsteriskLogger implements Logger {
	
	public void log(String a) {
	System.out.println("***" + a + "***");
	}
		
	
	public void error(String a) {
		System.out.println("******************");
		System.out.println("***ERROR: "+a+ "***");
		System.out.println("******************");
	}
	
}
