package com.example.simpleinstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("iveau0DgkKoT4HRyKZaj6t61Jj42RLARkSSgHQb3")
                .clientKey("Gxv84y2rCmoNVDP45vgJuHTW5thRwww1ACe9WTPM")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
