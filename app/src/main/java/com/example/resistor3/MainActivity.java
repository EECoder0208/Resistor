package com.example.resistor3;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Scanner;


public class MainActivity<container, string> extends AppCompatActivity {
    public int var = 0;
    public string word;
    public TextView textView, textView2, textView3, textView4;
    public Button button, button2, button3, button4, button5, button6, button7, button8, button9;
    public  ImageView imageView1, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10, imageView11, imageView12;
    private Object container;
    private Object string;
    public static final String EXTRA_TEXT = "com.example.buttontest.example.EXTRA_TEXT";
    public static final String EXTRA_TEXT2 = "com.example.buttontest.example.EXTRA_TEXT";
    public static final String EXTRA_NUM = "com.example.buttontest.example.EXTRA_NUM";
    Button buttons[];
   // public int var = 0 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);
        final EditText editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.buttonCalc);
        button2 = (Button) findViewById(R.id.buttonSave);//Save
        button3 = (Button) findViewById(R.id.buttonFirst);
        button4 = (Button) findViewById(R.id.buttonSec);
        button5 = (Button) findViewById(R.id.buttonMulti);
        button6 = (Button) findViewById(R.id.buttonTol);
        button7 = (Button) findViewById(R.id.buttonExit);
        button8 = (Button) findViewById(R.id.buttonClear);
        button9 = (Button) findViewById(R.id.buttonSetting);
        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView4 = (ImageView) findViewById(R.id.imageView4);
        imageView5 = (ImageView) findViewById(R.id.imageView5);
        imageView6 = (ImageView) findViewById(R.id.imageView6);
        imageView7 = (ImageView) findViewById(R.id.imageView7);
        imageView8 = (ImageView) findViewById(R.id.imageView8);
        imageView9 = (ImageView) findViewById(R.id.imageView9);
        imageView10 = (ImageView) findViewById(R.id.imageView10);
        imageView11 = (ImageView) findViewById(R.id.imageView11);
        imageView12 = (ImageView) findViewById(R.id.imageView12);
        final LinearLayout con = (LinearLayout) this.findViewById(R.id.container);
        final int[] listColors = new int[13];
        {
            listColors[0] = ContextCompat.getColor(getApplicationContext(), R.color.black);
            listColors[1] = ContextCompat.getColor(getApplicationContext(), R.color.brown);
            listColors[2] = ContextCompat.getColor(getApplicationContext(), R.color.red);
            listColors[3] = ContextCompat.getColor(getApplicationContext(), R.color.orange);
            listColors[4] = ContextCompat.getColor(getApplicationContext(), R.color.yellow);
            listColors[5] = ContextCompat.getColor(getApplicationContext(), R.color.green);
            listColors[6] = ContextCompat.getColor(getApplicationContext(), R.color.blue);
            listColors[7] = ContextCompat.getColor(getApplicationContext(), R.color.violet);
            listColors[8] = ContextCompat.getColor(getApplicationContext(), R.color.grey);
            listColors[9] = ContextCompat.getColor(getApplicationContext(), R.color.white);
            listColors[10] = ContextCompat.getColor(getApplicationContext(), R.color.none);
            listColors[11] = ContextCompat.getColor(getApplicationContext(), R.color.silver);
            listColors[12] = ContextCompat.getColor(getApplicationContext(), R.color.gold);
        }

        final Context context = getApplicationContext();
        imageView1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(context, "Clicked on Button1", Toast.LENGTH_LONG).show();

                //  textView.setText("1" );
                var = 0;
             word = (string) "Black";
               // methodA();
                methodB();

                ObjectAnimator colorFade = ObjectAnimator.ofObject(con, "backgroundColor",
                        new ArgbEvaluator(), Color.argb(255,0,0,0), 0xffffffff);
                colorFade.setDuration(700);     colorFade.start();
            }

        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                word = (string) "Brown";
                Toast.makeText(context, "Clicked on Button2", Toast.LENGTH_LONG).show();
                var = 1;
               // methodA();
                methodB();          ObjectAnimator colorFade = ObjectAnimator.ofObject(con, "backgroundColor",
                        new ArgbEvaluator(), Color.argb(255,145,63,0), 0xffffffff);
                colorFade.setDuration(700);     colorFade.start();
                }

        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(context, "Clicked on Button3", Toast.LENGTH_LONG).show();
                var = 2;
                word = (string) "Red";
                methodA(); methodB();               ObjectAnimator colorFade = ObjectAnimator.ofObject(con, "backgroundColor",
                        new ArgbEvaluator(), Color.argb(255,0255,25,25), 0xffffffff);
                colorFade.setDuration(700);     colorFade.start();
                }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                var = 3;
                word = (string) "Orange";
                methodA(); methodB();                          ObjectAnimator colorFade = ObjectAnimator.ofObject(con, "backgroundColor",
                        new ArgbEvaluator(), Color.argb(255,255,150,0), 0xffffffff);
                colorFade.setDuration(700);     colorFade.start();  }       });
        imageView5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                var = 4;
                word = (string) "Yellow";
                methodA(); methodB();                  ObjectAnimator colorFade = ObjectAnimator.ofObject(con, "backgroundColor",
                        new ArgbEvaluator(), Color.argb(255,255,255,0), 0xffffffff);
                colorFade.setDuration(700);     colorFade.start();          }       });
        imageView6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                var = 5;
                word = (string) "Green";
                methodA(); methodB();                  ObjectAnimator colorFade = ObjectAnimator.ofObject(con, "backgroundColor",// fg
                        new ArgbEvaluator(), Color.argb(255,0,255,0), 0xffffffff);
                colorFade.setDuration(700);     colorFade.start();          }       });
        imageView7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                var = 6;
                word = (string) "Blue";
                methodA(); methodB();                 ObjectAnimator colorFade = ObjectAnimator.ofObject(con, "backgroundColor",
                        new ArgbEvaluator(), Color.argb(255,0,0,255), 0xffffffff);
                colorFade.setDuration(700);     colorFade.start();           }       });
        imageView8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                var = 7;
                word = (string) "Violet";
                methodA(); methodB();                 ObjectAnimator colorFade = ObjectAnimator.ofObject(con, "backgroundColor",
                        new ArgbEvaluator(), Color.argb(255,150,0,255), 0xffffffff);
                colorFade.setDuration(700);     colorFade.start();           }       });
        imageView9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                var = 8;
                word = (string) "Gray";
                methodA();  methodB();                 ObjectAnimator colorFade = ObjectAnimator.ofObject(con, "backgroundColor",
                        new ArgbEvaluator(), Color.argb(255,125,125,125), 0xffffffff);
                colorFade.setDuration(700);     colorFade.start();          }       });
        imageView10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                var = 9;
                word = (string) "White";
                methodA(); methodB();                  ObjectAnimator colorFade = ObjectAnimator.ofObject(con, "backgroundColor",
                        new ArgbEvaluator(), Color.argb(255,0,0,0), 0xffffffff);
                colorFade.setDuration(700);     colorFade.start();          }       });
        imageView11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                var = 10;
                methodA(); methodB();                ObjectAnimator colorFade = ObjectAnimator.ofObject(con, "backgroundColor",
                        new ArgbEvaluator(), Color.argb(255,255,215,0), 0xffffffff);
                colorFade.setDuration(700);     colorFade.start();            }       });
        imageView12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                var = 100;
                methodA();  methodB();                 ObjectAnimator colorFade = ObjectAnimator.ofObject(con, "backgroundColor",
                        new ArgbEvaluator(), Color.argb(255,192,192,192), 0xffffffff);
                colorFade.setDuration(700);     colorFade.start();          }       });
        LinearLayout PER = (LinearLayout) this.findViewById(R.id.PER);
        PER.setVisibility(View.GONE);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
                public void onClick(View v) {
                String color[] = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white", "silver", "gold"};
                String color2[] = {"none" ,"brown", "red", "orange", "yellow", "green", "blue", "violet", "grey",          "silver", "gold"};


                String string = editText.getText().toString().toLowerCase();
                String var1, var2, var3, var4;

                try {
                    Scanner s = new Scanner(string).useDelimiter("\\s* \\s*");
                    textView.setText(s.next());
                    textView2.setText(s.next());
                    textView3.setText(s.next());
                    textView4.setText(s.next());
                }catch(Exception err){
                    Toast.makeText(MainActivity.this, "Four Values are required", Toast.LENGTH_LONG).show();
                    Toast.makeText(MainActivity.this, "Dumb Shit", Toast.LENGTH_SHORT).show();
                }
                var1 = (String) textView.getText();
                var2 = (String) textView2.getText();
                var3 = (String) textView3.getText();
                var4 = (String) textView4.getText();

                button3.setVisibility(View.VISIBLE);
                button4.setVisibility(View.VISIBLE);
                button5.setVisibility(View.VISIBLE);
                button6.setVisibility(View.VISIBLE);

                Toast.makeText(MainActivity.this, "YOU SUCK", Toast.LENGTH_SHORT).show();

                int k ,i, j;

                for (i = 0; i <= 9; i++) {
                    if (color[i].equals(var1)) {
                        textView.setText("" );
                        button3.setBackgroundColor(listColors[i]);
                        button3.setText("" + i);
                        break;
                    }
                }
                for (j = 0; j <= 9; j++) {
                    if (color[j].equals(var2)) {
                        //textView2.setText("");
                        button4.setBackgroundColor(listColors[j]);
                        button4.setText("" + j);
                        break;
                    }
                }
                for ( k = 0; k <= 9; k++) {
                    if (color[k].equals(var3)) {
                        button5.setText("" + k);
                        button5.setBackgroundColor(listColors[k]);
                        break;
                    }
                }

                int kk = (int) Math.pow(10, k);
                float jj = ((i*10)+j)*(kk);

                if(jj < 1000 ){
                    textView3.setText("Ω" );
                    textView2.setText("" + jj);
                }else if (jj < 1000000 ){
                    textView3.setText("Kilo Ω" );
                    textView2.setText("" + jj/1000.0f);

                }else if (jj < 1000000000 ){
                    textView3.setText("Mega Ω" );
                    textView2.setText("" + jj/1000000.f);
                }/*else if (jj < .1 ){
                    textView3.setText("deci Ω" );
                    textView2.setText("" + jj/1000000.f);
                }else if (jj < .01 ){
                    textView3.setText("mili Ω" );
                    textView2.setText("" + jj/01.f);
                }    */


                for (i = 0; i <= 10; i++) {
                    if (color2[i].equals(var4)) {
                        if (i == 0) {
                            textView4.setText("±X%");
                            button6.setBackgroundColor(listColors[i]);
                            button6.setText("±X%");
                            break;//none
                        } else
                        if (i == 1){
                            textView4.setText("± 1%");
                            button6.setBackgroundColor(listColors[i]);
                            button6.setText("± 1%");
                            break;//brown
                        } else
                        if (i == 2) {
                            textView4.setText("± 2%");
                            button6.setBackgroundColor(listColors[i]);
                            button6.setText("± 2%");
                            break;//Red
                        }  else
                        if (i == 5) {
                            textView4.setText("± 0.5%");
                            button6.setBackgroundColor(listColors[i]);
                            button6.setText("± 0.5%");
                            break;//green
                        } else
                        if (i == 6) {
                            textView4.setText("± 0.25%");
                            button6.setBackgroundColor(listColors[i]);
                            button6.setText("± 0.25%");
                            break;//blue
                        } else
                        if(i == 7){
                            textView4.setText("± 0.1%");
                            button6.setBackgroundColor(listColors[i]);
                            button6.setText("± 0.1%");
                            break;//violet
                        } else
                        if (i == 8) {
                            textView4.setText("±0.05%");
                            button6.setBackgroundColor(listColors[i]);
                            button6.setText("± 0.05%");
                            break;//grey
                        } else
                        if(i == 10){
                            textView4.setText("± 5%");
                            button6.setBackgroundColor(listColors[12]);
                            button6.setText("± 5%");
                            break;//gold
                        }
                        if(i == 9){
                            textView4.setText("± 10%");
                            button6.setBackgroundColor(listColors[11]);
                            button6.setText("± 10%");
                            break;//silver
                        }}}}
        });

        Button btn1 = (Button) findViewById(R.id.buttonExit);//EXIT
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                try {
                    Thread.sleep(100);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finish();
                System.exit(0);
//                finishAffinity();
            }
        });
