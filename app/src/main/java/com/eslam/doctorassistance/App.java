package com.eslam.doctorassistance;

import android.app.Application;

import com.mapzen.speakerbox.Speakerbox;

public class App extends Application {
    static Speakerbox speakerbox;
    @Override
    public void onCreate() {
        super.onCreate();
        speakerbox = new Speakerbox(this);

    }
}
