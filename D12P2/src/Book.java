public class Book {
	int bookId;
	String bookName;
	Book(int bookId, String bookName){
		this.bookId = bookId;
		this.bookName = bookName;
	}
	void print(){
		System.out.println("Book ID: " +bookId + " Book Name: " +bookName);
	}
}
