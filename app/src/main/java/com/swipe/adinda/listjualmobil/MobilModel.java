package com.swipe.adinda.listjualmobil;

import java.io.Serializable;

/**
 * Created by adinda on 02/10/16.
 */

public class MobilModel implements Serializable {
    String title, image, harga, lokasi;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public String getHarga() {
        return harga;
    }

    public String getLokasi() {
        return lokasi;
    }
}
