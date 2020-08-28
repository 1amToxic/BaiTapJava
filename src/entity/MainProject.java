/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sonpt
 */
//them, bot, tim kiem, show
public class MainProject {
    static ArrayList<Tailieu> listTaiLieu = new ArrayList<>();
    static Scanner scMain = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.println("0.Thoat");
            System.out.println("1.Them");
            System.out.println("2.Xoa");
            System.out.println("3.Tim kiem");
            System.out.println("4.Show");
            int chooseNumber = sc.nextInt();
            sc.nextLine();
            switch(chooseNumber){
                case 0:{
                    break;
                }
                case 1:{
                    chooseEntity(1);
                    showList(listTaiLieu);
                    break;
                }
                case 2:{
                    System.out.print("Nhap ma tai lieu: ");
                    int maTaiLieu = scMain.nextInt();
                    xoaTaiLieu(maTaiLieu);
                    break;
                }
                case 3:{
                    System.out.println("Nhap ma tai lieu: ");
                    int maxTaiLieu = scMain.nextInt();
                    ArrayList<Tailieu> tlDisplay = new ArrayList<>();
                    tlDisplay.add(timKiemTaiLieu(maxTaiLieu));
                    showList(tlDisplay);
                    break;
                }
                case 4:{
                    showList(listTaiLieu);
                    break;
                }
            }
        }
    }
    
    
    
    private static void chooseEntity(int type){
        System.out.println("1.Tap chi");
        System.out.println("2.Bao");
        System.out.println("3.Sach");
        int chooseEntity = scMain.nextInt();
        scMain.nextLine();
        Tailieu tl = inputTailieu();
        
        switch(chooseEntity){
            case 1:{
                themTaiLieu(inputTapchi(tl));
                break;
            }
            case 2:{
                themTaiLieu(inputBao(tl));
                break;
            }
            case 3:{
                themTaiLieu(inputSach(tl));
                break;
            }
        }
    }
    
    private static Sach inputSach(Tailieu tl){
        String tenTg,tenS;
        int soTrang;
        System.out.print("Nhap ten tac gia "); tenTg = scMain.nextLine();
        System.out.print("Nhap ten Sach "); tenS = scMain.nextLine();
        System.out.print("Nhap so trang: "); soTrang = scMain.nextInt();
        scMain.nextLine();
        return new Sach(tenTg, tenS, soTrang, tl.getMaTaiLieu(), tl.getTenNXB(), tl.getSoban());
    }
    
    private static Tapchi inputTapchi(Tailieu tl){
        int soPH,thangPH;
        System.out.print("Nhap so phat hanh: "); soPH = scMain.nextInt();
        scMain.nextLine();
        System.out.print("Nhap thang phat hanh: "); thangPH = scMain.nextInt();
        scMain.nextLine();
        return new Tapchi(soPH, thangPH, tl.getMaTaiLieu(), tl.getTenNXB(), tl.getSoban());
    }
    
    private static Bao inputBao(Tailieu tl){
        //
        String date;
        System.out.println("Nhap ngay phat hanh: (dd/MM/yyyy) ");  date = scMain.nextLine();
        Date datePH;
        try {
            datePH = new SimpleDateFormat("dd/MM/yyyy").parse(date);
            return new Bao(datePH, tl.getMaTaiLieu(), tl.getTenNXB(), tl.getSoban());
        } catch (ParseException ex) {
            Logger.getLogger(MainProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    private static Tailieu inputTailieu(){
        //(maTaiLieu, tenNXB, soban
        int maTL,soban;
        String tenNXB;
        System.out.print("Nhap ma tai lieu ");  maTL = scMain.nextInt();
        scMain.nextLine();
        System.out.print("Nhap ten NXB "); tenNXB = scMain.nextLine();
        System.out.print("Nhap so ban "); soban = scMain.nextInt();
        scMain.nextLine();
        return new Tailieu(maTL, tenNXB, soban);
    }
    
    private static  void themTaiLieu(Tailieu tl){
        listTaiLieu.add(tl);
    }
    private static  void xoaTaiLieu(int maTL){
        listTaiLieu.removeIf(tl -> tl.getMaTaiLieu() == maTL);
        
    }
    private static Tailieu timKiemTaiLieu(int maTL){
        for(Tailieu tl : listTaiLieu){
            if(tl.getMaTaiLieu() == maTL){
                return tl;
            }
        }
        return null;
    }
    private static void showList(ArrayList<Tailieu> listTl){
        for(Tailieu tl : listTl){
            if(tl instanceof Tapchi){
                System.out.println(((Tapchi)tl).toString());
            }
            else if(tl instanceof Bao){
                 System.out.println(((Bao)tl).toString());
            }
            else{
                 System.out.println(((Sach)tl).toString());
            }
        }
    }
    
}