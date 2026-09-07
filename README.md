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

### **1. Tampilan Menu Utama**

<img width="341" height="205" alt="image" src="https://github.com/user-attachments/assets/19468a4b-ac3e-413d-87d6-3b82477c63ba" />

Ini adalah tampilan awal atau menu utama dari program saat program barusan saja di jalankan dan dapat di lihat menu utama nya itu ada 5 pilihan yang emang di khsususkan untuk sistem CRUD buat program ini.

### **2. Tambah Data Produksi**

<img width="357" height="374" alt="image" src="https://github.com/user-attachments/assets/a30aba89-7f9d-451d-afb5-151b579d78cc" />

Pada menu 1 yaitu Tambah Data Produksi. Program kemudian meminta pengguna memasukkan beberapa informasi produksi, yaitu ID Produksi 5, ID Produk 6, Nama Produk Pancake, Jenis Produk Kue, Harga Produk 10000, Jumlah Produksi 75, Tanggal Produksi 17-08-2026, dan Status Produksi Berhasil. Setelah seluruh data dimasukkan, program membuat objek Produk dan Produksi, kemudian menyimpan objek produksi tersebut ke dalam ArrayList menggunakan add(). Pesan ("Data produksi berhasil ditambahkan!") menunjukkan bahwa proses penambahan data telah berhasil dilakukan.


### **3. Tampilkan Data Produksi**

<img width="333" height="399" alt="image" src="https://github.com/user-attachments/assets/20ce4611-5521-404f-b0cf-40668936c311" />

Pada menu 2 yaitu Tampilkan Data Produksi. Program mengambil data produksi yang sebelumnya telah disimpan di dalam ArrayList dan menampilkannya satu per satu. Data yang ditampilkan meliputi ID Produksi, ID Produk, Nama Produk, Jenis Produk, Harga Produk, Jumlah Produksi, Tanggal Produksi, dan Status Produksi. Proses ini menggunakan perulangan for, ArrayList.get(i), serta getter untuk mengambil data dari objek.


### **4. Update Data Produksi**

<img width="345" height="373" alt="image" src="https://github.com/user-attachments/assets/f8b7e79c-dfa5-4658-a009-6620e722d374" />

Pada menu 3 yaitu Update Data Produksi. Program meminta ID Produksi yang ingin diperbarui, yaitu ID 7. Setelah ID ditemukan, program meminta pengguna memasukkan data baru berupa Nama Produk Roti Canai, Jenis Produk Gandum, Harga Produk 8000, Jumlah Produksi 85, Tanggal Produksi 25-09-2026, dan Status Produksi Berhasil. Data tersebut kemudian diperbarui menggunakan setter, seperti setNamaProduk(), setJenisProduk(), setHargaProduk(), setJumlahProduksi(), setTanggalProduksi(), dan setStatusProduksi(). Pesan ("Data produksi berhasil diperbarui!") menunjukkan bahwa proses update berhasil dilakukan.


### **5. Hapus Data Produksi**

<img width="351" height="258" alt="image" src="https://github.com/user-attachments/assets/4233f9dc-c79e-46f2-b991-655ff9d72c70" />

Pada menu 4 yaitu Hapus Data Produksi. Program kemudian meminta pengguna memasukkan ID Produksi yang ingin dihapus, dan pengguna memasukkan ID 7. Setelah itu, program melakukan pencarian ID menggunakan perulangan for untuk memeriksa setiap data yang terdapat di dalam ArrayList. Program menggunakan getter getIdProduksi() untuk membandingkan ID yang dimasukkan dengan ID yang tersimpan. Setelah ID ditemukan, program menggunakan method remove(i) untuk menghapus data produksi dari ArrayList. Setelah proses penghapusan berhasil, program menampilkan pesan “Data produksi berhasil dihapus!”, yang menunjukkan bahwa data produksi dengan ID 7 telah berhasil dihapus dari daftar produksi.


### **6. Keluar Progam**

<img width="611" height="344" alt="image" src="https://github.com/user-attachments/assets/be1cecdb-13ae-4595-8d4a-8c6663d96454" />

Pada Menu 5 yaitu Keluar dari program atau sistem manajemen produksi roti dan kue ini yang berarti program selesai dan tidak akan mengulang kembali lagi ke pilihan utama.
