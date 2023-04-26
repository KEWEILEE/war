package a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MainClass extends SpringBootServletInitializer {
    public static void main(String[] args) {
//        var a = "1";
//        System.out.println(a);
        SpringApplication.run(MainClass.class, args);
    }
}
