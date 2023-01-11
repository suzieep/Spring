package videocall.prototype.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
