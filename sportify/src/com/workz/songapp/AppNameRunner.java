package com.workz.songapp;

import com.workz.songapp.appname.AppName;
import com.workz.songapp.song.Song;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class AppNameRunner {
    public static void main(String[] args) {
        AppName appName = new AppName();
        Song song = new Song();
        Scanner s= new Scanner(System.in);
        //String[] singer= new String[]{"Sonu Nigam", "Shreya Ghoshal"};
        System.out.println("Enter the song id: ");
        int songId=s.nextInt();
        song.setId(songId);
        System.out.println("Enter the song name: ");
        s.nextLine();
        String songName= s.nextLine();
        song.setSongName(songName);
        System.out.println("Enter the singers name: ");
        String singers=s.nextLine();
        song.setSingerNames(singers);
        System.out.println("Enter the views: ");
        long views=s.nextLong();
        song.setViews(views);
        System.out.println(song);
/*
        Song song1 = new Song();
        System.out.println(song1);
        String[] singer1= new String[]{"Sonu Nigam"};
        song1.setId(2);
        song1.setSongName("Munjane maathu");
        song1.setSingerNames(singer1);
        song1.setViews(40000000);
        System.out.println(song1);

        int hashCode=song1.hashCode();
        System.out.println(hashCode);
        boolean equal=song1.equals(song);
        System.out.println(equal);

//        boolean isSongAdded= appName.addSong(song);
//        System.out.println("Is song added: "+isSongAdded);
//        appName.getSongDetails();

 */
    }
}
