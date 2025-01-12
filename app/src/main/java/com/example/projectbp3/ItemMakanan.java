package com.example.projectbp3;

public class ItemMakanan {
    private String namaMakanan;
    private String asalMakanan;
    private String deskripsiMakanan;
    private int gambarMakanan;

    public ItemMakanan(String namaMakanan, String asalMakanan, String deskripsiMakanan, int gambarMakanan) {
        this.namaMakanan = namaMakanan;
        this.asalMakanan = asalMakanan;
        this.deskripsiMakanan = deskripsiMakanan;
        this.gambarMakanan = gambarMakanan;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public String getAsalMakanan() {
        return asalMakanan;
    }

    public String getDeskripsiMakanan() {
        return deskripsiMakanan;
    }

    public int getGambarMakanan() {
        return gambarMakanan;
    }
}