//////////////////////////////////////////////////////////////////////////////////////////////////////////
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clear();           }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openSetting();           }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openActivity3() ;
                }
        });
    }

    public void methodA() {
        Toast.makeText(getApplicationContext(), "Method A", Toast.LENGTH_SHORT).show();
        string text, text2 ,text3, text4;
        TextView textView = (TextView) findViewById(R.id.textView);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        final EditText editText = (EditText) findViewById(R.id.editText);

       // for (int i = 0; i <= 3; i++) {
            int val = 0;

            if (textView.getText().toString().equals("")) {
                textView.setText("" + var);
                editText.setText(" " + word);
                //break;
            } else if (textView2.getText().toString().equals("")) {
                textView2.setText("" + var);
                text = (string) textView.getText().toString();

                editText.setText(text +" " + word);
                //break;
            } else if (textView3.getText().toString().equals("")) {
                textView3.setText("" + var);
                text = (string) textView.getText().toString();
                text2 = (string) textView2.getText().toString();
                editText.setText(text + " "+ text2 + " " + word);
                collapse();
                //break;
            } else if (textView4.getText().toString().equals("")) {
                textView4.setText("±" + var+"%");
                text = (string) textView.getText().toString();
                text2 = (string) textView2.getText().toString();
                text3 = (string) textView3.getText().toString();
                editText.setText(text + " "+ text2 +" "+ text3+ " " + word);
                //break;
            }}//}

  public void methodB() {
    /*      buzz();
        Toast.makeText(getApplicationContext(), "Method B "+ word, Toast.LENGTH_SHORT).show();
        final EditText editText = (EditText) findViewById(R.id.editText);
        TextView textView = (TextView) findViewById(R.id.textView);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        TextView textView5 = (TextView) findViewById(R.id.textView5);
        String var1, var2, var3, var4;
        
        //for (int i = 0; i <= 3; i++) {
            if (editText.getText().toString().equals("")) {
                 editText.setText(" " + word);

                Toast.makeText(MainActivity.this, "Four Values are required", Toast.LENGTH_LONG).show();
                }else{
                String word = editText.getText().toString();
                try {
                    Scanner s = new Scanner(word).useDelimiter("\\s* \\s*");
                    textView.setText(s.next());
                    textView2.setText(s.next());
                    textView3.setText(s.next());
                    textView4.setText(s.next());
                }catch(Exception err){
                    //Toast.makeText(MainActivity.this, "Four Values are required", Toast.LENGTH_LONG).show();
                    Toast.makeText(MainActivity.this, "Dumb Shit", Toast.LENGTH_SHORT).show();
                }
                var1 = (String) textView.getText();
                var2 = (String) textView2.getText();
                var3 = (String) textView3.getText();
                var4 = (String) textView4.getText();
                //editText.setText(" " + var1 + " " + var2+" " + var3 + " " + var4);
                if (var1.equals("")){
                    editText.setText("one");
                   // editText.setText(var1);
                }else if (var2.equals("")&& !var1.equals("")){
                    editText.setText("two");
                    //editText.setText(var1+var2);
                }else if (var3.equals("")&& !var2.equals("")){
                    editText.setText("Three");
                    //editText.setText(var1+var2+var3);
                }else if (var4.equals("")&& !var3.equals("")){
                    //editText.setText("Four");
                    editText.setText(var1+var2 +var3+var4);
                }

            }   */}

    public void clear() {
        Toast.makeText(getApplicationContext(), "Clear", Toast.LENGTH_SHORT).show();
        TextView textView = (TextView) findViewById(R.id.textView);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        LinearLayout top = (LinearLayout) this.findViewById(R.id.topRow);
        LinearLayout btm = (LinearLayout) this.findViewById(R.id.btmRow);
        LinearLayout PER = (LinearLayout) this.findViewById(R.id.PER);
        final Button button3 = (Button) findViewById(R.id.buttonFirst);
        final Button button4 = (Button) findViewById(R.id.buttonSec);
        final Button button5 = (Button) findViewById(R.id.buttonMulti);
        final Button button6 = (Button) findViewById(R.id.buttonTol);
        final EditText editText = (EditText) findViewById(R.id.editText);

        editText.setText("");
        PER.setVisibility(View.GONE);
        top.setVisibility(View.VISIBLE);
        btm.setVisibility(View.VISIBLE);
        textView.setText("");
        textView2.setText("");
        textView3.setText("");
        textView4.setText("");
        button3.setVisibility(View.INVISIBLE);
        button4.setVisibility(View.INVISIBLE);
        button5.setVisibility(View.INVISIBLE);
        button6.setVisibility(View.INVISIBLE);

    }

    public <linearLayout> void collapse(){
            Toast.makeText(getApplicationContext(), "Test", Toast.LENGTH_SHORT).show();
        LinearLayout top = (LinearLayout) this.findViewById(R.id.topRow);
        LinearLayout btm = (LinearLayout) this.findViewById(R.id.btmRow);
//      ln.setBackgroundDrawable(getResources().getDrawable(R.drawable.red2small)); sets the bacground as small.png
        LinearLayout PER = (LinearLayout) this.findViewById(R.id.PER);

        PER.setVisibility(View.VISIBLE);
        top.setVisibility(View.GONE);
        btm.setVisibility(View.INVISIBLE);
        }
    public void Calc() {
           int val = 0;
           val = 2 + 2;
        buzz();
    }
        public void rando(){
}
        public void buzz(){

            Switch switch1;
           // final String SWITCH1 = "switch1";
            boolean switchOnOff = false;
            switch1 = (Switch) findViewById(R.id.switch1);
            switch1.setChecked(false);

      if(switchOnOff == true){
        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        // Vibrate for 400 milliseconds
        v.vibrate(20);
        Toast.makeText(MainActivity.this, "Buzz", Toast.LENGTH_LONG).show();

       }}
    public void edit(){
        // if
    }
    public void saveLast(){
        // if
    }
    public void saveCustom(){
        // if
    }

    class MyGestureListener extends GestureDetector.SimpleOnGestureListener {

        @Override
        public boolean onDown(MotionEvent event) {
            Log.d("TAG","onDown: ");
            Toast.makeText(MainActivity.this, "onDown", Toast.LENGTH_LONG).show();
            // don't return false here or else none of the other
            // gestures will work
            return true;
        }

        @Override
        public boolean onSingleTapConfirmed(MotionEvent e) {
            Log.i("TAG", "onSingleTapConfirmed: ");
            Toast.makeText(MainActivity.this, "onSingleTapConfirmed", Toast.LENGTH_LONG).show();
            return true;
        }

        @Override
        public void onLongPress(MotionEvent e) {
            Log.i("TAG", "onLongPress: ");
            Toast.makeText(MainActivity.this, "onLongPress", Toast.LENGTH_LONG).show();

        }

        @Override
        public boolean onDoubleTap(MotionEvent e) {
            Log.i("TAG", "onDoubleTap: ");
            Toast.makeText(MainActivity.this, "onDoubleTap", Toast.LENGTH_LONG).show();

            return true;
        }

        @Override
        public boolean onScroll(MotionEvent e1, MotionEvent e2,
                                float distanceX, float distanceY) {
            Log.i("TAG", "onScroll: ");
            Toast.makeText(MainActivity.this, "onScroll", Toast.LENGTH_LONG).show();

            return true;
        }

        @Override
        public boolean onFling(MotionEvent event1, MotionEvent event2,
                               float velocityX, float velocityY) {
            Log.d("TAG", "onFling: ");
            Toast.makeText(MainActivity.this, "onSingleTapConfirmed", Toast.LENGTH_LONG).show();

            return true;
        }
    }

    public void methodC() {
        //Toast.makeText(getApplicationContext(), "Method Calc", Toast.LENGTH_SHORT).show();
        TextView textView = (TextView) findViewById(R.id.textView);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        textView.setText("");
        textView2.setText("");
        textView3.setText("");
        textView4.setText("");
    }
    public  void calc2(){
        final TextView textView = (TextView) findViewById(R.id.textView);
        final TextView textView2 = (TextView) findViewById(R.id.textView2);
        final TextView textView3 = (TextView) findViewById(R.id.textView3);
        final TextView textView4 = (TextView) findViewById(R.id.textView4);
        final TextView textView5 = (TextView) findViewById(R.id.textView5);
        String val1, val2, val3, val4, val5;

        val1 = textView.getText().toString();
        val2 = textView2.getText().toString();
        val3 = textView3.getText().toString();
        val4 = textView4.getText().toString();
        textView5.setText("" + val1 +  val2 + val3+ val4);
        val5 = textView5.getText().toString();
    }

    /*public void openActivity2(){
        EditText editText = findViewById(R.id.editText);
        //TextView textView5 = findViewById(R.id.textView5);
        //int text = textView5.getText().toString();
        String text = editText.getText().toString();
        //EditText edittext2 = findViewById(R.id.edittext2);
         string text = Integer.parseInt(editText.getText().toString());
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra(EXTRA_TEXT, text);
        //intent.putExtra(EXTRA_NUM, number);
        startActivity(intent);
    //final*/

       public void openSetting(){
       Intent intent = new Intent(this, Setting.class);
       startActivity(intent);
   }
       public void openActivity3(){
       Intent intent = new Intent(this, Activity2.class);
       startActivity(intent);
   }
    public void calc(){




       }


}
