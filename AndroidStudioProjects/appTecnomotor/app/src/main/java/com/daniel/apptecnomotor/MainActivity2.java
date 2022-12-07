package com.daniel.apptecnomotor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.daniel.apptecnomotor.adpters.VeiculoAdapter;
import com.daniel.apptecnomotor.model.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    RecyclerView recyclerView;
    ProgressBar progressBar;
    LinearLayoutManager layoutManager;
    VeiculoAdapter adapter;
    List<Veiculo> veiculosList = new ArrayList<Veiculo>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recyclerView = findViewById(R.id.recyclerView);
        progressBar = findViewById(R.id.progressBar);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter= new VeiculoAdapter(veiculosList);
        recyclerView.setAdapter(adapter);

        Toast.makeText(this, "EXIBIR VEICULOS DA MONTADORA SELECIONADA", Toast.LENGTH_SHORT).show();

    }



}