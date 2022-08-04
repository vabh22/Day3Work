//static block example 
class STest//subclass
{
	int a=10;//instance variable
	static int b=20;//static variable
	static //static block
	{
		System.out.println("Sub class static block");
		//System.out.println("The value of a"+a);//not excuted because static block can not access instance variable
		System.out.println("The valuw of b"+b);
	}
}
class DemoStaticBlock{
	int x=100;//instance
	static int y=200;//static variable
	public static void main(String args[]){
		System.out.println("Main class method");
		//System.out.println("the value of x:"+x);//getting error
		System.out.println("The value of y:"+y);
		STest obj1=new STest();
	}
	
		static{
			System.out.println("Mainclas static block");
			//System.out.println("The value x:"+x);//error
			System.out.println("The value of y:"+y);
		}
		}
	

	

	
	