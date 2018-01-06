package com.service.ecomerce.serviceecomerce.model;

public class SinglePostInfo {
    String id;
    String key;
    Post doc;


    public SinglePostInfo(){}


    public Post getDoc() {
        return doc;
    }

    public void setDoc(Post doc) {
        this.doc =doc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
