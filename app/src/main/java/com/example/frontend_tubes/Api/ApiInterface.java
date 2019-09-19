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
import retrofit2.http.Query;

public interface ApiInterface {


    //USER-api
    @POST("user/create.php")
    @FormUrlEncoded
    Call<String> createUser(@Field("nama") String nama,
                            @Field("npm") String npm,
                            @Field("fakultas") String fakultas,
                            @Field("prodi") String prodi,
                            @Field("telp") String telp,
                            @Field("username") String username,
                            @Field("password") String password);

    @DELETE("user/delete.php")
    @FormUrlEncoded
    Call<String> deleteUser(@Field("id") String id);

    @PUT("user/edit.php")
    @FormUrlEncoded
    Call<String> editUser(@Field("nama") String nama,
                          @Field("npm") String npm,
                          @Field("fakultas") String fakultas,
                          @Field("prodi") String prodi,
                          @Field("telp") String telp,
                          @Field("username") String username,
                          @Field("password") String password,
                          @Field("id") String id);

    @GET("user/login.php")
    Call<userDAO> loginUser(@Query("username") String username);

    @GET("user/viewAll.php")
    Call<List<userDAO>> viewAllUser();

    //Event
    @POST("event/create.php")
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
    @PUT("event/edit.php")
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
    @DELETE("event/delete.php")
    Call<String> deleteEvent(@Field("id") String id);
    @GET("event/login.php")
    Call<eventDAO> loginEvent(@Query("username") String username);
    @GET("event/searchById.php")
    Call<List<eventDAO>> searchById(@Query("id") String id);
    @GET("event/searchByKategori.php")
    Call<List<eventDAO>> searchByKategori(@Path("kategori") String kategori);
    @GET("event/searchByNama.php")
    Call<List<eventDAO>> searchByNama(@Path("nama") String nama);
    @GET("event/searchByPenyelenggara")
    Call<List<eventDAO>> searchByPenyelenggara(@Path("penyelenggara") String penyelenggara);
    @GET("event/viewAll.php")
    Call<List<eventDAO>> viewAllEvent();

    //TRANSAKSI
    @POST("transaksi/create.php")
    @FormUrlEncoded
    Call<String> createTransaksi(@Field("id_user") String id_event,
                                 @Field("id_event") String id_user,
                                 @Field("status") String status);
    @PUT("transaksi/confirm.php")
    Call<String> confirmTransaksi(@Query("id") String id);
    @GET("transaksi/searchByEvent.php")
    Call<List<transaksiDAO>> searchByEvent(@Query("id") String id);
    @GET("transaksi/searchByUser.php")
    Call<List<transaksiDAO>> searchByUser(@Query("id") String id);

    //detilTransaksi
    @POST("detilTransaksi/create.php")
    @FormUrlEncoded
    Call<String> createDetilTransaksi(@Field("id_transaksi") String id_transaksi,
                                      @Field("no_rek") String no_rek,
                                      @Field("nama_rek") String nama_rek);
    @PUT("detilTransaksi/edit.php")
    @FormUrlEncoded
    Call<String> editDetilTransaksi(@Field("id_transaksi") String id_transaksi,
                                    @Field("no_rek") String no_rek,
                                    @Field("nama_rek") String nama_rek);
    @GET("detilTransaksi/view.php")
    Call<detilTransaksiDAO> viewDetilTransaksi(@Query("id") String id);

    //USER TICKETS
    @GET("userTicket/view.php")
    Call<List<userTicketDAO>> viewUserTickts(@Query("id") String id);
    @GET("userTicket/viewEO.php")
    Call<List<userTicketDAO>> viewEOUserTickets(@Query("id") String id);
}
