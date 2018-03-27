package epitos.com.herotest.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import epitos.com.herotest.R;
import epitos.com.herotest.model.Item;
import epitos.com.herotest.viewholder.ItemsViewHolder;

/**
 * Created by epitos on 27/03/2018.
 */

public class ItemsAdapter extends RecyclerView.Adapter<ItemsViewHolder> {

    private ArrayList<Item> items;

    public ItemsAdapter(ArrayList<Item> items) {
        this.items = items;
    }

    @Override
    public ItemsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View v = inflater.inflate(R.layout.items_layout, parent, false);

        ItemsViewHolder viewHolder = new ItemsViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ItemsViewHolder holder, int position) {
        Item item = items.get(position);

        if (item.getBrandName() != null) {
            holder.brandNameTextView.setVisibility(View.VISIBLE);
            holder.brandNameTextView.setText(item.getBrandName());
        }

        if (item.getName() != null) {
            holder.nameTextView.setVisibility(View.VISIBLE);
            holder.nameTextView.setText(item.getName());
        }

        if (item.getSize() != null) {
            holder.sizeTitleTextView.setVisibility(View.VISIBLE);
            holder.sizeTextView.setVisibility(View.VISIBLE);
            holder.sizeTextView.setText(item.getSize());
        }

        if (item.getIngredients()!= null) {
            holder.ingrediantsTitleTextView.setVisibility(View.VISIBLE);
            holder.ingrediantsTextView.setVisibility(View.VISIBLE);
            holder.ingrediantsTextView.setText(item.getIngredients());
        }

        if (item.getServingSize()!= null) {
            holder.servingSizeTitleTextView.setVisibility(View.VISIBLE);
            holder.servingSizeTextView.setVisibility(View.VISIBLE);
            holder.servingSizeTextView.setText(item.getServingSize());
        }

        if (item.getServingsPerContainer()!= null) {
            holder.servingsPerContainerTitleTextView.setVisibility(View.VISIBLE);
            holder.servingsPerContainerTextView.setVisibility(View.VISIBLE);
            holder.servingsPerContainerTextView.setText(item.getServingsPerContainer());
        }

        if (item.getCalories() != null) {
            holder.caloriesTitleTextView.setVisibility(View.VISIBLE);
            holder.caloriesTextView.setVisibility(View.VISIBLE);
            holder.caloriesTextView.setText(Integer.toString(item.getCalories()));
        }

        if (item.getFatCalories() != null) {
            holder.fatCaloriesTitleTextView.setVisibility(View.VISIBLE);
            holder.fatCaloriesTextView.setVisibility(View.VISIBLE);
            holder.fatCaloriesTextView.setText(Integer.toString(item.getFatCalories()));
        }

        if (item.getFat() != null) {
            holder.fatTitleTextView.setVisibility(View.VISIBLE);
            holder.fatTextView.setVisibility(View.VISIBLE);
            holder.fatTextView.setText(item.getFat());
        }

        if (item.getSaturatedFat()!= null) {
            holder.saturatedFatTitleTextView.setVisibility(View.VISIBLE);
            holder.saturatedFatTextView.setVisibility(View.VISIBLE);
            holder.saturatedFatTextView.setText(item.getSaturatedFat());
        }

        if (item.getTransFat() != null) {
            holder.transFatTitleTextView.setVisibility(View.VISIBLE);
            holder.transFatTextView.setVisibility(View.VISIBLE);
            holder.transFatTextView.setText(item.getTransFat());
        }

        if (item.getPolyunsaturatedFat() != null) {
            holder.polyunsaturatedFatTitleTextView.setVisibility(View.VISIBLE);
            holder.polyunsaturatedFatTextView.setVisibility(View.VISIBLE);
            holder.polyunsaturatedFatTextView.setText(item.getPolyunsaturatedFat());
        }

        if (item.getMonounsaturatedFat() != null) {
            holder.monounsaturatedFatTitleTextView.setVisibility(View.VISIBLE);
            holder.monounsaturatedFatTextView.setVisibility(View.VISIBLE);
            holder.monounsaturatedFatTextView.setText(item.getMonounsaturatedFat());
        }

        if (item.getCholesterol()!= null) {
            holder.cholesterolTitleTextView.setVisibility(View.VISIBLE);
            holder.cholesterolTextView.setVisibility(View.VISIBLE);
            holder.cholesterolTextView.setText(Integer.toString(item.getCholesterol()));
        }

        if (item.getSodium()!= null) {
            holder.sodiumTitleTextView.setVisibility(View.VISIBLE);
            holder.sodiumTextView.setVisibility(View.VISIBLE);
            holder.sodiumTextView.setText(Integer.toString(item.getSodium()));
        }

        if (item.getPotassium() != null) {
            holder.potassiumTitleTextView.setVisibility(View.VISIBLE);
            holder.potassiumTextView.setVisibility(View.VISIBLE);
            holder.potassiumTextView.setText(Integer.toString(item.getPotassium()));
        }

        if (item.getCarbohydrate()!= null) {
            holder.carbohydrateTitleTextView.setVisibility(View.VISIBLE);
            holder.carbohydrateTextView.setVisibility(View.VISIBLE);
            holder.carbohydrateTextView.setText(Integer.toString(item.getCarbohydrate()));
        }

        if (item.getFiber() != null) {
            holder.fiberTitleTextView.setVisibility(View.VISIBLE);
            holder.fiberTextView.setVisibility(View.VISIBLE);
            holder.fiberTextView.setText(Integer.toString(item.getFiber()));
        }

        if (item.getSugars() != null) {
            holder.sugarsTitleTextView.setVisibility(View.VISIBLE);
            holder.sugarsTextView.setVisibility(View.VISIBLE);
            holder.sugarsTextView.setText(Integer.toString(item.getSugars()));
        }

        if (item.getProtein() != null) {
            holder.proteinTitleTextView.setVisibility(View.VISIBLE);
            holder.proteinTextView.setVisibility(View.VISIBLE);
            holder.proteinTextView.setText(Integer.toString(item.getProtein()));
        }

        if (item.getAuthor()!= null) {
            holder.authorTitleTextView.setVisibility(View.VISIBLE);
            holder.authorTextView.setVisibility(View.VISIBLE);
            holder.authorTextView.setText(item.getAuthor());
        }

        if (item.getFormat()!= null) {
            holder.fiberTitleTextView.setVisibility(View.VISIBLE);
            holder.fiberTextView.setVisibility(View.VISIBLE);
            holder.fiberTextView.setText(item.getSodium());
        }

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
