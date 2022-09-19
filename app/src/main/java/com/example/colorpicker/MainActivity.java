package com.example.colorpicker;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    private SeekBar red, green, blue;
    private TextView piros, kek, zold, szoveg;
    private RelativeLayout hatter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        red.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                hatter.setBackgroundColor(Color.rgb(red.getProgress(),green.getProgress(),blue.getProgress()));
                piros.setText("Piros: "+red.getProgress());
                zold.setText("Zöld: "+green.getProgress());
                kek.setText("Kék: "+blue.getProgress());
                szoveg.setText("(" +red.getProgress()+", "+green.getProgress()+", "+blue.getProgress()+")");

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        green.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                hatter.setBackgroundColor(Color.rgb(red.getProgress(),green.getProgress(),blue.getProgress()));
                piros.setText("Piros: "+red.getProgress());
                zold.setText("Zöld: "+green.getProgress());
                kek.setText("Kék: "+blue.getProgress());
                szoveg.setText("(" +red.getProgress()+", "+green.getProgress()+", "+blue.getProgress()+")");



            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        blue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                hatter.setBackgroundColor(Color.rgb(red.getProgress(),green.getProgress(),blue.getProgress()));
                piros.setText("Piros: "+red.getProgress());
                zold.setText("Zöld: "+green.getProgress());
                kek.setText("Kék: "+blue.getProgress());
                szoveg.setText("(" +red.getProgress()+", "+green.getProgress()+", "+blue.getProgress()+")");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }

    private void init() {

        hatter = findViewById(R.id.hatter);
        red = findViewById(R.id.red);
        green = findViewById(R.id.green);
        blue = findViewById(R.id.blue);
        piros = findViewById(R.id.piros);
        kek = findViewById(R.id.kek);
        zold = findViewById(R.id.zold);
        szoveg = findViewById(R.id.szoveg);


    }

}