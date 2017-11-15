package shehan.tictactoempgameapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/* |b1|b2|b3|
   |b4|b5|b6|
   |b7|b8|b9|

   this is the arrangement of places.
 */
public class Game extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        final int[] turn = new int[1];/*Used for change turn */

        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);
        b3=(Button) findViewById(R.id.b3);
        b4=(Button) findViewById(R.id.b4);
        b5=(Button) findViewById(R.id.b5);
        b6=(Button) findViewById(R.id.b6);
        b7=(Button) findViewById(R.id.b7);
        b8=(Button) findViewById(R.id.b8);
        b9=(Button) findViewById(R.id.b9);
        reset=(Button) findViewById(R.id.reset);

        turn[0] =1;

/*if turn result is 1 put x and replace turn with 2, if turn result is 2 put O and  replace with 1*/
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(b1.getText().toString().equals("")) {
                    if (turn[0] == 1) {
                        turn[0] = 2;
                        b1.setText("X");
                    } else if (turn[0] == 2) {
                        turn[0] = 1;
                        b1.setText("O");
                    }
                }
                endgame();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(b2.getText().toString().equals("")) {
                    if (turn[0] == 1) {
                        turn[0] = 2;
                        b2.setText("X");
                    } else if (turn[0] == 2) {
                        turn[0] = 1;
                        b2.setText("O");
                    }
                }
                endgame();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(b3.getText().toString().equals("")) {
                    if (turn[0] == 1) {
                        turn[0] = 2;
                        b3.setText("X");
                    } else if (turn[0] == 2) {
                        turn[0] = 1;
                        b3.setText("O");
                    }
                }
                endgame();

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(b4.getText().toString().equals("")) {
                    if (turn[0] == 1) {
                        turn[0] = 2;
                        b4.setText("X");
                    } else if (turn[0] == 2) {
                        turn[0] = 1;
                        b4.setText("O");
                    }
                }
                endgame();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(b5.getText().toString().equals("")) {
                    if (turn[0] == 1) {
                        turn[0] = 2;
                        b5.setText("X");
                    } else if (turn[0] == 2) {
                        turn[0] = 1;
                        b5.setText("O");
                    }
                }
                endgame();

            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(b6.getText().toString().equals("")) {
                    if (turn[0] == 1) {
                        turn[0] = 2;
                        b6.setText("X");
                    } else if (turn[0] == 2) {
                        turn[0] = 1;
                        b6.setText("O");
                    }
                }
                endgame();
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(b7.getText().toString().equals("")) {
                    if (turn[0] == 1) {
                        turn[0] = 2;
                        b7.setText("X");
                    } else if (turn[0] == 2) {
                        turn[0] = 1;
                        b7.setText("O");
                    }
                }
                endgame();
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(b8.getText().toString().equals("")) {
                    if (turn[0] == 1) {
                        turn[0] = 2;
                        b8.setText("X");
                    } else if (turn[0] == 2) {
                        turn[0] = 1;
                        b8.setText("O");
                    }
                }
                endgame();
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(b9.getText().toString().equals("")) {
                    if (turn[0] == 1) {
                        turn[0] = 2;
                        b9.setText("X");
                    } else if (turn[0] == 2) {
                        turn[0] = 1;
                        b9.setText("O");
                    }
                }
                endgame();

            }
        });

    }
    public void endgame()
    {

        boolean end =false;
        String a,b,c,d,e,f,g,h,i;
/*get tha values fro each button */
        a=b1.getText().toString();
        b=b2.getText().toString();
        c=b3.getText().toString();
        d=b4.getText().toString();
        e=b5.getText().toString();
        f=b6.getText().toString();
        g=b7.getText().toString();
        h=b8.getText().toString();
        i=b9.getText().toString();
/*check 3 position to find winner eg: if b1,b2,b3 have X then Xis winner so end is true Same process for O*/
        if(a.equals("X") && b.equals("X") && c.equals("X")) {
            Toast.makeText(Game.this,"Winner X!!",Toast.LENGTH_LONG).show();
            end=true;

        }
        if(a.equals("X") && d.equals("X") && g.equals("X")) {
            Toast.makeText(Game.this,"Winner X!!",Toast.LENGTH_LONG).show();
            end=true;


        }
        if(a.equals("X") && e.equals("X") && i.equals("X")) {
            Toast.makeText(Game.this,"Winner X!!",Toast.LENGTH_LONG).show();
            end=true;


        }
        if(d.equals("X") && e.equals("X") && f.equals("X")) {
            Toast.makeText(Game.this,"Winner X!!",Toast.LENGTH_LONG).show();
            end=true;

        }
        if(g.equals("X") && h.equals("X") && i.equals("X")) {
            Toast.makeText(Game.this,"Winner X!!",Toast.LENGTH_LONG).show();
            end=true;


        }
        if (c.equals("X") && f.equals("X") && i.equals("X")) {
            Toast.makeText(Game.this,"Winner X!!",Toast.LENGTH_LONG).show();
            end=true;


        }
        if(c.equals("X") && e.equals("X") && g.equals("X")) {
            Toast.makeText(Game.this,"Winner X!!",Toast.LENGTH_LONG).show();
            end=true;


        }
        if(b.equals("X") && e.equals("X") && h.equals("X")) {
            Toast.makeText(Game.this,"Winner X!!",Toast.LENGTH_LONG).show();
            end=true;


        }







        if(a.equals("O") && b.equals("O") && c.equals("O")) {
            Toast.makeText(Game.this,"Winner O!!",Toast.LENGTH_LONG).show();
            end=true;

        }
        if(a.equals("O") && d.equals("O") && g.equals("O")) {
            Toast.makeText(Game.this,"Winner O!!",Toast.LENGTH_LONG).show();
            end=true;


        }
        if(a.equals("O") && e.equals("O") && i.equals("O")) {
            Toast.makeText(Game.this,"Winner O!!",Toast.LENGTH_LONG).show();
            end=true;


        }
        if(d.equals("O") && e.equals("O") && f.equals("O")) {
            Toast.makeText(Game.this,"Winner O!!",Toast.LENGTH_LONG).show();
            end=true;

        }
        if(g.equals("O") && h.equals("O") && i.equals("O")) {
            Toast.makeText(Game.this,"Winner O!!",Toast.LENGTH_LONG).show();
            end=true;


        }
        if (c.equals("O") && f.equals("O") && i.equals("O")) {
            Toast.makeText(Game.this,"Winner O!!",Toast.LENGTH_LONG).show();
            end=true;


        }
        if(c.equals("O") && e.equals("O") && g.equals("O")) {
            Toast.makeText(Game.this,"Winner O!!",Toast.LENGTH_LONG).show();
            end=true;


        }
        if(b.equals("O") && e.equals("O") && h.equals("O")) {
            Toast.makeText(Game.this,"Winner O!!",Toast.LENGTH_LONG).show();
            end=true;


        }

        /*After finish restart game by replace X & O with empty and active buttons*/

        if(end) {
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");

                b1.setEnabled(true);
                b2.setEnabled(true);
                b3.setEnabled(true);
                b4.setEnabled(true);
                b5.setEnabled(true);
                b6.setEnabled(true);
                b7.setEnabled(true);
                b8.setEnabled(true);
                b9.setEnabled(true);

            }
        });
    }
}
