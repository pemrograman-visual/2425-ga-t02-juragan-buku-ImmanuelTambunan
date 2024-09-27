// 12S24021 - Ika Manurung
// 12S24034 - Immanuel Tambunan
import java.util.*;
import java.lang.Math;

public class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judul, penulis, penerbit, formatBukuElektronik, kategori;
        double tahunTerbit, stok, hargaPembelian, rating, minimumMargin;

        iSBN = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        tahunTerbit = input.nextDouble();
        penerbit = input.nextLine();
        formatBukuElektronik = input.nextLine();
        hargaPembelian = input.nextDouble();
        minimumMargin = input.nextDouble();
        stok = input.nextDouble();
        rating = input.nextDouble();
        kategori = input.nextLine();
        if (rating >= 4.7 && rating <= 5) {
            kategori = "Best Pick";
        } else {
            if (rating >= 4.5 && rating <= 5) {
                kategori = "Must Read";
            } else {
                if (rating >= 4.0 && rating <= 5) {
                    kategori = "Recommanded";
                } else {
                    if (rating >= 3.0 && rating <= 5) {
                        kategori = "Average";
                    } else {
                        if (rating <= 3.0 && rating <= 5) {
                            kategori = "Low";
                        } else {
                            kategori = "Error";
                        }
                    }
                }
            }
        }
        System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahunTerbit + "|" + penerbit + "|" + formatBukuElektronik + "|" + hargaPembelian + "|" + minimumMargin + "|" + stok + "|" + rating + "|" + kategori);
    }
}
