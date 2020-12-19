package me.mrgarymoore.albiondata;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetrofitConfiguration {

    @Bean
    @Autowired
    @Qualifier("provideGsonForRetrofit")
    public Retrofit provideRetrofit(Gson gson) {
        return new Retrofit.Builder()
                .baseUrl("https://www.albion-online-data.com/api/v2/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }
}
