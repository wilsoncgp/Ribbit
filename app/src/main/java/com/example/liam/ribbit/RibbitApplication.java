package com.example.liam.ribbit;

import android.app.Application;

import com.parse.Parse;

public class RibbitApplication extends Application {
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "FU8AY2uZiDu1cDMnNuZNGZPsWPgbWhjLYep1tBeD", "yrI2mmE9YAmdW5g4OVQbIQ2Puv6fAWn7PMg8WDeO");


    }
}
