package cn.itcast;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @program: freemarker
 * @description: TODO
 * @author: Mr.Yan
 * @create: 2019-02-23 21:00
 **/
public class A {

    public static void A(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n * 2 - 1; j++) {
                if (j == i || j == n * 2 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


       for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= n * 2 - 1; j++) {
                if (j == i || j == n * 2 - i) {
                    System.out.print("*");
                }else {
                System.out.print(" ");}
            }
           System.out.println();
        }

    }


    public static void main(String[] args) {
        A(2);
    }
}



