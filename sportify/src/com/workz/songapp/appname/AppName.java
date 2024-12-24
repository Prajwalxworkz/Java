package com.workz.songapp.appname;

import com.workz.songapp.song.Song;

import java.util.Arrays;

public class AppName {
    Song song;
    public boolean addSong(Song song){
         boolean isSongAdded=false;
         if(song!=null){
             if(song.getSongName()!=null){
                 this.song=song;
                 isSongAdded=true;
         }
    }else {
             System.out.println("Song fields are empty");
         }
         return isSongAdded;
    }
    public void getSongDetails(){
        System.out.println("name: "+song.getSongName());
        System.out.println("singer/singers: "+song.getSingerNames());
        System.out.println("views: "+song.getViews());
    }

}
