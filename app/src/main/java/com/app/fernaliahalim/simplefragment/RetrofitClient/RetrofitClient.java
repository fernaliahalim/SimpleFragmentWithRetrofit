package com.app.fernaliahalim.simplefragment.RetrofitClient;

import com.app.fernaliahalim.simplefragment.Service.APIService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by fernaliahalim on 5/7/2017.
 */

public class RetrofitClient {
    public  static final String END_POINT = "http://codeaing.com/training_micro/";
    private static Retrofit retrofit  =null;

    public  static Retrofit getClient(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(END_POINT)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    public static APIService getApiService(){
        return getClient().create(APIService.class);
    }
}
