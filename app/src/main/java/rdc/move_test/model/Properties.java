
package rdc.move_test.model;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Properties implements Serializable
{

    @SerializedName("meta")
    @Expose
    private Meta meta;
    @SerializedName("properties")
    @Expose
    private List<Property> properties = null;
    private final static long serialVersionUID = 7083144403108826817L;

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

}
