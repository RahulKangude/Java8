package d.java8;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class Bi_function_demo {
public static void main(String[] args) {
	ArrayList<Employee> e=new ArrayList<>();
	BiFunction<Integer, String, Employee> f=(Emp_no,Emp_name)->new Employee(Emp_no,Emp_name);
	e.add(f.apply(100, "Rahul"));
	e.add(f.apply(200, "Ram"));
	e.add(f.apply(100, "Krish"));
	e.add(f.apply(100, "lala"));
	
	
	for (Employee employee : e) {
		System.out.println(employee);
	}
}
}

class Employee{
	Integer Emp_no;
	String Emp_name;
	public Employee(Integer emp_no, String emp_name) {
		super();
		Emp_no = emp_no;
		Emp_name = emp_name;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [Emp_no=" + Emp_no + ", Emp_name=" + Emp_name + "]";
	}
	
}