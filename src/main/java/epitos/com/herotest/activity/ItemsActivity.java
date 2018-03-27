package epitos.com.herotest.activity;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;

import java.util.ArrayList;
import java.util.Collections;

import epitos.com.herotest.R;
import epitos.com.herotest.adapter.ItemsAdapter;
import epitos.com.herotest.model.Item;
import epitos.com.herotest.utils.ApiUtils;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ItemsActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private Resources resources;
    private FrameLayout progressbarLayout;
    private RecyclerView itemsRecyclerView;
    private ItemsAdapter itemsAdapter;
    private CheckBox sortByCheckbox;
    private ArrayList<Item> items;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);

        resources = getResources();
        bindView();
        setItemsRecyclerView();

        getItems();
        setListener();
    }

    private void bindView() {
        progressbarLayout = (FrameLayout) findViewById(R.id.progress_bar_layout);
        itemsRecyclerView = (RecyclerView) findViewById(R.id.items_list);
        sortByCheckbox = (CheckBox) findViewById(R.id.checkbox);
    }

    private void setItemsRecyclerView() {
        itemsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        itemsRecyclerView.setHasFixedSize(true);

    }

    private void setListener() {
        sortByCheckbox.setOnCheckedChangeListener(this);
    }

    private void getItems() {
        ApiUtils.getRequest(resources.getString(R.string.base_url)).getItems().enqueue(new Callback<ArrayList<Item>>() {
            @Override
            public void onResponse(Call<ArrayList<Item>> call, Response<ArrayList<Item>> response) {
                items = response.body();
                progressbarLayout.setVisibility(View.GONE);
                itemsAdapter = new ItemsAdapter(items);
                itemsRecyclerView.setAdapter(itemsAdapter);
            }

            @Override
            public void onFailure(Call<ArrayList<Item>> call, Throwable t) {
                progressbarLayout.setVisibility(View.GONE);
            }
        });
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            ArrayList<String> brandNames = new ArrayList<>();

            for (int i = 0; i < items.size(); i++) {
                brandNames.add(items.get(i).getBrandName());
            }
            Collections.sort(brandNames);
        }
    }
}
