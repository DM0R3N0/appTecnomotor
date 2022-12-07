package com.daniel.apptecnomotor;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("montadora?pm.platform=1&pm.version=23&pm.type=LEVES")
    Call<List<Posts>> getLeves();

    @GET("montadora?pm.platform=1&pm.version=23&pm.type=PESADOS")
    Call<List<Posts>> getPesados();


    @GET("montadora?pm.platform=1&pm.version=23&pm.type=AGRICOLAS")
    Call<List<Posts>> getAgricolas();


    @GET("montadora?pm.platform=1&pm.version=23&pm.type=MOTOS")
    Call<List<Posts>> getMotos();
}
