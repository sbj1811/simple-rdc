
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
    private Double probability;
    private final static long serialVersionUID = -3574851057804099340L;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Double getProbability() {
        return probability;
    }

    public void setProbability(Double probability) {
        this.probability = probability;
    }

}
