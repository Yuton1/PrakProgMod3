# PrakProgMod3
ini praktikum
Kelas Segitiga
Kelas Segitiga digunakan untuk menghitung luas dan keliling dari sebuah segitiga. Kelas ini memiliki atribut berikut:

- alas: Menyimpan panjang alas dari segitiga.
- tinggi: Menyimpan tinggi dari segitiga.
- sisiA: Menyimpan panjang sisi A dari segitiga.
- sisiB: Menyimpan panjang sisi B dari segitiga.
- sisiC: Menyimpan panjang sisi C dari segitiga.
Metode
public Segitiga(double alas, double tinggi, double sisiA, double sisiB, double sisiC)

Konstruktor untuk membuat objek Segitiga dengan nilai-nilai alas, tinggi, dan panjang sisi yang diberikan.
public double hitungLuas()

Mengembalikan luas segitiga dengan rumus 0.5 * alas * tinggi.
public double hitungKeliling()

Mengembalikan keliling segitiga dengan menjumlahkan panjang semua sisinya (sisiA + sisiB + sisiC).
public void setAlas(double alas)

Metode untuk mengatur nilai alas segitiga.
public double getAlas()

Metode untuk mendapatkan nilai alas segitiga.
public void setTinggi(double tinggi)

Metode untuk mengatur nilai tinggi segitiga.
public double getTinggi()

Metode untuk mendapatkan nilai tinggi segitiga.
public static void main(String[] args)

Metode utama untuk menguji kelas Segitiga. Pada metode ini, sebuah objek segitiga dibuat dengan nilai alas, tinggi, dan panjang sisinya yang telah ditentukan, dan kemudian hasil perhitungan luas dan keliling segitiga dicetak.
