package com.example.sliderprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

public class MainActivity extends IntroActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        //esconder botões
        setButtonBackVisible(false);
        setButtonNextVisible(false);

        //usando fragments
        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.holo_orange_light)
                .fragment(R.layout.intro_1)
                .canGoBackward(false)
                .build()
        );

        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.holo_orange_dark)
                .fragment(R.layout.intro_2)
                .build()
        );

        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.holo_orange_light)
                .fragment(R.layout.intro_3)
                .build()
        );

        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.holo_orange_dark)
                .fragment(R.layout.intro_4)
                .canGoForward(false)
                .build()
        );

        /*
        //slider simples
        addSlide(new SimpleSlide.Builder()
                                .title("Titulo 1")
                                .description("Descricao 1")
                                .image(R.drawable.um)
                                .background(android.R.color.holo_orange_light)
                                .build()
        );

        addSlide(new SimpleSlide.Builder()
                .title("Titulo 2")
                .description("Descricao 2")
                .image(R.drawable.dois)
                .background(android.R.color.holo_orange_light)
                .build()
        );

        addSlide(new SimpleSlide.Builder()
                .title("Titulo 3")
                .description("Descricao 3")
                .image(R.drawable.tres)
                .background(android.R.color.holo_orange_light)
                .build()
        );

        addSlide(new SimpleSlide.Builder()
                .title("Titulo 4")
                .description("Descricao 4")
                .image(R.drawable.quatro)
                .background(android.R.color.holo_orange_light)
                .build()
        );
        */
    }
}