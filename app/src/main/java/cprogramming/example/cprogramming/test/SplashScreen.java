package cprogramming.example.cprogramming.test;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.TextView;


public class SplashScreen extends AppCompatActivity {
    TextView t1;

    /** Duration of wait **/
    private final int SPLASH_DISPLAY_LENGTH = 3*1000;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_splash_screen);

        getSupportActionBar().hide();

        t1 = (TextView) findViewById(R.id.textView100);
        t1.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounce));
        t1.setText("Developed and Designed By :\nHimanshu Kumawat");


        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(SplashScreen.this,MainActivity.class);
                SplashScreen.this.startActivity(mainIntent);
                SplashScreen.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}