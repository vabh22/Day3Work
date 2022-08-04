class Demo1String{
	public static void main(String args[]){
		String s1="java";
		int len1=s1.length();
		String s2=new String("Program");
		int len2=s2.length();
		String s3=s1.concat(s2);//concatination
		int len3=s3.length();
		System.out.println("S1:"+s1.toString());
		System.out.println("length of s1:"+len1);
		System.out.println("s2:"+s2.toString());
		System.out.println("length of s2:"+len2);
		System.out.println("s3:"+s3.toString());
		System.out.println("length of s3:"+len3);
	}
}
		