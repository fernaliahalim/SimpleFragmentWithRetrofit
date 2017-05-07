package com.app.fernaliahalim.simplefragment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.app.fernaliahalim.simplefragment.Model.Barang;
import com.app.fernaliahalim.simplefragment.Service.APIService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TambahBarang extends AppCompatActivity {
    EditText etnama,etstock,etsupplier;
    Button btnsave;
    APIService apiservice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_barang);
        etnama = (EditText) findViewById(R.id.editTextNama);
        etstock = (EditText) findViewById(R.id.editTextStock);
        etsupplier = (EditText) findViewById(R.id.editTextsupplier);
        btnsave = (Button) findViewById(R.id.btnsave);

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nama, supplier;
                int stock;

                nama = etnama.getText().toString();
                supplier = etsupplier.getText().toString();
                stock = Integer.valueOf(etstock.getText().toString()) ;

                apiservice.insertBarang(nama,stock,supplier).enqueue(new Callback<Barang>() {
                    @Override
                    public void onResponse(Call<Barang> call, Response<Barang> response) {
                        if(response.isSuccessful()){
                            Toast.makeText(TambahBarang.this, "Data Berhasil ditambag", Toast.LENGTH_SHORT).show();
                            Intent i = new Intent(TambahBarang.this,ListBarang.class);
                            startActivity(i);
                        }
                    }

                    @Override
                    public void onFailure(Call<Barang> call, Throwable t) {

                    }
                });
            }
        });
    }
}
