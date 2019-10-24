
package rdc.move_test.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Agent implements Serializable
{

    @SerializedName("primary")
    @Expose
    private Boolean primary;
    @SerializedName("advertiser_id")
    @Expose
    private String advertiserId;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("photo")
    @Expose
    private Photo photo;
    @SerializedName("name")
    @Expose
    private String name;
    private final static long serialVersionUID = 2922888890530010200L;

    public Boolean getPrimary() {
        return primary;
    }

    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    public String getAdvertiserId() {
        return advertiserId;
    }

    public void setAdvertiserId(String advertiserId) {
        this.advertiserId = advertiserId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
