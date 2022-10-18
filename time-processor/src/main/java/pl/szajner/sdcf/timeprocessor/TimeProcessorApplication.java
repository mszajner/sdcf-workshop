package pl.szajner.sdcf.timeprocessor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.integration.annotation.Transformer;

@SpringBootApplication
@EnableBinding(Processor.class)
public class TimeProcessorApplication {

  public static void main(String[] args) {
    SpringApplication.run(TimeProcessorApplication.class, args);
  }

  @Transformer(inputChannel = Processor.INPUT, outputChannel = Processor.OUTPUT)
  public Object timestampProcessor(Long timestamp) {
    return null;
  }
}
