package dayOneEmployeecom.Employee;

public class Employee {
private String name,gmail;
private int age;
public Employee(String name,int age,String gmail)
{
	this.age=age;
	this.gmail=gmail;
	this.name=name;
}
public String toString()
{
	return "name: "+this.name+
			" age: "+this.age+
			" gmail: "+this.gmail;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGmail() {
	return gmail;
}
public void setGmail(String gmail) {
	this.gmail = gmail;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
}
