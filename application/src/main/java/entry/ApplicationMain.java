package entry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:application-context.xml")
public class ApplicationMain {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ApplicationMain.class, args);
    }
}
