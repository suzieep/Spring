//package videocall.prototype.repository;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.Test;
//import videocall.prototype.domain.Channel;
//
//import java.util.List;
//
//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//
//public class MemoryChannelRepositoryTest {
//    MemoryChannelRepository repository = new MemoryChannelRepository();
//    @AfterEach
//    public void afterEach(){
//        repository.clearStore();
//    }
//    @Test
//    public void findById(){
//        //given
//        Channel channel = new Channel();
//        channel.setName("MBC");
//
//        //when
//        repository.save(channel);
//
//        //then
//        Channel result = repository.findById(channel.getId()).get();
//        //System.out.println("result = "+(result==channel));
//        //assertEquals(channel,null);
//        assertThat(channel).isEqualTo(result);
//    }
//
//
//}
