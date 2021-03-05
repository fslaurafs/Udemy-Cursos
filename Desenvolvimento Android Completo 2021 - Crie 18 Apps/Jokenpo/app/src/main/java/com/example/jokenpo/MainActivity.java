package com.example.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view) {
        this.opcaoSelecionada("PEDRA");
    }

    public void selecionadoPapel(View view) {
        this.opcaoSelecionada("PAPEL");
    }

    public void selecionadoTesoura(View view) {
        this.opcaoSelecionada("TESOURA");
    }

    public void opcaoSelecionada(String escolhaUsuario) {
        ImageView imagemResultado = findViewById(R.id.imageResultado);
        TextView textoResultado = findViewById(R.id.textResultado);

        int numero = new Random().nextInt(3); //0 1 2
        String[] opcoes = {"PEDRA", "PAPEL", "TESOURA"};
        String escolhaApp = opcoes[numero];

        switch(escolhaApp) {
            case "PEDRA":
                imagemResultado.setImageResource(R.drawable.pedra);
                break;

            case "PAPEL":
                imagemResultado.setImageResource(R.drawable.papel);
                break;

            case "TESOURA":
                imagemResultado.setImageResource(R.drawable.tesoura);
                break;
        }

        if(
                (escolhaApp == "TESOURA" && escolhaUsuario == "PAPEL") ||
                (escolhaApp == "PAPEL" && escolhaUsuario == "PEDRA") ||
                (escolhaApp == "PEDRA" && escolhaUsuario == "TESOURA")
        ) { //App ganhador
            textoResultado.setText("Você PERDEU :( ");

        } else if(
                (escolhaUsuario == "TESOURA" && escolhaApp == "PAPEL") ||
                (escolhaUsuario == "PAPEL" && escolhaApp == "PEDRA") ||
                (escolhaUsuario == "PEDRA" && escolhaApp == "TESOURA")
        ) { //Usuario ganhador
            textoResultado.setText("Você GANHOU :) ");

        } else { //Empate
            textoResultado.setText("EMPATE ;) ");
        }

        //System.out.println("Item selecionado: " + escolhaApp);
    }

}