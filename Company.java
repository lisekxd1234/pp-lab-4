public class Company {
    public static void main(String[] args) {
        // tworzy tablicę pracowników
        Employee[] employees = new Employee[5];

        // dodaje pracowników do tablicy z nowymi imionami i nazwiskami
        employees[0] = new Employee("Karol Bielecki", 3500);
        employees[1] = new Employee("Julia Wojciechowska", 4200);
        employees[2] = new Employee("Robert Łukasik", 3900);
        employees[3] = new Employee("Ewa Baran", 4700);
        employees[4] = new Employee("Tomasz Leśniak", 3000);

        // wyświetla informacje o pracowniku z indeksu 3
        System.out.println("Dane pracownika o indeksie 3: " + employees[3]);

        // modyfikuje wynagrodzenie pracownika o indeksie 3
        employees[3].setSalary(5000);

        // wyświetla informacje o wszystkich pracownikach
        System.out.println("Lista wszystkich pracowników:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}