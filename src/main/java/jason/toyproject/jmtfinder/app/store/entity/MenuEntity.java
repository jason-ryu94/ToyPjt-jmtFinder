package jason.toyproject.jmtfinder.app.store.entity;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MenuEntity {

    @Id @GeneratedValue
    private String menuId;

    @ManyToOne
    private StoreEntity Store;

    private String menuNm;

    private String price;

    private String categoryCd;

    private String categoryNm;

    private String useYn;

    private String imgUrl;



}
