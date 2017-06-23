package ru.itpark.core;
import ru.itpark.models.*;

import java.util.List;

/**
 * Created by Л on 22.06.2017.
 */
public class FindMutual {
    private List<User> friends1;
    private List<User> friends2;

    public FindMutual(List<User> friends1, List<User> friends2) {
        this.friends1 = friends1;
        this.friends2 = friends2;
    }

    public List<User> mutual () {
        friends1.retainAll(friends2);
        return  friends1;
        /*if (friends1.retainAll(friends2)){
            for (User friend :friends1 ) {
                System.out.println(friend);
            }
            return friends1;*/
      //  } else return friends2;
    }
}

