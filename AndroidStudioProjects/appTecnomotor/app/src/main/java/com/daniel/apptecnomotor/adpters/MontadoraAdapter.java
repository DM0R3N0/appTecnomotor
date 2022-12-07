package com.daniel.apptecnomotor.adpters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.daniel.apptecnomotor.MainActivity2;
import com.daniel.apptecnomotor.R;
import com.daniel.apptecnomotor.model.Montadora;

import java.util.List;

public class MontadoraAdapter extends RecyclerView.Adapter<MontadoraAdapter.ViewHolder> {

    private List<Montadora> montadoraList;

    public MontadoraAdapter(List<Montadora> montadoraList) {
        this.montadoraList = montadoraList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_montadora, parent, false);

        return new ViewHolder(view, parent.getContext());
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvTitle.setText(montadoraList.get(position).getNome());
        //holder.tvBody.setText(postsList.get(position).getTipo());

    }

    @Override
    public int getItemCount() {
        return montadoraList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvTitle;
        //TextView tvBody;

        public ViewHolder(@NonNull View itemView, final Context context) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            //tvBody = itemView.findViewById(R.id.tvBody);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent it = new Intent(context, MainActivity2.class);
                    context.startActivity(it);
                }
            });
        }
      }
    }




