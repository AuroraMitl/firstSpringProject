package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

    @Component
    public class MusicPlayer {

        @Value("${musicPlayer.name}")
        private String name;
        @Value("${musicPlayer.volume}")
        private int volume;

        public String getName() {
            return name;
        }

        public int getVolume() {
            return volume;
        }



        @Autowired
        @Qualifier("classicalMusic")
        private Music music;

        private ClassicalMusic classicalMusic;//bean classical
        private RockMusic rockMusic;

//        private Music music;//bean interface music

//    @Autowired
//    public MusicPlayer(ClassicalMusic classicalMusic){
//        this.classicalMusic = classicalMusic;
//    }

//    @Autowired
//    public MusicPlayer(Music music){//we can use the 1 variant of implements injections
//        this.music = music;
//    }
//or

//        @Autowired
//        public void setMusic(Music music){ //we can use the 2 variant of implements injections
//            this.music = music;
//        }
//    @Autowired
//    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic){ //we can use the 3 variant of implements injections
//        this.classicalMusic = classicalMusic;
//        this.rockMusic = rockMusic;
//    }
//
//
//    public String playMusic(){
//       return "Playing "+ classicalMusic.getSong();
//        System.out.println("Playing "+ rockMusic.getSong());
//    }

        public String playMusic(){
            return "Playing "+ music.getSong();

        }

}
