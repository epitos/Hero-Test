package epitos.com.herotest.network;

import java.util.ArrayList;

import epitos.com.herotest.model.Item;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by epitos on 15/03/2018.
 */

public interface Requests {

    //Get Items
    @GET("items")
    Call<ArrayList<Item>> getItems();

}
