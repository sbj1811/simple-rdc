package rdc.move_test.Data;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.util.Log;

import com.google.gson.JsonObject;

import org.json.JSONObject;

import rdc.move_test.model.Properties;
import rdc.move_test.model.Property;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;



public class DataRepository {


    MutableLiveData<Properties> mutableLiveData = new MutableLiveData<>();
    public static final String TAG = DataRepository.class.getSimpleName();

    public void getPropertyFromApi(){
        ApiConnection.getAPI().getProperties("5","Napa","CA","relevance","rdc_mobile_native").enqueue(new Callback<Properties>() {
            @Override
            public void onResponse(Call<Properties> call, Response<Properties> response) {
                mutableLiveData.setValue(response.body());
            }

            @Override
            public void onFailure(Call<Properties> call, Throwable t) {

            }
        });
    }

    public LiveData<Properties> getProperyData(){
        getPropertyFromApi();
        return mutableLiveData;
    }


}
