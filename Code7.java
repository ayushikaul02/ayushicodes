package experiments;

//Write a program in java to demonstrate method overloading
public class Code7 {
    public int add(int a,int b) {
    	return a+b;
    }
    public int add(int a, int b,int c) {
       return a+b+c;
    }
    public double add(double a, double b) {
    	return a+b;
    }
    
    public static void main(String[] args) {
		Code7 obj=new Code7();
		System.out.println("Sum of two integers:" + obj.add(7, 9));
		System.out.println("Sum of three integers:" + obj.add(2, 4,7));
		System.out.println("Sum of two double integers:" + obj.add(4.5, 6.5));
	}
}
