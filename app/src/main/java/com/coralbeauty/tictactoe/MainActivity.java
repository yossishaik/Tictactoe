package com.coralbeauty.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView iv0,iv1,iv2,iv3,iv4,iv5,iv6,iv7,iv8; //משתנים גלובלים
    TextView msg;


    boolean turn=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeVariables();

    }

    private void initializeVariables() {           // אתחול משתנים

        msg=(TextView) findViewById(R.id.tvMsg);
        iv0=(ImageView) findViewById(R.id.iv0);
        iv1=(ImageView) findViewById(R.id.iv1);
        iv2=(ImageView) findViewById(R.id.iv2);
        iv3=(ImageView) findViewById(R.id.iv3);
        iv4=(ImageView) findViewById(R.id.iv4);
        iv5=(ImageView) findViewById(R.id.iv5);
        iv6=(ImageView) findViewById(R.id.iv6);
        iv7=(ImageView) findViewById(R.id.iv7);
        iv8=(ImageView) findViewById(R.id.iv8);

                                                //אתחול לתגים

        iv0.setTag("empty");
        iv1.setTag("empty");
        iv2.setTag("empty");
        iv3.setTag("empty");
        iv4.setTag("empty");
        iv5.setTag("empty");
        iv6.setTag("empty");
        iv7.setTag("empty");
        iv8.setTag("empty");

        iv0.setOnClickListener(this);
        iv1.setOnClickListener(this);
        iv2.setOnClickListener(this);
        iv3.setOnClickListener(this);
        iv4.setOnClickListener(this);
        iv5.setOnClickListener(this);
        iv6.setOnClickListener(this);
        iv7.setOnClickListener(this);
        iv8.setOnClickListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        ImageView iv=(ImageView) v;
        if(iv.getTag().toString().equals("empty")&&checkWin()==false) {
            if(turn==true) {
                iv.setImageResource(R.drawable.x);
                iv.setTag(R.drawable.x);
                turn=false;
                if(checkWin()==true) {
                    msg.setText("X Victorious");
                }
            }
            else if(iv.getTag().toString().equals("empty")&&checkWin()==false){
                iv.setImageResource(R.drawable.o);
                iv.setTag(R.drawable.o);
                turn=true;
                if (checkWin()==true) {
                    msg.setText("O Victorious");
                }

            }

        }


    }
    public void clickNewGame(View view) {
        Button newGame =(Button) view;
        iv0.setImageResource(0);
        iv1.setImageResource(0);
        iv2.setImageResource(0);
        iv3.setImageResource(0);
        iv4.setImageResource(0);
        iv5.setImageResource(0);
        iv6.setImageResource(0);
        iv7.setImageResource(0);
        iv8.setImageResource(0);

        iv0.setTag("empty");
        iv1.setTag("empty");
        iv2.setTag("empty");
        iv3.setTag("empty");
        iv4.setTag("empty");
        iv5.setTag("empty");
        iv6.setTag("empty");
        iv7.setTag("empty");
        iv8.setTag("empty");

        turn=true;
        msg.setText("");


    }                                      //הגדרת הניצחון

    private boolean checkWin() {

        if(iv0.getTag().equals(R.drawable.x)&&iv1.getTag().equals(R.drawable.x)&&iv2.getTag().equals(R.drawable.x))
            return true;
        else if (iv3.getTag().equals(R.drawable.x)&&iv4.getTag().equals(R.drawable.x)&&iv5.getTag().equals(R.drawable.x))
            return true;
        else if (iv6.getTag().equals(R.drawable.x)&&iv7.getTag().equals(R.drawable.x)&&iv8.getTag().equals(R.drawable.x))
            return true;
        else if (iv0.getTag().equals(R.drawable.x)&&iv3.getTag().equals(R.drawable.x)&&iv6.getTag().equals(R.drawable.x))
            return true;
        else if (iv1.getTag().equals(R.drawable.x)&&iv4.getTag().equals(R.drawable.x)&&iv7.getTag().equals(R.drawable.x))
            return true;
        else if (iv2.getTag().equals(R.drawable.x)&&iv5.getTag().equals(R.drawable.x)&&iv8.getTag().equals(R.drawable.x))
            return true;
        else if (iv0.getTag().equals(R.drawable.x)&&iv4.getTag().equals(R.drawable.x)&&iv8.getTag().equals(R.drawable.x))
            return true;
        else if (iv2.getTag().equals(R.drawable.x)&&iv4.getTag().equals(R.drawable.x)&&iv6.getTag().equals(R.drawable.x))
            return true;

        else if(iv0.getTag().equals(R.drawable.o)&&iv1.getTag().equals(R.drawable.o)&&iv2.getTag().equals(R.drawable.o))
            return true;
        else if (iv3.getTag().equals(R.drawable.o)&&iv4.getTag().equals(R.drawable.o)&&iv5.getTag().equals(R.drawable.o))
            return true;
        else if (iv6.getTag().equals(R.drawable.o)&&iv7.getTag().equals(R.drawable.o)&&iv8.getTag().equals(R.drawable.o))
            return true;
        else if (iv0.getTag().equals(R.drawable.o)&&iv3.getTag().equals(R.drawable.o)&&iv6.getTag().equals(R.drawable.o))
            return true;
        else if (iv1.getTag().equals(R.drawable.o)&&iv4.getTag().equals(R.drawable.o)&&iv7.getTag().equals(R.drawable.o))
            return true;
        else if (iv2.getTag().equals(R.drawable.o)&&iv5.getTag().equals(R.drawable.o)&&iv8.getTag().equals(R.drawable.o))
            return true;
        else if (iv0.getTag().equals(R.drawable.o)&&iv4.getTag().equals(R.drawable.o)&&iv8.getTag().equals(R.drawable.o))
            return true;
        else if (iv2.getTag().equals(R.drawable.o)&&iv4.getTag().equals(R.drawable.o)&&iv6.getTag().equals(R.drawable.o))
            return true;

        return false;
    }
}
