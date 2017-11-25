package application.employee.model;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by admin on 2017-11-25.
 */
@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String>
{
}
