package pl.szajner.sdcf.timesource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;

@SpringBootApplication
@EnableBinding(Source.class)
public class TimeSourceApplication {

  public static void main(String[] args) {
    SpringApplication.run(TimeSourceApplication.class, args);
  }

  @Bean
  @InboundChannelAdapter(
          value = Source.OUTPUT,
          poller = @Poller(fixedDelay = "10000", maxMessagesPerPoll = "1")
  )
  public MessageSource<Long> timeMessageSource() {
    return null;
  }
}
