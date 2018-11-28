package com.example.administrador.drawer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LayoutAnimationController;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private boolean bandera = true;
    private LinearLayout layoutAnimado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layoutAnimado = (LinearLayout) findViewById(R.id.animado);

    }

    public void mostrar(View button)
    {
        if (layoutAnimado.getVisibility() == View.GONE)
        {
            bandera = false;
            animar(true);
            layoutAnimado.setVisibility(View.VISIBLE);
        }
    }

    public void ocultar(View button)
    {
        if (layoutAnimado.getVisibility() == View.VISIBLE)
        {
            bandera = true;
            animar(false);
            layoutAnimado.setVisibility(View.GONE);
        }

    }

    private void animar(boolean mostrar)
    {
        AnimationSet set = new AnimationSet(true);
        Animation animation = null;
        if (mostrar)
        {
            //desde la esquina inferior derecha a la superior izquierda
            animation = new TranslateAnimation(Animation.RELATIVE_TO_SELF, 1.0f, Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 1.0f, Animation.RELATIVE_TO_SELF, 0.0f);
        }
        else
        {    //desde la esquina superior izquierda a la esquina inferior derecha
            animation = new TranslateAnimation(Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 1.0f, Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 1.0f);
        }
        //duración en milisegundos
        animation.setDuration(800);
        set.addAnimation(animation);
        LayoutAnimationController controller = new LayoutAnimationController(set, 0.25f);

        layoutAnimado.setLayoutAnimation(controller);
        layoutAnimado.startAnimation(animation);

        layoutAnimado.setLayoutAnimation(controller);
        layoutAnimado.startAnimation(animation);


        layoutAnimado.setLayoutAnimation(controller);
        layoutAnimado.startAnimation(animation);

        /*d;lak;sdlk;slakd;lkasd*/

        animation.setDuration(800);
        set.addAnimation(animation);
//        LayoutAnimationController controller = new LayoutAnimationController(set, 0.25f);



        layoutAnimado.setLayoutAnimation(controller);
        layoutAnimado.startAnimation(animation);
        layoutAnimado.startAnimation(animation);
        layoutAnimado.startAnimation(animation);
        layoutAnimado.startAnimation(animation);

        layoutAnimado.setLayoutAnimation(controller);
        layoutAnimado.startAnimation(animation);
        layoutAnimado.startAnimation(animation);
        layoutAnimado.startAnimation(animation);
        layoutAnimado.startAnimation(animation);


        layoutAnimado.setLayoutAnimation(controller);
        layoutAnimado.startAnimation(animation);
        layoutAnimado.startAnimation(animation);
        layoutAnimado.startAnimation(animation);
        layoutAnimado.startAnimation(animation);

        layoutAnimado.setLayoutAnimation(controller);
        layoutAnimado.startAnimation(animation);
        layoutAnimado.startAnimation(animation);
        layoutAnimado.startAnimation(animation);
        layoutAnimado.startAnimation(animation);


        layoutAnimado.setLayoutAnimation(controller);
        layoutAnimado.startAnimation(animation);
        layoutAnimado.startAnimation(animation);
        layoutAnimado.startAnimation(animation);
        layoutAnimado.startAnimation(animation);

        layoutAnimado.setLayoutAnimation(controller);
        layoutAnimado.startAnimation(animation);
        layoutAnimado.startAnimation(animation);
        layoutAnimado.startAnimation(animation);
        layoutAnimado.startAnimation(animation);

        layoutAnimado.setLayoutAnimation(controller);
        layoutAnimado.setLayoutAnimation(controller);
        layoutAnimado.setLayoutAnimation(controller);
        layoutAnimado.startAnimation(animation);


    }
}
