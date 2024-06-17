package BookLibrary;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] arr=new Book[2];
		Scanner in=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter book id=");
		    int bookId=in.nextInt();
		    
		    System.out.print("Enter book Title=");
		    String bookTitle=in.next();
		    
		    System.out.print("Enter book Auther=");
		    String bookAuthor=in.next();
		    
		    System.out.print("Enter true or false to check Book is available or not=");
		    boolean isAvailable=in.nextBoolean();
		    arr[i]=new Book(bookId,bookTitle,bookAuthor,isAvailable);
	
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Details of Book: "+arr[i]);   //or arr[i].toString();
			
		}
		System.out.println("Count of books= "+Book.countTotalBook());
	}

}
