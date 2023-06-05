package com.example.apimodel.model;

import com.google.gson.annotations.SerializedName;

public class Shops {
    @SerializedName("_id")
    private String serverId;
    private Integer id;
    @SerializedName("admin_graphql_api_id")
    private String adminGraphqlApiId;
    @SerializedName("app_id")
    private Integer appId;
    @SerializedName("browser_ip")
    private String browserIp;
    @SerializedName("buyer_accepts_marketing")
    private Boolean buyerAcceptsMarketing;
    @SerializedName("cancel_reason")
    private String cancelReason;
    @SerializedName("cancelled_at")
    private String cancelledAt;
    @SerializedName("cart_token")
    private String cartToken;
    @SerializedName("checkout_id")
    private Integer checkOut;
    @SerializedName("checkout_token")
    private String checkoutToken;
    @SerializedName("client_details")
    public ClientDetails clientDetails;
    @SerializedName("closed_at")
    private String closedAt;
    @SerializedName("confirmed")
    private Boolean confirmed;
    @SerializedName("created_at")
    private String createdAt;
    @SerializedName("currency")
    private String currency;
    @SerializedName("current_subtotal_price")
    private String currentSubTotalPrice;
    @SerializedName("current_subtotal_price_set")
    private Set currentSubtotalPriceSet;
    @SerializedName("current_total_discounts")
    private String currentTotalDiscounts;
    @SerializedName("current_total_discounts_set")
    private Set currentTotalDiscountsSet;
    @SerializedName("current_total_duties_set")
    private String currentTotalDutiesSet;
    @SerializedName("current_total_price")
    private String currentTotalPrice;
    @SerializedName("current_total_price_set")
    private Set currentTotalPriceSet;
    @SerializedName("current_total_tax")
    private String currentTotalTax;
    @SerializedName("current_total_tax_set")
    private Set currentTotalTaxSet;

}
