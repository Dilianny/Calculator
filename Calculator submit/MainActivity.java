package com.example.diana.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double first = 0, second = 0;
    TextView show;
    Button button, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16;
    boolean Addition, Subtraction, Multiplication, Division;

    public void numbers(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.button6:
                show.setText(show.getText() + "0");
                break;
            case R.id.button7:
                show.setText(show.getText() + "1");
                break;
            case R.id.button9:
                show.setText(show.getText() + "3");
                break;
            case R.id.button10:
                show.setText(show.getText() + "2");
                break;
            case R.id.button11:
                show.setText(show.getText() + "4");
                break;
            case R.id.button12:
                show.setText(show.getText() + "5");
                break;
            case R.id.button13:
                show.setText(show.getText() + "6");
                break;
            case R.id.button14:
                show.setText(show.getText() + "7");
                break;
            case R.id.button15:
                show.setText(show.getText() + "8");
                break;
            case R.id.button16:
                show.setText(show.getText() + "9");
                break;
        }
    }

    public void operations(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.button5:
                if (show.getText().length() != 0) {
                    first = Float.parseFloat(show.getText() + "");
                    Addition = true;
                    show.setText(null);
                }
                break;
            case R.id.button2:
                if (show.getText().length() != 0) {
                    first = Float.parseFloat(show.getText() + "");
                    Subtraction = true;
                    show.setText(null);
                }
                break;
            case R.id.button3:
                if (show.getText().length() != 0) {
                    first = Float.parseFloat(show.getText() + "");
                    Division = true;
                    show.setText(null);
                }
                break;
            case R.id.button4:
                if (show.getText().length() != 0) {
                    first = Float.parseFloat(show.getText() + "");
                    Multiplication = true;
                    show.setText(null);
                }
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    button =(Button) findViewById(R.id.button);
    button2 =(Button) findViewById(R.id.button2);
    button3 =(Button) findViewById(R.id.button3);
    button4 =(Button) findViewById(R.id.button4);
    button5 =(Button) findViewById(R.id.button5);
    button6 =(Button) findViewById(R.id.button6);
    button7 =(Button) findViewById(R.id.button7);
    button8 =(Button) findViewById(R.id.button8);
    button9 =(Button) findViewById(R.id.button9);
    button10 =(Button) findViewById(R.id.button10);
    button11 =(Button) findViewById(R.id.button11);
    button12 =(Button) findViewById(R.id.button12);
    button13 =(Button) findViewById(R.id.button13);
    button14 =(Button) findViewById(R.id.button14);
    button15 =(Button) findViewById(R.id.button15);
    button16 =(Button) findViewById(R.id.button16);
    show =(TextView) findViewById(R.id.editText);

        /* button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show.setText(show.getText() + "0");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show.setText(show.getText() + "1");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show.setText(show.getText() + "3");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show.setText(show.getText() + "2");
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show.setText(show.getText() + "4");
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show.setText(show.getText() + "5");
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show.setText(show.getText() + "6");
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show.setText(show.getText() + "7");
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show.setText(show.getText() + "8");
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show.setText(show.getText() + "9");
            }
        });

        button5.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        if (show.getText().length() != 0) {
            first = Float.parseFloat(show.getText() + "");
            Addition = true;
            show.setText(null);
        }
    }
    });
        button2.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        if (show.getText().length() != 0) {
            first = Float.parseFloat(show.getText() + "");
            Subtraction = true;
            show.setText(null);
        }
    }
    });
        button3.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        if (show.getText().length() != 0) {
            first = Float.parseFloat(show.getText() + "");
            Division = true;
            show.setText(null);
        }
    }
    });
        button4.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        if (show.getText().length() != 0) {
            first = Float.parseFloat(show.getText() + "");
            Multiplication = true;
            show.setText(null);
        }
    }
    }); */
        button.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        if (Addition || Subtraction || Multiplication || Division) {
            second = Float.parseFloat(show.getText() + "");
        }

        if (Addition) {

            show.setText(first + second + "");
            Addition = false;
        }

        if (Subtraction) {

            show.setText(first - second + "");
            Subtraction = false;
        }

        if (Multiplication) {
            show.setText(first * second + "");
            Multiplication = false;
        }

        if (Division) {
            show.setText(first / second + "");
            Division = false;
        }
    }
    });
        button8.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        show.setText("");
        first = 0.0;
        second = 0.0;
    }
    });

}
}
