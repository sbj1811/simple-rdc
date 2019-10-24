package rdc.move_test;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import rdc.move_test.Data.DataRepository;
import rdc.move_test.model.Property;

public class ListViewModel extends ViewModel {

    private DataRepository repository;

    public ListViewModel(DataRepository repository) {
        this.repository = repository;
    }

    public LiveData<Property> getProperty(){
        return repository.getProperyData();
    }
}
