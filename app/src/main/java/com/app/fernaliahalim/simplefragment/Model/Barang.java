package com.app.fernaliahalim.simplefragment.Model;

/**
 * Created by fernaliahalim on 5/7/2017.
 */

        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;

public class Barang {

    @SerializedName("id_barang")
    @Expose
    private String idBarang;
    @SerializedName("nama")
    @Expose
    private String nama;
    @SerializedName("stock")
    @Expose
    private String stock;
    @SerializedName("supplier")
    @Expose
    private String supplier;

    public String getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

}