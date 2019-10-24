
package rdc.move_test.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Broker implements Serializable
{

    @SerializedName("advertiser_id")
    @Expose
    private Integer advertiserId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("phone1")
    @Expose
    private Phone1 phone1;
    private final static long serialVersionUID = -144176400411916357L;

    public Integer getAdvertiserId() {
        return advertiserId;
    }

    public void setAdvertiserId(Integer advertiserId) {
        this.advertiserId = advertiserId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Phone1 getPhone1() {
        return phone1;
    }

    public void setPhone1(Phone1 phone1) {
        this.phone1 = phone1;
    }

}
