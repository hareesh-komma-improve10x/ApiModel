package com.example.apimodel.network;

import com.example.apimodel.model.Shops;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ShopsApiService {
    @GET("api/479dd07f8c1d482e9219f7dcb48e25f4/renukaTemplates")
    Call<List<Shops>> getItems();
}
