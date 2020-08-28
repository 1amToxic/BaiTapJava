/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;
/**
 *
 * @author sonpt
 */

/*

  
  Các báo cần quản lý: ngày phát hành. (Date)*/
public class Tailieu {
    private int maTaiLieu;
    private String tenNXB;
    private int soban;

    public Tailieu(int maTaiLieu, String tenNXB, int soban) {
        this.maTaiLieu = maTaiLieu;
        this.tenNXB = tenNXB;
        this.soban = soban;
    }
    
    public int getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(int maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public int getSoban() {
        return soban;
    }

    public void setSoban(int soban) {
        this.soban = soban;
    }

    @Override
    public String toString() {
        return "Tailieu: " + "maTaiLieu=" + maTaiLieu + ", tenNXB=" + tenNXB + ", soban=" + soban +" ";
    }
    
    
    
}
