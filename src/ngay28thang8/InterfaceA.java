/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngay28thang8;

/**
 *
 * @author lamit
 */
public class InterfaceA {
    public static void main(String[] args) {
        canFly canFlyy = new canFly() {
            @Override
            public boolean canFly() {
                return true;
            }
        };
    }
}
interface canFly{
    boolean canFly();
    
}
interface canSwim{
    boolean canSwim();
}
//khong phai da ke thua
//implement : triển khai hoặc có tính chất
class Cat implements canFly,canSwim{

    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    public boolean canSwim() {
        return false;
    }
    
}
