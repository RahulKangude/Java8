package predefine_functions;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Predicate_demo {
	public static void main(String[] args) {
		String[] arr = { "Rahul", "Rushikesh", "Pranav", "Vaibhav", "Suyash" };

		Predicate<String> pd = s1 -> s1.length() > 6;
		for (String p : arr) {
			if (pd.test(p)) {
				// System.out.println(p);
			}
		}

		ArrayList<Employee> e1 = new ArrayList<>();
		e1.add(new Employee(10, "Pankaj", 50000));
		e1.add(new Employee(15, "Venki", 65000));
		e1.add(new Employee(11, "Dhiraj", 45000));
		e1.add(new Employee(18, "om", 80000));
		e1.add(new Employee(14, "Sai", 35000));
		e1.add(new Employee(16, "Ram", 25000));

		Predicate<Employee> e = a -> a.salary >= 50000;
		for (Employee ee : e1) {
			if (e.test(ee)) {
				System.out.println(ee);
			}
		}

	}
}

class Employee {
	Integer Id;
	String name;
	Integer salary;

	public Employee(Integer id, String name, Integer salary) {
		super();
		Id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", salary=" + salary + "]";
	}

}