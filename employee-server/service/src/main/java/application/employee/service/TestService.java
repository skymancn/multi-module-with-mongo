package application.employee.service;

import application.employee.config.EmployeeConfigContext;
import application.employee.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by admin on 2017-11-25.
 */
public class TestService {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(EmployeeConfigContext.class);
        EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);

        Employee employee = new Employee();
        employee.setCode("E02");
        employee.setName("Skymancn");
        employeeService.addEmployee(employee);

        System.out.println(employeeService.getEmployees());
    }
}
