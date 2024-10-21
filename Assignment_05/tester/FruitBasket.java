package tester;

import java.util.Scanner;

import com.app.fruits.Apple;
import com.app.fruits.Fruit;
import com.app.fruits.Mango;
import com.app.fruits.Orange;

public class FruitBasket {
	public static int menu(Scanner sc) {
		int choice;

		System.out.println("0.Exit");
		System.out.println("1.Add Mango");
		System.out.println("2.Add Orange");
		System.out.println("3.Add Apple");
		System.out.println("4.Display names of all fruits");
		System.out.println("5.Display Fruit details");
		System.out.println("6.Display taste of all stale Fruits");
		System.out.println("7.Mark Fruit as stale");
		System.out.println("8.Mark all sour Fruits stale");
		System.out.println("Enter your choice :");

		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		int choice;
		System.out.println("Enter basket size : ");
		size = sc.nextInt();
		Fruit[] basket = new Fruit[size];
		int counter = 0;

		while ((choice = menu(sc)) != 0) {

			switch (choice) {

			case 1:
				if (counter < size) {
					basket[counter] = new Mango();
					basket[counter].accept(sc);
					basket[counter].setName("Mango");
					counter++;
				} else {
					System.out.println("Array is full");
				}

				break;
			case 2:
				if (counter < size) {
					basket[counter] = new Orange();
					basket[counter].accept(sc);
					basket[counter].setName("Orange");
					counter++;
				} else {
					System.out.println("Array is full");
				}

				break;
			case 3:
				if (counter < size) {
					basket[counter] = new Apple();
					basket[counter].accept(sc);
					basket[counter].setName("Apple");
					counter++;
				} else {
					System.out.println("Array is full");
				}

				break;
			case 4:
				for (Fruit fruits : basket) {
					System.out.println(fruits.getName());
				}
				break;
			case 5:
				for (Fruit fruit : basket) {
					if (fruit != null && fruit.isFresh() == true) {
						System.out.println(fruit.toString() + " taste : " + fruit.taste());

					}
				}
				break;
			case 6:
				for (Fruit fruit : basket) {
					if (fruit != null) {
						if (fruit.isFresh() == false) {
							System.out.println(fruit.getName() + "-> taste : " + fruit.taste());
						}
					}
				}
				break;
			case 7:
				int index;
				System.out.println("Enter index to make fruit as stale");
				index = sc.nextInt();
				if (index > 0 && index < counter) {
					basket[index].setFresh(false);
				} else {
					System.out.println("Invalid index");
				}
				break;
			case 8:
				for (Fruit fruit : basket) {
					if (fruit.taste().equals("sour")) {
						fruit.setFresh(false);
					}
				}
				break;
			default:
				System.out.println("wrong choice...");
			}
		}

		System.out.println("Thank You!");

	}
}
