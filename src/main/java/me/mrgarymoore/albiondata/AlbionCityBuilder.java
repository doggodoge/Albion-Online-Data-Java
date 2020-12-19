package me.mrgarymoore.albiondata;

public class AlbionCityBuilder {
    private StringBuilder stringBuilder = new StringBuilder();

    public AlbionCityBuilder bridgewatch() {
        stringBuilder.append("Bridgewatch,");
        return this;
    }

    public AlbionCityBuilder caerleon() {
        stringBuilder.append("Caerleon,");
        return this;
    }

    public AlbionCityBuilder fortSterling() {
        stringBuilder.append("FortSterling,");
        return this;
    }

    public AlbionCityBuilder lymhurst() {
        stringBuilder.append("Lymhurst,");
        return this;
    }

    public AlbionCityBuilder thetford() {
        stringBuilder.append("Thetford,");
        return this;
    }

    public AlbionCityBuilder martlock() {
        stringBuilder.append("Martlock,");
        return this;
    }

    public String build() {
        return stringBuilder.deleteCharAt(stringBuilder.length() - 1).toString();
    }
}
