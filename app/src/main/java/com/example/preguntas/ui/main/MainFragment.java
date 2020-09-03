package com.example.preguntas.ui.main;

import androidx.lifecycle.ViewModelProviders;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.preguntas.R;

public class MainFragment extends Fragment {

    private MainViewModel mViewModel;
    private TextView texto;
    private Button boton1, boton2, boton3, boton4;
    private Pregunta[] preguntas = {
            new Pregunta(R.string.p1, true),
            new Pregunta(R.string.p2, true),
            new Pregunta(R.string.p3, true),
            new Pregunta(R.string.p4, true),
            new Pregunta(R.string.p5, false),
    };
    private int posicionActual = 0;
    private int pos=posicionActual;

    public static MainFragment newInstance() {
        return new MainFragment();
    }



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_fragment, container, false);
        texto = view.findViewById(R.id.textView);
        boton1 = view.findViewById(R.id.button1);
        boton2 =view.findViewById(R.id.button2);
        boton3 = view.findViewById(R.id.button4);
        boton4 = view.findViewById(R.id.button3);


        return  view;
    }

    private void actualizarPregunta() {
        int preguntaId = preguntas[posicionActual].getTextoId();
        texto.setText(preguntaId);
    }
    private void actualizarPreguntaA() {
        int preguntaId = preguntas[pos-1].getTextoId();
        texto.setText(preguntaId);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        // TODO: Use the ViewModel
    }

}