package bookService;

import java.util.LinkedHashSet;
import java.util.Set;
import entity.BookEntity;
import util.ScannerValidate;

public class BookInsert {
	static Set<BookEntity> book = new LinkedHashSet<>();

	public static void addBook() {
		boolean quit = true;
		int close = 0;
		do {
			System.out.println("Enter the book Id");
			int bookId = ScannerValidate.getValidInt();
			for (BookEntity obj : book) {
				if (obj.getBookId() == bookId) {
					System.out.println("Id already present");
					close = 1;
					break;

				}
			}
			if (close != 1) {
				System.out.println("Enter the book name");
				String name = ScannerValidate.getString();
				System.out.println("Enter the book author");
				String author = ScannerValidate.getString();
				System.out.println("Enter the book  quantity");
				int quantity = ScannerValidate.getValidInt();
				System.out.println("Enter the book genre");
				String genre = ScannerValidate.getString();
				book.add(new BookEntity(bookId, name, author, quantity, genre));
				System.out.println("Do u want to add one more book \n1>yes\n2>No");
				int n = ScannerValidate.getValidInt();
				if (n == 1) {

				} else {
					quit = false;
				}
			} else {
				quit = false;
			}

		} while (quit);
	}

	public static void update() {
		int count = 0;
		System.out.println("Enter the book Id");
		int bookId = ScannerValidate.getValidInt();
		for (BookEntity obj : book) {
			if (obj.getBookId() == bookId) {
				System.out.println("Book present!!!!!");
				System.out.println("Enter the book quantity");
				int quantity = ScannerValidate.getValidInt();
				obj.setQuantity(quantity);
				System.out.println("Quantity updated successfull!!!!!");
				count = 1;
				break;

			}
		}
		if (count == 0) {
			System.out.println("book not present");

		}
	}

	public static void delete() {
		int count = 0;
		System.out.println("Enter the book Id");
		int bookId = ScannerValidate.getValidInt();
		for (BookEntity obj : book) {
			if (obj.getBookId() == bookId) {
				book.remove(obj);
				count = 1;
				System.out.println("deleted successfull!!!!!");

				break;

			}
		}
		if (count == 0) {
			System.out.println("book not present");

		}
	}

	public static void bookById() {
		int count = 0;
		System.out.println("Enter the book Id");
		int bookId = ScannerValidate.getValidInt();
		for (BookEntity obj : book) {
			if (obj.getBookId() == bookId) {
				System.out.println(obj.getBookId() + "  " + obj.getName() + " " + obj.getAuthorName() + " "
						+ obj.getQuantity() + " " + obj.getGenre());
				count = 1;
				break;

			}
		}
		if (count == 0) {
			System.out.println("book not present");

		}
	}

	public static void display() {

		if (book == null) {
			System.out.println("No books in librery");

		} else {
			System.out.println("Availaable books are:");
			for (BookEntity obj1 : book) {
				System.out.println(obj1.getBookId() + "  " + obj1.getName() + " " + obj1.getAuthorName() + " "
						+ obj1.getQuantity() + " " + obj1.getGenre());
			}
		}
	}

}
