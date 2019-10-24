
package rdc.move_test.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Meta implements Serializable
{

    @SerializedName("build")
    @Expose
    private String build;
    @SerializedName("_links")
    @Expose
    private Links links;
    @SerializedName("schema")
    @Expose
    private String schema;
    @SerializedName("market")
    @Expose
    private String market;
    @SerializedName("tracking_params")
    @Expose
    private TrackingParams trackingParams;
    @SerializedName("tracking")
    @Expose
    private String tracking;
    @SerializedName("returned_rows")
    @Expose
    private Integer returnedRows;
    @SerializedName("matching_rows")
    @Expose
    private Integer matchingRows;
    private final static long serialVersionUID = -6692378313067229924L;

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public TrackingParams getTrackingParams() {
        return trackingParams;
    }

    public void setTrackingParams(TrackingParams trackingParams) {
        this.trackingParams = trackingParams;
    }

    public String getTracking() {
        return tracking;
    }

    public void setTracking(String tracking) {
        this.tracking = tracking;
    }

    public Integer getReturnedRows() {
        return returnedRows;
    }

    public void setReturnedRows(Integer returnedRows) {
        this.returnedRows = returnedRows;
    }

    public Integer getMatchingRows() {
        return matchingRows;
    }

    public void setMatchingRows(Integer matchingRows) {
        this.matchingRows = matchingRows;
    }

}
