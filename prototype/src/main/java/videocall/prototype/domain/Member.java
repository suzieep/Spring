package videocall.prototype.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @ManyToOne
    @JoinColumn(name ="GROUP_ID")
    private Group group;

    @ManyToOne
    @JoinColumn(name ="USER_ID")
    private User user;
}
