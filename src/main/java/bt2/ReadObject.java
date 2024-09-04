/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class ReadObject {

    public static void main(String[] args) {
        ArrayList<Product> ds;
        try {
            FileInputStream fis = new FileInputStream("sanpham.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ds = (ArrayList<Product>) ois.readObject();
            ois.close();
            System.out.println("\n Da doc xong");
            for (Product sp : ds) {
                System.out.println(sp);

            }
        } catch (Exception ex) {
            System.out.println("Loi xay ra: " + ex.toString());
        }

    }
}
