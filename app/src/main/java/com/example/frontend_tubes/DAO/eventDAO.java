package com.example.frontend_tubes.DAO;

public class eventDAO{
    String id,nama,kategori,penyelenggara,temapt,waktu,deskrpsi,harga,no_rek,nama_rek,bank_rek,username,password,email;

    public eventDAO(String username, String password, String id) {
        this.username = username;
        this.password = password;
        this.id = id;
    }

    public eventDAO(String id, String nama, String kategori, String penyelenggara, String temapt, String waktu, String deskrpsi, String harga, String no_rek, String nama_rek, String bank_rek) {
        this.id = id;
        this.nama = nama;
        this.kategori = kategori;
        this.penyelenggara = penyelenggara;
        this.temapt = temapt;
        this.waktu = waktu;
        this.deskrpsi = deskrpsi;
        this.harga = harga;
        this.no_rek = no_rek;
        this.nama_rek = nama_rek;
        this.bank_rek = bank_rek;
    }

    public eventDAO(String id, String nama, String kategori, String penyelenggara, String temapt, String waktu, String deskrpsi, String harga, String no_rek, String nama_rek, String bank_rek, String username, String password, String email) {
        this.id = id;
        this.nama = nama;
        this.kategori = kategori;
        this.penyelenggara = penyelenggara;
        this.temapt = temapt;
        this.waktu = waktu;
        this.deskrpsi = deskrpsi;
        this.harga = harga;
        this.no_rek = no_rek;
        this.nama_rek = nama_rek;
        this.bank_rek = bank_rek;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public eventDAO(String id, String nama, String kategori, String penyelenggara, String temapt, String waktu, String deskrpsi, String harga, String no_rek, String nama_rek, String bank_rek, String email) {
        this.id = id;
        this.nama = nama;
        this.kategori = kategori;
        this.penyelenggara = penyelenggara;
        this.temapt = temapt;
        this.waktu = waktu;
        this.deskrpsi = deskrpsi;
        this.harga = harga;
        this.no_rek = no_rek;
        this.nama_rek = nama_rek;
        this.bank_rek = bank_rek;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getPenyelenggara() {
        return penyelenggara;
    }

    public void setPenyelenggara(String penyelenggara) {
        this.penyelenggara = penyelenggara;
    }

    public String getTemapt() {
        return temapt;
    }

    public void setTemapt(String temapt) {
        this.temapt = temapt;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public String getDeskrpsi() {
        return deskrpsi;
    }

    public void setDeskrpsi(String deskrpsi) {
        this.deskrpsi = deskrpsi;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getNo_rek() {
        return no_rek;
    }

    public void setNo_rek(String no_rek) {
        this.no_rek = no_rek;
    }

    public String getNama_rek() {
        return nama_rek;
    }

    public void setNama_rek(String nama_rek) {
        this.nama_rek = nama_rek;
    }

    public String getBank_rek() {
        return bank_rek;
    }

    public void setBank_rek(String bank_rek) {
        this.bank_rek = bank_rek;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}