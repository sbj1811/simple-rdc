
package rdc.move_test.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TrackingParams implements Serializable
{

    @SerializedName("channel")
    @Expose
    private String channel;
    @SerializedName("siteSection")
    @Expose
    private String siteSection;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("county")
    @Expose
    private String county;
    @SerializedName("neighborhood")
    @Expose
    private String neighborhood;
    @SerializedName("searchCityState")
    @Expose
    private String searchCityState;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("zip")
    @Expose
    private String zip;
    @SerializedName("srpPropertyStatus")
    @Expose
    private String srpPropertyStatus;
    @SerializedName("listingActivity")
    @Expose
    private String listingActivity;
    @SerializedName("propertyStatus")
    @Expose
    private String propertyStatus;
    @SerializedName("propertyType")
    @Expose
    private String propertyType;
    @SerializedName("searchBathrooms")
    @Expose
    private String searchBathrooms;
    @SerializedName("searchBedrooms")
    @Expose
    private String searchBedrooms;
    @SerializedName("searchMaxPrice")
    @Expose
    private String searchMaxPrice;
    @SerializedName("searchMinPrice")
    @Expose
    private String searchMinPrice;
    @SerializedName("searchRadius")
    @Expose
    private String searchRadius;
    @SerializedName("searchHouseSqft")
    @Expose
    private String searchHouseSqft;
    @SerializedName("searchLotSqft")
    @Expose
    private String searchLotSqft;
    @SerializedName("searchResults")
    @Expose
    private String searchResults;
    @SerializedName("sortResults")
    @Expose
    private String sortResults;
    @SerializedName("searchCoordinates")
    @Expose
    private String searchCoordinates;
    @SerializedName("version")
    @Expose
    private String version;
    private final static long serialVersionUID = 7021664158950275751L;

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getSiteSection() {
        return siteSection;
    }

    public void setSiteSection(String siteSection) {
        this.siteSection = siteSection;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getSearchCityState() {
        return searchCityState;
    }

    public void setSearchCityState(String searchCityState) {
        this.searchCityState = searchCityState;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getSrpPropertyStatus() {
        return srpPropertyStatus;
    }

    public void setSrpPropertyStatus(String srpPropertyStatus) {
        this.srpPropertyStatus = srpPropertyStatus;
    }

    public String getListingActivity() {
        return listingActivity;
    }

    public void setListingActivity(String listingActivity) {
        this.listingActivity = listingActivity;
    }

    public String getPropertyStatus() {
        return propertyStatus;
    }

    public void setPropertyStatus(String propertyStatus) {
        this.propertyStatus = propertyStatus;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public String getSearchBathrooms() {
        return searchBathrooms;
    }

    public void setSearchBathrooms(String searchBathrooms) {
        this.searchBathrooms = searchBathrooms;
    }

    public String getSearchBedrooms() {
        return searchBedrooms;
    }

    public void setSearchBedrooms(String searchBedrooms) {
        this.searchBedrooms = searchBedrooms;
    }

    public String getSearchMaxPrice() {
        return searchMaxPrice;
    }

    public void setSearchMaxPrice(String searchMaxPrice) {
        this.searchMaxPrice = searchMaxPrice;
    }

    public String getSearchMinPrice() {
        return searchMinPrice;
    }

    public void setSearchMinPrice(String searchMinPrice) {
        this.searchMinPrice = searchMinPrice;
    }

    public String getSearchRadius() {
        return searchRadius;
    }

    public void setSearchRadius(String searchRadius) {
        this.searchRadius = searchRadius;
    }

    public String getSearchHouseSqft() {
        return searchHouseSqft;
    }

    public void setSearchHouseSqft(String searchHouseSqft) {
        this.searchHouseSqft = searchHouseSqft;
    }

    public String getSearchLotSqft() {
        return searchLotSqft;
    }

    public void setSearchLotSqft(String searchLotSqft) {
        this.searchLotSqft = searchLotSqft;
    }

    public String getSearchResults() {
        return searchResults;
    }

    public void setSearchResults(String searchResults) {
        this.searchResults = searchResults;
    }

    public String getSortResults() {
        return sortResults;
    }

    public void setSortResults(String sortResults) {
        this.sortResults = sortResults;
    }

    public String getSearchCoordinates() {
        return searchCoordinates;
    }

    public void setSearchCoordinates(String searchCoordinates) {
        this.searchCoordinates = searchCoordinates;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

}
