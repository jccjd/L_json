package com.example.lenovo.l_json;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface ApiService {
    @GET("json.php")
    Call<HttpResult<List<news>>> getNews();
}
