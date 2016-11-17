package com.example.gonzalo.saveyourdreams.Layout;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gonzalo.saveyourdreams.Clases.Dream;
import com.example.gonzalo.saveyourdreams.R;
import com.example.gonzalo.saveyourdreams.Otros.RecyclerViewItemSelectedListener;
import com.example.gonzalo.saveyourdreams.adapters.DreamAdapter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Gonzalo on 09/11/2016.
 */


public class FragmentoPesadillas extends Fragment {

    private RecyclerView lista2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_dream, container, false);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        lista2 = (RecyclerView) view.findViewById(R.id.lista_dream);

        List<Dream> dreams = new ArrayList<>();

        for(int i = 0 ; i < 100; i++){
            Dream dream = new Dream();
            dream.setTitulo("Pesadilla " + i);
            dream.setTime(new Date());
            dreams.add(dream);
        }

        DreamAdapter adapter = new DreamAdapter(dreams, new RecyclerViewItemSelectedListener<Dream>() {
            @Override
            public void onItemSelected(Dream item) {
                Intent intent = new Intent(getActivity(), VisorDream.class);
                intent.putExtra("dream", item);
                startActivity(intent);
            }
        });
        lista2.setLayoutManager(new LinearLayoutManager(getContext()));
        lista2.setHasFixedSize(true);
        lista2.setAdapter(adapter);
    }
}