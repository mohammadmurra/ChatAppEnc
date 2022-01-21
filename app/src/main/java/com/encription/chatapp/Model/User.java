package com.encription.chatapp.Model;

public class User {

    private String id;
    private String username;
    private String imageURL;
    private String status;
    private String search;
    private String publicKey;
    private String nInt;

    private String privateKey;

    public User(String id, String username, String imageURL, String status, String search, String publicKey, String privateKey , String nInt) {
        this.id = id;
        this.username = username;
        this.imageURL = imageURL;
        this.status = status;
        this.search = search;
        this.publicKey = publicKey;
        this.privateKey = privateKey;
    this.nInt = nInt;
    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public String getnInt() {
        return nInt;
    }

    public void setnInt(String nInt) {
        this.nInt = nInt;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }
}