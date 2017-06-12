package core;

import models.Friend;
import java.util.List;

public interface VkApi {
    List<Friend> getUserFriends(int userId, int count, String ... fields);
}
