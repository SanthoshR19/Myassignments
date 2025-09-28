package Week3.Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
public class EditLead {
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");  //Enter the Username as "DemoSalesManager" and the Password as "crmsfa".
		driver.findElement(By.id("password")).sendKeys("crmsfa");      //Enter the Password as "crmsfa".
		driver.findElement(By.className("decorativeSubmit")).click();    // Click on the Login Button.
		driver.findElement(By.linkText("CRM/SFA")).click();  // Click on the CRM/SFA Link.
		driver.findElement(By.linkText("Leads")).click();     //Click on the Leads Button.
		driver.findElement(By.linkText("Create Lead")).click();   //Click on Create Lead
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Freshers Inc");   //Enter the CompanyName Field Using Xpath		  
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Santhosh"); //Enter the FirstName Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("R");   //Enter the LastName Field Using Xpath
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Santy");   //Enter the FirstName (Local) Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Computer Science");   //Enter the Department Field Using any Locator of Your Choice.
		driver.findElement(By.id("createLeadForm_description")).sendKeys("To Create a lead");    //Enter the Description Field Using any Locator of your choice.
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("santhoshr@gmail.com"); //Enter your email in the E-mail address Field using the locator of your choice.
		WebElement StateDropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")); //Select State/Province as NewYork Using Visible Text.
		Select StateOptions = new Select(StateDropdown) ;
		StateOptions.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();   //Click on the Create Button.
		driver.findElement(By.linkText("Edit")).click();     // Click on the edit button.
		driver.findElement(By.id("updateLeadForm_description")).clear();  //Clear the Description Field.
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("To Create a lead");   //Fill the Important Note Field with Any text. 
		driver.findElement(By.xpath("//input[@value='Update']")).click();   //Click on the update button. 			
		String TitleofPage = driver.getTitle();  //Get the Title of the Resulting Page. 
		System.out.println(TitleofPage);
		driver.close();   //Close the browser window.		
	}

}
