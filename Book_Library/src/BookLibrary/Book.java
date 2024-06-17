package BookLibrary;

public class Book {
	protected int bookId;
	protected String title,author;
	protected boolean isAvailable;
	protected static int count=0; //to keep track of total number of books
	//constructor for initializing data members
	public Book(int bookId,String title,String author,boolean isAvailable)
	{
		this.bookId=bookId;
		this.title=title;
		this.author=author;
		this.isAvailable=isAvailable;
		this.count++;
	}
	
	@Override
	public String toString()
	{
		return "Book id= "+this.bookId+
				"Title="+this.title+
				"Author="+this.author+
				"Is available"+this.isAvailable+"\n";
	}
	
	//static method for returning static data member count
	
	
	/**
	 * @return
	 */
	public static int countTotalBook()
	{
		return count;
	}
	
//getters and setters for all data members
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Book.count = count;
	}
}
