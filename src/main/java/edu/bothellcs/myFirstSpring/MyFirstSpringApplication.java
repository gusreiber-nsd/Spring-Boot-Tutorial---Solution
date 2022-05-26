package edu.bothellcs.myFirstSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyFirstSpringApplication {
  
    
    public static void main(String[] args) {
      SpringApplication.run(MyFirstSpringApplication.class, args);
    }
    
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {

      System.out.println(name);
      Person bill = new Person(name);
      String liesBillTells = bill.tellMeLies();
      
      return String.format("Hello %s!", liesBillTells);
    }


  
  @GetMapping("/addition")
  public String addition(
    @RequestParam(value = "A", defaultValue = "0") String a,
    @RequestParam(value = "B", defaultValue = "0") String b
  
  ) {

    return "4";
  }





  

    @GetMapping("/guess")
    public String guess(@RequestParam(value = "guess", defaultValue = "World") String guess) {

      GuessingGame g = new GuessingGame();
      String result = g.guess(guess);
      
      return String.format(result);
    }
  
}
