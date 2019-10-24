package rdc.move_test;


import android.arch.lifecycle.Observer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;



import rdc.move_test.Data.DataRepository;
import rdc.move_test.model.Properties;
import rdc.move_test.model.Property;

public class ListActivityJava extends AppCompatActivity {
    private RecyclerView recyclerView;

    ListViewModel viewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_main);
        recyclerView = findViewById(R.id.list_recyclerview);


        ListViewModelFactory factory = new ListViewModelFactory(new DataRepository());
        viewModel = new ListViewModel(new DataRepository());
        final LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        final ListAdapterJava listAdapter = new ListAdapterJava(this);
        viewModel.getProperty().observe(this, new Observer<Properties>() {
            @Override
            public void onChanged(@Nullable Properties properties) {
                listAdapter.setListItems(properties.getProperties());
                recyclerView.setAdapter(listAdapter);
                listAdapter.notifyDataSetChanged();
            }
        });





    }
}
