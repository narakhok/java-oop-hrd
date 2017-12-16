package polymorphismtest;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		PhoneIStandard p = null;
		p = new Iphone();

		System.out.println("Phone is working on : ");

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		switch (str) {
		case "Iphone":
			p = new Iphone();
			break;
		case "LG":
			p = new LG();
			break;

		case "Samsung":
			p = new Samsung();
			break;

		case "Sony":
			p = new Sony();
			break;

		}
		System.out.println("Do for : ");
		sc = new Scanner(System.in);
		 str = sc.nextLine();
		switch(str){
		case "Call" : p.call();
				break;
		case "message" : p.message();
				break;
		}

	}

}
