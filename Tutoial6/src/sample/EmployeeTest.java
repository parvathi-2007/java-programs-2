package sample;

import module2.Employee;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee = new Employee(50000);

        System.out.println("Salary: " + employee.salary);

        employee.showSalary();
    }
}
