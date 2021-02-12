package client;

import java.util.*;

import entity.User;
import service.Service;
import util.ScannerValidate;

public class Client {

	
	public static void main(String[] args) {
		Set<User> user = new LinkedHashSet<>();
		boolean quit = true;
		do {
			System.out.println("1> SignUp\n2> Login\n3> Exit");
			int choice = ScannerValidate.getValidInt();
			switch (choice) {
			case 1:
				Service.signup(user);
				break;
			case 2:
				Service.login(user);
				break;
			case 3: 
				quit = false;
				break;
			default:
				System.out.println("Invalied choice");

			}

		} while (quit);

	}

}
