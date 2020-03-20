//Program to check if the String is Null in Java
import java.util.*;	

class NullStringChecker{
 public static boolean isStringNull(String st){
	if(st==null)
			return true;		
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st2= sc.nextLine();


		String st3= null;

		System.out.println("Is String ["+ st2+"] Null ? "+isStringNull(st2));
		System.out.println("Is String ["+ st3+"] Null ? "+isStringNull(st3));

		st3=sc.nextLine();

		System.out.println("Is String ["+ st2+"] Null ? "+isStringNull(st2));
		System.out.println("Is String ["+ st3+"] Null ? "+isStringNull(st3));
	}
}