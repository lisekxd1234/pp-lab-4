package employees;

public class Worker extends Employee {
    // przechowuje pozycję pracownika
    public String position;

    public Worker(String fullName, double salary, String position) {
        super(fullName, salary);
        this.position = position;
    }

    // zwraca pozycję pracownika
    public String getPosition() {
        return position;
    }

    // ustawia nową pozycję pracownika
    public void setPosition(String position) {
        this.position = position;
    }

    // zwraca reprezentację tekstową obiektu pracownika
    @Override
    public String toString() {
        return "Worker: " + getFullName() + ", Salary: " + getSalary() + ", Position: " + position;
    }
}
