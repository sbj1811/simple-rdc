package rdc.move_test.Data;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import rdc.move_test.model.Property;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;



public class DataRepository {


    MutableLiveData<Property> mutableLiveData = new MutableLiveData<>();


    public void getPropertyFromApi(){
        ApiConnection.getAPI().getProperties().enqueue(new Callback<Property>() {
            @Override
            public void onResponse(Call<Property> call, Response<Property> response) {
                mutableLiveData.setValue(response.body());
            }

            @Override
            public void onFailure(Call<Property> call, Throwable t) {

            }
        });
    }

    public LiveData<Property> getProperyData(){
        getPropertyFromApi();
        return mutableLiveData;
    }


}
