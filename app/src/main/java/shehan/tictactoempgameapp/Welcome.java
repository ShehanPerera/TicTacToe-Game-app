package shehan.tictactoempgameapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
/*This only for dispaly SHEHAN IT. Not necessary.*/

public class Welcome extends AppCompatActivity {

    private static int SPLASH_TIME_OUT= 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                Intent homeInternt =new Intent(Welcome.this,Game.class);
                startActivity(homeInternt);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
