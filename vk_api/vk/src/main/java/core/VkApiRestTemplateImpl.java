package core;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import models.Friend;
import models.FriendList;

import java.util.Arrays;
import java.util.List;

public class VkApiRestTemplateImpl implements VkApi {

    private final String FRIENDS_GET_URL = "https://api.vk.com/method/friends.get";
    private RestTemplate restTemplate;

    public VkApiRestTemplateImpl() {
    }

    public VkApiRestTemplateImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    public List<Friend> getUserFriends(int userId, int count, String ... fields) {
        StringBuilder fieldsAsString = new StringBuilder();
        for (String field: fields) {
            fieldsAsString.append(field).append(",");
        }
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(FRIENDS_GET_URL)
                .queryParam("user_id", userId)
                .queryParam("count", count)
                .queryParam("fields", fieldsAsString);
        String expandUrl = builder.toUriString();

        FriendList friends = restTemplate.getForObject(expandUrl, FriendList.class);

        return friends.getResponse();
    }
}
