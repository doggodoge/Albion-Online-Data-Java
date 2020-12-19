package me.mrgarymoore.albiondata;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.gson.annotations.SerializedName;

import java.time.LocalDateTime;


/**
 * Simple DTO class for the endpoint {@code /stats/prices/{items}} in
 * {@link AlbionService}
 */
public class ItemPrice {
    @SerializedName("item_id")
    final String itemId;

    final String city;

    final int quality;

    @SerializedName("sell_price_min")
    final int sellPriceMin;

    @SerializedName("sell_price_min_date")
    final LocalDateTime sellPriceMinDate;

    @SerializedName("sell_price_max")
    final int sellPriceMax;

    @SerializedName("sell_price_max_date")
    final LocalDateTime sellPriceMaxDate;

    final int buyPriceMin;

    @SerializedName("buy_price_min_date")
    final LocalDateTime buyPriceMinDate;

    @SerializedName("buy_price_max")
    final int buyPriceMax;

    @SerializedName("buy_price_max_date")
    final LocalDateTime buyPriceMaxDate;

    public ItemPrice(
            String itemId,
            String city,
            int quality,
            int sellPriceMin,
            LocalDateTime sellPriceMinDate,
            int sellPriceMax,
            LocalDateTime sellPriceMaxDate,
            int buyPriceMin,
            LocalDateTime buyPriceMinDate,
            int buyPriceMax,
            LocalDateTime buyPriceMaxDate
    ) {
        this.itemId = itemId;
        this.city = city;
        this.quality = quality;
        this.sellPriceMin = sellPriceMin;
        this.sellPriceMinDate = sellPriceMinDate;
        this.sellPriceMax = sellPriceMax;
        this.sellPriceMaxDate = sellPriceMaxDate;
        this.buyPriceMin = buyPriceMin;
        this.buyPriceMinDate = buyPriceMinDate;
        this.buyPriceMax = buyPriceMax;
        this.buyPriceMaxDate = buyPriceMaxDate;
    }

    /**
     * Albion Online item ID.
     *
     * @return {@link String} of Item ID.
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * Get the city on which the item is on the market.
     *
     * @return City where the item is on the market.
     */
    public String getCity() {
        return city;
    }

    /**
     * Get the quality of the item.
     *
     * @return Quality of the item.
     */
    public int getQuality() {
        return quality;
    }

    public int getSellPriceMin() {
        return sellPriceMin;
    }

    public LocalDateTime getSellPriceMinDate() {
        return sellPriceMinDate;
    }

    public int getSellPriceMax() {
        return sellPriceMax;
    }

    public LocalDateTime getSellPriceMaxDate() {
        return sellPriceMaxDate;
    }

    public int getBuyPriceMin() {
        return buyPriceMin;
    }

    public LocalDateTime getBuyPriceMinDate() {
        return buyPriceMinDate;
    }

    public int getBuyPriceMax() {
        return buyPriceMax;
    }

    public LocalDateTime getBuyPriceMaxDate() {
        return buyPriceMaxDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemPrice itemPrice = (ItemPrice) o;
        return getQuality() == itemPrice.getQuality()
                && getSellPriceMin() == itemPrice.getSellPriceMin()
                && getSellPriceMax() == itemPrice.getSellPriceMax()
                && getBuyPriceMin() == itemPrice.getBuyPriceMin()
                && getBuyPriceMax() == itemPrice.getBuyPriceMax()
                && Objects.equal(getItemId(), itemPrice.getItemId())
                && Objects.equal(getCity(), itemPrice.getCity())
                && Objects.equal(getSellPriceMinDate(), itemPrice.getSellPriceMinDate())
                && Objects.equal(getSellPriceMaxDate(), itemPrice.getSellPriceMaxDate())
                && Objects.equal(getBuyPriceMinDate(), itemPrice.getBuyPriceMinDate())
                && Objects.equal(getBuyPriceMaxDate(), itemPrice.getBuyPriceMaxDate());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(
                getItemId(),
                getCity(),
                getQuality(),
                getSellPriceMin(),
                getSellPriceMinDate(),
                getSellPriceMax(),
                getSellPriceMaxDate(),
                getBuyPriceMin(),
                getBuyPriceMinDate(),
                getBuyPriceMax(),
                getBuyPriceMaxDate()
        );
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("itemId", itemId)
                .add("city", city)
                .add("quality", quality)
                .add("sellPriceMin", sellPriceMin)
                .add("sellPriceMinDate", sellPriceMinDate)
                .add("sellPriceMax", sellPriceMax)
                .add("sellPriceMaxDate", sellPriceMaxDate)
                .add("buyPriceMin", buyPriceMin)
                .add("buyPriceMinDate", buyPriceMinDate)
                .add("buyPriceMax", buyPriceMax)
                .add("buyPriceMaxDate", buyPriceMaxDate)
                .toString();
    }
}
