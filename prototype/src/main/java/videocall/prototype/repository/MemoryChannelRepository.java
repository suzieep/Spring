//package videocall.prototype.repository;
//
//import org.springframework.stereotype.Repository;
//import videocall.prototype.domain.Channel;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class MemoryChannelRepository implements ChannelRepository{
//    private static Map<Long, Channel> store = new HashMap<>();
//    private static long sequence = 0L;
//
//    @Override
//    public Channel save(Channel member) {
//        member.setId(++sequence);
//        store.put(member.getId(),member);
//        return member;
//    }
//
//    @Override
//    public Optional<Channel> findById(Long id) {
//        return Optional.ofNullable(store.get(id));
//    }
//
//    @Override
//    public List<Channel> findByGroupId(Long groupId) {
//        return new ArrayList<>(
//                store.values().stream()
//                .filter(channel -> channel.getId()==groupId)
//                .collect(Collectors.toList()));
//
//
//    }
//    public void clearStore(){
//        store.clear();
//    }
//
//}
