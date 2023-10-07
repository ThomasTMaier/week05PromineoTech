package week05CodingProject;

public class SpacedLogger implements Logger {
	
	public  void log(String a) {
		for(int i = 0; i<a.length(); i++) {
			System.out.print(a.charAt(i));
			System.out.print(" ");
		}
		System.out.println(" ");
	}
	public static void error(String a) {
		System.out.print("ERROR: ");
		for(int i = 0; i<a.length(); i++) {
			System.out.print(a.charAt(i));
			System.out.print(" ");
		}
	}
}
