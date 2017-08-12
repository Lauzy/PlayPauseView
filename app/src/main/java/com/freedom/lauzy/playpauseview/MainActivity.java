package com.freedom.lauzy.playpauseview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.freedom.lauzy.playpauseviewlib.PlayPauseView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final PlayPauseView playPauseView1 = (PlayPauseView) findViewById(R.id.play_pause_view1);
        final PlayPauseView playPauseView2 = (PlayPauseView) findViewById(R.id.play_pause_view2);
        playPauseView1.setPlayPauseListener(new PlayPauseView.PlayPauseListener() {
            @Override
            public void play() {
                Toast.makeText(MainActivity.this, "Play", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void pause() {
                Toast.makeText(MainActivity.this, "Pause", Toast.LENGTH_SHORT).show();
            }
        });


        findViewById(R.id.btn_paly_pause).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (playPauseView1.isPlaying()) {
                    playPauseView1.pause();
                } else {
                    playPauseView1.play();
                }

                if (playPauseView2.isPlaying()) {
                    playPauseView2.pause();
                } else {
                    playPauseView2.play();
                }

            }
        });
    }
}
