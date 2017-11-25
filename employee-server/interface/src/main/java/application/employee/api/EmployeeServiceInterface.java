package application.employee.api;

import application.employee.model.Employee;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Collection;

/**
 * Created by admin on 2017-11-25.
 */
@Path("/employee")
public interface EmployeeServiceInterface {

    @GET
    @Path("/employees")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Employee> getEmployees();

    public void addEmployee(Employee employee);
}
