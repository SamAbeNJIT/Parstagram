package com.samabenjit.parstagram;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;


@ParseClassName("Post")
public class Post extends ParseObject {
    public static final String Key_Description = "Description";
    public static final String Key_Image = "image";
    public static final String Key_User = "User";
    public static final String Key_Created_Key = "createdAt";

    public String getDescription(){
        return getString(Key_Description);
    }

    public void setDescription(String description){
        put(Key_Description, description);
    }

    public ParseFile getImage(){
        return getParseFile(Key_Image);
    }
    public void setImage(ParseFile parseFile){
        put(Key_Image,parseFile);
    }

    public ParseUser getUser() {
        return getParseUser(Key_User);
    }

    public void setUser(ParseUser user){
        put(Key_User,user);
    }

}
