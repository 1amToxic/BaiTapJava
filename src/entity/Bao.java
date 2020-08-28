/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author sonpt
 */
//Các báo cần quản lý: ngày phát hành. (Date)*
public class Bao extends Tailieu{
    private Date ngayPH;

    public Bao(Date ngayPH, int maTaiLieu, String tenNXB, int soban) {
        super(maTaiLieu, tenNXB, soban);
        this.ngayPH = ngayPH;
    }
    
    public Date getNgayPH() {
        return ngayPH;
    }

    public void setNgayPH(Date ngayPH) {
        this.ngayPH = ngayPH;
    }

    @Override
    public String toString() {
        return super.toString()+  "ngayPH=" + ngayPH;
    }
    
}
