/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan3;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Hieu Pham
 */
public class PwdEncrytion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nhaSh;
        BigInteger[] cipherText = null;
        BigInteger n, d = null;
        String pwd = "";
        System.out.println("Enter text to be encryted");
        pwd = in.nextLine();
        System.out.println("Password (Input): " + pwd);
        RSA rsa = new RSA(8);
        n = rsa.getN();
        d = rsa.getD();
        cipherText = rsa.encrpyt(pwd);
        StringBuffer bf = new StringBuffer();
        for (int i = 0; i < cipherText.length; i++) {
            bf.append(cipherText[i].toString(16).toUpperCase());
            if (i != cipherText.length - 1) {
                System.out.print(" ");
            }
        }
        String message = bf.toString();
        System.out.println();
        System.out.println("Encrpyted message: " + message);
        String dhash = rsa.decrpyt(cipherText, d, n);
        System.out.println("");
        System.out.println("Decrypted message: " + dhash);
    }
}
