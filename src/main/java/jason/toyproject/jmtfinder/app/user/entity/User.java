package jason.toyproject.jmtfinder.app.user.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private String userId;

    private String userEmail;

    private String userNm;


    private String userPw;

}
