package epitos.com.herotest.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import epitos.com.herotest.R;

/**
 * Created by epitos on 27/03/2018.
 */

public class ItemsViewHolder extends RecyclerView.ViewHolder {

    public TextView brandNameTextView;
    public TextView nameTextView;
    public TextView sizeTextView;
    public TextView ingrediantsTextView;
    public TextView servingSizeTextView;
    public TextView servingsPerContainerTextView;
    public TextView caloriesTextView;
    public TextView fatCaloriesTextView;
    public TextView fatTextView;
    public TextView saturatedFatTextView;
    public TextView transFatTextView;
    public TextView polyunsaturatedFatTextView;
    public TextView monounsaturatedFatTextView;
    public TextView cholesterolTextView;
    public TextView sodiumTextView;
    public TextView potassiumTextView;
    public TextView carbohydrateTextView;
    public TextView fiberTextView;
    public TextView sugarsTextView;
    public TextView proteinTextView;
    public TextView authorTextView;
    public TextView formatTextView;

    public TextView sizeTitleTextView;
    public TextView ingrediantsTitleTextView;
    public TextView servingSizeTitleTextView;
    public TextView servingsPerContainerTitleTextView;
    public TextView caloriesTitleTextView;
    public TextView fatCaloriesTitleTextView;
    public TextView fatTitleTextView;
    public TextView saturatedFatTitleTextView;
    public TextView transFatTitleTextView;
    public TextView polyunsaturatedFatTitleTextView;
    public TextView monounsaturatedFatTitleTextView;
    public TextView cholesterolTitleTextView;
    public TextView sodiumTitleTextView;
    public TextView potassiumTitleTextView;
    public TextView carbohydrateTitleTextView;
    public TextView fiberTitleTextView;
    public TextView sugarsTitleTextView;
    public TextView proteinTitleTextView;
    public TextView authorTitleTextView;
    public TextView formatTitleTextView;


    public ItemsViewHolder(View itemView) {
        super(itemView);

        brandNameTextView = (TextView) itemView.findViewById(R.id.brand_name);
        nameTextView = (TextView) itemView.findViewById(R.id.name);
        sizeTextView = (TextView) itemView.findViewById(R.id.size);
        ingrediantsTextView = (TextView) itemView.findViewById(R.id.ingredients);
        servingSizeTextView = (TextView) itemView.findViewById(R.id.serving_size);
        servingsPerContainerTextView = (TextView) itemView.findViewById(R.id.servings_per_container);
        caloriesTextView = (TextView) itemView.findViewById(R.id.calories);
        fatCaloriesTextView = (TextView) itemView.findViewById(R.id.fat_calories);
        fatTextView = (TextView) itemView.findViewById(R.id.fat);
        saturatedFatTextView = (TextView) itemView.findViewById(R.id.saturated_fat);
        transFatTextView = (TextView) itemView.findViewById(R.id.trans_fat);
        polyunsaturatedFatTextView = (TextView) itemView.findViewById(R.id.polyunsaturated_fat);
        monounsaturatedFatTextView = (TextView) itemView.findViewById(R.id.monounsaturated_fat);
        cholesterolTextView = (TextView) itemView.findViewById(R.id.cholesterol);
        sodiumTextView = (TextView) itemView.findViewById(R.id.sodium);
        potassiumTextView = (TextView) itemView.findViewById(R.id.potassium);
        carbohydrateTextView = (TextView) itemView.findViewById(R.id.carbohydrate);
        fiberTextView = (TextView) itemView.findViewById(R.id.fiber);
        sugarsTextView = (TextView) itemView.findViewById(R.id.sugars);
        proteinTextView = (TextView) itemView.findViewById(R.id.protein);
        authorTextView = (TextView) itemView.findViewById(R.id.author);
        formatTextView = (TextView) itemView.findViewById(R.id.format);

        sizeTitleTextView = (TextView) itemView.findViewById(R.id.size_title);
        ingrediantsTitleTextView = (TextView) itemView.findViewById(R.id.ingredients_title);
        servingSizeTitleTextView = (TextView) itemView.findViewById(R.id.serving_size_title);
        servingsPerContainerTitleTextView = (TextView) itemView.findViewById(R.id.servings_per_container_title);
        caloriesTitleTextView = (TextView) itemView.findViewById(R.id.calories_title);
        fatCaloriesTitleTextView = (TextView) itemView.findViewById(R.id.fat_calories_title);
        fatTitleTextView = (TextView) itemView.findViewById(R.id.fat_title);
        saturatedFatTitleTextView = (TextView) itemView.findViewById(R.id.saturated_fat_title);
        transFatTitleTextView = (TextView) itemView.findViewById(R.id.trans_fat_title);
        polyunsaturatedFatTitleTextView = (TextView) itemView.findViewById(R.id.polyunsaturated_fat_title);
        monounsaturatedFatTitleTextView = (TextView) itemView.findViewById(R.id.monounsaturated_fat_title);
        cholesterolTitleTextView = (TextView) itemView.findViewById(R.id.cholesterol_title);
        sodiumTitleTextView = (TextView) itemView.findViewById(R.id.sodium_title);
        potassiumTitleTextView = (TextView) itemView.findViewById(R.id.potassium_title);
        carbohydrateTitleTextView = (TextView) itemView.findViewById(R.id.carbohydrate_title);
        fiberTitleTextView = (TextView) itemView.findViewById(R.id.fiber_title);
        sugarsTitleTextView = (TextView) itemView.findViewById(R.id.sugars_title);
        proteinTitleTextView = (TextView) itemView.findViewById(R.id.protein_title);
        authorTitleTextView = (TextView) itemView.findViewById(R.id.author_title);
        formatTitleTextView = (TextView) itemView.findViewById(R.id.format_title);
    }
}
