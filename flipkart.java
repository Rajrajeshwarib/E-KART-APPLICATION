/**
 * 
 */
package com.gqt.flipkart.project;
import java.util.Scanner;

/**
 * @author Rajeshwari
 *
 */
public class flipkart {
	public static void collect() {
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Welcome to furnitures store");
			System.out.println("---------------------");
			System.out.println("Select your choice");
			System.out.println("1.bed cot\n"
					+ "2.sofa");
			int key1 = sc.nextInt();
			switch(key1) {
			case 1:{
				System.out.println("Specification:\n"
						+ "Cot type:\tWooden\n"
						+ "waranty:-\t3years\n"
						+ "size:-\tking size\n"
						+ "price:-\t\t30000");
				System.out.println("Do you wish to purchase:");
				String s1 = new String();
				s1=sc.next();
				if(s1.equals("yes")) {
					System.out.println("Thank you for shopping\n");
					System.out.println("\t***CASH RECIEPT***");
					System.out.println("\t  -----------------");
					System.out.println("Items\t\t\tPrice");
					System.out.println("------------------------------");
					System.out.println("Bed Cot\t\t30000");
					System.out.println();
					System.out.println("------------------------------");
					System.out.println("Total\t\t\t30000");
				}
				else {
					System.out.println("Thank you\n"
							+ "*Visit Again*");
					main(null);
				}
				break;
			}
			case 2:{
				System.out.println("Specification:\n"
						+"Sofa Type:-\tCushon sofa\n"
						+ "warinty:-\t2.5years\n"
						+ "price:-\t50000");
				System.out.println("Do you wish to purchase:");
				String s1 = new String();
				s1=sc.next();
				if(s1.equals("yes")) {
					System.out.println("Thank you for shopping\n");
					System.out.println("\t***CASH RECIEPT***");
					System.out.println("\t  ------------");
					System.out.println("Items\t\t\tPrice");
					System.out.println("------------------------------");
					System.out.println("Cushon\t\t60000");
					System.out.println();
					System.out.println("------------------------------");
					System.out.println("Total\t\t\t60000");
				}
				else {
					System.out.println("Thank you\n"
							+ "*Visit Again*");
					main(null);
				}
				break;
			}
			}
			break;
		}
		case 2:{
			System.out.println("Welcome to blankets store");
			System.out.println("---------------------");
			System.out.println("Enter your choice");
			System.out.println("1.large blankets\n"
					+ "2.Small blankets");
			System.out.println();
			int key1 = sc.nextInt();
			switch(key1) {
			case 1:{
				System.out.println("Enter your choice:");
				System.out.println("1.Sleepwell\n"
						+"2.Soft");
				System.out.println();
				int a = sc.nextInt();
				switch(a) {
				case 1:{
					System.out.println("Specification:\n"
							+ "length:-\t300cm\n"
							+ "width:-\t\t200cm\n"
							+ "warinty:-\t2years\n"
							+ "price:-\t\t20000");
					System.out.println("Do you wish to purchase:");
					String s1 = new String();
					s1=sc.next();
					if(s1.equals("yes")) {
						System.out.println("Thank you for shopping\n");
						System.out.println("\t*CASH RECIPET*");
						System.out.println("\t  ------------");
						System.out.println("Items\t\t\tPrice");
						System.out.println("------------------------------");
						System.out.println("Sleepwell blanket\t20000");
						System.out.println();
						System.out.println("------------------------------");
						System.out.println("Total\t\t\t20000");
					}
					else {
						System.out.println("Thank you\n"
								+ "*Visit Again*");
						main(null);
					}
					break;
				}
				case 2:{
					System.out.println("Specification:\n"
							+ "length:-\t300cm\n"
							+ "width:-\t150cm\n"
							+ "warinty:-\t2.5years"
							+ "price:-25000");
					System.out.println("Do you wish to purchase:");
					String s1 = new String();
					s1=sc.next();
					if(s1.equals("yes")) {
						System.out.println("Thank you for shopping\n");
						System.out.println("\t*CASH RECIEPT*");
						System.out.println("\t  ------------");
						System.out.println("Items\t\t\tPrice");
						System.out.println("------------------------------");
						System.out.println("Soft blanket\t20000");
						System.out.println();
						System.out.println("------------------------------");
						System.out.println("Total\t\t\t20000");
					}
					else {
						System.out.println("Thank you\n"
								+ "*Visit Again*");
						main(null);
					}
					break;
				}

				}
				break;
			}

			case 2:{
				System.out.println("Enter your choice");
				System.out.println("1.comfy\n"
						+"2.peep");
				System.out.println();
				int b = sc.nextInt();
				switch(b) {
				case 1:{
					System.out.println("Specification:\n"
							+ "length:-\t200cm\n"
							+ "width:-\t100cm\n"
							+ "warinty:-\t2years"
							+ "price:-10000");
					System.out.println("Do you wish to purchase:");
					String s1 = new String();
					s1=sc.next();
					if(s1.equals("yes")) {
						System.out.println("Thank you for shopping\n");
						System.out.println("\t*CASH RECIEPT*");
						System.out.println("\t  ------------");
						System.out.println("Items\t\t\tPrice");
						System.out.println("------------------------------");
						System.out.println("Comfy blanket\t20000");
						System.out.println();
						System.out.println("------------------------------");
						System.out.println("Total\t\t\t20000");
					}
					else {
						System.out.println("Thank you\n"
								+ "*Visit Again*");
						main(null);
					}
					break;
				}
				case 2:{
					System.out.println("Specification:\n"
							+ "length:-\t100cm\n"
							+ "width:-\t70cm\n"
							+ "warinty:-\t1years"
							+ "price:-5000");
					System.out.println("Do you wish to purchase:");
					String s1 = new String();
					s1=sc.next();
					if(s1.equals("yes")) {
						System.out.println("Thank you for shopping\n");
						System.out.println("\t*CASH RECIEPT*");
						System.out.println("\t  ------------");
						System.out.println("Items\t\t\tPrice");
						System.out.println("------------------------------");
						System.out.println("Peep blanket\t20000");
						System.out.println();
						System.out.println("------------------------------");
						System.out.println("Total\t\t\t20000");
					}
					else {
						System.out.println("Thank you\n"
								+ "*Visit Again*");
						main(null);
					}
					break;
				}
				}

			}

			}
			break;
		}

