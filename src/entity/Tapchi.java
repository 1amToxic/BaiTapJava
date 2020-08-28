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
//Các tạp chí cần quản lý: Số phát hành, tháng phát hành
public class Tapchi extends Tailieu{
    private int soPH;
    private int thangPH;

    public Tapchi(int soPH, int thangPH, int maTaiLieu, String tenNXB, int soban) {
        super(maTaiLieu, tenNXB, soban);
        this.soPH = soPH;
        this.thangPH = thangPH;
    }
    
    public int getSoPH() {
        return soPH;
    }

    public void setSoPH(int soPH) {
        this.soPH = soPH;
    }

    public int getThangPH() {
        return thangPH;
    }

    public void setThangPH(int thangPH) {
        this.thangPH = thangPH;
    }

    @Override
    public String toString() {
        return super.toString() +  "soPH=" + soPH + ", thangPH=" + thangPH ;
    }
    
}
