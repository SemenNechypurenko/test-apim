package apim.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static apim.TestSpringBootAppForApimApplication.counter;

@RestController
@RequestMapping("apim")
@Slf4j
public class SimpleController {

  @GetMapping()
  public String index() {
    log.info("New request: {}", counter++);
    return "Greetings from Spring Boot and APIM!";
  }
}
