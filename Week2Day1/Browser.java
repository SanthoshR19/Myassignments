package Week2Day1;

public class Browser {

	
	public void launchBrowser(String browserName) {
		
		
		System.out.println("Browser name is "+browserName);
	}
	
	public String loadUrl() {
		
		String s = "Url loaded successfully";
		System.out.println(s);
		return s;
		
	}

	
	public static void main(String[] args) {
Browser name = new Browser();
name.launchBrowser("Chrome");
System.out.println(name.loadUrl());
	}

}
