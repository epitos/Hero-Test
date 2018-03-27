package epitos.com.herotest.utils;


import epitos.com.herotest.network.Requests;
import epitos.com.herotest.network.RetrofitClient;

/**
 * Created by epitos on 20/06/2017.
 */

public class ApiUtils {

    public static Requests getRequest(String url) {
        return RetrofitClient.getClient(url).create(Requests.class);
    }
}
