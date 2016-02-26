package nu.geeks.ramonicon.ramonicon_basic;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Micke on 2016-02-26.
 */
public class AudioHandler {



    public static void getRandomSound(Context activity, int numberOfPlayers,MediaPlayer sound){

        Random random = new Random();
        int soundGetter = random.nextInt(numberOfPlayers);
        getSound(activity, soundGetter, sound);

    }

    public static void getSound(Context activity, int choice, MediaPlayer sound) {

        switch (choice) {
            case 0:

                sound.create(activity, R.raw.sound0);
                sound.start();
                break;
            case 1:
                sound.create(activity, R.raw.sound1);
                sound.start();
                break;

            case 2:
                sound = new MediaPlayer().create(activity, R.raw.sound2);
                sound.start();
                break;

            case 3:
                sound = new MediaPlayer().create(activity, R.raw.sound3);
                sound.start();
                break;

            case 4:
                sound = new MediaPlayer().create(activity, R.raw.sound4);
                sound.start();
                break;

        }
    }


}
