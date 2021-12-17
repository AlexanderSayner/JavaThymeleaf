package sandbox.front.end.simplebootstrap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class SimpleBootstrapApplication {
    private static final Logger logger = LoggerFactory.getLogger(SimpleBootstrapApplication.class);

    public static void main(String[] args) {
        final SpringApplication app = new SpringApplication(SimpleBootstrapApplication.class);
        final ConfigurableApplicationContext context = app.run(args);
        final ConfigurableEnvironment environment = context.getEnvironment();
        logger.info("""

                        =======================================================
                        \tApplication '{}' is running!
                        \thttp://127.0.0.1:8080/swagger-ui.html
                        \tJava Version is {}
                        =======================================================
                        """,
                environment.getProperty("spring.application.name"),
                System.getProperty("java.version"));
    }

}
