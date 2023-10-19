package apim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestSpringBootAppForApimApplication {

  public static int counter = 1;

  public static void main(String[] args) {
    SpringApplication.run(TestSpringBootAppForApimApplication.class, args);
  }

}