		case 3:{
			System.out.println("Welcome to Carpets");
			System.out.println("------------------");
			System.out.println("Enter your choice");
			System.out.println("1.large carpets\n"
					+ "2.small carpets");
			int key1 = sc.nextInt();
			switch(key1) {
			case 1:{
				System.out.println("Specification:\n"
						+ "Carpet type:\tWoolen\n"
						+ "Color:\t\tRed\n"
						+ "warinty:-\t2years\n"
						+ "price:-\t\t35000");
				System.out.println("Do you wish to purchase:");
				String s1 = new String();
				s1=sc.next();
				if(s1.equals("yes")) {
					System.out.println("Thank you for shopping\n");
					System.out.println("\t*CASH RECIEPT*");
					System.out.println("\t  ------------");
					System.out.println("Items\t\t\tPrice");
					System.out.println("------------------------------");
					System.out.println("large Carpet\t\t35000");
					System.out.println();
					System.out.println("------------------------------");
					System.out.println("Total\t\t\t35000");
				}
				else {
					System.out.println("Thank you\n"
							+ "*Visit Again*");
					main(null);
				}
				break;
			}
			case 2:{
				System.out.println("Specification:\n"
						+"Carpet Type:-\tSmooth\n"
						+ "warinty:-\t2.5years\n"
						+ "price:-\t\t43000");
				System.out.println("Do you wish to purchase:");
				String s1 = new String();
				s1=sc.next();
				if(s1.equals("yes")) {
					System.out.println("Thank you for shopping\n");
					System.out.println("\t*CASH RECIEPT*");
					System.out.println("\t  ------------");
					System.out.println("Items\t\t\tPrice");
					System.out.println("------------------------------");
					System.out.println("Small Carpet\t\t70000");
					System.out.println();
					System.out.println("------------------------------");
					System.out.println("Total\t\t\t70000");
				}
				else {
					System.out.println("Thank you\n"
							+ "*Visit Again*");
					main(null);
				}
				break;
			}
			}

			break;
		}
		}
	}
	

	public static void collect1(){
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Welcome to mobiles");
			System.out.println("------------------");
			System.out.println("Enter your choice:");
			System.out.println("1.Realme\n"
					+ "2.iphone");
			System.out.println();
			int key1 = sc.nextInt();
			switch(key1) {
			case 1:{
				System.out.println("Enter your choice:");
				System.out.println("1.Realme9i\n"
						+"2.Realme9");
				System.out.println();
				int a = sc.nextInt();
				switch(a) {
				case 1:{
					System.out.println("Specification:\n"
							+ "RAM:-\t\t64GB\n"
							+ "Color:-\t\tBlue\n"
							+ "price:-\t\t20000");
					System.out.println("Do you wish to purchase:");
					String s1 = new String();
					s1=sc.next();
					if(s1.equals("yes")) {
						System.out.println("Thank you for shopping\n");
						System.out.println("\t*CASH RECIEPT*");
						System.out.println("\t  ------------");
						System.out.println("Items\t\t\tPrice");
						System.out.println("------------------------------");
						System.out.println("Realme9i\t\t\t20000");
						System.out.println();
						System.out.println("Screen Guard\t\t+1000");
						System.out.println("------------------------------");
						System.out.println("Total\t\t\t21000");
					}
					else {
						System.out.println("Thank you\n"
								+ "*Visit Again*");
						main(null);
					}
					break;
				}
				case 2:{
					System.out.println("Specification:\n"
							+ "RAM:-\t\t128GB\n"
							+ "Color:-\t\tBlack\n"
							+ "price:-\t\t23000");
					System.out.println("Do you wish to purchase:");
					String s1 = new String();
					s1=sc.next();
					if(s1.equals("yes")) {
						System.out.println("Thank you for shopping\n");
						System.out.println("\t*CASH RECIEPT*");
						System.out.println("\t  ------------");
						System.out.println("Items\t\t\tPrice");
						System.out.println("------------------------------");
						System.out.println("Realme9\t\t\t35000");
						System.out.println();
						System.out.println("------------------------------");
						System.out.println("Total\t\t\t35000");
					}
					else {
						System.out.println("Thank you\n"
								+ "*Visit Again*");
						main(null);
					}
					break;
				}

				}
				break;
			}

			case 2:{
				System.out.println("Enter your choice");
				System.out.println("1.iphone13pro\n"
						+"2.iphone13promax");
				System.out.println();
				int b = sc.nextInt();
				switch(b) {
				case 1:{
					System.out.println("Specification:\n"
							+ "RAM:-\t\t128GB\n"
							+ "Color:-\t\tBlack\n"
							+ "price:-\t\t105000");
					System.out.println("Do you wish to purchase:");
					String s1 = new String();
					s1=sc.next();
					if(s1.equals("yes")) {
						System.out.println("Thank you for shopping\n");
						System.out.println("\t*CASH RECIPET*");
						System.out.println("\t  ------------");
						System.out.println("Items\t\t\tPrice");
						System.out.println("------------------------------");
						System.out.println("iphone13pro\t\t105000");
						System.out.println();
						System.out.println("------------------------------");
						System.out.println("Total\t\t\t105000");
					}
					else {
						System.out.println("Thank you\n"
								+ "*Visit Again*");
						main(null);
					}
					break;
				}
				case 2:{
					System.out.println("Specification:\n"
							+ "RAM:-\t256GB\n"
							+ "Color:-\tBlue\n"
							+ "price:-\t150000");
					System.out.println("Do you wish to purchase:");
					String s1 = new String();
					s1=sc.next();
					if(s1.equals("yes")) {
						System.out.println("Thank you for shopping\n");
						System.out.println("\t*CASH RECIEPT*");
						System.out.println("\t  ------------");
						System.out.println("Items\t\t\tPrice");
						System.out.println("------------------------------");
						System.out.println("iphone13promax\t\t150000");
						System.out.println();
						System.out.println("------------------------------");
						System.out.println("Total\t\t\t150000");
					}
					else {
						System.out.println("Thank you\n"
								+ "*Visit Again*");
						main(null);
					}
					break;
				}
				}
			}
			}
			break;
		}
		case 2:{
			System.out.println("Welcome to headphones");
			System.out.println("------------------");
			System.out.println("1.boat\n"
					+ "2.onepus\n"+"3.Realme");
			int key1 = sc.nextInt();
			switch(key1) {
			case 1:{
				System.out.println("Specification:\n"
						+ "Company:\tBoat\n"
						+ "Color:\t\tblack\n"
						+ "warinty:-\t3years\n"
						+ "price:-\t\t20000");
				System.out.println("Do you wish to purchase:");
				String s1 = new String();
				s1=sc.next();
				if(s1.equals("yes")) {
					System.out.println("Thank you for shopping\n");
					System.out.println("\t*CASH RECIEPT*");
					System.out.println("\t  ------------");
					System.out.println("Items\t\t\tPrice");
					System.out.println("------------------------------");
					System.out.println("Boat headphone\t\t2000");
					System.out.println();
					System.out.println("------------------------------");
					System.out.println("Total\t\t\t20000");
				}
				else {
					System.out.println("Thank you\n"
							+ "*Visit Again*");
					main(null);
				}
				break;
			}
			case 2:{
				System.out.println("Specification:\n"
						+"Company:-\tOneplus\n"
						+ "Color:\t\tBlue\n"
						+ "warinty:-\t2.5years\n"
						+ "price:-\t\t40000");
				System.out.println("Do you wish to purchase:");
				String s1 = new String();
				s1=sc.next();
				if(s1.equals("yes")) {
					System.out.println("Thank you for shopping\n");
					System.out.println("\t*CASH RECIEPT*");
					System.out.println("\t  ------------");
					System.out.println("Items\t\t\tPrice");
					System.out.println("------------------------------");
					System.out.println("Oneplus headphone\t\t40000");
					System.out.println();
					System.out.println("------------------------------");
					System.out.println("Total\t\t\t40000");
				}
				else {
					System.out.println("Thank you\n"
							+ "*Visit Again*");
					main(null);
				}
				break;
			}
			}

			break;
		}
		case 3:{
			System.out.println("Welcome to laptops");
			System.out.println("------------------");
			System.out.println("1.MacBook\n"
					+ "2.Lenovo");
			int key1 = sc.nextInt();
			switch(key1) {
			case 1:{
				System.out.println("Specification:\n"
						+ "Company:\tApple\n"
						+ "Size:\t\t10inches\n"
						+ "Color:-\t\tGrey\n"
						+ "price:-\t\t75000");
				System.out.println("Do you wish to purchase:");
				String s1 = new String();
				s1=sc.next();
				if(s1.equals("yes")) {
					System.out.println("Thank you for shopping\n");
					System.out.println("\t*CASH RECIEPT*");
					System.out.println("\t  ------------");
					System.out.println("Items\t\t\tPrice");
					System.out.println("------------------------------");
					System.out.println("MacBook\t\t\t75000");
					System.out.println();
					System.out.println("------------------------------");
					System.out.println("Total\t\t\t75000");
				}
				else {
					System.out.println("Thank you\n"
							+ "*Visit Again*");
					main(null);
				}
				break;
			}
			case 2:{
				System.out.println("Specification:\n"
						+"Company:-\tLenovo\n"
						+ "size:-\t\t18inches\n"
						+ "Color:-\t\tSilver\n"
						+ "price:-\t\t43000");
				System.out.println("Do you wish to purchase:");
				String s1 = new String();
				s1=sc.next();
				if(s1.equals("yes")) {
					System.out.println("Thank you for shopping\n");
					System.out.println("\t*CASH RECIEPT*");
					System.out.println("\t  ------------");
					System.out.println("Items\t\t\tPrice");
					System.out.println("------------------------------");
					System.out.println("Lenovo\t\t\t43000");
					System.out.println();
					System.out.println("------------------------------");
					System.out.println("Total\t\t\t43000");
				}
				else {
					System.out.println("Thank you\n"
							+ "*Visit Again*");
					main(null);
				}
				break;
			}
			}

			break;
		}
		}
	}
	public static void collect2(){
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Welcome to Men section");
			System.out.println("------------------");
			System.out.println("1.Shirts\n"
					+ "2.T-shirts");
			int key1 = sc.nextInt();
			switch(key1) {
			case 1:{
				System.out.println("Specification:\n"
						+ "Company name:\tRamraj\n"
						+ "Color:\t\tBlack\n"
						+ "price:-\t\t599");
				System.out.println("Do you wish to purchase:");
				String s1 = new String();
				s1=sc.next();
				if(s1.equals("yes")) {
					System.out.println("Thank you for shopping\n");
					System.out.println("\t*CASH RECIEPT*");
					System.out.println("\t  ------------");
					System.out.println("Items\t\t\tPrice");
					System.out.println("------------------------------");
					System.out.println("Shirt\t\t\t599");
					System.out.println();
					System.out.println("------------------------------");
					System.out.println("Total\t\t\t599");
				}
				else {
					System.out.println("Thank you\n"
							+ "*Visit Again*");
					main(null);
				}
				break;
			}
			case 2:{
				System.out.println("Specification:\n"
						+"Company:-\tCk\n"
						+ "Color:\t\tBlue\n"
						+ "price:-\t\t799");
				System.out.println("Do you wish to purchase:");
				String s1 = new String();
				s1=sc.next();
				if(s1.equals("yes")) {
					System.out.println("Thank you for shopping\n");
					System.out.println("\t*CASH RECIEPT*");
					System.out.println("\t  ------------");
					System.out.println("Items\t\t\tPrice");
					System.out.println("------------------------------");
					System.out.println("Trousers\t\t799");
					System.out.println();
					System.out.println("------------------------------");
					System.out.println("Total\t\t\t799");
				}
				else {
					System.out.println("Thank you\n"
							+ "*Visit Again*");
					main(null);
				}
				break;
			}
			}

			break;
		}
		case 2:{
			System.out.println("Welcome to women section");
			System.out.println("------------------");
			System.out.println("1.kurtas\n"
					+ "2.Lehengas");
			int key1 = sc.nextInt();
			switch(key1) {
			case 1:{
				System.out.println("Specification:\n"
						+ "*Combo offer*\n"
						+ "Company:\tMax\n"
						+ "Color:\t\tWhite\n"
						+ "price:-\t\t999");
				System.out.println("Do you wish to purchase:");
				String s1 = new String();
				s1=sc.next();
				if(s1.equals("yes")) {
					System.out.println("Thank you for shopping\n");
					System.out.println("\t*CASH RECIEPT*");
					System.out.println("\t  ------------");
					System.out.println("Items\t\t\tPrice");
					System.out.println("------------------------------");
					System.out.println("Combo set\t\t999");
					System.out.println();
					System.out.println("------------------------------");
					System.out.println("Total\t\t\t999");
				}
				else {
					System.out.println("Thank you\n"
							+ "*Visit Again*");
					main(null);
				}
				break;
			}
			case 2:{
				System.out.println("Specification:\n"
						+"Company:-\tTrends\n"
						+ "Color:\t\tBlue\n"
						+ "price:-\t\t31200");
				System.out.println("Do you wish to purchase:");
				String s1 = new String();
				s1=sc.next();
				if(s1.equals("yes")) {
					System.out.println("Thank you for shopping\n");
					System.out.println("\t*CASH RECIEPT*");
					System.out.println("\t  ------------");
					System.out.println("Items\t\t\tPrice");
					System.out.println("------------------------------");
					System.out.println("Denims\t\t\t31200");
					System.out.println();
					System.out.println("------------------------------");
					System.out.println("Total\t\t\t31200");
				}
				else {
					System.out.println("Thank you\n"
							+ "*Visit Again*");
					main(null);
				}
				break;
			}
			}

			break;
		}
		case 3:{
			System.out.println("Welcome to kids section");
			System.out.println("------------------");
			System.out.println("1.Marriage wear\n"
					+ "2.Casual wear");
			System.out.println();
			int key1 = sc.nextInt();
			switch(key1) {
			case 1:{
				System.out.println("Enter your choice:");
				System.out.println("1.Girls\n"
						+"2.boys");
				System.out.println();
				int a = sc.nextInt();
				switch(a) {
				case 1:{
					System.out.println("Specification:\n"
							+ "Dress type:-\tLehanga\n"
							+ "Color:-\t\tGreen,pink\n"
							+ "price:-\t\t9000");
					System.out.println("Do you wish to purchase:");
					String s1 = new String();
					s1=sc.next();
					if(s1.equals("yes")) {
						System.out.println("Thank you for shopping\n");
						System.out.println("\t*CASH RECIEPT*");
						System.out.println("\t  ------------");
						System.out.println("Items\t\t\tPrice");
						System.out.println("------------------------------");
						System.out.println("Lehanga\t\t\t9000");
						System.out.println();
						System.out.println("------------------------------");
						System.out.println("Total\t\t\t9000");
					}
					else {
						System.out.println("Thank you\n"
								+ "*Visit Again*");
						main(null);
					}
					break;
				}
				case 2:{
					System.out.println("Specification:\n"
							+ "Drees Type:-\tSuit\n"
							+ "Color:-\t\tCream\n"
							+ "price:-\t\t10000");
					System.out.println("Do you wish to purchase:");
					String s1 = new String();
					s1=sc.next();
					if(s1.equals("yes")) {
						System.out.println("Thank you for shopping\n");
						System.out.println("\t*CASH RECIEPT*");
						System.out.println("\t  ------------");
						System.out.println("Items\t\t\tPrice");
						System.out.println("------------------------------");
						System.out.println("Suit\t\t\t10000");
						System.out.println();
						System.out.println("------------------------------");
						System.out.println("Total\t\t\t10000");
					}
					else {
						System.out.println("Thank you\n"
								+ "*Visit Again*");
						main(null);
					}
					break;
				}

				}
				break;
			}

			case 2:{
				System.out.println("Enter your choice");
				System.out.println("1.Girls\n"
						+"2.Boy");
				System.out.println();
				int b = sc.nextInt();
				switch(b) {
				case 1:{
					System.out.println("Specification:\n"
							+ "Dress type:-\tTop and leggin\n"
							+ "Color:-\t\tBlack top and White leggin\n"
							+ "price:-\t\t600");
					System.out.println("Do you wish to purchase:");
					String s1 = new String();
					s1=sc.next();
					if(s1.equals("yes")) {
						System.out.println("Thank you for shopping\n");
						System.out.println("\t*CASH RECIEPT*");
						System.out.println("\t  ------------");
						System.out.println("Items\t\t\tPrice");
						System.out.println("------------------------------");
						System.out.println("Top and leggin\t\t600");
						System.out.println();
						System.out.println("------------------------------");
						System.out.println("Total\t\t\t600");
					}
					else {
						System.out.println("Thank you\n"
								+ "*Visit Again*");
						main(null);
					}
					break;
				}
				case 2:{
					System.out.println("Specification:\n"
							+ "Dress Type:-\tTShirt\n"
							+ "Color:-\tBlue\n"
							+ "price:-\t299");
					System.out.println("Do you wish to purchase:");
					String s1 = new String();
					s1=sc.next();
					if(s1.equals("yes")) {
						System.out.println("Thank you for shopping\n");
						System.out.println("\t*CASH RECIEPT*");
						System.out.println("\t  ------------");
						System.out.println("Items\t\t\tPrice");
						System.out.println("------------------------------");
						System.out.println("Tshirt\t\t299");
						System.out.println();
						System.out.println("------------------------------");
						System.out.println("Total\t\t\t299");
					}
					else {
						System.out.println("Thank you\n"
								+ "*Visit Again*");
						main(null);
					}
					break;
				}
				}
			}
			}
			break;
		}
		}
	}
	public static void collect3(){
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Welcome to fruit and veggies stor");
			System.out.println("------------------");
			System.out.println("1.Fruits\n"
					+ "2.Vegetables");
			System.out.println();
			int key1 = sc.nextInt();
			switch(key1) {
			case 1:{
				System.out.println("Enter your choice:");
				System.out.println("1.Apple\n"
						+"2.Mango");
				System.out.println();
				int a = sc.nextInt();
				switch(a) {
				case 1:{
					System.out.println("Specification:\n"
							+ "Color:-red/green\n"
							+ "Price:-70rs/kg");
							
					System.out.println("Do you wish to purchase:");
					String s1 = new String();
					s1=sc.next();
					if(s1.equals("yes")) {
						System.out.println("Thank you for shopping\n");
						System.out.println("\t*CASH RECIEPT*");
						System.out.println("\t  ------------");
						System.out.println("Items\tQuantity\tPrice");
						System.out.println("------------------------------");
						System.out.println("Apple\t1kg\t\t70");
						System.out.println();
						System.out.println("------------------------------");
						System.out.println("Total\t\t\t70");
					}
					else {
						System.out.println("Thank you\n"
								+ "*Visit Again*");
						main(null);
					}
					break;
				}
				case 2:{
					System.out.println("Specification:\n"
							+ "Mango species:-Malika\n"
							+ "Price:-50rs/kg");
					System.out.println("Do you wish to purchase:");
					String s1 = new String();
					s1=sc.next();
					if(s1.equals("yes")) {
						System.out.println("Thank you for shopping\n");
						System.out.println("\t*CASH RECIEPT*");
						System.out.println("\t  ------------");
						System.out.println("Items\tQuantity\tPrice");
						System.out.println("------------------------------");
						System.out.println("Mango\t1kg\t\t50");
						System.out.println();
						System.out.println("------------------------------");
						System.out.println("Total\t\t\t50");
					}
					else {
						System.out.println("Thank you\n"
								+ "*Visit Again*");
						main(null);
					}
					break;
				}

				}
				break;
			}

			case 2:{
				System.out.println("Enter your choice");
				System.out.println("1.Tomato\n"
						+"2.Onion");
				System.out.println();
				int b = sc.nextInt();
				switch(b) {
				case 1:{
					System.out.println("Specification:\n"
							+ "Nati Tomato"
							+ "Price:-100rs/kg");
					System.out.println("Do you wish to purchase:");
					String s1 = new String();
					s1=sc.next();
					if(s1.equals("yes")) {
						System.out.println("Thank you for shopping\n");
						System.out.println("\t*CASH RECIEPT*");
						System.out.println("\t  ------------");
						System.out.println("Items\tQuantity\tPrice");
						System.out.println("------------------------------");
						System.out.println("Tomato\t1kg\t\t100");
						System.out.println();
						System.out.println("------------------------------");
						System.out.println("Total\t\t\t100");
					}
					else {
						System.out.println("Thank you\n"
								+ "*Visit Again*");
						main(null);
					}
					break;
				}
				case 2:{
					System.out.println("Specification:\n"
							+"Price:-40rs/kg");
					System.out.println("Do you wish to purchase:");
					String s1 = new String();
					s1=sc.next();
					if(s1.equals("yes")) {
						System.out.println("Thank you for shopping\n");
						System.out.println("\t*CASH RECIEPT*");
						System.out.println("\t  ------------");
						System.out.println("Items\tQuantity\tPrice");
						System.out.println("------------------------------");
						System.out.println("Onion\t1kg\t\t40");
						System.out.println();
						System.out.println("------------------------------");
						System.out.println("Total\t\t\t40");
					}
					else {
						System.out.println("Thank you\n"
								+ "*Visit Again*");
						main(null);
					}
					break;
				}
				}
			}
			}
			
			break;
		}
		case 2:{
			System.out.println("Welcome to cerals store");
			System.out.println("------------------");
			System.out.println("1.OrangeGram\n"
					+ "2.GreenGram");
			int key1 = sc.nextInt();
			switch(key1) {
			case 1:{
				System.out.println("Specification:\n"
						+ "price:-\t\t30rs/kg");
				System.out.println("Do you wish to purchase:");
				String s1 = new String();
				s1=sc.next();
				if(s1.equals("yes")) {
					System.out.println("Thank you for shopping\n");
					System.out.println("\t*CASH RECIEPT*");
					System.out.println("\t  ------------");
					System.out.println("Items\tQuantity\tPrice");
					System.out.println("------------------------------");
					System.out.println("Orangegram\t1kg\t30");
					System.out.println();
					System.out.println("------------------------------");
					System.out.println("Total\t\t\t30");
				}
				else {
					System.out.println("Thank you\n"
							+ "*Visit Again*");
					main(null);
				}
				break;
			}
			case 2:{
				System.out.println("Specification:\n"
						+"price:-\t\t20rs/kg");
				System.out.println("Do you wish to purchase:");
				String s1 = new String();
				s1=sc.next();
				if(s1.equals("yes")) {
					System.out.println("Thank you for shopping\n");
					System.out.println("\t*CASH RECIEPT*");
					System.out.println("\t  ------------");
					System.out.println("Items\tQuantity\tPrice");
					System.out.println("------------------------------");
					System.out.println("Greengram\t2kg\t40");
					System.out.println();
					System.out.println("------------------------------");
					System.out.println("Total\t\t\t40");
				}
				else {
					System.out.println("Thank you\n"
							+ "*Visit Again*");
					main(null);
				}
				break;
			}
			}
			break;
		}
		case 3:{
			System.out.println("Welcome to juice store");
			System.out.println("------------------");
			System.out.println("1.Sprite\n"
					+ "2.Maaza");
			int key1 = sc.nextInt();
			switch(key1) {
			case 1:{
				System.out.println("Specification:\n"
						+ "Company:-\tSprite\n"
						+ "price:-\t\t70/ltr");
				System.out.println("Do you wish to purchase:");
				String s1 = new String();
				s1=sc.next();
				if(s1.equals("yes")) {
					System.out.println("Thank you for shopping\n");
					System.out.println("\t*CASH RECIEPT*");
					System.out.println("\t  ------------");
					System.out.println("Items\tQuantity\tPrice");
					System.out.println("------------------------------");
					System.out.println("Sprite\t1ltr\t\t70");
					System.out.println();
					System.out.println("------------------------------");
					System.out.println("Total\t\t\t70");
				}
				else {
					System.out.println("Thank you\n"
							+ "*Visit Again*");
					main(null);
				}
				break;
			}
			case 2:{
				System.out.println("Specification:\n"
						+ "Company:-\tMaaza\n"
						+"price:-\t\t90rs/ltr");
				System.out.println("Do you wish to purchase:");
				String s1 = new String();
				s1=sc.next();
				if(s1.equals("yes")) {
					System.out.println("Thank you for shopping\n");
					System.out.println("\t*CASH RECIEPT*");
					System.out.println("\t  ------------");
					System.out.println("Items\tQuantity\tPrice");
					System.out.println("------------------------------");
					System.out.println("Maaza\t1ltr\t\t90");
					System.out.println();
					System.out.println("------------------------------");
					System.out.println("Total\t\t\t90");
				}
				else {
					System.out.println("Thank you\n"
							+ "*Visit Again*");
					main(null);
				}
				break;
			}
			}
			break;
		}
		case 4:{
			System.out.println("Welcome to provision store");
			System.out.println("------------------");
			System.out.println("1.Masalas\n"
					+ "2.seeds");
			int key1 = sc.nextInt();
			switch(key1) {
			case 1:{
				System.out.println("Specification:\n"
						+ "Company:-\tTeju masala\n"
						+ "Masala Type:-\tkabab\n"
						+ "price:-\t\t10/pckt");
				System.out.println("Do you wish to purchase:");
				String s1 = new String();
				s1=sc.next();
				if(s1.equals("yes")) {
					System.out.println("Thank you for shopping\n");
					System.out.println("\t*CASH RECIEPT*");
					System.out.println("\t  ------------");
					System.out.println("Items\t\tQuantity\tPrice");
					System.out.println("----------------------------------");
					System.out.println("Tejukabab masala\t1pckt\t10");
					System.out.println();
					System.out.println("----------------------------------");
					System.out.println("Total\t\t\t\t10");
				}
				else {
					System.out.println("Thank you\n"
							+ "*Visit Again*");
					main(null);
				}
				break;
			}
			case 2:{
				System.out.println("Specification:\n"
						+ "Company:-\tAshirvaad\n"
						+"price:-\t\t30/kg");
				System.out.println("Do you wish to purchase:");
				String s1 = new String();
				s1=sc.next();
				if(s1.equals("yes")) {
					System.out.println("Thank you for shopping\n");
					System.out.println("\t*CASH RECIEPT*");
					System.out.println("\t  ------------");
					System.out.println("Items\tQuantity\tPrice");
					System.out.println("------------------------------");
					System.out.println("Maida\t1kg\t\t30");
					System.out.println();
					System.out.println("------------------------------");
					System.out.println("Total\t\t\t30");
				}
				else {
					System.out.println("Thank you\n"
							+ "*Visit Again*");
					main(null);

				}
			break;
			}
		}
			break;
	}
		}	
	}
	public static void collect4(){
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Welcome to sport wear");
			System.out.println("------------------");
			System.out.println("1.Track suit\n"
					+ "2.Trousers");
			int key1 = sc.nextInt();
			switch(key1) {
			case 1:{
				System.out.println("Specification:\n"
						+ "Company:-\tDecathlon\n"
						+ "Color:-\t\tBlack\n"
						+ "price:-\t\t5000");
				System.out.println("Do you wish to purchase:");
				String s1 = new String();
				s1=sc.next();
				if(s1.equals("yes")) {
					System.out.println("Thank you for shopping\n");
					System.out.println("\t*CASH RECIEPT*");
					System.out.println("\t  ------------");
					System.out.println("Items\t\t\tPrice");
					System.out.println("----------------------------------");
					System.out.println("Tracksuit\t\t5000");
					System.out.println();
					System.out.println("----------------------------------");
					System.out.println("Total\t\t\t5000");
				}
				else {
					System.out.println("Thank you\n"
							+ "*Visit Again*");
					main(null);
				}
				break;
			}
			case 2:{
				System.out.println("Specification:\n"
						+ "Company:-\tZudio\n"
						+"price:-\t\t399");
				System.out.println("Do you wish to purchase:");
				String s1 = new String();
				s1=sc.next();
				if(s1.equals("yes")) {
					System.out.println("Thank you for shopping\n");
					System.out.println("\t*CASH RECIEPT*");
					System.out.println("\t  ------------");
					System.out.println("Items\t\t\tPrice");
					System.out.println("----------------------------------");
					System.out.println("Trosers\t\t\t399");
					System.out.println();
					System.out.println("----------------------------------");
					System.out.println("Total\t\t\t399");
				}
				else {
					System.out.println("Thank you\n"
							+ "*Visit Again*");
					main(null);

				}
			break;
			}
			}
			break;
		}
		case 2:{
			System.out.println("Welcome to sports shoes");
			System.out.println("------------------");
			System.out.println("1.puma\n"
					+ "2.Adidas");
			int key1 = sc.nextInt();
			switch(key1) {
			case 1:{
				System.out.println("Specification:\n"
						+ "Company:-\tPuma\n"
						+ "Color:-\t\tBlack\n"
						+ "price:-\t\t7000");
				System.out.println("Do you wish to purchase:");
				String s1 = new String();
				s1=sc.next();
				if(s1.equals("yes")) {
					System.out.println("Thank you for shopping\n");
					System.out.println("\t*CASH RECIEPT*");
					System.out.println("\t  ------------");
					System.out.println("Items\t\t\tPrice");
					System.out.println("----------------------------------");
					System.out.println("Puma\t\t\t7000");
					System.out.println();
					System.out.println("----------------------------------");
					System.out.println("Total\t\t\t7000");
				}
				else {
					System.out.println("Thank you\n"
							+ "*Visit Again*");
					main(null);
				}
				break;
			}
			case 2:{
				System.out.println("Specification:\n"
						+ "Company:-\tAdidas\n"
						+ "Color:-\tWhite\n"
						+"price:-\t\t8099");
				System.out.println("Do you wish to purchase:");
				String s1 = new String();
				s1=sc.next();
				if(s1.equals("yes")) {
					System.out.println("Thank you for shopping\n");
					System.out.println("\t*CASH RECIEPT*");
					System.out.println("\t  ------------");
					System.out.println("Items\t\t\tPrice");
					System.out.println("----------------------------------");
					System.out.println("Trosers\t\t\t8099");
					System.out.println();
					System.out.println("----------------------------------");
					System.out.println("Total\t\t\t699");
				}
				else {
					System.out.println("Thank you\n"
							+ "*Visit Again*");
					main(null);

				}
			break;
			}
			}
			break;
		}
		
		case 3:{
			System.out.println("Welcome to sports equipment");
			System.out.println("------------------");
			System.out.println("1.batkit\n"
					+ "2.football");
			int key1 = sc.nextInt();
			switch(key1) {
			case 1:{
				System.out.println("Specification:\n"
						+ "Company:-\tMRF\n"
						+ "Combo:-\tWickets,handglouses,helmet\n"
						+ "price:-\t\t10000");
				System.out.println("Do you wish to purchase:");
				String s1 = new String();
				s1=sc.next();
				if(s1.equals("yes")) {
					System.out.println("Thank you for shopping\n");
					System.out.println("\t*CASH RECIEPT*");
					System.out.println("\t  ------------");
					System.out.println("Items\t\t\tPrice");
					System.out.println("----------------------------------");
					System.out.println("Batkit\t\t\t10000");
					System.out.println();
					System.out.println("----------------------------------");
					System.out.println("Total\t\t\t10000");
				}
				else {
					System.out.println("Thank you\n"
							+ "*Visit Again*");
					main(null);
				}
				break;
			}
			case 2:{
				System.out.println("Specification:\n"
						+ "Color:-\t\tYellow\n"
						+"price:-\t\t2999");
				System.out.println("Do you wish to purchase:");
				String s1 = new String();
				s1=sc.next();
				if(s1.equals("yes")) {
					System.out.println("Thank you for shopping\n");
					System.out.println("\t*CASH RECIEPT*");
					System.out.println("\t  ------------");
					System.out.println("Items\t\t\tPrice");
					System.out.println("----------------------------------");
					System.out.println("Football\t\t2999");
					System.out.println();
					System.out.println("----------------------------------");
					System.out.println("Total\t\t\t2999");
				}
				else {
					System.out.println("Thank you\n"
							+ "*Visit Again*");
					main(null);

				}
			break;
			}
			}
			break;
		}
		
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\tWelcome to shopping kart");
		System.out.println("\t\t-------------------------");
		System.out.println();
		System.out.println("1.Home Decor\n"
				+ "2.Electronics\n"
				+ "3.Fashion\n"
				+ "4.Instamart\n"
				+ "5.Sports");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Welcome to home decors");
			System.out.println("----------------------");
			System.out.println("1.Furniture\n"
					+ "2.Blankets\n"
					+ "3.Carpets\n");
			collect();


			break;
		}
		case 2:{
			System.out.println("Welcome to Electronics");
			System.out.println("----------------------");
			System.out.println("1.Mobiles\n"
					+ "2.Headphones\n"
					+ "3.Laptop\n");
					
			collect1();

			break;
		}
		case 3:{
			System.out.println("Welcome to Fashion");
			System.out.println("----------------------");
			System.out.println("1.Men\n"
					+ "2.Women\n"
					+ "3.Children");
			collect2();

			break;
		}
		case 4:{
			System.out.println("Welcome to Instamart");
			System.out.println("----------------------");
			System.out.println("1.Fruits and veggies\n"
					+ "2.cerals\n"
					+ "3.juices\n"
					+ "4.provisions\n");
			collect3();

			break;
		}
		case 5:{
			System.out.println("Welcome to sports");
			System.out.println("----------------------");
			System.out.println("1.Sports wear\n"
					+ "2.sports equipment\n"
					+ "3.sports shoes");
			collect4();

			break;
		}
		}

	}

}