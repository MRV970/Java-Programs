package Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Student_Details {

	ArrayList<Student> list;

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList();
		Student s1 = new Student("abc", 1, 'A');
		Student s2 = new Student("def", 2, 'B');
		Student s3 = new Student("mrv", 5, 'D');
		Student s4 = new Student("manju", 3, 'e');
		Student s5 = new Student("ghj", 4, 'x');
		Student s6 = new Student("ram", 9, 'y');
		Student s7 = new Student("sita", 10, 'f');
		Student s8 = new Student("krish", 11, 'Z');
		Student s9 = new Student("radha", 31, 'M');
		Student s10 = new Student("nishi", 23, 'n');
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		list.add(s7);
		list.add(s8);
		list.add(s9);
		list.add(s10);

//		// Ascending order by Id
//		Collections.sort(list,new Comparator<Student>() {
//
//			@Override
//			public int compare(Student s1, Student s2) {
//				
//				return Integer.compare(s1.getId(), s2.getId());
//			}
//			
//		});System.out.println("***** Ascending order by Id*****");
//		for(Student s:list) {
//			
//			System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getName());
//		}
//		
//		
//		
//		
//		//decending order by id
//		Collections.sort(list,new Comparator<Student>() {
//
//			@Override
//			public int compare(Student s1, Student s2) {
//				
//				return Integer.compare(s2.getId(), s1.getId());
//			}
//			
//		});
//		System.out.println("****Descending order by Id*****");
//		for(Student s:list) {
//			
//			System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getGrade());
//		}

// Ascending order by Grade

		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {

				return Character.compare(s1.getGrade(), s2.getGrade());
			}

		});

		System.out.println("******Ascending order by Grade*****");
		for (Student s : list) {
			System.out.println(s.getGrade() + "\t" + s.getId() + "\t" + s.getName());
		}

		// Descending order by Grade
		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {

				return Character.compare(s2.getGrade(), s1.getGrade());
			}

		});

		System.out.println("******Descending order by Grade*******");
		for (Student s : list) {
			System.out.println(s.getId() + "\t" + s.getGrade() + "\t" + s.getName());
		}

		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {

				return s1.getName().compareTo(s2.getName());
			}

		});
//		System.out.println("*******Ascending order by names******");
//		for(Student s:list) {
//			
//			System.out.println(s.getName()+"\t"+s.getGrade()+"\t"+s.getId());
//		}
//		Collections.sort(list,new Comparator<Student>() {
//
//			@Override
//			public int compare(Student s1, Student s2) {
//				
//				return s2.getName().compareTo(s1.getName());
//			}
//			
//		});System.out.println("*******descending order by  Name*******");
//		for(Student s:list) {
//			
//			System.out.println(s.getName()+"\t"+s.getGrade()+"\t"+s.getId());
//		}
	}

}
