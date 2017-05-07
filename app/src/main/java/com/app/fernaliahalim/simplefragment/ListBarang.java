package com.app.fernaliahalim.simplefragment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

import com.app.fernaliahalim.simplefragment.Model.Barang;
import com.app.fernaliahalim.simplefragment.RetrofitClient.RetrofitClient;
import com.app.fernaliahalim.simplefragment.Service.APIService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListBarang extends AppCompatActivity {
    private APIService apiservice;
    private List<String> nama_barang;
    private List<Barang> list;
    private Button btntambah;
    public ListBarang(){
        nama_barang = new ArrayList<>();
        apiservice = RetrofitClient.getApiService();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_barang);



        apiservice.getAllBarang().enqueue(new Callback<List<Barang>>() {
            @Override
            public void onResponse(Call<List<Barang>> call, Response<List<Barang>> response) {
                list = response.body();
                int ke = 1;
                for(Barang b : list){
                    Log.d("BARANG","BARANG " + ke + " "+b.getNama());
                    ke++;
                }
            }

            @Override
            public void onFailure(Call<List<Barang>> call, Throwable t) {
            Log.d("BARANG",t.toString());
            }
        });

        btntambah = (Button) findViewById(R.id.buttontambah);
        btntambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ListBarang.this,TambahBarang.class);
                startActivity(i);
            }
        });
    }
}
