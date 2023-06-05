package com.example.apimodel.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ShopsApi {
    public ShopsApiService createShopsApiService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://crudcrud.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ShopsApiService shopsApiService = retrofit.create(ShopsApiService.class);
        return shopsApiService;
    }
}
