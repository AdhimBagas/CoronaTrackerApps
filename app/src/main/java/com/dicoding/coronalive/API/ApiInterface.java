package com.dicoding.coronalive.API;

import com.dicoding.coronalive.Model.Headlines;
import com.dicoding.coronalive.Model.ModelDataIndonesia;
import com.dicoding.coronalive.Model.ModelObjectProvince;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET ("top-headlines")
    Call<Headlines> getHeadlines (
            @Query("country") String country,
            @Query("category") String category,
            @Query("apiKey") String apiKey
    );

    @GET ("indonesia")
    Call<List<ModelDataIndonesia>> getData();

    @GET ("indonesia/provinsi")
    Call<List<ModelObjectProvince>> getProvince();
}
