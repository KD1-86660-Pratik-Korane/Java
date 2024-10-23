package comparators;

import java.util.Comparator;

import entities.Student;

public class MarksComparator implements Comparator<Student>{
	 @Override
	public int compare(Student o1, Student o2) {
		 return Double.compare(o2.getMarks(), o1.getMarks());
	}
}