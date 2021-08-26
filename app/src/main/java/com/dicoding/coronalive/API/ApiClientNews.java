package com.dicoding.coronalive.API;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClientNews {

    private static final String BASE_URL = "https://newsapi.org/v2/";
    private static ApiClientNews apiClientNews;
    private static Retrofit retrofit;

    private ApiClientNews(){
        retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();

    }

    public static synchronized ApiClientNews getInstance(){
        if (apiClientNews == null){
            apiClientNews = new ApiClientNews();
        }

        return apiClientNews;
    }

    public ApiInterface getApi(){
        return retrofit.create(ApiInterface.class);
    }
}
