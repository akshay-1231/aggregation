package aggregation1;

public class Student {
   int rollNo;
   String name;
   String address;
public Student(int rollNo, String name, String address) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	this.address = address;
}
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + "]";
}
   public void display() {
	   
   }
   
}
