package me.mrgarymoore.albiondata;

public class AlbionQualityBuilder {
    private final StringBuilder stringBuilder = new StringBuilder();

    AlbionQualityBuilder normal() {
        stringBuilder.append("1,");
        return this;
    }

    AlbionQualityBuilder good() {
        stringBuilder.append("2,");
        return this;
    }

    AlbionQualityBuilder outstanding() {
        stringBuilder.append("3,");
        return this;
    }

    AlbionQualityBuilder excellent() {
        stringBuilder.append("4,");
        return this;
    }

    AlbionQualityBuilder masterpiece() {
        stringBuilder.append("5,");
        return this;
    }

    public String build() {
        return stringBuilder.deleteCharAt(stringBuilder.length() - 1).toString();
    }
}
