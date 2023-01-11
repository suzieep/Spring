package videocall.prototype.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import videocall.prototype.domain.Channel;

import java.util.List;
import java.util.Optional;

public interface SpringDataJpaChannelRepository extends JpaRepository<Channel,Long> ,ChannelRepository {
    @Override
    Optional<Channel> findByName(String name);

    @Override
    List<Channel> findAll();
}
