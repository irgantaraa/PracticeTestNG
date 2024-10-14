# Proyek TestNG Practice

## Deskripsi
Proyek ini berisi contoh penggunaan TestNG dalam pengujian unit di Java. Terdapat lima soal yang masing-masing mencakup berbagai konsep dalam pengujian menggunakan TestNG, termasuk dasar-dasar, prioritas test case, DataProvider, pengecualian yang diharapkan, serta penggunaan anotasi `@BeforeClass` dan `@AfterClass`.

## Struktur Proyek
TestNGPractice │ ├── src │ └── main │ └── java │ └── com │ └── juaracoding │ ├── Soal1.java │ ├── Soal2.java │ ├── Soal3.java │ ├── Soal4.java │ └── Soal5.java │ └── src └── test └── java └── com └── juaracoding ├── Soal1Test.java ├── Soal2Test.java ├── Soal3Test.java ├── Soal4Test.java └── Soal5Test.java

## Soal dan Implementasi

### Soal 1: Dasar TestNG
- **Deskripsi**: Memeriksa nilai variabel `x`, string `str`, dan angka dalam array.
- **File**: `Soal1.java` dan `Soal1Test.java`
- **Test Case**:
  1. Memeriksa apakah nilai `x` sama dengan 10.
  2. Memeriksa apakah string `str` mengandung kata "TestNG".
  3. Memeriksa apakah angka dalam array `[2, 4, 6]` semuanya adalah bilangan genap.

### Soal 2: Prioritas Test Case
- **Deskripsi**: Mengatur urutan eksekusi test case.
- **File**: `Soal2.java` dan `Soal2Test.java`
- **Test Case**:
  1. Memverifikasi bahwa string `hello` tidak kosong.
  2. Memverifikasi bahwa nilai `x` lebih besar dari 0.
  3. Memverifikasi bahwa jumlah elemen dalam array `[1, 2, 3]` adalah 3.

### Soal 3: DataProvider di TestNG
- **Deskripsi**: Menguji fungsi `isEven()` menggunakan DataProvider.
- **File**: `Soal3.java` dan `Soal3Test.java`
- **Test Case**:
  - Menguji beberapa input untuk memverifikasi bahwa bilangan genap mengembalikan `true` dan bilangan ganjil mengembalikan `false`.

### Soal 4: TestNG dengan Expected Exceptions
- **Deskripsi**: Memverifikasi bahwa metode `divide(int a, int b)` melempar `ArithmeticException` ketika `b` adalah 0.
- **File**: `Soal4.java` dan `Soal4Test.java`
- **Test Case**:
  - Menguji pembagian dengan nol dan pembagian normal.

### Soal 5: Menggunakan BeforeClass dan AfterClass
- **Deskripsi**: Menambahkan anotasi `@BeforeClass` dan `@AfterClass` untuk menandai awal dan akhir pengujian.
- **File**: `Soal5.java` dan `Soal5Test.java`
- **Test Case**:
  1. Memeriksa apakah nilai string `nama` adalah "TestNG".
  2. Memeriksa apakah array `[1, 2, 3, 4]` memiliki panjang 4.
  3. Memeriksa apakah nilai variabel `nilai` lebih dari 50.

## Cara Menjalankan
1. Pastikan Anda telah menginstal Java dan TestNG.
2. Clone repositori ini.
3. Buka proyek di IDE yang mendukung TestNG (seperti IntelliJ IDEA atau Eclipse).
4. Jalankan semua test case menggunakan TestNG.

## Penjelasan Anotasi TestNG
- `@Test`: Digunakan untuk mendefinisikan metode pengujian.
- `@BeforeClass`: Metode yang dijalankan sebelum kelas pengujian dieksekusi.
- `@AfterClass`: Metode yang dijalankan setelah kelas pengujian dieksekusi.
- `@DataProvider`: Mengizinkan penggunaan data eksternal dalam test case.
- `expectedExceptions`: Digunakan untuk memverifikasi bahwa metode melempar pengecualian yang diharapkan.

## Lisensi
Proyek ini tidak memiliki lisensi khusus, dan bebas untuk digunakan dan dimodifikasi.

