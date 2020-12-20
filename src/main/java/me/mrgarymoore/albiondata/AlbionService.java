package me.mrgarymoore.albiondata;

import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import retrofit2.http.QueryName;

import java.util.List;
import java.util.Map;

/**
 * Provides a Java API to the albion online data project RESTful service. Must
 * be built with Retrofit if extracted from this project.
 *
 * Example of instantiating the service:
 *<p>
 * <code>
 *     Retrofit retrofit = new Retrofit.Builder()
 *             .baseUrl(albionDataApiUrl)
 *             build();
 *
 *     AlbionService albionService = retrofit.create(AlbionService.class);
 * </code>
 */
public interface AlbionService {

    /**
     * Retrieve collection of item prices. More than one item can be specified.
     * Options such as location and item quality also available.
     * <p>
     * Use {@link AlbionCityBuilder}, {@link AlbionItemBuilder}, and
     * {@link AlbionQualityBuilder} for a more ergonomic method of inputting
     * the items and options into a {@link Map}.
     *
     * @param items Comma separated list of items.
     * @param options Map of options.
     * @return
     */
    @GET("stats/prices/{items}")
    Call<List<ItemPrice>> getItemPrices(
            @Path("items") String items,
            @QueryMap Map<String, String> options);

    /**
     * Retrieve gold prices between a range of dates.
     *
     * @param startDate ISO DATE TIME string of start date.
     * @param endDate   ISO DATE TIME string of end date.
     * @return Collection of gold prices between specified dates
     */
    @GET("stats/gold")
    Call<List<GoldPrice>> getGoldPrices(
            @QueryName String startDate,
            @QueryName String endDate);

    /**
     * Fetch the n most recent gold prices.
     *
     * @param count Number of gold price records to retrieve.
     * @return Collection of n gold prices.
     */
    @GET("stats/gold")
    Call<List<GoldPrice>> getGoldPrices(@QueryName int count);
}
