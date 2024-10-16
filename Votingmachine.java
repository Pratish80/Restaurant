package Program;
import java.util.*;
public class Votingmachine {
	static int bjp,congress,aap,mns,sena,nota;
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("****VOTING MACHINE****");
		System.out.println();
		System.out.println("Enter the count of votes : ");
		System.out.println();
		int count=sc.nextInt();
		for(int i=1;i<count;i++) {
			System.out.println();
			System.out.println("1.BJP   2.CONGRESS  3.AAP  4.MNS  5.SENA  6.NOTA");
			System.out.println("Enter your option:");
			int option=sc.nextInt();
			System.out.println();
			
			switch(option) {
			case 1:bjp++;
			System.out.println("!!sabka saath sabka vikas!!");
			break;
			case 2:congress++;
			System.out.println("bharat jodo..");break;
			case 3:aap++;
			System.out.println("apka ek vote kare aazad..");break;
			case 4:mns++;
			System.out.println("jay baharat??");break;
			case 5:sena++;
			System.out.println("ek sena shivsena");break;
			case 6:nota++;
			System.out.println("your are educated::::::::::");break;
			default:System.out.println("Wrong option entered");
			i--;
			}
			
			
		}
		if(bjp>congress && bjp>aap && bjp>mns && bjp>sena && bjp>nota) 
			System.out.println("BJP won the Election BY "+bjp+"VOTES");
		
		else if(congress>bjp && congress>aap && congress>mns && congress>sena && congress>nota) 
			System.out.println("CONGRESS won the Election BY "+congress+"VOTES");
		
		else if(aap>bjp && aap>congress && aap>mns && aap>sena && aap>nota) 
				System.out.println("AAP won the Election BY "+aap+"VOTES");
		
		else if(mns>congress && mns>aap && mns>bjp && mns>sena && mns>nota) 
				System.out.println("MNS won the Election BY "+mns+"VOTES");
		
		else if(sena>congress && sena>aap && sena>bjp && sena>mns && sena>nota)
				System.out.println("SENA won the Election BY "+sena+"VOTES");
		
		else
					System.out.println("nota with"+nota+"VOTES");
		
		
	}

}
