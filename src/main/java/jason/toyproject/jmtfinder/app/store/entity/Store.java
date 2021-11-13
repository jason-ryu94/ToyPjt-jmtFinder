package jason.toyproject.jmtfinder.app.store.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Store {


    @Id
    private String storeId;

    private String storeCd;


}
