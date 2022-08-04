//Programs using operators with using switch case
import java.util.*;
class Addition{
	int add(int a, int b){
		return a+b;
	}
}
class Substraction{
	int sub(int a,int b){
		return a-b;
	}
}
class Multiplication{
	int mul(int a,int b){
		return a*b;
	}
}
class Division{
	float div(int a, int b){
		return (float)a/b;
	}
}
class ModDiv{
	int mdiv(int a,int b){
		return a%b;
	}
}
class ArithmeticEx{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("===Airthmatic operators====");
		System.out.println("Enter first value");
		int v1=s.nextInt();
		System.out.println("Enter second value");
		int v2=s.nextInt();
		System.out.println("===choice===");
		System.out.println("1.add\n 2.sub\n 3.mult\n 4.Div\n 5.Moddiv");
		System.out.println("Enter your choice");
		int ch=s.nextInt();
		switch(ch){
			case 1:
				Addition ad = new Addition();
				int result1 = ad.add(v1,v2);
				System.out.println("Sum:"+result1);
				break;
			case 2:
				Substraction sb = new Substraction();
				int result2 = sb.sub(v1,v2);
				System.out.println("Subtract:"+result2);
				break;
			case 3:
				Multiplication mu= new Multiplication();
				int result3=mu.mul(v1,v2);
				System.out.println("Multiplication:"+result3);
				break;
			case 4:
				Division dv=new Division();
				float result4=dv.div(v1,v2);
				System.out.println("Division:"+result4);
				break;
			case 5:
				ModDiv md=new ModDiv();
				int result5=md.mdiv(v1,v2);
				System.out.println("Modular division:"+result5);
				
			default:
				System.out.println("Invalid choice");
		}
	}
}

		
		
		
	