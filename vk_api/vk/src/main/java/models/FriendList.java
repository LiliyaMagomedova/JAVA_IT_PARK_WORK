package models;

import java.util.List;

public class FriendList {
    private List<Friend> response;

    public FriendList() {
    }

    public List<Friend> getResponse() {
        return response;
    }

    public void setResponse(List<Friend> response) {
        this.response = response;
    }
}
