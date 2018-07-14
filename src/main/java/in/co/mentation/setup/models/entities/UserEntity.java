package in.co.mentation.setup.models.entities;

import in.co.mentation.setup.common.enums.UserStatus;

import javax.persistence.*;

@Entity(name = "User")
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer ID;

    public  String username;

    public String password;

    @Enumerated(EnumType.STRING)
    public UserStatus status;


    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }
}
