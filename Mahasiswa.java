import java.util.HashMap;
import java.util.Scanner;

public class Mahasiswa {
    String nama, kelas, matkulPraktikum;
    int nim;

    public Mahasiswa(String nm, String kl, String mat, int ni) {
        nama = nm;
        kelas = kl;
        matkulPraktikum = mat;
        nim = ni;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Mahasiswa> mhs = new HashMap<>();
        String input;
        Mahasiswa data;

        mhs.put("2", new Mahasiswa("Putri", "4H", "Struktur Data", 1995));
        mhs.put("4", new Mahasiswa("Agus", "4A", "Struktur Data", 201383));
        mhs.put("5", new Mahasiswa("Putra", "4D", "Struktur Data", 64775));
        mhs.put("7", new Mahasiswa ("Raihan", "9D", "Struktur Data", 476351 ));
        mhs.put("7d", new Mahasiswa ("Raka", "10A", "Struktur Data", 8873));

        System.out.println("Masukkan ID: ");
        input = in.nextLine();
        data = mhs.get(input);
        if (data != null) {
            System.out.println("Data Mahasiswa : " + data.nama + ", kelas : " + data.kelas + ", mata kuliah praktikum : " + data.matkulPraktikum + ", nim : " + data.nim);
        }
    }
}