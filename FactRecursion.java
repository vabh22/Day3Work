class Recur{
	public int logic(int f){
		if(f>=1){
		return f*logic(f-1);
		}
		else {
			return 1;
		}
	}
}
class FactRecursion{
	public static void main(String args[]){
		int  n=5;
		Recur obj=new Recur();
		int fact=obj.logic(n);
		System.out.println("Factorial=" +fact);
	}
}
