
package rdc.move_test.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ClientDisplayFlags implements Serializable
{

    @SerializedName("presentation_status")
    @Expose
    private String presentationStatus;
    @SerializedName("is_showcase")
    @Expose
    private Boolean isShowcase;
    @SerializedName("lead_form_phone_required")
    @Expose
    private Boolean leadFormPhoneRequired;
    @SerializedName("price_change")
    @Expose
    private Integer priceChange;
    @SerializedName("is_co_broke_email")
    @Expose
    private Boolean isCoBrokeEmail;
    @SerializedName("has_open_house")
    @Expose
    private Boolean hasOpenHouse;
    @SerializedName("is_foreclosure")
    @Expose
    private Boolean isForeclosure;
    @SerializedName("is_short_sale")
    @Expose
    private Boolean isShortSale;
    @SerializedName("is_co_broke_phone")
    @Expose
    private Boolean isCoBrokePhone;
    @SerializedName("is_new_listing")
    @Expose
    private Boolean isNewListing;
    @SerializedName("is_new_plan")
    @Expose
    private Boolean isNewPlan;
    @SerializedName("is_new_construction")
    @Expose
    private Boolean isNewConstruction;
    @SerializedName("is_turbo")
    @Expose
    private Boolean isTurbo;
    @SerializedName("is_office_standard_listing")
    @Expose
    private Boolean isOfficeStandardListing;
    @SerializedName("suppress_map_pin")
    @Expose
    private Boolean suppressMapPin;
    @SerializedName("show_contact_a_lender_in_lead_form")
    @Expose
    private Boolean showContactALenderInLeadForm;
    @SerializedName("show_veterans_united_in_lead_form")
    @Expose
    private Boolean showVeteransUnitedInLeadForm;
    @SerializedName("flip_the_market_enabled")
    @Expose
    private Boolean flipTheMarketEnabled;
    @SerializedName("is_showcase_choice_enabled")
    @Expose
    private Boolean isShowcaseChoiceEnabled;
    private final static long serialVersionUID = 1808906054522285929L;

    public String getPresentationStatus() {
        return presentationStatus;
    }

    public void setPresentationStatus(String presentationStatus) {
        this.presentationStatus = presentationStatus;
    }

    public Boolean getIsShowcase() {
        return isShowcase;
    }

    public void setIsShowcase(Boolean isShowcase) {
        this.isShowcase = isShowcase;
    }

    public Boolean getLeadFormPhoneRequired() {
        return leadFormPhoneRequired;
    }

    public void setLeadFormPhoneRequired(Boolean leadFormPhoneRequired) {
        this.leadFormPhoneRequired = leadFormPhoneRequired;
    }

    public Integer getPriceChange() {
        return priceChange;
    }

    public void setPriceChange(Integer priceChange) {
        this.priceChange = priceChange;
    }

    public Boolean getIsCoBrokeEmail() {
        return isCoBrokeEmail;
    }

    public void setIsCoBrokeEmail(Boolean isCoBrokeEmail) {
        this.isCoBrokeEmail = isCoBrokeEmail;
    }

    public Boolean getHasOpenHouse() {
        return hasOpenHouse;
    }

    public void setHasOpenHouse(Boolean hasOpenHouse) {
        this.hasOpenHouse = hasOpenHouse;
    }

    public Boolean getIsForeclosure() {
        return isForeclosure;
    }

    public void setIsForeclosure(Boolean isForeclosure) {
        this.isForeclosure = isForeclosure;
    }

    public Boolean getIsShortSale() {
        return isShortSale;
    }

    public void setIsShortSale(Boolean isShortSale) {
        this.isShortSale = isShortSale;
    }

    public Boolean getIsCoBrokePhone() {
        return isCoBrokePhone;
    }

    public void setIsCoBrokePhone(Boolean isCoBrokePhone) {
        this.isCoBrokePhone = isCoBrokePhone;
    }

    public Boolean getIsNewListing() {
        return isNewListing;
    }

    public void setIsNewListing(Boolean isNewListing) {
        this.isNewListing = isNewListing;
    }

    public Boolean getIsNewPlan() {
        return isNewPlan;
    }

    public void setIsNewPlan(Boolean isNewPlan) {
        this.isNewPlan = isNewPlan;
    }

    public Boolean getIsNewConstruction() {
        return isNewConstruction;
    }

    public void setIsNewConstruction(Boolean isNewConstruction) {
        this.isNewConstruction = isNewConstruction;
    }

    public Boolean getIsTurbo() {
        return isTurbo;
    }

    public void setIsTurbo(Boolean isTurbo) {
        this.isTurbo = isTurbo;
    }

    public Boolean getIsOfficeStandardListing() {
        return isOfficeStandardListing;
    }

    public void setIsOfficeStandardListing(Boolean isOfficeStandardListing) {
        this.isOfficeStandardListing = isOfficeStandardListing;
    }

    public Boolean getSuppressMapPin() {
        return suppressMapPin;
    }

    public void setSuppressMapPin(Boolean suppressMapPin) {
        this.suppressMapPin = suppressMapPin;
    }

    public Boolean getShowContactALenderInLeadForm() {
        return showContactALenderInLeadForm;
    }

    public void setShowContactALenderInLeadForm(Boolean showContactALenderInLeadForm) {
        this.showContactALenderInLeadForm = showContactALenderInLeadForm;
    }

    public Boolean getShowVeteransUnitedInLeadForm() {
        return showVeteransUnitedInLeadForm;
    }

    public void setShowVeteransUnitedInLeadForm(Boolean showVeteransUnitedInLeadForm) {
        this.showVeteransUnitedInLeadForm = showVeteransUnitedInLeadForm;
    }

    public Boolean getFlipTheMarketEnabled() {
        return flipTheMarketEnabled;
    }

    public void setFlipTheMarketEnabled(Boolean flipTheMarketEnabled) {
        this.flipTheMarketEnabled = flipTheMarketEnabled;
    }

    public Boolean getIsShowcaseChoiceEnabled() {
        return isShowcaseChoiceEnabled;
    }

    public void setIsShowcaseChoiceEnabled(Boolean isShowcaseChoiceEnabled) {
        this.isShowcaseChoiceEnabled = isShowcaseChoiceEnabled;
    }

}
