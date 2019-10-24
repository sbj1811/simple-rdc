
package rdc.move_test.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Links_ implements Serializable
{

    @SerializedName("self")
    @Expose
    private Self_ self;
    private final static long serialVersionUID = -1574343644454144978L;

    public Self_ getSelf() {
        return self;
    }

    public void setSelf(Self_ self) {
        this.self = self;
    }

}
