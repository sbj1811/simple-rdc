
package rdc.move_test.model;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Property implements Serializable
{

    @SerializedName("property_id")
    @Expose
    private String propertyId;
    @SerializedName("prop_status")
    @Expose
    private String propStatus;
    @SerializedName("listing_id")
    @Expose
    private String listingId;
    @SerializedName("prop_type")
    @Expose
    private String propType;
    @SerializedName("list_date")
    @Expose
    private String listDate;
    @SerializedName("last_update")
    @Expose
    private String lastUpdate;
    @SerializedName("broker")
    @Expose
    private Broker broker;
    @SerializedName("year_built")
    @Expose
    private Integer yearBuilt;
    @SerializedName("listing_status")
    @Expose
    private String listingStatus;
    @SerializedName("beds")
    @Expose
    private Integer beds;
    @SerializedName("baths_full")
    @Expose
    private Integer bathsFull;
    @SerializedName("feature_tags")
    @Expose
    private List<String> featureTags = null;
    @SerializedName("branding")
    @Expose
    private Branding branding;
    @SerializedName("address")
    @Expose
    private Address address;
    @SerializedName("prop_sub_type")
    @Expose
    private String propSubType;
    @SerializedName("mls")
    @Expose
    private Mls mls;
    @SerializedName("client_display_flags")
    @Expose
    private ClientDisplayFlags clientDisplayFlags;
    @SerializedName("tax_history")
    @Expose
    private List<Object> taxHistory = null;
    @SerializedName("office")
    @Expose
    private Office office;
    @SerializedName("agents")
    @Expose
    private List<Agent> agents = null;
    @SerializedName("lot_size")
    @Expose
    private LotSize lotSize;
    @SerializedName("building_size")
    @Expose
    private BuildingSize buildingSize;
    @SerializedName("price")
    @Expose
    private Integer price;
    @SerializedName("rdc_web_url")
    @Expose
    private String rdcWebUrl;
    @SerializedName("rdc_app_url")
    @Expose
    private String rdcAppUrl;
    @SerializedName("baths")
    @Expose
    private Integer baths;
    @SerializedName("photo_count")
    @Expose
    private Integer photoCount;
    @SerializedName("_links")
    @Expose
    private Links_ links;
    @SerializedName("raw")
    @Expose
    private Raw raw;
    @SerializedName("data_source_name")
    @Expose
    private String dataSourceName;
    @SerializedName("page_no")
    @Expose
    private Integer pageNo;
    @SerializedName("rank")
    @Expose
    private Integer rank;
    @SerializedName("list_tracking")
    @Expose
    private String listTracking;
    @SerializedName("photos")
    @Expose
    private List<Photo_> photos = null;
    @SerializedName("garage")
    @Expose
    private String garage;
    @SerializedName("open_houses")
    @Expose
    private List<OpenHouse> openHouses = null;
    private final static long serialVersionUID = -3384315618160335733L;

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public String getPropStatus() {
        return propStatus;
    }

    public void setPropStatus(String propStatus) {
        this.propStatus = propStatus;
    }

    public String getListingId() {
        return listingId;
    }

    public void setListingId(String listingId) {
        this.listingId = listingId;
    }

    public String getPropType() {
        return propType;
    }

    public void setPropType(String propType) {
        this.propType = propType;
    }

    public String getListDate() {
        return listDate;
    }

    public void setListDate(String listDate) {
        this.listDate = listDate;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Broker getBroker() {
        return broker;
    }

    public void setBroker(Broker broker) {
        this.broker = broker;
    }

    public Integer getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(Integer yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public String getListingStatus() {
        return listingStatus;
    }

    public void setListingStatus(String listingStatus) {
        this.listingStatus = listingStatus;
    }

    public Integer getBeds() {
        return beds;
    }

    public void setBeds(Integer beds) {
        this.beds = beds;
    }

    public Integer getBathsFull() {
        return bathsFull;
    }

    public void setBathsFull(Integer bathsFull) {
        this.bathsFull = bathsFull;
    }

    public List<String> getFeatureTags() {
        return featureTags;
    }

    public void setFeatureTags(List<String> featureTags) {
        this.featureTags = featureTags;
    }

    public Branding getBranding() {
        return branding;
    }

    public void setBranding(Branding branding) {
        this.branding = branding;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPropSubType() {
        return propSubType;
    }

    public void setPropSubType(String propSubType) {
        this.propSubType = propSubType;
    }

    public Mls getMls() {
        return mls;
    }

    public void setMls(Mls mls) {
        this.mls = mls;
    }

    public ClientDisplayFlags getClientDisplayFlags() {
        return clientDisplayFlags;
    }

    public void setClientDisplayFlags(ClientDisplayFlags clientDisplayFlags) {
        this.clientDisplayFlags = clientDisplayFlags;
    }

    public List<Object> getTaxHistory() {
        return taxHistory;
    }

    public void setTaxHistory(List<Object> taxHistory) {
        this.taxHistory = taxHistory;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    public List<Agent> getAgents() {
        return agents;
    }

    public void setAgents(List<Agent> agents) {
        this.agents = agents;
    }

    public LotSize getLotSize() {
        return lotSize;
    }

    public void setLotSize(LotSize lotSize) {
        this.lotSize = lotSize;
    }

    public BuildingSize getBuildingSize() {
        return buildingSize;
    }

    public void setBuildingSize(BuildingSize buildingSize) {
        this.buildingSize = buildingSize;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getRdcWebUrl() {
        return rdcWebUrl;
    }

    public void setRdcWebUrl(String rdcWebUrl) {
        this.rdcWebUrl = rdcWebUrl;
    }

    public String getRdcAppUrl() {
        return rdcAppUrl;
    }

    public void setRdcAppUrl(String rdcAppUrl) {
        this.rdcAppUrl = rdcAppUrl;
    }

    public Integer getBaths() {
        return baths;
    }

    public void setBaths(Integer baths) {
        this.baths = baths;
    }

    public Integer getPhotoCount() {
        return photoCount;
    }

    public void setPhotoCount(Integer photoCount) {
        this.photoCount = photoCount;
    }

    public Links_ getLinks() {
        return links;
    }

    public void setLinks(Links_ links) {
        this.links = links;
    }

    public Raw getRaw() {
        return raw;
    }

    public void setRaw(Raw raw) {
        this.raw = raw;
    }

    public String getDataSourceName() {
        return dataSourceName;
    }

    public void setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getListTracking() {
        return listTracking;
    }

    public void setListTracking(String listTracking) {
        this.listTracking = listTracking;
    }

    public List<Photo_> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo_> photos) {
        this.photos = photos;
    }

    public String getGarage() {
        return garage;
    }

    public void setGarage(String garage) {
        this.garage = garage;
    }

    public List<OpenHouse> getOpenHouses() {
        return openHouses;
    }

    public void setOpenHouses(List<OpenHouse> openHouses) {
        this.openHouses = openHouses;
    }

}
