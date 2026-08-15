package module2;

public class Employee
{
	protected int salary;
	Employee(int salary)
	{
		this.salary = salary;
	}
	protected void showSalary()
	{
		System.out.println("Salary:"+ salary);
		
	}
}

class Manager extends Employee {

    Manager(int salary) {
        super(salary);
    }

    void showDetails() {
        System.out.println("Salary using variable: " + salary);
       showSalary();
    }
}
 class main {
	
	    public static void main (String[] args) {

	        Manager manager = new Manager(50000);

	        manager.showDetails();
	    }
	}


