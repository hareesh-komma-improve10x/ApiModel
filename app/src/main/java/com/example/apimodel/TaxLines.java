package com.example.apimodel;

import com.example.apimodel.model.Set;
import com.google.gson.annotations.SerializedName;

public class TaxLines {
    @SerializedName("channel_liable")
    private Boolean channelLiable;
    private String price;
    @SerializedName("price_set")
    private Set priceSet;
    private Float rate;
    private String title;
}
