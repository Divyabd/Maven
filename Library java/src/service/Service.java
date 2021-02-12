package service;

import java.util.*;

import bookService.BookInsert;
import bookService.BookService;
import entity.User;
import util.ScannerValidate;

public class Service {
	public static void signup(Set<User> user) {
		int close = 0;
		boolean quit = true;
		do {
			try {
				System.out.println("Enter user id");
				int userId = ScannerValidate.getValidInt();
				for (User obj : user) {
					if (obj.getUserId() == userId) {
						System.out.println("Id already present");
						close = 1;
						break;

					}
				}
				if (close != 1) {
					System.out.println("Entr the name");
					String name = ScannerValidate.getStringValied();
					System.out.println("Entr the role");
					String role = ScannerValidate.getRole();
					System.out.println("Entr the phone number");
					String number = ScannerValidate.getPhone();
					System.out.println("Entr the password");
					String password = ScannerValidate.getString();
					user.add(new User(userId, name, role, number, password));
					System.out.println("record inserted");
					System.out.println("Do u want to sign up one more \n1>yes\n2>No");
					int n = ScannerValidate.getValidInt();
					if (n == 1) {

					} else {
						quit = false;
					}
				} else {
					quit = false;
				}

			} catch (Exception e) {
				System.out.println("Error  " + e);
			}

		} while (quit);

	}

	public static void login(Set<User> user) {
		System.out.println("Enter user id");
		int userId = ScannerValidate.getValidInt();
		System.out.println("Entr the password");
		String password = ScannerValidate.getString();
		int count = 0;
		try {
			for (User obj : user) {
				if (obj.getUserId() == userId && obj.getPassword().compareTo(password) == 0) {
					count = 1;
					System.out.println("Login successfull");
					Date d = new Date();
					System.out
							.println(obj.getUserId() + " " + obj.getName() + " " + obj.getRoll() + "  logged in " + d);
					if (obj.getRoll().compareTo("student") == 0) {
						student();
						Date d1 = new Date();
						System.out.println(
								obj.getUserId() + " " + obj.getName() + " " + obj.getRoll() + "  logged in " + d1);
					} else if (obj.getRoll().compareTo("staff") == 0) {
						staff();
						Date d2 = new Date();
						System.out.println(
								obj.getUserId() + " " + obj.getName() + " " + obj.getRoll() + "  logged in " + d2);
					}
					break;

				}
			}
			if (count == 0) {
				throw new Exception("");
			}
		} catch (Exception e) {
			System.out.println("Invalied user");
		}

	}

	public static void student() {
		boolean quit = true;
		do {
			System.out.println("\n");

			System.out.println("1> view book details\n2> purchase book by id\n3>logout ");
			int choice = ScannerValidate.getValidInt();
			switch (choice) {
			case 1:
				BookService.displayBook();
				break;
			case 2:
				BookService.searchById();
				break;
			case 3:
				System.out.println("Logout Succesfull !!!!!!!");
				quit = false;
				break;
			default:
				System.out.println("Invalied choice");
			}

		} while (quit);
		System.out.println("\n");

	}

	public static void staff() {

		boolean quit = true;
		do {
			System.out.println("\n");
			System.out.println(
					"1> addBoos\n2> update quantity\n3>delete by id\n4> search by id\n5> display all books\n6> logout ");
			int choice = ScannerValidate.getValidInt();
			switch (choice) {
			case 1:
				BookInsert.addBook();
				break;
			case 2:
				BookInsert.update();
				break;
			case 3:
				BookInsert.delete();
				break;
			case 4:
				BookInsert.bookById();
				break;
			case 5:
				BookInsert.display();
				;
				break;

			case 6:
				System.out.println("Logout Succesfull !!!!!!!");
				quit = false;
				break;
			default:
				System.out.println("Invalied choice");
			}

		} while (quit);
		System.out.println("\n");

	}
}
