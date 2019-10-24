package rdc.move_test;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import rdc.move_test.Data.DataRepository;

public class ListViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    private DataRepository repository;

    public ListViewModelFactory(DataRepository repository) {
        this.repository = repository;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new ListViewModel(repository);
    }
}
