package ru.itpark.core;

/**
 * Created by Л on 22.06.2017.
 */
public class ApiBuilder {
    public static VkApiGetFriends buildRestTemplateApi() {
        return new VkApiGetFriendsRestTempImpl();
    }
}
