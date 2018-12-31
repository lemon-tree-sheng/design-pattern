package org.sheng.designpattern.adaptor;

/**
 * @author sheng 2018/12/31
 * @desc todo
 */
public class AdapterMusicPlayer implements TargetMusicPlayer {

    private AdapteeMusicPlayer adapteeMusicPlayer;

    AdapterMusicPlayer(AdapteeMusicPlayer adapteeMusicPlayer) {
        this.adapteeMusicPlayer = adapteeMusicPlayer;
    }

    @Override
    public void play(String type, String fileName) {
        switch (type) {
            case "mp3":
                adapteeMusicPlayer.playMp3();
                break;
            case "wmv":
                adapteeMusicPlayer.playWmv();
                break;
                default:
        }

    }
}
