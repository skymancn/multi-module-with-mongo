package platform.persistence.model;

import org.springframework.data.annotation.Id;

/**
 * Created by admin on 2017-11-25.
 */
public class ModelBase {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    @Id
    private String id;
}
