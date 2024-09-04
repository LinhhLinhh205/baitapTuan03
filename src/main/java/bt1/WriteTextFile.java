/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class WriteTextFile {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        try{
            FileWriter fw=new FileWriter("sanpham.txt");
            for(int i=0;i<3;i++){
                System.out.println("Thong tin san pham thu "+(i+1));
                System.out.print("Nhap ma so: ");
                String maso=sc.nextLine();
                System.out.print("Nhap ten: ");
                String ten=sc.nextLine();
                System.out.print("Nhap gia: ");
                float gia=sc.nextFloat();  
                sc.nextLine();   
                
                Product sp=new Product(maso, ten, gia);
                fw.write(sp.getMaso()+";"+sp.getTen()+";"+sp.getGia()+"\n");
            }
            fw.close();
            System.out.println("\n Da ghi xong");
            
        }catch(Exception ex){
            System.out.println("Loi xay ra: "+ex.toString());
        }
    }
}
