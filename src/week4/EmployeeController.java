package week4;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeController {

    private final ArrayList<Employee> employees = new ArrayList<>();   // models
    private final EmployeeView view;   // view

    public EmployeeController(EmployeeView view, Employee... employees) {
        Collections.addAll(this.employees, employees);
        this.view = view;
    }

    public void promoteEmployee(Employee... employees) {
        for (Employee employee: employees) {
            employee.salaryPromotion();
        }
        printInfo(employees);
    }

    public void printInfo(Employee... employees) {
        if (employees.length == 0){
            view.updateView(this.employees.toArray(Employee[]::new));
        } else {
            view.updateView(employees);
        }
    }

    public void addEmployeeToSystem(Employee... employees){
        Collections.addAll(this.employees, employees);
    }

}