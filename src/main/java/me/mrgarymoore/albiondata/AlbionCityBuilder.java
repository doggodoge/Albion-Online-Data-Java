package me.mrgarymoore.albiondata;

/**
 * Builder to generate a comma seperated string of city names appropriate for
 * ingestion to a RESTful call to an online API.
 *
 * @author Gary Moore
 */
public class AlbionCityBuilder {
    private final StringBuilder stringBuilder = new StringBuilder();

    /**
     * Applies "Bridgewatch" to the string.
     * @return {@link AlbionCityBuilder}
     */
    public AlbionCityBuilder bridgewatch() {
        stringBuilder.append("Bridgewatch,");
        return this;
    }

    /**
     * Applies "Caerleon" to the string.
     * @return {@link AlbionCityBuilder}
     */
    public AlbionCityBuilder caerleon() {
        stringBuilder.append("Caerleon,");
        return this;
    }

    /**
     * Applies "FortSterling" to the string.
     * @return {@link AlbionCityBuilder}
     */
    public AlbionCityBuilder fortSterling() {
        stringBuilder.append("FortSterling,");
        return this;
    }

    /**
     * Applies "Lymhurst" to the string.
     * @return {@link AlbionCityBuilder}
     */
    public AlbionCityBuilder lymhurst() {
        stringBuilder.append("Lymhurst,");
        return this;
    }

    /**
     * Applies "Thetford" to the string.
     * @return {@link AlbionCityBuilder}
     */
    public AlbionCityBuilder thetford() {
        stringBuilder.append("Thetford,");
        return this;
    }

    /**
     * Applies "Martlock" to the string.
     * @return {@link AlbionCityBuilder}
     */
    public AlbionCityBuilder martlock() {
        stringBuilder.append("Martlock,");
        return this;
    }

    /**
     * Returns the internal state of the builder as a comma separated string of
     * the city names.
     * @return Comma separated list of city names.
     */
    public String build() {
        return stringBuilder.deleteCharAt(stringBuilder.length() - 1).toString();
    }
}
