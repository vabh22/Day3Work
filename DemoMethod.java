class EmployeeData{
	String empid,ename,edesg;
	void setEmployeeData(String a,String b,String c){
		empid=a;
		ename=b;
		edesg=c;
	}
	void getEmployeeData(){
		System.out.println("==EmployeeData===");
		System.out.println("Employee id: "+empid);
		System.out.println("Employee : "+ename);
		System.out.println("Employee id: "+edesg);
	}
}
class EmployeeAddress{
	String hno,sname,city;
	int pincode;
	void setEmployeeAddress(String a,String b,String c,int d){
		hno=a;
		sname=b;
		city=c;
		pincode=d;
	}
	void getEmployeeAddress(){
		System.out.println("Employee house no: "+hno);
		System.out.println("Employee Street: "+sname);
		System.out.println("Employee city: "+city);
		System.out.println("Employee Pincode: "+pincode);
	}
}
class EmployeeContact{
	String email;
	long phno;
	void setEmployeeContact(String a, long b){
		email=a;
		phno=b;
	}
	void getEmployeeContact(){
		System.out.println("Employee mail id: "+email);
		System.out.println("Employee id: "+phno);
	}
}
class DemoMethod{
	public static void main(String args[]){
		EmployeeData ed= new EmployeeData();
		ed.setEmployeeData("A101","Raj","EE");
		ed.getEmployeeData();
		EmployeeAddress ea=new EmployeeAddress();
		ea.setEmployeeAddress("B10","BA99","KOlkata",70050);
		ea.getEmployeeAddress();
		EmployeeContact ec=new EmployeeContact();
		ec.setEmployeeContact("raj123@gmail.com",98273366l);
		ec.getEmployeeContact();
	}
}
		