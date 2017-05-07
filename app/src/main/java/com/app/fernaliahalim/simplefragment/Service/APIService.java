package com.app.fernaliahalim.simplefragment.Service;

import com.app.fernaliahalim.simplefragment.Model.Barang;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by fernaliahalim on 5/7/2017.
 */

public interface APIService {
    @GET("barang")
    Call<List<Barang>> getAllBarang();

    @POST("tambah_barang")
    @FormUrlEncoded
    Call<Barang> insertBarang(@Field("nama") String nama,
                             @Field("stock") int stock,
                             @Field("supplier") String supplier
                             );
}
