package com.example.frontend_tubes.DAO;

public class detilTransaksiDAO {
    String id_transaksi,no_rek,nama_rek,nama_event,harga_ticekt,no_rek_event,bank_rek_event,nama_rek_event,no_rek_user,nama_rek_user,status;

    public detilTransaksiDAO(String id_transaksi, String no_rek, String nama_rek, String nama_event, String harga_ticekt, String no_rek_event, String bank_rek_event, String nama_rek_event, String no_rek_user, String nama_rek_user, String status) {
        this.id_transaksi = id_transaksi;
        this.no_rek = no_rek;
        this.nama_rek = nama_rek;
        this.nama_event = nama_event;
        this.harga_ticekt = harga_ticekt;
        this.no_rek_event = no_rek_event;
        this.bank_rek_event = bank_rek_event;
        this.nama_rek_event = nama_rek_event;
        this.no_rek_user = no_rek_user;
        this.nama_rek_user = nama_rek_user;
        this.status = status;
    }

    public String getId_transaksi() {
        return id_transaksi;
    }

    public void setId_transaksi(String id_transaksi) {
        this.id_transaksi = id_transaksi;
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

    public String getNama_event() {
        return nama_event;
    }

    public void setNama_event(String nama_event) {
        this.nama_event = nama_event;
    }

    public String getHarga_ticekt() {
        return harga_ticekt;
    }

    public void setHarga_ticekt(String harga_ticekt) {
        this.harga_ticekt = harga_ticekt;
    }

    public String getNo_rek_event() {
        return no_rek_event;
    }

    public void setNo_rek_event(String no_rek_event) {
        this.no_rek_event = no_rek_event;
    }

    public String getBank_rek_event() {
        return bank_rek_event;
    }

    public void setBank_rek_event(String bank_rek_event) {
        this.bank_rek_event = bank_rek_event;
    }

    public String getNama_rek_event() {
        return nama_rek_event;
    }

    public void setNama_rek_event(String nama_rek_event) {
        this.nama_rek_event = nama_rek_event;
    }

    public String getNo_rek_user() {
        return no_rek_user;
    }

    public void setNo_rek_user(String no_rek_user) {
        this.no_rek_user = no_rek_user;
    }

    public String getNama_rek_user() {
        return nama_rek_user;
    }

    public void setNama_rek_user(String nama_rek_user) {
        this.nama_rek_user = nama_rek_user;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}