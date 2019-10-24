package rdc.move_test;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import rdc.move_test.model.Property;
import rdc.move_test.model.Property_;

public class ListAdapterJava extends RecyclerView.Adapter<ListAdapterJava.ListItemHolder> {
    private Context context;
    private List<Property_> listItems = new ArrayList<>();

    ListAdapterJava(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ListItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_list_item, parent, false);
        return new ListItemHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListItemHolder holder, int position) {
        final Property_ property = listItems.get(position);

        // Load title
        holder.titleView.setText(property.getPropertyId());

    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public void setListItems(@NonNull List<Property_> listItems) {
        this.listItems = listItems;
    }

    class ListItemHolder extends RecyclerView.ViewHolder {
        private TextView titleView;
        private ImageView imageView;
        private TextView priceView;

        ListItemHolder(View view) {
            super(view);

            titleView = view.findViewById(R.id.list_item_title);
            imageView = view.findViewById(R.id.list_item_image);
            priceView = view.findViewById(R.id.list_item_price);
        }
    }
}
