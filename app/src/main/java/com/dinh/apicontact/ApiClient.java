package com.dinh.apicontact;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public static Retrofit retrofit = null;
    public static Retrofit getApiClient(String url){
        if (retrofit == null) {
            retrofit= new Retrofit.Builder().baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
//    private static Retrofit retrofit = null;
//
//    public static Retrofit getClient(String baseURL) {
//        retrofit = new Retrofit.Builder()
//                .baseUrl(baseURL)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//        return retrofit;
//    }
}
