package sample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.Comparator;

public class Group {
		private String groupName;
		private final Student[] students = new Student[10];

		
		public Group() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Group(String groupName, Student[] students) {
			super();
			this.groupName = groupName;
			
}

		public String getGroupName() {
			return groupName;
		}
		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}
		public Student[] getStudents() {
			return students;
		}
	 public void addStudent (Student student) throws GroupOverflowException {
			for(int i = 0; i < students.length; i++) {
				if(students[i] == null) {
					students [i] = student;
					return;
				}
			  }
			throw new GroupOverflowException("Overflow");
		    }
		
		public Student searchStudentByLastName(String lastName) throws StudentNotFoundException {
			for(int i = 0; i < students.length; i++) {
			 if (students[i]!= null) {
				if(students[i].getLastName().equals(lastName)) {
			       return students[i];
				}
			  }
			}
			 throw new StudentNotFoundException("Error. No student found");
		 }
			
		public boolean removeStudentByID(int id) {
			for(int i = 0; i < students.length; i++) {
				if (students[i]!= null) {
						if(students[i].getId() == id) {
							students[i] = null;
							return true;
				 }
			   }     
			 }
			return false;
        }

		@Override
		public String toString() {
			String result = "Group " + groupName + "\".Students:" + System.lineSeparator();
			  for (int i = 0; i < students.length; i++) {
			   if(students[i] != null) {
			    result+=students[i] + System.lineSeparator();
			   }
			  }
			return result; 
			}
		public void sortStudentsByLastName() {
			Arrays.sort(students, Comparator.nullsLast(new StudentSortComparator()));
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + Arrays.hashCode(students);
			result = prime * result + Objects.hash(groupName);
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Group other = (Group) obj;
			return Objects.equals(groupName, other.groupName) && Arrays.equals(students, other.students);
		}	
      }
