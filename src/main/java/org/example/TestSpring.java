package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Music music = context.getBean("musicBean", Music.class);
//        Music music = context.getBean("someRockMusic", Music.class); //9 lesson (annotation components)
//        Music music2 = context.getBean("someClassicalMusic", Music.class); //9 lesson (annotation components)
//        MusicPlayer musicPlayer = new MusicPlayer(music);//9 lesson (annotation components)
//        MusicPlayer musicPlayer2 = new MusicPlayer(music2);//9 lesson (annotation components)
//
////        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//        musicPlayer.playMusic();//9 lesson (annotation components)
//        musicPlayer2.playMusic();//9 lesson (annotation components)
//
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());

//        ClassicalMusic  classicalMusic = context.getBean("musicBean", ClassicalMusic.class); //8 lessons(singleton)
//        System.out.println(classicalMusic.getSong());//8 lessons(singleton)

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();

//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
