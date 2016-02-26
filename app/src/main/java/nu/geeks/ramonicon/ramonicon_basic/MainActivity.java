package nu.geeks.ramonicon.ramonicon_basic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    AudioHandler audioHandler;
    Button b1, b2, b3, b4, b5, start;
    EditText numberPlayer;
    MediaPlayer mPLayer;
    int numbPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPLayer = new MediaPlayer();

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);

        start = (Button) findViewById(R.id.bStarta);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        start.setOnClickListener(this);

        numberPlayer = (EditText) findViewById(R.id.edNum);


    }

    @Override
    public void onClick(View v) {
        MediaPlayer mediaPlayer;
        switch(v.getId()){
            case R.id.b1:
               //  audioHandler.getSound(mPLayer, 0);
                mediaPlayer = MediaPlayer.create(this, R.raw.sound0);
                mediaPlayer.start();
                break;
            case R.id.b2:
                mediaPlayer = MediaPlayer.create(this, R.raw.sound1);
                mediaPlayer.start();

                break;
            case R.id.b3:
                mediaPlayer = MediaPlayer.create(this, R.raw.sound2);
                mediaPlayer.start();

                break;
            case R.id.b4:
                mediaPlayer = MediaPlayer.create(this, R.raw.sound3);
                mediaPlayer.start();

                break;
            case R.id.b5:
                mediaPlayer = MediaPlayer.create(this, R.raw.sound4);
                mediaPlayer.start();

                break;
            case R.id.bStarta:
                Intent intent = new Intent(this, PlayActivity.class);
                numbPlayer = Integer.parseInt(numberPlayer.getText().toString());
                if(numbPlayer < 1 || numbPlayer > 5){
                    Toast.makeText(this, "Välj mellan en och fem spelare", Toast.LENGTH_LONG).show();
                }else{
                    intent.putExtra("players", numbPlayer);
                    startActivity(intent);
                }
                break;

        }
    }
}
