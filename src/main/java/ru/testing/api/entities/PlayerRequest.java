package ru.testing.api.entities;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PlayerRequest {

    @SerializedName("user")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
