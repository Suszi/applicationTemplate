package entry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
public class ApplicationMain {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ApplicationMain.class, args);
    }
}
