package com.dicoding.coronalive.API;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClientCorona {

    public static final String BASE_URL = "https://api.kawalcorona.com/";
    public static ApiInterface apiInterface() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        ApiInterface s = retrofit.create(ApiInterface.class);
        return s;
    }
}
