
package rdc.move_test.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Photo implements Serializable
{

    @SerializedName("href")
    @Expose
    private String href;
    private final static long serialVersionUID = 6088660375190166032L;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

}
