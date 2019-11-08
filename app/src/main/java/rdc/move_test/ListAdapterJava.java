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

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import rdc.move_test.model.Property;

public class ListAdapterJava extends RecyclerView.Adapter<ListAdapterJava.ListItemHolder> {
    private Context context;
    private List<Property> listItems = new ArrayList<>();

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
        final Property property = listItems.get(position);
        holder.titleView.setText(formatAddress(property));
        holder.priceView.setText(formatPrice(property));
        String image = property.getPhotos().get(0).getHref();
        if (!image.isEmpty()) {
            Glide.with(holder.imageView.getContext())
                    .load(image)
                    .into(holder.imageView);
        }

    }

    private String formatPrice(Property property) {
        return "$" + NumberFormat.getNumberInstance(Locale.US).format(property.getPrice());
    }

    private String formatAddress(Property property) {
        return new StringBuilder()
                .append(property.getAddress().getLine()).append(", ")
                .append(property.getAddress().getCity()).append(", ")
                .append(property.getAddress().getState()).append(" ")
                .append(property.getAddress().getPostalCode()).toString();
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public void setListItems(@NonNull List<Property> listItems) {
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
