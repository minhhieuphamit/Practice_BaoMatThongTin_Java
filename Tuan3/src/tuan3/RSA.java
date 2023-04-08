/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan3;

import java.math.BigInteger;
import java.util.Random;
import java.io.*;

/**
 *
 * @author Hieu Pham
 */
public class RSA {

    int primeSize;
    BigInteger p, q, N, r, E, D;

    public BigInteger getP() {
        return p;
    }

    public BigInteger getQ() {
        return q;
    }

    public BigInteger getN() {
        return N;
    }

    public BigInteger getR() {
        return r;
    }

    public BigInteger getE() {
        return E;
    }

    public BigInteger getD() {
        return D;
    }

    public RSA() {
    }

    public RSA(int primeSize) {
        this.primeSize = primeSize;
        generatePrimeNumbers();
        generatePublicPrivateKey();
    }

    public void generatePrimeNumbers() {
        p = BigInteger.probablePrime(primeSize / 2, new Random());
        do {
            q = BigInteger.probablePrime(primeSize / 2, new Random());
        } while (q.compareTo(p) == 0);
    }

    public void generatePublicPrivateKey() {
        N = p.multiply(q);
        r = p.subtract(BigInteger.valueOf(1));
        r = r.multiply(q.subtract(BigInteger.valueOf(1)));

        do {
            E = new BigInteger(2 * primeSize, new Random());
        } while ((E.compareTo(r) != -1) || (E.gcd(r).compareTo(BigInteger.valueOf(1)) != 0));
        D = E.modInverse(r);
    }

    public BigInteger[] encrpyt(String message) {
        int i;
        byte[] temp = new byte[1];
        byte[] digits = message.getBytes();
        BigInteger[] bigdigits = new BigInteger[digits.length];
        for (i = 0; i < bigdigits.length; i++) {
            temp[0] = digits[i];
            bigdigits[i] = new BigInteger(temp);
        }

        BigInteger[] encrypted = new BigInteger[bigdigits.length];
        for (i = 0; i < bigdigits.length; i++) {
            encrypted[i] = bigdigits[i].modPow(E, N);
        }
        return encrypted;
    }

    public BigInteger[] encrpyt(String message, BigInteger userD, BigInteger userN) {
        int i;
        byte[] temp = new byte[1];
        byte[] digits = message.getBytes();
        BigInteger[] bigdigits = new BigInteger[digits.length];
        for (i = 0; i < bigdigits.length; i++) {
            temp[0] = digits[i];
            bigdigits[i] = new BigInteger(temp);
        }

        BigInteger[] encrypted = new BigInteger[bigdigits.length];
        for (i = 0; i < bigdigits.length; i++) {
            encrypted[i] = bigdigits[i].modPow(userD, userN);
        }
        return encrypted;
    }

    public String decrpyt(BigInteger[] encrypted, BigInteger D, BigInteger N) {
        int i;
        BigInteger[] decrpyted = new BigInteger[encrypted.length];
        for (i = 0; i < decrpyted.length; i++) {
            decrpyted[i] = encrypted[i].modPow(D, N);
        }
        char[] charArray = new char[decrpyted.length];
        for (i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (decrpyted[i].intValue());
        }
        return (new String(charArray));
    }

    public static void main(String[] args) throws IOException {
        int primeSize = 8;
        RSA rsa = new RSA(primeSize);
        System.out.println("Key size: [" + primeSize + "]");
        System.out.println("");

        System.out.println("Generated prime numbers p and q");
        System.out.println("p: [" + rsa.getP().toString(16).toUpperCase() + "]");
        System.out.println("q: [" + rsa.getQ().toString(16).toUpperCase() + "]");
        System.out.println("");

        System.out.println("The pulbic key is the pair (N, E) which will be published.");
        System.out.println("N: [" + rsa.getN().toString(16).toUpperCase() + "]");
        System.out.println("E: [" + rsa.getE().toString(16).toUpperCase() + "]");
        System.out.println("");

        System.out.println("The pulbic key is the pair (N, D) which will be published.");
        System.out.println("N: [" + rsa.getN().toString(16).toUpperCase() + "]");
        System.out.println("D: [" + rsa.getE().toString(16).toUpperCase() + "]");
        System.out.println("");

        System.out.println("Please enter message (plaintext): ");
        String plainText = (new BufferedReader(new InputStreamReader(System.in)).readLine());
        System.out.println("");

        BigInteger[] cipherText = rsa.encrpyt(plainText);
        System.out.print("Ciphertext: [");
        for (int i = 0; i < cipherText.length; i++) {
            System.out.print(cipherText[i].toString(16).toUpperCase());
            if (i != cipherText.length - 1) {
                System.out.print("");
            }
        }
        System.out.println("]");
        System.out.println("");

        RSA rsa1 = new RSA(8);
        String recoverPlainText = rsa1.decrpyt(cipherText, rsa.getD(), rsa.getN());
        System.out.println("Recovered plaintext: [" + recoverPlainText + "]");
    }
}
