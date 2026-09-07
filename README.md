# **Sistem Manajemen Produksi Roti dan Kue**

## **Deskripsi Singkat Program**
Sistem Manajemen Produksi Roti dan Kue merupakan program berbasis bahasa pemrograman Java yang digunakan untuk mengelola data produksi roti dan kue secara sederhana. Program ini memungkinkan pengguna untuk menambahkan, menampilkan, mengubah, dan menghapus data produksi. Data yang dikelola meliputi ID produksi, ID produk, nama produk, jenis produk, harga produk, jumlah produksi, tanggal produksi, dan status produksi. Program menerapkan konsep dasar Pemrograman Berorientasi Objek (PBO), seperti class, object, constructor, encapsulation, getter dan setter, ArrayList, percabangan, perulangan, serta input menggunakan Scanner.


## **Class Yang Ada Dalam Progam**
1. Minpro1.java
Merupakan class utama (entry point) yang digunakan untuk menjalankan program. Class ini menampilkan menu utama, menerima input pilihan dari pengguna, dan memanggil fungsi yang sesuai.

3. Produk.java
Merupakan class entitas yang menyimpan informasi mengenai produk roti dan kue, seperti ID produk, nama produk, jenis produk, dan harga produk. Class ini juga menerapkan constructor, getter, setter, dan encapsulation.

5. Produksi.java
Merupakan class entitas yang menyimpan informasi kegiatan produksi, seperti ID produksi, produk yang dibuat, jumlah produksi, tanggal produksi, dan status produksi. Class ini juga menggunakan constructor, getter, dan setter.

7. manajemensistem.java
Merupakan class yang menangani proses CRUD. Class ini menggunakan ArrayList untuk menyimpan data produksi dan menyediakan fungsi untuk menambah, menampilkan, mengubah, serta menghapus data produksi.

## **Alur Perencanaan Program**
Alur program dimulai ketika program dijalankan melalui class Main/Minpro1.java. Program akan menampilkan menu utama yang berisi beberapa pilihan, yaitu Tambah Data Produksi, Tampilkan Data Produksi, Update Data Produksi, Hapus Data Produksi, dan Keluar.

Pengguna memilih menu dengan memasukkan angka sesuai pilihan. Program kemudian menggunakan percabangan switch untuk menentukan proses yang akan dijalankan berdasarkan pilihan pengguna.

Alur setiap menu:

1. Tambah Produksi

Pengguna memasukkan data produksi seperti ID produksi, ID produk, nama produk, jenis produk, harga, jumlah produksi, tanggal produksi, dan status produksi. Data tersebut kemudian digunakan untuk membuat object Produk dan object Produksi menggunakan constructor. Object produksi selanjutnya dimasukkan ke dalam ArrayList daftarProduksi menggunakan add().

2. Tampilkan Produksi

Program memeriksa apakah ArrayList memiliki data. Jika belum ada data, program menampilkan pesan bahwa data produksi belum tersedia. Jika terdapat data, program menggunakan perulangan for untuk mengambil setiap data dari ArrayList menggunakan get(i), kemudian menampilkan informasi produksi menggunakan getter seperti getIdProduksi(), getNamaProduk(), dan sebagainya.

3. Update Produksi

Pengguna memasukkan ID produksi yang ingin diubah. Program kemudian melakukan pencarian menggunakan perulangan. Jika ID ditemukan, pengguna dapat memasukkan data baru. Data tersebut kemudian diperbarui menggunakan setter, seperti setNamaProduk(), setHargaProduk(), setJumlahProduksi(), dan lainnya.

4. Hapus Produksi

Pengguna memasukkan ID produksi yang ingin dihapus. Program mencari ID tersebut di dalam ArrayList. Jika ditemukan, data dihapus menggunakan remove(i). Jika ID tidak ditemukan, program menampilkan pesan bahwa data produksi tidak ditemukan.

5. Keluar

Jika pengguna memilih menu keluar, nilai kondisi perulangan diubah sehingga perulangan utama berhenti dan program selesai.


## **Dokumentasi Alur Program**
