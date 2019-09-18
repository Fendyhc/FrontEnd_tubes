package com.example.frontend_tubes.DAO;

public class transaksiDAO {
    String id,id_user,id_event,status,nama_user,npm_user,no_telp,no_rek,nama_rek,bank_rek,nama,kategori,penyelenggara,tempat,waktu,deskripsi,harga;


    public transaksiDAO(String id, String id_event, String status, String no_rek, String nama_rek, String bank_rek, String nama, String kategori, String penyelenggara, String tempat, String waktu, String deskripsi, String harga) {
        this.id = id;
        this.id_event = id_event;
        this.status = status;
        this.no_rek = no_rek;
        this.nama_rek = nama_rek;
        this.bank_rek = bank_rek;
        this.nama = nama;
        this.kategori = kategori;
        this.penyelenggara = penyelenggara;
        this.tempat = tempat;
        this.waktu = waktu;
        this.deskripsi = deskripsi;
        this.harga = harga;
    }

    public transaksiDAO(String id, String id_user, String nama_user, String npm_user, String no_telp, String no_rek, String nama_rek) {
        this.id = id;
        this.id_user = id_user;
        this.nama_user = nama_user;
        this.npm_user = npm_user;
        this.no_telp = no_telp;
        this.no_rek = no_rek;
        this.nama_rek = nama_rek;
    }

    public String getBank_rek() {
        return bank_rek;
    }

    public void setBank_rek(String bank_rek) {
        this.bank_rek = bank_rek;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getId_event() {
        return id_event;
    }

    public void setId_event(String id_event) {
        this.id_event = id_event;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNama_user() {
        return nama_user;
    }

    public void setNama_user(String nama_user) {
        this.nama_user = nama_user;
    }

    public String getNpm_user() {
        return npm_user;
    }

    public void setNpm_user(String npm_user) {
        this.npm_user = npm_user;
    }

    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
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

    public String getTempat() {
        return tempat;
    }

    public void setTempat(String tempat) {
        this.tempat = tempat;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }
}
