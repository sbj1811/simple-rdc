
package rdc.move_test.model;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Raw implements Serializable
{

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("style")
    @Expose
    private List<String> style = null;
    private final static long serialVersionUID = 7845683534829734255L;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getStyle() {
        return style;
    }

    public void setStyle(List<String> style) {
        this.style = style;
    }

}
