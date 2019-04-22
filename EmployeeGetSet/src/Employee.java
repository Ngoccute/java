
public class Employee {
public String name;
public int id;
public double salary;
public int age;
public boolean marry;
public Job job;
public Employee(String name, int id , double salary,int age ,boolean marry,Job job) {
	this.name=name;
	this.id=id;
	this.salary=salary;
	this.age=age;
	this.marry=marry;
	this.job=job;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public boolean isMarry() {
	return marry;
}
public void setMarry(boolean marry) {
	this.marry = marry;
}
public Job getJob() {
	return job;
}
public void setJob(Job job) {
	this.job = job;
}

}
