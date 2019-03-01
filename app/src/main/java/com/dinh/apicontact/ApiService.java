package com.dinh.apicontact;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("contact")
    Call<List<Contact>> getAnswers();
}
