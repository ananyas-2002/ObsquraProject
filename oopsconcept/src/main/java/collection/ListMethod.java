package collection;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {

	public static void main(String[] args) {
		
		List<String> students=new ArrayList<String>();
		students.add("Ananya");   //add method
		students.add("Ami");
		students.add("Arun");
		students.add("Sanvi");
		System.out.println(students);
		
		System.out.println(students.get(2));  //get method
		students.set(1, "Zara");             //set method
		System.out.println("Modified list: "+students);
		System.out.println("Size: "+students.size());  //size method
		System.out.println(students.isEmpty());      //isEmpty method
		students.remove(1);
		System.out.println("Modified list after removing: "+students); //remove method
		System.out.println(students.contains("Ananya"));     //contains method
		students.add("Ananya");
		System.out.println("After adding new element: "+students);
		System.out.println(students.indexOf("Ananya"));  //indexOf method
		System.out.println(students.lastIndexOf("Ananya"));   //lastIndexOf method

	}

}
