
package rdc.move_test.model;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Property implements Serializable
{

    @SerializedName("meta")
    @Expose
    private Meta meta;
    @SerializedName("properties")
    @Expose
    private List<Property_> properties = null;
    private final static long serialVersionUID = -3844066443649049344L;

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public List<Property_> getProperties() {
        return properties;
    }

    public void setProperties(List<Property_> properties) {
        this.properties = properties;
    }

}
