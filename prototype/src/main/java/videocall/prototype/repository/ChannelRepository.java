package videocall.prototype.repository;


import videocall.prototype.domain.Channel;

import java.util.List;
import java.util.Optional;

public interface ChannelRepository {
    Channel save(Channel channel);
    Optional<Channel> findById(Long id);
    List<Channel> findByGroupId(Long groupId);
    Optional<Channel> findByName(String name);

    List<Channel> findAll();

}
