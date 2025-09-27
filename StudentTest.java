package textcode;

	class Student {
	   
	    int studentID;
	    String name;
	    double marks;

	    static int totalStudents = 0;

	    Student(int studentID, String name, double marks) {
	        this.studentID = studentID;
	        this.name = name;
	        this.marks = marks;

	        totalStudents++;
	    }

	    void displayDetails() {
	        System.out.println("Student ID: " + studentID);
	        System.out.println("Name: " + name);
	        System.out.println("Marks: " + marks);
	        System.out.println("----------------------");
	    }
	}


	public class StudentTest {
	    public static void main(String[] args) {
	        
	        Student s1 = new Student(101, "Ayushi", 89.5);
	        Student s2 = new Student(102, "Nidhi", 92.0);
	        Student s3 = new Student(103, "Harshi", 85.0);
	        
	        s1.displayDetails();
	        s2.displayDetails();
	        s3.displayDetails();

	        
	        System.out.println("Total number of students created: " + Student.totalStudents);
	    }
	}

	