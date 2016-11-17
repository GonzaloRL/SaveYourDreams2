package com.example.gonzalo.saveyourdreams.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gonzalo.saveyourdreams.Clases.Pesadilla;
import com.example.gonzalo.saveyourdreams.R;
import com.example.gonzalo.saveyourdreams.Otros.RecyclerViewItemSelectedListener;

import java.util.List;

/**
 * Created by Gonzalo on 10/11/2016.
 */

public class PesadillaAdapter {
    private List<Pesadilla> pesadilla;

    private RecyclerViewItemSelectedListener<Pesadilla> listener;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder{
        // each data item is just a string in this case
        public TextView textoTitulo;
        public TextView textoFecha;
        public ImageView imagen;
        private RecyclerViewItemSelectedListener listener;

        public ViewHolder(View v, final List<Pesadilla> data, final RecyclerViewItemSelectedListener<Pesadilla> listener) {
            super(v);
            this.listener = listener;
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(listener != null)
                        listener.onItemSelected(data.get(PesadillaAdapter.ViewHolder.this.getLayoutPosition()));
                }
            });

            textoTitulo = (TextView) v.findViewById(R.id.titulo);
            textoFecha = (TextView) v.findViewById(R.id.fecha);
            imagen = (ImageView) v.findViewById(R.id.imagen);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public PesadillaAdapter(List<Pesadilla> pesadilla, RecyclerViewItemSelectedListener<Pesadilla> listener) {
        this.pesadilla = pesadilla;
        this.listener = listener;
    }


    // Create new views (invoked by the layout manager)

    public PesadillaAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                      int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pesadilla, parent, false);
        PesadillaAdapter.ViewHolder vh = new PesadillaAdapter.ViewHolder(v, pesadilla, listener);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)

    public void onBindViewHolder(PesadillaAdapter.ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.textoTitulo.setText(pesadilla.get(position).getTitulo());
        holder.textoFecha.setText(pesadilla.get(position).getFormattedTime());
    }

    // Return the size of your dataset (invoked by the layout manager)

    public int getItemCount() {
        return pesadilla.size();
    }
}
