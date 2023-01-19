package emailapp;

public class EmailApp {
	public static void main(String[] args) {
		Email em1 = new Email("DURGA","RANI");
		
		
		/*
		 * em1.setAlternateEmail("js@gmail.com");
		 * System.out.println("Your atlernate email is: " +em1.getAtlernateEmail());
		 */
		System.out.println(em1.showInfo());			 
	}

}
