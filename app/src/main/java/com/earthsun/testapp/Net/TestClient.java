package com.earthsun.testapp.Net;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TestClient {

    public TestService newInstance(String url){
        TestService testService = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(TestService.class);
                return testService;
    }
}
