package pack2;

public class employee {
	int empId;
	String empName;
	//parameterized constructor with two parameters
	employee(int id, String name){
	this.empId = id;
	this.empName = name;
	}
	void info(){
	System.out.println("Id: "+empId+" Name: "+empName);
	}
	public static void main(String args[]){
	employee obj1 = new employee(10245,"Chaitanya");
	employee obj2 = new employee(92232,"Negan");
	obj1.info();
	obj2.info();

}
}
