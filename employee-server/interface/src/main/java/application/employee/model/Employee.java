package application.employee.model;

import org.springframework.data.mongodb.core.mapping.Document;
import platform.persistence.model.ModelBase;
/**
 * Created by admin on 2017-11-25.
 */
@Document(collection = "Employee")
public class Employee  extends ModelBase {
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;


}
