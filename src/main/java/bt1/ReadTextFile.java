/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class ReadTextFile {

    public static void main(String[] args) {
        ArrayList<Product> ds = new ArrayList<>();
        try {
            FileReader fr = new FileReader("sanpham.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] arr = line.split(";");
                ds.add(new Product(arr[0], arr[1], Float.parseFloat(arr[2])));
            }
            fr.close();
            System.out.println("\n Da doc xong");
            for (Product sp : ds) {
                System.out.println(sp);
            }
        } catch (Exception ex) {
            System.out.println("Loi xay ra: " + ex.toString());
        }

    }
}
