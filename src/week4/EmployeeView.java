package week4;

public class EmployeeView {

    public void updateView(Employee... employees){
        System.out.println();
        for (Employee employee: employees) {
            System.out.printf("Employee id: %s, salary: %s%n", employee.getId(), employee.getSalary());
        }
        System.out.println();
    }

}
