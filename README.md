# PenghasilanKaryawan

Program Java berbasis konsol untuk menghitung penghasilan karyawan berdasarkan golongan (A/B/C) dan jam lembur.

---

## Persyaratan

| Kebutuhan | Keterangan |
| --- | --- |
| JDK (Java Development Kit) | Versi 8 atau lebih baru |
| Terminal / Command Prompt | Untuk mengompilasi dan menjalankan program |
| Editor teks atau IDE (opsional) | Notepad++, VS Code, IntelliJ IDEA, Eclipse, atau NetBeans |
| Sistem operasi | Windows, macOS, atau Linux |

Catatan: yang dibutuhkan adalah **JDK**, bukan hanya JRE, karena perintah `javac` untuk kompilasi hanya tersedia di JDK.

---

## Cara Instalasi

### 1. Instal JDK

#### Windows

1. Unduh JDK dari situs resmi, misalnya [Oracle](https://www.oracle.com/java/technologies/downloads/) atau [Adoptium Temurin](https://adoptium.net/).
2. Jalankan installer, lalu ikuti petunjuk hingga selesai.
3. Pastikan opsi pengaturan `PATH` atau `JAVA_HOME` aktif jika tersedia pada installer. Jika tidak, tambahkan folder `bin` JDK ke variabel lingkungan `Path` secara manual.

#### macOS

1. Unduh installer `.pkg` dari situs resmi di atas, lalu jalankan.
2. Atau gunakan Homebrew:

   ```bash
   brew install openjdk
   ```

#### Linux (Debian/Ubuntu)

```bash
sudo apt update
sudo apt install default-jdk
```

### 2. Verifikasi Instalasi

Buka terminal atau Command Prompt, lalu jalankan:

```bash
java -version
javac -version
```

Jika keduanya menampilkan nomor versi, instalasi berhasil. Jika muncul pesan "command not found" atau "is not recognized", periksa kembali pengaturan `PATH`.

### 3. Siapkan File Program

Simpan kode program dengan nama **`PenghasilanKaryawan.java`** (nama file harus sama persis dengan nama kelas, termasuk huruf besar dan kecil) pada satu folder, misalnya `C:\Java\` atau `~/java/`.

---

## Cara Mengompilasi Program

1. Buka terminal atau Command Prompt.
2. Pindah ke folder tempat file disimpan:

   ```bash
   cd path/ke/folder
   ```

3. Kompilasi dengan perintah:

   ```bash
   javac PenghasilanKaryawan.java
   ```

4. Jika berhasil, tidak ada pesan kesalahan dan file `PenghasilanKaryawan.class` muncul di folder yang sama.

---

## Cara Menjalankan Program

Setelah kompilasi berhasil, jalankan dengan perintah (tanpa ekstensi `.class`):

```bash
java PenghasilanKaryawan
```

Program akan meminta dua input:

```text
Masukkan Golongan (A/B/C): B
Masukkan Jam Lembur: 3
```

Lalu menampilkan slip gaji:

```text
========== SLIP GAJI ==========
Golongan      : B
Gaji Pokok    : Rp. 6.500.000
Jam Lembur    : 3 jam
Persen Lembur : 34%
Gaji Lembur   : Rp. 2.210.000
Total Gaji    : Rp. 8.710.000
================================
```

### Menjalankan Melalui IDE (opsional)

1. Buat proyek Java baru, lalu tambahkan file `PenghasilanKaryawan.java`.
2. Klik tombol **Run** pada IDE.
3. Masukkan input golongan dan jam lembur pada jendela konsol IDE.

---

## Pemecahan Masalah Singkat

| Masalah | Penyebab dan Solusi |
| --- | --- |
| `'javac' is not recognized` / `command not found` | JDK belum terpasang atau `PATH` belum diatur. Instal JDK dan periksa `PATH`. |
| `class PenghasilanKaryawan is public, should be declared in a file named...` | Nama file tidak sama dengan nama kelas. Ganti nama file menjadi `PenghasilanKaryawan.java`. |
| `Could not find or load main class PenghasilanKaryawan` | Perintah dijalankan di folder yang salah, atau memakai ekstensi (`.class`/`.java`). Gunakan `java PenghasilanKaryawan` di folder yang berisi file `.class`. |
