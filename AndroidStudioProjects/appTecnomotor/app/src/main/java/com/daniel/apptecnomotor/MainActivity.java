package com.daniel.apptecnomotor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.daniel.apptecnomotor.adpters.MontadoraAdapter;
import com.daniel.apptecnomotor.model.Montadora;
import com.daniel.apptecnomotor.retrofit.RetrofitClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ProgressBar progressBar;
    LinearLayoutManager layoutManager;
    MontadoraAdapter adapter;
    List<Montadora> montadoraList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        progressBar = findViewById(R.id.progressBar);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new MontadoraAdapter(montadoraList);
        recyclerView.setAdapter(adapter);
    }

    public void leves(View view) {
        progressBar.setVisibility(View.VISIBLE);
        RetrofitClient.getRetrofitClient().getLeves().enqueue(new Callback<List<Montadora>>() {
            @Override
            public void onResponse(Call<List<Montadora>> call, Response<List<Montadora>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    montadoraList.clear();
                    montadoraList.addAll(response.body());
                    adapter.notifyDataSetChanged();
                    progressBar.setVisibility(View.GONE);
                }
            }

            @Override
            public void onFailure(Call<List<Montadora>> call, Throwable t) {
                progressBar.setVisibility(View.GONE);
                Toast.makeText(MainActivity.this, "ERROR" + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void pesados(View view) {
        progressBar.setVisibility(View.VISIBLE);
        RetrofitClient.getRetrofitClient().getPesados().enqueue(new Callback<List<Montadora>>() {
            @Override
            public void onResponse(Call<List<Montadora>> call, Response<List<Montadora>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    montadoraList.clear();
                    montadoraList.addAll(response.body());
                    adapter.notifyDataSetChanged();
                    progressBar.setVisibility(View.GONE);
                }
            }

            @Override
            public void onFailure(Call<List<Montadora>> call, Throwable t) {
                progressBar.setVisibility(View.GONE);
                Toast.makeText(MainActivity.this, "ERROR" + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void agricolas(View view) {
        progressBar.setVisibility(View.VISIBLE);
        RetrofitClient.getRetrofitClient().getAgricolas().enqueue(new Callback<List<Montadora>>() {
            @Override
            public void onResponse(Call<List<Montadora>> call, Response<List<Montadora>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    montadoraList.clear();
                    montadoraList.addAll(response.body());
                    adapter.notifyDataSetChanged();
                    progressBar.setVisibility(View.GONE);
                }
            }

            @Override
            public void onFailure(Call<List<Montadora>> call, Throwable t) {
                progressBar.setVisibility(View.GONE);
                Toast.makeText(MainActivity.this, "ERROR" + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void motos(View view) {
        progressBar.setVisibility(View.VISIBLE);
        RetrofitClient.getRetrofitClient().getMotos().enqueue(new Callback<List<Montadora>>() {
            @Override
            public void onResponse(Call<List<Montadora>> call, Response<List<Montadora>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    montadoraList.clear();
                    montadoraList.addAll(response.body());
                    adapter.notifyDataSetChanged();
                    progressBar.setVisibility(View.GONE);
                }
            }

            @Override
            public void onFailure(Call<List<Montadora>> call, Throwable t) {
                progressBar.setVisibility(View.GONE);
                Toast.makeText(MainActivity.this, "ERROR" + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}