package com.example.myinstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
       Parse.initialize(new Parse.Configuration.Builder(this)
               .applicationId("instagram-pierre") // should correspond to APP_ID env variable
                .clientKey("codepath-instagram")  // set explicitly unless clientKey is explicitly configured on Parse server
                //.clientBuilder(builder)
               .server("http://instagram-pierre.herokuapp.com/parse").build());
    }
}
