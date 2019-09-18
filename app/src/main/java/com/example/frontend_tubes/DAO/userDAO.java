package com.example.frontend_tubes.DAO;

public class userDAO {
    String id, nama, npm, fakultas, prodi, email,telp,username,password;

    public userDAO(String id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public userDAO(String id, String nama, String npm, String fakultas, String prodi, String email, String telp, String username, String password) {
        this.id = id;
        this.nama = nama;
        this.npm = npm;
        this.fakultas = fakultas;
        this.prodi = prodi;
        this.email = email;
        this.telp = telp;
        this.username = username;
        this.password = password;
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

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
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
}
