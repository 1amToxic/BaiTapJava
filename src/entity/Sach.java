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
public class Sach extends Tailieu{
//Các loại sách cần quản lý: Tên tác giả, Tên sách, số trang
    private String tenTG;
    private String tenS;
    private int soTrang;

    public Sach(String tenTG, String tenS, int soTrang, int maTaiLieu, String tenNXB, int soban) {
        super(maTaiLieu, tenNXB, soban);
        this.tenTG = tenTG;
        this.tenS = tenS;
        this.soTrang = soTrang;
    }
    
    
    
    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public String getTenS() {
        return tenS;
    }

    public void setTenS(String tenS) {
        this.tenS = tenS;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return super.toString() + "tenTG=" + tenTG + ", tenS=" + tenS + ", soTrang=" + soTrang;
    }
    
}
