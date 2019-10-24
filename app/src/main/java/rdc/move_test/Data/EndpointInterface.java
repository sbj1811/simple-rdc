package rdc.move_test.Data;

import rdc.move_test.model.Property;
import retrofit2.Call;
import retrofit2.http.GET;

public interface EndpointInterface {
    String API_ENDPOINT =  "https://mapi-ng.rdc.moveaws.com";

    @GET("/api/v1/properties?limit=5&city=Napa&state_code=CA&sort=relevance&client_id=rdc_mobile_native")
    Call<Property> getProperties();
}
