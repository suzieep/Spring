//package videocall.prototype.repository;
//
//import org.springframework.stereotype.Repository;
//import videocall.prototype.domain.Channel;
//
//import javax.persistence.EntityManager;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//
//@Repository
//public class JpaChannelRepository implements ChannelRepository{
//
//    private final EntityManager em;
//    @Override
//    public Channel save(Channel channel) {
//        em.persist(channel); //insert 대신 사용
//        return channel;
//    }
//
//    @Override
//    public Optional<Channel> findById(Long id) {
//        Channel channel = em.find(Channel.class,id);
//        return Optional.ofNullable(channel);
//    }
//
//    @Override
//    public List<Channel> findByGroupId(Long groupId) {
//        return new ArrayList<>(
//                em.values().stream()
//                        .filter(channel -> channel.getId()==groupId)
//                        .collect(Collectors.toList()));
//
//
//    }
//
//}
