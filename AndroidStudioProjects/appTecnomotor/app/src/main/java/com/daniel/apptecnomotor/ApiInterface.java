package com.daniel.apptecnomotor;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("montadora?pm.platform=1&pm.version=23&pm.type=LEVES")
    Call<List<Montadora>> getLeves();

    @GET("montadora?pm.platform=1&pm.version=23&pm.type=PESADOS")
    Call<List<Montadora>> getPesados();


    @GET("montadora?pm.platform=1&pm.version=23&pm.type=AGRICOLAS")
    Call<List<Montadora>> getAgricolas();


    @GET("montadora?pm.platform=1&pm.version=23&pm.type=MOTOS")
    Call<List<Montadora>> getMotos();

}
