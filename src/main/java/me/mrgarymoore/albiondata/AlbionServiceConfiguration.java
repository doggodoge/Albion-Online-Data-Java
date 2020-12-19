package me.mrgarymoore.albiondata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;

@Configuration
public class AlbionServiceConfiguration {

    @Bean
    @Autowired
    public AlbionService provideAlbionService(Retrofit retrofit) {
        return retrofit.create(AlbionService.class);
    }
}
