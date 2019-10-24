package rdc.move_test.Data;

import rdc.move_test.model.Properties;
import rdc.move_test.model.Property;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface EndpointInterface {
    String API_ENDPOINT =  "https://mapi-ng.rdc.moveaws.com";

    @GET("/api/v1/properties?limit=5&city=Napa&state_code=CA&sort=relevance&client_id=rdc_mobile_native")
    Call<Properties> getProperties(@Query("limit") String limit, @Query("city") String city, @Query("state_code") String state_code, @Query("sort") String sort, @Query("client_id") String client_id);
}
