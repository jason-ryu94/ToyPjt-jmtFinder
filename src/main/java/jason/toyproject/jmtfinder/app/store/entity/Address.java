package jason.toyproject.jmtfinder.app.store.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

    @Id
    private String Id;

    private String AllAddr;

    private String latitude;

    private String longtitude;

}
