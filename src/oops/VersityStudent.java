package oops;


class Test{
	int roll;
	String name;
	double fee;
	
	Test(int roll, String name, double fee){
		this.roll = roll;
		this.name = name;
		this.fee = fee;
	}
	
	void display() {
		System.out.println("Student roll is "+roll+" . Name is "+name+" . Fee is "+fee+"$ .");
	}
}


public class VersityStudent {
	
	public static void main(String[] args) {
		
		Test st1 = new Test(101, "Rasel", 3000.55);
		Test st2 = new Test(102, "Mahmud", 56478.76);
		
		st1.display();
		st2.display();
		
	}

}
