package ru.itpark.core;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import ru.itpark.models.FriendList;
import ru.itpark.models.User;

import java.util.List;

/**
 * Created by Л on 22.06.2017.
 */
public class VkApiGetFriendsRestTempImpl implements VkApiGetFriends{
    private final String FRIENDS_GET_URL = "https://api.vk.com/method/friends.get";
    private RestTemplate restTemplate;

    public VkApiGetFriendsRestTempImpl() {
        this.restTemplate = new RestTemplate();
    }

    public List<User> getUsersFriends(int userId, String... fields) {
        StringBuilder fieldsAsString = new StringBuilder();
        for (String field: fields){
            fieldsAsString.append(field).append(";");
        }
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(FRIENDS_GET_URL)
                .queryParam("user_id", userId)
                .queryParam("fields", fieldsAsString);
        String expandUrl = builder.toUriString();
        FriendList friends = restTemplate.getForObject(expandUrl, FriendList.class);

        return friends.getResponse();
    }
}
