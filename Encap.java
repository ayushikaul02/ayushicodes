package ayushicodes;

class Student{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

    public int getAge() {
    	return age;
    }

    public void setName(String n) {
    	name=n;
    }
    public void setAge(int a) {
    	if(a>0) {
    		age=a;
    	}
    	else {
    		System.out.println("Age must be positive!");
    	}
    		
    }
}
public class Encap {
	public static void main(String[] args) {
		Student s1=new Student();
		
		s1.setName("Ayushi");
		s1.setAge(20);
		
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
	}

}
