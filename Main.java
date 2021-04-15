package Minggu6;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Minumanku minumanku = new Minumanku();
        while (true) {
            String namaMinuman = minumanku.tambahMinuman();
            if(namaMinuman.equals("selesai")) {
                break;
            }
        }
        if(!minumanku.cekMinuman()){
            return;
        }
        minumanku.minumanPalingBaru();
        minumanku.hapusMinuman();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Cari nama minuman (isikan 'selesai' jika sudah) : ");
            String namaMinuman = scanner.nextLine();
            if(namaMinuman.equals("selesai")) {
                break;
            }
            minumanku.cariMinuman(namaMinuman);
        }
    }
}