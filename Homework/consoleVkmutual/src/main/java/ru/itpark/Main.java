package ru.itpark;
import org.springframework.objenesis.instantiator.basic.FailingInstantiator;
import ru.itpark.core.FindMutual;
import ru.itpark.models.*;
import ru.itpark.core.ApiBuilder;
import ru.itpark.core.VkApiGetFriends;
import ru.itpark.core.VkApiGetFriendsRestTempImpl;

import java.util.List;
import java.util.Scanner;

/**
 * Created by Л on 22.06.2017.
 */
public class Main {
    public static void main(String[] args) {
        //??????/

        Scanner scanner = new Scanner(System.in);
        int userId1 = scanner.nextInt();
        int userId2 = scanner.nextInt();

        VkApiGetFriends getFriendsApi = ApiBuilder.buildRestTemplateApi();
        List<User> friends1 = getFriendsApi.getUsersFriends(userId1, "sex", "country");
        List<User> friends2 = getFriendsApi.getUsersFriends(userId2, "sex", "country");

        FindMutual mutualFriends= new FindMutual(friends1,friends2);

        for (User friend :  mutualFriends.mutual()) {
            System.out.println(friend);
        }
    }
}
