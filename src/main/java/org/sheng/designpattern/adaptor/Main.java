package org.sheng.designpattern.adaptor;

/**
 * @author sheng 2018/12/31
 * @desc todo
 */
public class Main {
    public static void main(String[] args) {
        TargetMusicPlayer targetMusicPlayer = new AdapterMusicPlayer(new AdapteeMusicPlayer());

        targetMusicPlayer.play("mp3", "");
        targetMusicPlayer.play("wmv", "");
    }
}
