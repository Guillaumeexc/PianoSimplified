package excoffier.guillaume.pianosimplified;


import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import static android.R.attr.src;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    private SoundPool mSoundPool;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mCbisSoundId;
    private int mAbisSoundId;
    private int mDbisSoundId;
    private int mFbisSoundId;
    private int mGbisSoundId;
    private int mBSoundId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSoundPool=new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS,AudioManager.STREAM_MUSIC,0);

        mCSoundId= mSoundPool.load(getApplicationContext(),R.raw.sound40,1);
        mCbisSoundId= mSoundPool.load(getApplicationContext(),R.raw.sound41,1);
        mDSoundId= mSoundPool.load(getApplicationContext(),R.raw.sound42,1);
        mDbisSoundId= mSoundPool.load(getApplicationContext(),R.raw.sound43,1);
        mESoundId= mSoundPool.load(getApplicationContext(),R.raw.sound44,1);
        mFSoundId= mSoundPool.load(getApplicationContext(),R.raw.sound45,1);
        mFbisSoundId= mSoundPool.load(getApplicationContext(),R.raw.sound46,1);
        mGSoundId= mSoundPool.load(getApplicationContext(),R.raw.sound47,1);
        mGbisSoundId= mSoundPool.load(getApplicationContext(),R.raw.sound48,1);
        mASoundId= mSoundPool.load(getApplicationContext(),R.raw.sound49,1);
        mAbisSoundId= mSoundPool.load(getApplicationContext(),R.raw.sound50,1);
        mBSoundId= mSoundPool.load(getApplicationContext(),R.raw.sound51,1);
    }


    public void playC(View v){
        mSoundPool.play(mCSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
    public void playCbis(View v){
        mSoundPool.play(mCbisSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
    public void playD(View v){
        mSoundPool.play(mDSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
    public void playDbis(View v){
        mSoundPool.play(mDbisSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
    public void playE(View v){
        mSoundPool.play(mESoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
    public void playF(View v){
        mSoundPool.play(mFSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
    public void playFbis(View v){
        mSoundPool.play(mFbisSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
    public void playG(View v){
        mSoundPool.play(mGSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
    public void playGbis(View v){
        mSoundPool.play(mGbisSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
    public void playA(View v){
        mSoundPool.play(mASoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
    public void playAbis(View v){
        mSoundPool.play(mAbisSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
    public void playB(View v){
        mSoundPool.play(mBSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }


}
