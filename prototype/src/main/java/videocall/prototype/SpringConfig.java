package videocall.prototype;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import videocall.prototype.controller.ChannelController;
import videocall.prototype.repository.ChannelRepository;
import videocall.prototype.service.ChannelService;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private final ChannelRepository channelRepository;

    public SpringConfig(ChannelRepository channelRepository){
        this.channelRepository = channelRepository;
    }

    @Bean
    public ChannelService channelService(){
        return new ChannelService(channelRepository);
    }



}
