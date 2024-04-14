package employees;

public class Employee {
    // przechowuje pełne imię i nazwisko pracownika
    protected String fullName;
    // przechowuje wynagrodzenie pracownika
    protected double salary;

    // konstruktor inicjalizujący pola klasy
    public Employee(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    // zwraca pełne imię i nazwisko pracownika
    public String getFullName() {
        return fullName;
    }

    // zwraca wynagrodzenie pracownika
    public double getSalary() {
        return salary;
    }

    // ustawia nowe wynagrodzenie pracownika
    public void setSalary(double newSalary) {
        this.salary = newSalary;
    }

    // zwraca reprezentację tekstową obiektu pracownika
    @Override
    public String toString() {
        return "Employee: " + fullName + ", Salary: " + salary;
    }
}
