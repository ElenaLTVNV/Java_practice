package sample;


import java.util.Arrays;
import java.util.Comparator;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Student s1 = new Student("Name1","LastName1", Gender.MALE, 1, "Java Friends");
	Student s2 = new Student("Name2","LastName2", Gender.FEMALE, 2, "Java Friends");
	Student s3 = new Student("Name3","LastName3", Gender.MALE, 3, "Java Friends");
	Student s4 = new Student("Name4","LastName4", Gender.MALE, 4, "Java Friends");
	Student s5 = new Student("Name5","LastName5", Gender.FEMALE, 5, "Java Friends");
	Student s6 = new Student("Name6","LastName6", Gender.MALE, 6, "Java Friends");
	Student s7 = new Student("Name7","LastName7", Gender.MALE, 7, "Java Friends");
	Student s8 = new Student("Name8","LastName8", Gender.FEMALE, 8, "Java Friends");
	Student s9 = new Student("Name9","LastName9", Gender.FEMALE, 9, "Java Friends");
	Student s10 = new Student("Name10","LastName10", Gender.MALE, 10, "Java Friends");
	Student s11 = new Student("Name11","LastName11", Gender.FEMALE, 11, "Java Friends");
	Student s12 = new Student("Name12","LastName12", Gender.FEMALE, 12, "Java Friends");
	
	Group g = new Group("Java Friends",null);
	System.out.println(g);
	try {
		
	g.addStudent(s1);
	g.addStudent(s2);
	g.addStudent(s3);
	g.addStudent(s4);
	g.addStudent(s5);
	g.addStudent(s6);
	g.addStudent(s7);
	g.addStudent(s8);
	g.addStudent(s9);
	g.addStudent(s10);
	
	System.out.println(g);
	
	}catch(GroupOverflowException e) {
		e.printStackTrace();
	}
	System.out.println();
	
	try {
	    System.out.println("Search by last name: ");
	    System.out.println(g.searchStudentByLastName("LastName8"));
	    
	   } catch (StudentNotFoundException e) {
	    e.printStackTrace();  
	   }
	   System.out.println();
	   System.out.println("Remove by Id: ");
	   System.out.println(g.removeStudentByID(2));
	   System.out.println(g.removeStudentByID(13));
	   
	   Student[] students = new Student[] {s1, s2, null, s3, s4, null, s5, s6, s7, s8, s9, s10};
		  
	   
	   Arrays.sort(students, Comparator.nullsFirst(new StudentSortComparator()));
	   
	   System.out.println();
	   for (int i = 0; i < students.length; i++) {
		   System.out.println(students [i]);
	   }
	   
	   System.out.println(s1);
	   System.out.println(s2);

	   System.out.println(s1 == s2);
	   System.out.println(s1.equals(s2));
	    
	   System.out.println(s1.hashCode());
	   System.out.println(s2.hashCode());
	   
	  }
	  }
	


