public class ArrayAritmatika {
    public static void main(String[] args) {
        // Array tipe data int dan double
        int[] bilanganInt = {10, 20, 30, 40, 50};
        double[] bilanganDouble = {1.5, 2.5, 3.5, 4.5, 5.5};

        // Array untuk menyimpan hasil perhitungan
        double[] hasil = new double[bilanganInt.length];

        // Perhitungan aritmatika menggunakan for
        for (int i = 0; i < bilanganInt.length; i++) {
            hasil[i] = bilanganInt[i] * bilanganDouble[i];
        }

        // Menampilkan hasil perhitungan
        System.out.println("Hasil Perkalian:");
        for (int i = 0; i < hasil.length; i++) {
            System.out.printf("Hasil[%d] = %d x %.1f = %.2f%n", i, bilanganInt[i], bilanganDouble[i], hasil[i]);
        }
    }
}
