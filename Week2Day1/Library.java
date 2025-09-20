package Week2Day1;

public class Library {

	public String addBook (String bookTitle) //Define a method addBook(String bookTitle)
	{
		System.out.println("Book added successfully");
		return bookTitle;         //return the bookTitle
	}
	
	public void issueBook()    //Define a method issueBook()
	{
		
		System.out.println("Book issued successfully");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Library newObject = new Library();   // Create an object
		newObject.addBook("Harry Potter");  //Call both methods using the object.
		newObject.issueBook();              //Call both methods using the object.
	}

}
