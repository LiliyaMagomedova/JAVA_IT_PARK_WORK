package ru.itpark.models;
import java.util.List;

/**
 * Created by Л on 22.06.2017.
 */
public class FriendList {
        private List<User> response;

        public FriendList() {
        }

        public List<User> getResponse() {
            return response;
        }

        public void setResponse(List<User> response) {
            this.response = response;
        }
}
