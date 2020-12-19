package me.mrgarymoore.albiondata;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

public interface AlbionService {
    @GET("stats/prices/{items}")
    Call<List<ItemPrice>> getItemPrices(
            @Path("items") String items,
            @QueryMap Map<String, String> options);
}
