package com.example.finery;

public class Rate {

    //private String rateid;
    private String productTitle;
    private String Comment;
   // private String rate;

    public Rate() {
    }

    public Rate(String productTitle, String comment) {
        this.productTitle = productTitle;
        Comment = comment;
    }

    public String getProductTitle(String trim) {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public String getComment(String trim) {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }
}

