
package rdc.move_test.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tag implements Serializable
{

    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("probability")
    @Expose
    private Integer probability;
    private final static long serialVersionUID = 8213182837727943201L;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getProbability() {
        return probability;
    }

    public void setProbability(Integer probability) {
        this.probability = probability;
    }

}
