package com.samabenjit.parstagram;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("c8ZPcdYGAUMq1HrrhVuxpXvfk25LKNDC8HURBXJu")
                .clientKey("3n5L8nCgevlj6wCTZXeNMXS7mXLR5qDTgDjBf3Yn")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
