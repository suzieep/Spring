package videocall.prototype.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import videocall.prototype.domain.Channel;
import videocall.prototype.repository.ChannelRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
@Transactional

public class ChannelService {
    private final ChannelRepository channelRepository;

    public ChannelService(ChannelRepository channelRepository) {
        this.channelRepository = channelRepository;
    }


    public List<Channel> getChannelsByGroupId(Long groupId){
        return channelRepository.findByGroupId(groupId);
    }

    public Optional<Channel> getChannelById(Long channelId){
        return channelRepository.findById(channelId);
    }
    public List<Channel> getChannels(){
        return channelRepository.findAll();
    }
}
