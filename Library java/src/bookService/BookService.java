package bookService;

import entity.BookEntity;
import util.ScannerValidate;

public class BookService {
	public static void displayBook() {
		if (BookInsert.book == null) {
			System.out.println("No books in libeary");

		} else {
			System.out.println("Availaable books are:");
			for (BookEntity obj1 : BookInsert.book) {
				System.out.println(obj1.getBookId() + "  " + obj1.getName() + " " + obj1.getAuthorName() + " "
						+ obj1.getQuantity() + " " + obj1.getGenre());
			}
		}

	}

	public static void searchById() {
		int count = 0;
		System.out.println("Enter the book Id");
		int bookId = ScannerValidate.getValidInt();
		for (BookEntity obj1 : BookInsert.book) {
			if (obj1.getBookId() == bookId) {
				try {
					if (obj1.getQuantity() == 0) {
						count=1;
						throw new Exception("presently book not available ");
						

					} else {

						obj1.setQuantity(obj1.getQuantity() - 1);
						System.out.println(obj1.getBookId() + "  " + obj1.getName() + " " + obj1.getAuthorName() + " "
								+ obj1.getQuantity() + " " + obj1.getGenre());
						count = 1;
						break;
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

			}
		}
		if (count == 0) {
			System.out.println("book not present");

		}
	}

}
