package example1;

import java.util.ArrayList;

public class ex1_parameters {
	
	public static void main(String [] args) {
		
//System.out.println(s1);
	
	search();
	
	

		
	}
	
	static void search() {
		Person p1=new Person("John",24, "Engineer");	
		Person p2=new Person("Adam",22, "Trainee");
		Person p3=new Person("Luke",27, "Nothing");
		Person p4=new Person("Mark",29, "Loser");

		ArrayList <Person> people = new ArrayList<Person>();
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		
	for (Person i :people) {
		if (i.name=="Mark") {
			System.out.println(i);	
		}

	}	
	}	
}
	
	
	

