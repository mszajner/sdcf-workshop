package pl.szajner.sdcf.timetolog;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
@EnableBinding(Sink.class)
@Log4j2
public class TimeToLogApplication {

  public static void main(String[] args) {
    SpringApplication.run(TimeToLogApplication.class, args);
  }

  @StreamListener(Sink.INPUT)
  public void loggerSink(String date) {

  }
}
