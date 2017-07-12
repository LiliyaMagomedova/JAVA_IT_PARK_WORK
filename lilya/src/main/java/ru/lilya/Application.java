package ru.lilya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import ru.lilya.models.Guest;
import ru.lilya.services.GuestService;
import ru.lilya.services.GuestServiceImpl;

import javax.xml.bind.SchemaOutputResolver;


@SpringBootApplication
@ComponentScan(basePackages = "ru.lilya")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}