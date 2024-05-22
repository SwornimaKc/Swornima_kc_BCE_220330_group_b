package lab2;

public class MyInfo {
	private String name = "Zake";
	private String address = "Kathmandu";
	private int phone = 123456789;

	public static void main(String[] args) {
		MyInfo Obj = new MyInfo();
		String myName = Obj.name;
		String myAddress = Obj.address;
		int myPhone = Obj.phone;
		
		Obj.name = " jolie ";
		Obj.address = " Lalitpur ";
		Obj.phone =  987654321;
		System.out.println(Obj.name + Obj.address + Obj.phone);

	}

}
