/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116058.latihan37.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author xider
 * 
 */
public class Mahasiswa {

    public int nilaiMhs;
    public double totalNilaiMhs;
    Scanner scan = new Scanner(System.in);

    public double HitungTotal(int parNilaiMhs, int parN) {
        for (int i = 1; i <= parN; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            parNilaiMhs = scan.nextInt();
            totalNilaiMhs += parNilaiMhs;
        }
        return totalNilaiMhs;
    }

    public double HitungRataRataNilaiMhs(double total, int jmlMhs) {
        return total / jmlMhs;

    }
}