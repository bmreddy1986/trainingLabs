package demo.lab7.constructor;

public class ConstructorDemoRun {

	public static void main(String[] args) {
		
		/*
		 * System.out.println("default constructor"); Employee e1 = new Employee();
		 * System.out.println("Name: " + e1.name); System.out.println("Id: " + e1.id);
		 */
		
		System.out.println("single param constructor");
		Employee emp = new Employee("Manohar");
		System.out.println("Name: " + emp.name);
		System.out.println("Id: " + emp.getId());
		
		/*
		 * System.out.println("two param constructor"); Employee e2 = new
		 * Employee("Manohar", 10283); System.out.println("Name: " + e2.name);
		 * System.out.println("Id: " + e2.id);
		 */
	}

}
