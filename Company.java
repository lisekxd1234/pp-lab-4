import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[7];

        employees[0] = new Manager("Karol Bielecki", 3500, 0);
        employees[1] = new Worker("Julia Wojciechowska", 4200, "Accountant");
        employees[2] = new Employee("Robert Łukasik", 3900);
        employees[3] = new Employee("Ewa Baran", 4700);
        employees[4] = new Worker("Tomasz Leśniak", 3000, "HR Specialist");
        employees[5] = new Manager("Alicja Nowak", 3400, 0);
        employees[6] = new Worker("Krzysztof Krawczyk", 3600, "Developer");

        for (Employee emp : employees) {
            emp.setSalary(emp.getSalary() + 500);
        }

        ((Manager)employees[0]).setNumberOfSubordinates(6);
        ((Manager)employees[0]).setSalary(7500);
        ((Manager)employees[5]).setNumberOfSubordinates(6);
        ((Manager)employees[5]).setSalary(7500);

        System.out.println("Lista wszystkich pracowników:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
