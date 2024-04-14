package employees;

public class Manager extends Employee {
    // przechowuje liczbę podwładnych
    public int numberOfSubordinates;

    public Manager(String fullName, double salary, int numberOfSubordinates) {
        super(fullName, salary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    // zwraca liczbę podwładnych
    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    // ustawia liczbę podwładnych
    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    // zwraca reprezentację tekstową obiektu menedżera
    @Override
    public String toString() {
        return "Manager: " + getFullName() + ", Salary: " + getSalary() + ", Subordinates: " + numberOfSubordinates;
    }
}
