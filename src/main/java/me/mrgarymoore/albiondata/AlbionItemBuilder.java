package me.mrgarymoore.albiondata;

// TODO: Write a code generator to produce an item builder based on items.json
//  in the resources folder.

/**
 * Returns a comma separated list of items appropriate for ingestion into a
 * RESTful API.
 *
 * @author Gary Moore
 */
public class AlbionItemBuilder {
    private final StringBuilder albionItems = new StringBuilder();

    /**
     * Appends to a comma separated string of item names.
     *
     * @param tier Tier of the item to append to the string of item names.
     * @return {@link AlbionItemBuilder} containing appended item names.
     */
    public AlbionItemBuilder bag(Tier tier) {
        switch (tier) {
            case ONE:
                albionItems.append("T1_BAG,");
                break;
            case TWO:
                albionItems.append("T2_BAG,");
                break;
            case THREE:
                albionItems.append("T3_BAG,");
                break;
            case FOUR:
                albionItems.append("T4_BAG,");
                break;
            case FIVE:
                albionItems.append("T5_BAG,");
                break;
            case SIX:
                albionItems.append("T6_BAG,");
                break;
            case SEVEN:
                albionItems.append("T7_BAG,");
                break;
            case EIGHT:
                albionItems.append("T8_BAG,");
                break;
        }

        return this;
    }

    /**
     * Get a comma separated list of item names appropriate for consumption in
     * the RESTful API.
     *
     * @return Comma separated list of item names.
     */
    public String build() {
        return albionItems
                // Trim the trailing comma
                .deleteCharAt(albionItems.length() - 1)
                .toString();
    }
}
