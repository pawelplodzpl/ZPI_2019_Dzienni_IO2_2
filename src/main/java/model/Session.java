package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Session {

    @SerializedName("data")
    @Expose
    private String data;
    @SerializedName("cena")
    @Expose
    private Double cena;

    public String getData() {
        return data;
    }

    public Double getCena() {
        return cena;
    }


}