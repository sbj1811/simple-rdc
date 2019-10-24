
package rdc.move_test.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListingOffice implements Serializable
{

    @SerializedName("list_item")
    @Expose
    private ListItem listItem;
    private final static long serialVersionUID = 3524927941241287261L;

    public ListItem getListItem() {
        return listItem;
    }

    public void setListItem(ListItem listItem) {
        this.listItem = listItem;
    }

}
