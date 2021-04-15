package Minggu6;

import java.util.Scanner;
import java.util.Stack;

public class Minumanku {
    Stack<String> daftarMinuman;
    Minumanku(){
        daftarMinuman = new Stack<String>();
    }
    public String tambahMinuman() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama minuman (isikan 'selesai' jika sudah) : ");
        String namaMinuman = scanner.nextLine();
        if(namaMinuman.equals("selesai")) {
            return namaMinuman;
        }
        this.daftarMinuman.push(namaMinuman);
        return  namaMinuman;
    }
    public void hapusMinuman() {
        String minumanYangDibuang = this.daftarMinuman.pop();
        System.out.println(minumanYangDibuang + " telah dihapus dari daftar minuman. (pop)");
        System.out.println();
    }
    public void minumanPalingBaru() {
        String minumanBaru = this.daftarMinuman.peek();
        System.out.println(minumanBaru + " adalah minuman yang paling baru di input. (peek)");
    }
    public void cariMinuman(String namaMinuman) {
        Integer pos = (Integer) daftarMinuman.search(namaMinuman);
        if(pos == -1) {
            System.out.println(namaMinuman + " tidak ditemukan. (search)");
            System.out.println();
            return;
        }
        System.out.println(namaMinuman + " ditemukan. (search)");
        System.out.println();
    }
    public boolean cekMinuman() {
        if(this.daftarMinuman.empty()) {
            System.out.println("List minuman kosong. (empty)");
            return false;
        }
        System.out.println();
        System.out.println("Total ada " + this.daftarMinuman.size() + " minuman. (empty)");
        return true;
    }
}