package videocall.prototype.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity

public class Channel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Long channelTypeId;
    private Long groupId;

//    @ManyToOne
//    @JoinColumn(name ="GROUP_ID")
//    private Group group;
}
