package com.example.preguntas.ui.main;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.lifecycle.ViewModel;



public class MainViewModel extends ViewModel {

        private  int pos1;
        private int pos2  ;
        private String preguntas;




        public void setPos1(int posicionActual) {
            pos1 = (posicionActual +1) % preguntas.length();
        }

        public void setPos2 (int pos) {
            pos2 = (pos + 1) % preguntas.length();
        }
    }


