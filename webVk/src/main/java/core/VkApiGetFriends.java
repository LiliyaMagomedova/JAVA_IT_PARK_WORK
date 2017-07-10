package ru.itpark.core;

import ru.itpark.models.User;

import java.util.List;

/**
 * Created by Л on 22.06.2017.
 */
public interface VkApiGetFriends {
    List<User> getUsersFriends (int userId, String ... fields);
}
