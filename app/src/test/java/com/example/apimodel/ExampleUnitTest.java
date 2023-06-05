package com.example.apimodel;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.apimodel.model.Shops;
import com.example.apimodel.network.ShopsApi;
import com.example.apimodel.network.ShopsApiService;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void getShops() throws IOException {
        ShopsApi shopsApi = new ShopsApi();
        ShopsApiService shopsApiService = shopsApi.createShopsApiService();
        Call<List<Shops>> call = shopsApiService.getItems();
        List<Shops> shops = call.execute().body();
        assertNotNull(shops);
        assertFalse(shops.isEmpty());
        System.out.println(new Gson().toJson(shops));
    }
}