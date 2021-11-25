package jason.toyproject.jmtfinder.app.store.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BusinessHour {

    @Id
    private String id;

    private String storeId;

    private String weekOpenTime;

    private String weekEndTime;

    private String weekendOpenTime;

    private String weekendEndTime;

}
