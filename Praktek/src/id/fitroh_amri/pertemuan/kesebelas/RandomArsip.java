/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.fitroh_amri.pertemuan.kesebelas;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author FITROH_08
 */
public class RandomArsip {
    
    public void setTulis(String file, int position, String record) {
        try {
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            //move file pointer to position
            raf.seek(position);
            //writing string to RandomAccessFile
            raf.writeUTF(record);
            raf.close();
        } catch (IOException e) {
            System.err.println("Error : " + e.getMessage());
        }
    }
    public String getBaca(String file, int position) {
        String record = " ";
        try {
            RandomAccessFile raf = new RandomAccessFile(file, "r");
            //move file pointer to position specified
            raf.seek(position);
            //writing string to RandomAccessFile
            record = raf.readUTF();
            raf.close();
        } catch (IOException e) {
            System.err.println("Error : " + e.getMessage());
        }
        return record;
    }
    public static void main(String[] args) {
        String berkas = "D:\\Gitlab\\coba.txt";
        String data  = "NIM  : 123 | Nama : Budi";
        
        RandomArsip ra = new RandomArsip();
        ra.setTulis(berkas, 1, data);
        System.out.println("Tulis Berhasil");
        
        String output = ra.getBaca(berkas, 1);
        System.out.println("Baca berhasil : "+ output);
        
    }
}
