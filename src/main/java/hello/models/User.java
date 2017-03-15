package hello.models;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.Id;
import java.io.Serializable;
import javax.persistence.*;

/**
 * Created by hjing on 3/10/17.
 */
@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    public User(long id) {
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
