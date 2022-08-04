/*type casting program 
when we read string data after numeric data the string
data will be skipped while reading from keyboard so we use parse()
*/
import java.util.*;
class TypeCastEx{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the User Name");
		String n=s.nextLine();
		System.out.println("Enter the Mail id");
		String m=s.nextLine();
		System.out.println("Enter the phone number");
		//long phno=s.nextLong();
		long phno=Long.parseLong(s.nextLine());
		System.out.println("Enter the Address");
		String a=s.nextLine();
		System.out.println("====Your Inserted Data====");
		System.out.println("User Name:"+n);
		System.out.println("User Mail:"+m);
		System.out.println("User Phone:"+phno);
		System.out.println("User Address:"+a);
	}
}
