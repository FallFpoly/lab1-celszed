/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai2 {

    public static void main(String[] args) {
          // sinh viên code ở đây
          Scanner sc=new Scanner(System.in);
        int dai,rong,Chuvi,Dientich;
        System.out.print("Nhap chieu dai: ");
        dai=sc.nextInt();
        System.out.print("Nhap chieu rong: ");
        rong=sc.nextInt();
        Chuvi=(dai+rong)*2;
        System.out.println("Chu vi hinh chu nhat= "+Chuvi);
        Dientich=dai*rong;
        System.err.println("Dien tich hinh chu nhat= "+Dientich);
        System.err.println("Canh nho nhat= "+Math.min(dai, rong));
    }
}
