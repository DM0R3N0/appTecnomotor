package com.daniel.apptecnomotor;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VeiculosAdapter extends RecyclerView.Adapter<VeiculosAdapter.ViewHolder> {

    private List<Veiculos> veiculosList;

    public VeiculosAdapter(List<Veiculos> veiculosList) {this.veiculosList = veiculosList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_veiculos, parent, false);

        return new ViewHolder(view, parent.getContext());
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvTitle.setText(veiculosList.get(position).getNome());
        //holder.tvBody.setText(postsList.get(position).getTipo());

    }

    @Override
    public int getItemCount() {
        return veiculosList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvTitle;
        //TextView tvBody;

        public ViewHolder(@NonNull View itemView, final Context contex) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            //tvBody = itemView.findViewById(R.id.tvBody);


        }
    }
}
