
package rdc.move_test.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BuildingSize implements Serializable
{

    @SerializedName("size")
    @Expose
    private Integer size;
    @SerializedName("units")
    @Expose
    private String units;
    private final static long serialVersionUID = -2098851506736888392L;

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

}
