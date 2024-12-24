package com.workz.songapp.song;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;

@NoArgsConstructor
@Getter
@Setter
public class Song {
    private int id;
    private String songName;
    private String singerNames;
    private long views;
    @Override
    public String toString(){
        return "Song(id= "+this.id+", songName="+this.songName+", singerNames="+ this.singerNames +", views="+this.views+")";
    }
    @Override
    public int hashCode(){
        return this.id;
    }
    @Override
    public boolean equals(Object obj){
        Song song = (Song) obj;
        if(this.hashCode()==song.hashCode())
            return true;
        return false;

    }
}
