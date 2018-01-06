package com.service.ecomerce.serviceecomerce.model;

public class AllPost {

    int total_rows;
    int offset;
    SinglePostInfo[] rows=new SinglePostInfo[total_rows];
    public AllPost(){}

    public int getTotal_rows() {
        return total_rows;
    }

    public void setTotal_rows(int total_rows) {
        this.total_rows = total_rows;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public SinglePostInfo[] getRows() {
        return rows;
    }

    public void setRows(SinglePostInfo[] rows) {
        this.rows = rows;
    }
}
