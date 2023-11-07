package sample;


import java.util.Comparator;

public class StudentSortComparator implements Comparator {

		@Override
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			Student st1 = (Student) o1;
			Student st2 = (Student) o2;
			
			String LastName1 = st1.getLastName();
			String LastName2 = st2.getLastName();
			
			if(LastName1.compareTo(LastName2) > 0) {
				return 1;
			}
			if(LastName1.compareTo(LastName2) < 0) {
				return -1;
			}
			return 0;
		}
	}


