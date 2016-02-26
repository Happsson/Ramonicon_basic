package nu.geeks.ramonicon.ramonicon_basic;

import android.app.Activity;
import android.media.MediaPlayer;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Micke on 2016-02-26.
 */
public class AudioHandler {
    private static int numberOfPlayers;

    Activity activity;


    public AudioHandler(Activity activity , int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
        this.activity = activity;

    }

    public static int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public static void setNumberOfPlayers(int numberOfPlayers) {
        AudioHandler.numberOfPlayers = numberOfPlayers;
    }

    public void getRandomSound(){
        MediaPlayer sound = new MediaPlayer();
        Random random = new Random();
        int soundGetter = random.nextInt(numberOfPlayers);
        sound = getSound(sound,soundGetter);
        sound.start();
    }

    public MediaPlayer getSound(MediaPlayer sound,int choice) {

        switch (choice) {
            case 0:
            sound.create(activity, R.raw.sound0);
                return sound;
            case 1:
                sound.create(activity, R.raw.sound1);
                return sound;

            case 2:
                sound.create(activity, R.raw.sound2);
                return sound;

            case 3:
                sound.create(activity, R.raw.sound3);
                return sound;

            default:
                sound.create(activity, R.raw.sound4);
                return sound;

        }
    }


}
