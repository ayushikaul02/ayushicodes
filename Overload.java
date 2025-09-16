package ayushicodes;

class Printer{
	void print(int n) {
		System.out.println("Printing int:"+n);
	}
	void print(String s) {
		System.out.println("Printing String:" + s);
	}
	
}

public class Overload {
	public static void main(String[] args) {
		Printer p=new Printer();
		p.print(100);
		p.print("Hello");
	}

}
