package com.daniel.apptecnomotor.adpters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.daniel.apptecnomotor.R;
import com.daniel.apptecnomotor.model.Veiculo;

import java.util.List;

public class VeiculoAdapter extends RecyclerView.Adapter<VeiculoAdapter.ViewHolder> {

    private List<Veiculo> veiculosList;

    public VeiculoAdapter(List<Veiculo> veiculosList) {this.veiculosList = veiculosList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_veiculo, parent, false);

        return new ViewHolder(view, parent.getContext());
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvTitle.setText(veiculosList.get(position).getId());
        //holder..setText(veiculosList.get(position).getNome());

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
