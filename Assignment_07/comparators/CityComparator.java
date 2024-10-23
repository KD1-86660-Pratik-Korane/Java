package comparators;

import java.util.Comparator;

import entities.Student;

public class CityComparator implements Comparator<Student>{
	@Override
	public  int compare(Student o1, Student o2) {
		 return o1.getCity().compareTo(o2.getCity());
	}
}