package jason.toyproject.jmtfinder.app.store.entity;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class StoreEntity {


    @Id @GeneratedValue
    private String storeId;

    private String storeCd;

    private String sotreNm;

    @OneToMany
    private List<MenuEntity> menus;

    @OneToOne
    private Address address;

    @OneToOne
    private BusinessHour businessHour;






}
