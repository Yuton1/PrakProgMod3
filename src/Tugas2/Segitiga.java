package Tugas2;

/**
 * Kelas Segitiga digunakan untuk menghitung luas dan keliling segitiga.
 */
public class Segitiga {
    private double alas;
    private double tinggi;
    private double sisiA;
    private double sisiB;
    private double sisiC;

    /**
     * Konstruktor untuk membuat objek Segitiga dengan panjang alas dan tinggi tertentu.
     *
     * @param alas   Panjang alas segitiga.
     * @param tinggi Tinggi segitiga.
     * @param sisiA  Panjang sisi A segitiga.
     * @param sisiB  Panjang sisi B segitiga.
     * @param sisiC  Panjang sisi C segitiga.
     */
    public Segitiga(double alas, double tinggi, double sisiA, double sisiB, double sisiC) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }

    /**
     * Metode untuk menghitung luas segitiga.
     *
     * @return Luas segitiga.
     */
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    /**
     * Metode untuk menghitung keliling segitiga.
     *
     * @return Keliling segitiga.
     */
    public double hitungKeliling() {
        return sisiA + sisiB + sisiC;
    }

    /**
     * Metode untuk mengatur nilai alas segitiga.
     *
     * @param alas Panjang alas segitiga.
     */
    public void setAlas(double alas) {
        this.alas = alas;
    }

    /**
     * Metode untuk mendapatkan nilai alas segitiga.
     *
     * @return Panjang alas segitiga.
     */
    public double getAlas() {
        return alas;
    }

    /**
     * Metode untuk mengatur nilai tinggi segitiga.
     *
     * @param tinggi Tinggi segitiga.
     */
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    /**
     * Metode untuk mendapatkan nilai tinggi segitiga.
     *
     * @return Tinggi segitiga.
     */
    public double getTinggi() {
        return tinggi;

    }
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga(5.0, 7.0, 4.0, 3.0, 6.0);

        System.out.println("Luas segitiga: " + segitiga.hitungLuas());
        System.out.println("Keliling segitiga: " + segitiga.hitungKeliling());
    }
}
