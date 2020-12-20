package me.mrgarymoore.albiondata;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.time.LocalDateTime;

/**
 * Simple DTO for gold prices. Related to the {@code stats/gold} endpoint in
 * {@link AlbionService}
 *
 * @author Gary Moore
 */
public class GoldPrice {
    final private int id;
    final private int price;
    final private LocalDateTime timestamp;

    public GoldPrice(int id, int price, LocalDateTime timestamp) {
        this.id = id;
        this.price = price;
        this.timestamp = timestamp;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GoldPrice goldPrice = (GoldPrice) o;
        return getId() == goldPrice.getId()
                && getPrice() == goldPrice.getPrice()
                && Objects.equal(getTimestamp(), goldPrice.getTimestamp());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId(), getPrice(), getTimestamp());
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("price", price)
                .add("timestamp", timestamp)
                .toString();
    }
}
