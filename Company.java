import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        // tworzy tablicę pracowników
        Employee[] employees = new Employee[5];

        // dodaje pracowników do tablicy, uwzględniając nowe klasy
        employees[0] = new Manager("Karol Bielecki", 3500, 0);
        employees[1] = new Worker("Julia Wojciechowska", 4200, "Accountant");
        employees[2] = new Employee("Robert Łukasik", 3900);
        employees[3] = new Employee("Ewa Baran", 4700);
        employees[4] = new Worker("Tomasz Leśniak", 3000, "HR Specialist");

        // wyświetla informacje o wszystkich pracownikach
        System.out.println("Lista wszystkich pracowników:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
