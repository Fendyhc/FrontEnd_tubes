package com.example.frontend_tubes.Api;

import com.example.frontend_tubes.DAO.detilTransaksiDAO;
import com.example.frontend_tubes.DAO.eventDAO;
import com.example.frontend_tubes.DAO.transaksiDAO;
import com.example.frontend_tubes.DAO.userDAO;
import com.example.frontend_tubes.DAO.userTicketDAO;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ApiInterface {


    //USER-api
    @FormUrlEncoded
    Call<String> createUser(@Field("nama") String nama,
                            @Field("npm") String npm,
                            @Field("fakultas") String fakultas,
                            @Field("prodi") String prodi,
                            @Field("telp") String telp,
                            @Field("username") String username,
                            @Field("password") String password);
    @FormUrlEncoded
    Call<String> deleteUser(@Field("id") String id);

    @FormUrlEncoded
    Call<String> editUser(@Field("nama") String nama,
                          @Field("npm") String npm,
                          @Field("fakultas") String fakultas,
                          @Field("prodi") String prodi,
                          @Field("telp") String telp,
                          @Field("username") String username,
                          @Field("password") String password,
                          @Field("id") String id);

    Call<userDAO> loginUser(@Path("username") String username);

    Call<List<userDAO>> viewAllUser();

    //Event
    @FormUrlEncoded
    Call<String> createEvent(@Field("nama") String nama,
                             @Field("kategori") String kategeori,
                             @Field("penyelenggara") String penyelenggara,
                             @Field("tempat") String tempat,
                             @Field("waktu") String waktu,
                             @Field("deskripsi") String deskripsi,
                             @Field("harga") String harga,
                             @Field("no_rek") String no_rek,
                             @Field("nama_rek") String nama_rek,
                             @Field("bank_Rek") String bank_rek,
                             @Field("username") String username,
                             @Field("password") String password,
                             @Field("email") String email);
    @FormUrlEncoded
    Call<String> editEvent(@Field("nama") String nama,
                           @Field("kategori") String kategeori,
                           @Field("penyelenggara") String penyelenggara,
                           @Field("tempat") String tempat,
                           @Field("waktu") String waktu,
                           @Field("deskripsi") String deskripsi,
                           @Field("harga") String harga,
                           @Field("no_rek") String no_rek,
                           @Field("nama_rek") String nama_rek,
                           @Field("bank_Rek") String bank_rek,
                           @Field("username") String username,
                           @Field("password") String password,
                           @Field("email") String email,
                           @Field("id") String id);

    Call<String> deleteEvent(@Field("id") String id);

    Call<eventDAO> loginEvent(@Path("username") String username);

    Call<List<eventDAO>> searchById(@Path("id") String id);

    Call<List<eventDAO>> searchByKategori(@Path("kategori") String kategori);

    Call<List<eventDAO>> searchByNama(@Path("nama") String nama);

    Call<List<eventDAO>> searchByPenyelenggara(@Path("penyelenggara") String penyelenggara);

    Call<List<eventDAO>> viewAllEvent();

    //TRANSAKSI
    @FormUrlEncoded
    Call<String> createTransaksi(@Field("id_user") String id_event,
                                 @Field("id_event") String id_user,
                                 @Field("status") String status);

    Call<String> confirmTransaksi(@Path("id") String id);

    Call<List<transaksiDAO>> searchByEvent(@Path("id") String id);

    Call<List<transaksiDAO>> searchByUser(@Path("id") String id);

    //detilTransaksi
    @FormUrlEncoded
    Call<String> createDetilTransaksi(@Field("id_transaksi") String id_transaksi,
                                      @Field("no_rek") String no_rek,
                                      @Field("nama_rek") String nama_rek);

    @FormUrlEncoded
    Call<String> editDetilTransaksi(@Field("id_transaksi") String id_transaksi,
                                    @Field("no_rek") String no_rek,
                                    @Field("nama_rek") String nama_rek);

    Call<detilTransaksiDAO> viewDetilTransaksi(@Path("id") String id);

    //USER TICKETS
    Call<List<userTicketDAO>> viewUserTickts(@Path("id") String id);

    Call<List<userTicketDAO>> viewEOUserTickets(@Path("id") String id);


}