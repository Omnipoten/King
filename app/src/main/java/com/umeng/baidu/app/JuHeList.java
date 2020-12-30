package com.umeng.baidu.app;

public class JuHeList {
    private Double lot;
    private Double gt;

    public Double getLot() {
        return lot;
    }

    public void setLot(Double lot) {
        this.lot = lot;
    }

    public Double getGt() {
        return gt;
    }

    public void setGt(Double gt) {
        this.gt = gt;
    }

    public JuHeList(Double lot, Double gt) {
        this.lot = lot;
        this.gt = gt;
    }
}
