/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngay28thang8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lamit
 */
public class MainClass {
    static String path = "user.txt";
    public static void main(String[] args) {
        // vào ra object
        //in vao file
        User u  = new User("Lam", "123");
        FileOutputStream fos; /// mở file
        try {
            fos = new FileOutputStream(path); //alt enter
            ObjectOutputStream oos = new ObjectOutputStream(fos); //ghi đối tượng
            oos.writeObject(u);
            oos.close();
        } catch (FileNotFoundException ex) { //nếu file k tồn tại thì vào đây
            System.out.println("File không tồn tại");
        } catch (IOException ex) { //nếu k in vào được thì vào đây
            ex.printStackTrace();
        }
        //doc file
        FileInputStream fis;
        try {
            fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            User user = (User) ois.readObject();
            System.out.println(user);
            ois.close();
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        } catch (ClassNotFoundException ex) {
        }
    }
}
class User implements Serializable{
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", password=" + password + '}';
    }
    
}
