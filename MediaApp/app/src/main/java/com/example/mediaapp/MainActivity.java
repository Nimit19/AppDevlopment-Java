package com.example.mediaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button play;
    private SeekBar seekBar;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = MediaPlayer.create(this,R.raw.somebodytoyou);

        play = findViewById(R.id.play);
        seekBar = findViewById(R.id.seekBar);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = play.getText().toString();
                if(str.equals("PLAY")){
                    mediaPlayer.start();
                    play.setText("PAUSE");
                }
                if(str.equals("PAUSE")){
                    mediaPlayer.pause();
                    play.setText("PLAY");
                }
            }
        });


        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                seekBar.setMax(mediaPlayer.getDuration());
                seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                        if (b) {
                            mediaPlayer.seekTo(i);
                        }

                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                });
            }
        });

    }
}