package com.vogella.android.retrofitgithub;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Creado por Antonio Sáiz. Fecha: 01/02/2017.
 */

public interface GithubAPI {

    String ENDPOINT = "https://api.github.com";

    @GET("/users/{user}")
    Call<GithubUser> getUser(@Path("user") String user);

    @GET("users/{user}/repos")
    Call<List<GithubRepo>> getRepos(@Path("user") String user);
}
