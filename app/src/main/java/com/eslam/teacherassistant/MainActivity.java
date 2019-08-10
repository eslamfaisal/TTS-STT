package com.eslam.teacherassistant;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private TTS tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tts = new TTS(this, Locale.ENGLISH, new SpeechListener() {
            @Override
            public void onInitFinished() {
                tts.speak("A+");
            }
        });



    }


    @Override
    protected void onDestroy() {

        if (tts != null && tts.isSpeaking()) {
            tts.stop();
        }

        if (tts != null) {
            tts.shutdown();
        }

        tts = null;

        super.onDestroy();
    }

}
