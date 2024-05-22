package lab2;

public class Student {
	String studentName = "Zake";
	String address = "Kathmandu";
	int phoneNumber = 123456789;

	public static void main(String[] args) {
		Student StudObj = new Student();
		String myName = StudObj.studentName;
		String myAddress = StudObj.address;
		int myPhone = StudObj.phoneNumber;
		System.out.println("====first Output====");
		System.out.println(myName + "\n" + myPhone + "\n" + myAddress);
		System.out.println("====Second Output====");
		System.out.println(myName + myPhone + myAddress);
		System.out.println("====Third Output====");
		System.out.println(myName + "\t" + myPhone + "\t" + myAddress);
	}

}
