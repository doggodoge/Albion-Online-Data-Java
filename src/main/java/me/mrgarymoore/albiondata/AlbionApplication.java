package me.mrgarymoore.albiondata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@SpringBootApplication
public class AlbionApplication {

    private static final Logger log = LoggerFactory.getLogger(AlbionApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AlbionApplication.class, args);
    }

    @Bean
    @Autowired
    public CommandLineRunner provideCommandLineRunner(AlbionService albionService) {
        return args -> {
            final String items = new AlbionItemBuilder()
                    .bag(Tier.THREE)
                    .bag(Tier.FOUR)
                    .bag(Tier.FIVE)
                    .build();

            final String city = new AlbionCityBuilder()
                    .fortSterling()
                    .caerleon()
                    .lymhurst()
                    .build();

            final String quality = new AlbionQualityBuilder()
                    .outstanding()
                    .masterpiece()
                    .build();

            final Map<String, String> options = Map.of(
                    "locations", city,
                    "qualities", quality
            );

            try {
                final List<ItemPrice> albionItems = albionService
                        .getItemPrices(items, options)
                        .execute()
                        .body();

                albionItems.stream()
                        .map(ItemPrice::toString)
                        .forEach(log::info);

                final int totalCost = albionItems.stream()
                        .map(ItemPrice::getSellPriceMax)
                        .reduce(0, Integer::sum);


                String formattedTotalCost = NumberFormat
                        .getNumberInstance(Locale.getDefault())
                        .format(totalCost);

                log.info("Total: {} gold", formattedTotalCost);
            } catch (IOException e) {
                log.error("Failed to fetch items from item prices endpoint.");
            }

            try {
                String startDateTime = LocalDateTime.of(2020, 11, 1, 12, 4)
                        .format(DateTimeFormatter.ISO_DATE_TIME);
                String endDateTime = LocalDateTime.of(2020, 11, 1, 1, 2)
                        .format(DateTimeFormatter.ISO_DATE_TIME);

                final List<GoldPrice> goldPrices = albionService.getGoldPrices(startDateTime, endDateTime)
                        .execute()
                        .body();

                goldPrices.stream()
                        .map(GoldPrice::toString)
                        .forEach(log::info);
            } catch (IOException | NullPointerException e) {
                log.error("Failed to fetch gold prices from the gold endpoint.");
            }
        };
    }
}
