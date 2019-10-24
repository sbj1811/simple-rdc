package rdc.move_test.Data;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiConnection {

    public static EndpointInterface getAPI(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(EndpointInterface.API_ENDPOINT)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(EndpointInterface.class);
    }

}
