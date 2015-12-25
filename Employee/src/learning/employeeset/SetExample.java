package learning.employeeset;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<String> mySet = new HashSet<String>();
		
		mySet.add("hello");
		mySet.add("hi");
		mySet.add("hello");
		
		for(String st : mySet){
			System.out.println(st);
		}

	}

}
