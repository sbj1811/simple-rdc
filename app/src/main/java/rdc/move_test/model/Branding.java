
package rdc.move_test.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Branding implements Serializable
{

    @SerializedName("listing_office")
    @Expose
    private ListingOffice listingOffice;
    private final static long serialVersionUID = 3635826918035719913L;

    public ListingOffice getListingOffice() {
        return listingOffice;
    }

    public void setListingOffice(ListingOffice listingOffice) {
        this.listingOffice = listingOffice;
    }

}
