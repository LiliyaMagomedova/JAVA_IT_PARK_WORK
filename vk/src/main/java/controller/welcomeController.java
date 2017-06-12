package controller;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.TextField;
import core.ApiBuilder;
import core.VkApi;
import models.Friend;

import java.util.List;
public class welcomeController {

    private VkApi vkApi;


    @FXML
    private ImageView imageAvatar;

    @FXML
    private AnchorPane pane;
    @FXML
    public TextField userId;
    @FXML
    private TextField userCount;
    int id, count;
    @FXML
    public void record (ActionEvent event) {
        id =Integer.parseInt( ((TextField) event.getSource()).getText() );
        count = Integer.parseInt( ((TextField) event.getSource()).getText() );
    }
    @FXML
    public void initialize() {

        vkApi = ApiBuilder.buildRestTemplateApi();
        List<Friend> friends = vkApi
                .getUserFriends(id, count, "photo_200_orig");
        double lastY = 0;
        for (Friend friend : friends) {
            ImageView friendAvatar = new ImageView(friend.getPhoto());
            friendAvatar.setY(lastY);
            lastY = lastY + friendAvatar.getImage().getHeight();

            pane.getChildren().add(friendAvatar);
        }
        int i = 0;
    }
}