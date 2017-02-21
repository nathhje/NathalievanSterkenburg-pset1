package com.example.gebruiker.oefenapp;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    // images are created
    private ImageView hat;
    private ImageView eyebrows;
    private ImageView glasses;
    private ImageView eyes;
    private ImageView ears;
    private ImageView arms;
    private ImageView nose;
    private ImageView mouth;
    private ImageView mustache;
    private ImageView shoes;

    private CheckBox hat2;
    private CheckBox eyebrows2;
    private CheckBox glasses2;
    private CheckBox eyes2;
    private CheckBox ears2;
    private CheckBox arms2;
    private CheckBox nose2;
    private CheckBox mouth2;
    private CheckBox mustache2;
    private CheckBox shoes2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // images are linked to the widgets and made invisible by default
        hat = (ImageView) findViewById(R.id.hat);
        hat2 = (CheckBox) findViewById(R.id.hat2);
        hat.setVisibility(View.GONE);

        eyebrows = (ImageView) findViewById(R.id.eyebrows);
        eyebrows2 = (CheckBox) findViewById(R.id.eyebrows2);
        eyebrows.setVisibility(View.GONE);

        glasses = (ImageView) findViewById(R.id.glasses);
        glasses2 = (CheckBox) findViewById(R.id.glasses2);
        glasses.setVisibility(View.GONE);

        eyes = (ImageView) findViewById(R.id.eyes);
        eyes2 = (CheckBox) findViewById(R.id.eyes2);
        eyes.setVisibility(View.GONE);

        ears = (ImageView) findViewById(R.id.ears);
        ears2 = (CheckBox) findViewById(R.id.ears2);
        ears.setVisibility(View.GONE);

        arms = (ImageView) findViewById(R.id.arms);
        arms2 = (CheckBox) findViewById(R.id.arms2);
        arms.setVisibility(View.GONE);

        nose = (ImageView) findViewById(R.id.nose);
        nose2 = (CheckBox) findViewById(R.id.nose2);
        nose.setVisibility(View.GONE);

        mouth = (ImageView) findViewById(R.id.mouth);
        mouth2 = (CheckBox) findViewById(R.id.mouth2);
        mouth.setVisibility(View.GONE);

        mustache = (ImageView) findViewById(R.id.mustache);
        mustache2 = (CheckBox) findViewById(R.id.mustache2);
        mustache.setVisibility(View.GONE);

        shoes = (ImageView) findViewById(R.id.shoes);
        shoes2 = (CheckBox) findViewById(R.id.shoes2);
        shoes.setVisibility(View.GONE);


    }




    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.content_land);
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            setContentView(R.layout.content_main);
        }

        // checkboxes are unchecked
        hat2.setChecked(false);
        eyebrows2.setChecked(false);
        glasses2.setChecked(false);
        eyes2.setChecked(false);
        ears2.setChecked(false);
        arms2.setChecked(false);
        nose2.setChecked(false);
        mouth2.setChecked(false);
        mustache2.setChecked(false);
        shoes2.setChecked(false);

        // checkboxes and images are reinitialized
        hat = (ImageView) findViewById(R.id.hat);
        hat2 = (CheckBox) findViewById(R.id.hat2);
        hat.setVisibility(View.GONE);

        eyebrows = (ImageView) findViewById(R.id.eyebrows);
        eyebrows2 = (CheckBox) findViewById(R.id.eyebrows2);
        eyebrows.setVisibility(View.GONE);

        glasses = (ImageView) findViewById(R.id.glasses);
        glasses2 = (CheckBox) findViewById(R.id.glasses2);
        glasses.setVisibility(View.GONE);

        eyes = (ImageView) findViewById(R.id.eyes);
        eyes2 = (CheckBox) findViewById(R.id.eyes2);
        eyes.setVisibility(View.GONE);

        ears = (ImageView) findViewById(R.id.ears);
        ears2 = (CheckBox) findViewById(R.id.ears2);
        ears.setVisibility(View.GONE);

        arms = (ImageView) findViewById(R.id.arms);
        arms2 = (CheckBox) findViewById(R.id.arms2);
        arms.setVisibility(View.GONE);

        nose = (ImageView) findViewById(R.id.nose);
        nose2 = (CheckBox) findViewById(R.id.nose2);
        nose.setVisibility(View.GONE);

        mouth = (ImageView) findViewById(R.id.mouth);
        mouth2 = (CheckBox) findViewById(R.id.mouth2);
        mouth.setVisibility(View.GONE);

        mustache = (ImageView) findViewById(R.id.mustache);
        mustache2 = (CheckBox) findViewById(R.id.mustache2);
        mustache.setVisibility(View.GONE);

        shoes = (ImageView) findViewById(R.id.shoes);
        shoes2 = (CheckBox) findViewById(R.id.shoes2);
        shoes.setVisibility(View.GONE);
    }

    // functions to adjust visibility when box is checked
    public void onHat(View view) {
        if (hat.getVisibility() == View.VISIBLE) {
            hat.setVisibility(View.GONE);
            Log.i("werkt dit", "onHat: ");
        } else {
            hat.setVisibility(View.VISIBLE);
            Log.i("en dit", "misschien");
        }
    }

    public void onHair(View view) {
        if (eyebrows.getVisibility() == View.VISIBLE) {
            eyebrows.setVisibility(View.GONE);
        } else {
            eyebrows.setVisibility(View.VISIBLE);
        }
    }

    public void onGlasses(View view) {
        if (glasses.getVisibility() == View.VISIBLE) {
            glasses.setVisibility(View.GONE);
        } else {
            glasses.setVisibility(View.VISIBLE);
        }
    }

    public void onEyes(View view) {
        if (eyes.getVisibility() == View.VISIBLE) {
            eyes.setVisibility(View.GONE);
        } else {
            eyes.setVisibility(View.VISIBLE);
        }
    }

    public void onEars(View view) {
        if (ears.getVisibility() == View.VISIBLE) {
            ears.setVisibility(View.GONE);
        } else {
            ears.setVisibility(View.VISIBLE);
        }
    }

    public void onArms(View view) {
        if (arms.getVisibility() == View.VISIBLE) {
            arms.setVisibility(View.GONE);
        } else {
            arms.setVisibility(View.VISIBLE);
        }
    }

    public void onNose(View view) {
        if (nose.getVisibility() == View.VISIBLE) {
            nose.setVisibility(View.GONE);
        } else {
            nose.setVisibility(View.VISIBLE);
        }
    }

    public void onMouth(View view) {
        if (mouth.getVisibility() == View.VISIBLE) {
            mouth.setVisibility(View.GONE);
        } else {
            mouth.setVisibility(View.VISIBLE);
        }
    }

    public void onMustache(View view) {
        if (mustache.getVisibility() == View.VISIBLE) {
            mustache.setVisibility(View.GONE);
        } else {
            mustache.setVisibility(View.VISIBLE);
        }
    }

    public void onShoes(View view) {
        if (shoes.getVisibility() == View.VISIBLE) {
            shoes.setVisibility(View.GONE);
        } else {
            shoes.setVisibility(View.VISIBLE);
        }
    }
}
