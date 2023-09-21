package oops;

public class ConstructorOverloading {

	public static void main(String[] agrs) {
		// parameterize constructor
		Student st1 = new Student(101, "Rasel");
		Student st2 = new Student(102, "Mahmud", 22);

		// printing details
		st1.showStudent();
		st2.showStudent();
	}

}

class Student {
	int id;
	String name;
	int age;

	// two argument constructor

	Student(int i, String n) {
		id = i;
		name = n;
	}

	// three argument constructor

	Student(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}

	void showStudent() {
		System.out.println(id + " " + name + " " + age);
	}

}
