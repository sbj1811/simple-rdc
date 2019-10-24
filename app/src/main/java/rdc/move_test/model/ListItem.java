
package rdc.move_test.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListItem implements Serializable
{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("photo")
    @Expose
    private Object photo;
    @SerializedName("phone")
    @Expose
    private Object phone;
    @SerializedName("slogan")
    @Expose
    private Object slogan;
    @SerializedName("show_realtor_logo")
    @Expose
    private Boolean showRealtorLogo;
    @SerializedName("link")
    @Expose
    private Object link;
    @SerializedName("accent_color")
    @Expose
    private Object accentColor;
    private final static long serialVersionUID = -2249700149844689314L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getPhoto() {
        return photo;
    }

    public void setPhoto(Object photo) {
        this.photo = photo;
    }

    public Object getPhone() {
        return phone;
    }

    public void setPhone(Object phone) {
        this.phone = phone;
    }

    public Object getSlogan() {
        return slogan;
    }

    public void setSlogan(Object slogan) {
        this.slogan = slogan;
    }

    public Boolean getShowRealtorLogo() {
        return showRealtorLogo;
    }

    public void setShowRealtorLogo(Boolean showRealtorLogo) {
        this.showRealtorLogo = showRealtorLogo;
    }

    public Object getLink() {
        return link;
    }

    public void setLink(Object link) {
        this.link = link;
    }

    public Object getAccentColor() {
        return accentColor;
    }

    public void setAccentColor(Object accentColor) {
        this.accentColor = accentColor;
    }

}
