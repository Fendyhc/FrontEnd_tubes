package com.example.frontend_tubes.DAO;

public class userTicketDAO {
    String nama_event,kategori,penyelenggara,tempat,waktu,nama_user,npm,telp,email;

    public userTicketDAO(String nama_event, String kategori, String penyelenggara, String tempat, String waktu) {
        this.nama_event = nama_event;
        this.kategori = kategori;
        this.penyelenggara = penyelenggara;
        this.tempat = tempat;
        this.waktu = waktu;
    }

    public userTicketDAO(String nama_user, String npm, String telp, String email) {
        this.nama_user = nama_user;
        this.npm = npm;
        this.telp = telp;
        this.email = email;
    }
}