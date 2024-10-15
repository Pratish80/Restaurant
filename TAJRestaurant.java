package qspidy;
import java.util.*;
public class TAJRestaurant {
	static String username;
	static String pass;
	static String phone;
	static double bill;
	static ArrayList<String> cart=new ArrayList<>();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(; ;) 
		{
			System.out.println();
			System.out.println("        *****WELCOME******     ");
			System.out.println();
			System.out.println("1.SIGN IN");
			System.out.println("2.SIGN UP");
			System.out.println();
			System.out.print("Enter an option: ");
		int option=sc.nextInt();
		switch(option) {
		case 1:createAccount(sc);break;
		case 2:login(sc);break;
		default:System.out.println("Wrong Option Entered");
		}
		}
	}
	public static void createAccount(Scanner sc) {
		System.out.println();
		System.out.print("create  Account ");
		System.out.println();
		System.out.print("Username : ");
		sc.nextLine();
		username=sc.nextLine();
		System.out.print("Password");
		pass=sc.next();
		System.out.print("Contact Number : ");
		phone=sc.next();
		System.out.println();
		System.out.print("Account Created:");
		System.out.println();
	}
	public static void login(Scanner sc) {
		if(username!=null) {
			for(int i=1;i<=3;i++) {
				System.out.println(" ");
				System.out.println("    Login Page   ");
				System.out.println();
				System.out.print("Username/contactNo  : ");
				sc.nextLine();
				String un1=sc.nextLine();
				System.out.print("Password: ");
				String pass1=sc.next();
				
				if((un1.equals(username)||(un1.equals(phone)))&&(pass1.equals(pass))) {
					homePage(sc);
					
				}
				else {
					System.out.println();
					System.out.println("Wrong cred Entered");
					System.out.println();	
				}	
			}
			System.exit(0);
		}
		else {
			System.out.println("Create your account First");
		}
	}
	public static void homePage(Scanner sc) {
		for(; ; ) {
			System.out.println();
			System.out.println(" HOMEPAGE ");
			System.out.println();
			System.out.println("1.VEG MENU");
			System.out.println("2.NON-VEG MENU");
			System.out.println("3. CHECKOUT");
			System.out.println("4.LOGOUT");
			System.out.println();
			System.out.print("Enter an option:");
			int option=sc.nextInt();
			switch(option) {
			case 1:vegMenu(sc);break;
			case 2:nonvegmenu(sc);break;
			case 3:checkout(sc);break;
			case 4:System.exit(0);
			System.out.println("THANK U NEVER VISIT AGAIN");break;
			default:System.out.println("wrong option");break;
			
			}
			
		}
	}
	public static void vegMenu(Scanner sc) {
		for(; ;) {
			System.out.println();
			System.out.println("veg Dishes");
			System.out.println("101.Paneer Tikka: 200");
			System.out.println("102.Kaju Curry: 300");
			System.out.println("103.Veg maratha:350");
			System.out.println("104.Dal Tadka: 200");
			System.out.println("105.Veg Biryani:400");
			System.out.println("106.Menu");
			System.out.println();
			System.out.println("Enter a Dish Id");
			int id=sc.nextInt();
			switch(id) {
			case 101:cart.add("PannerTikka:200");
			                 bill+=200;
			System.out.println("Paneer tikka Added inside the cart");break;
			case 102:cart.add("Kaju Curry:300");
			bill+=300;
			System.out.println("Kaju Curry Added inside the cart");break;
			case 103:cart.add("Veg maratha:350");
			bill+=350;
			System.out.println("Veg maratha Added inside the cart");break;
			case 104:cart.add("Dal Tadka: 200");
			bill+=200;
			System.out.println("Dal Tadka Added inside the cart");break;
			case 105:cart.add("Veg Biryani:400");
			bill+=400;
			System.out.println("Veg BiryaniAdded inside the cart");break;
			case 106:return;
			default:System.out.println("Wrong Dish Id");
			
			}
			
		}
	}
	public static void nonvegmenu(Scanner sc) {
		for(; ;) {
			System.out.println();
			System.out.println("Nonveg Dishes");
			System.out.println("107.Chicken Masala: 200");
			System.out.println("108.Fish Curry: 300");
			System.out.println("109.Nonveg Biryani:350");
			System.out.println("106.Menu");
			System.out.println();
			System.out.println("Enter a Dish Id");
			int id=sc.nextInt();
			switch(id) {
			case 107:cart.add("Chicken Masala:200");
			bill+=200;
			System.out.println("Chicken Masala Added inside the cart");break;
			case 108:cart.add("Fish Curry:200");
			bill+=200;
			System.out.println("Fish Curry Added inside the cart");break;
			case 109:cart.add("Nonveg Biryani:350");
			bill+=350;
			System.out.println("Nonveg Biryani Added inside the cart");break;
			
			case 106:return;
			default:System.out.println("Wrong Dish Id");
			
			}
			
		}
	}
	public static void cart(Scanner sc) {
		System.out.println(" YOUR PURCHASED FOOD IS:-");
		System.out.println();
		for(String food: cart) {
			System.out.println(food);
		}
		System.out.println();
		System.out.println("Your total bill is:->"+bill+"rs");
		System.out.println();
		System.exit(0);
	}
	public static void checkout(Scanner sc) {
//		System.out.println("checkout tomorrow");
		cart(sc);
	}

}
