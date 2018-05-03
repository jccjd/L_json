package com.example.lenovo.l_json;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;
//工厂模式
public class HttpUtil {
    public static void requestNews(Callback<HttpResult<List<news>>> callback) {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://10.0.2.2")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiService apiService = retrofit.create(ApiService.class);
        Call<HttpResult<List<news>>> call = apiService.getNews();
        call.enqueue(callback);
    }
}
