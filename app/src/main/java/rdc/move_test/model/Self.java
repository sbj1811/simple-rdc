
package rdc.move_test.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Self implements Serializable
{

    @SerializedName("href")
    @Expose
    private String href;
    private final static long serialVersionUID = -609488540094282479L;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

}
