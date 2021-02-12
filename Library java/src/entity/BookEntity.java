package entity;

public class BookEntity {
	private int bookId;
	private String name;
	private String authorName;
	private int quantity;
	private String genre;
	public BookEntity() {
	}
	public BookEntity(int bookId, String name, String authorName, int quantity, String genre) {
		this.bookId = bookId;
		this.name = name;
		this.authorName = authorName;
		this.quantity = quantity;
		this.genre = genre;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	

}
