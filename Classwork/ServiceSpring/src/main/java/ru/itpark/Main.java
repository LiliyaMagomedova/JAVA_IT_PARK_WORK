package ru.itpark;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.itpark.models.User;
import ru.itpark.service.UsersService;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ru.itpark\\context.xml");
        UsersService usersService = (UsersService) context.getBean("usersService");
        User user = new User("MEGAMEN", 177);
        usersService.register(user);
    }
}
