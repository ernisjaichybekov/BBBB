import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        try {

            employees.add(new Employee("Ernis", 16, "Student"));
            employees.add(new Employee("Alice", -5, "Developer"));


            for (Employee emp : employees) {
                System.out.println(emp.toString());
            }


            System.out.println(employees.get(5));

        } catch (InvalidAgeException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());

        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception: Trying to access null value");

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index Out Of Bounds Exception: Invalid index access");

        } catch (Exception e) {
            System.out.println("General Exception Caught: " + e.getMessage());
        } finally {
            System.out.println("Бутту");
}

    }
}