package videocall.prototype.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import videocall.prototype.domain.Channel;
import videocall.prototype.service.ChannelService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ChannelController {
    private final ChannelService channelService;

    @Autowired
    public ChannelController(ChannelService channelService) {
        this.channelService = channelService;
    }
    @GetMapping("/group")
    @ResponseBody
    public List<Channel> getChannelsByGroupId(@RequestHeader("groupId") Long groupId){
        return channelService.getChannelsByGroupId(groupId);
    }
    @GetMapping("/channel")
    @ResponseBody
    public List<Channel> getChannels(){
        return channelService.getChannels();
    }
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }


}
