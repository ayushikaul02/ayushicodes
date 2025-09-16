package ayushicodes;


class Parent{ 
	public void add(int a) {
    	System.out.println(a+a);
	
	}
}

class Child extends Parent
{
	public void add(int a) {
		System.out.println(a*a);
	}
}

public class Inher{ 
	public static void main(String[] args) {
		Parent child=new Parent();
		child.add(12);
  
    }
}
