//method demo2 using Scanner input type
import java.util.*;
class DemoMethod2{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("==Show name Mail and phone");
		System.out.println("Enter name:---");
		String a=s.nextLine();
		System.out.println("Enter Mail:---");
		String b=s.nextLine();
		System.out.println("Enter Phone number:---");
		long c=s.nextLong();
		System.out.println("Name:--"+a);
		System.out.println("Mail id:--"+b);
		System.out.println("Phone no:--"+c);
	}
}
