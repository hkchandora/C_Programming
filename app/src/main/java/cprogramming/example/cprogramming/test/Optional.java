package cprogramming.example.cprogramming.test;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class Optional extends AppCompatActivity implements View.OnClickListener {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25;
    RadioGroup g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, g12, g13, g14, g15, g16, g17, g18, g19, g20, g21, g22, g23, g24, g25;
    TextView t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25;
    RadioButton ansredioBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_optional);

        t1 = (TextView) findViewById(R.id.textView5);
        t2 = (TextView) findViewById(R.id.textView232);
        t3 = (TextView) findViewById(R.id.textView233);
        t4 = (TextView) findViewById(R.id.textView234);
        t5 = (TextView) findViewById(R.id.textView235);
        t6 = (TextView) findViewById(R.id.textView236);
        t7 = (TextView) findViewById(R.id.textView237);
        t8 = (TextView) findViewById(R.id.textView238);
        t9 = (TextView) findViewById(R.id.textView239);
        t10 = (TextView) findViewById(R.id.textView240);
        t11 = (TextView) findViewById(R.id.textView241);
        t12 = (TextView) findViewById(R.id.textView242);
        t13 = (TextView) findViewById(R.id.textView243);
        t14 = (TextView) findViewById(R.id.textView244);
        t15 = (TextView) findViewById(R.id.textView245);
        t16 = (TextView) findViewById(R.id.textView246);
        t17 = (TextView) findViewById(R.id.textView247);
        t18 = (TextView) findViewById(R.id.textView248);
        t19 = (TextView) findViewById(R.id.textView249);
        t20 = (TextView) findViewById(R.id.textView250);
        t21 = (TextView) findViewById(R.id.textView251);
        t22 = (TextView) findViewById(R.id.textView252);
        t23 = (TextView) findViewById(R.id.textView253);
        t24 = (TextView) findViewById(R.id.textView254);
        t25 = (TextView) findViewById(R.id.textView255);


        g1 = (RadioGroup) findViewById(R.id.radioGroup1);
        g2 = (RadioGroup) findViewById(R.id.radioGroup2);
        g3 = (RadioGroup) findViewById(R.id.radioGroup3);
        g4 = (RadioGroup) findViewById(R.id.radioGroup4);
        g5 = (RadioGroup) findViewById(R.id.radioGroup5);
        g6 = (RadioGroup) findViewById(R.id.radioGroup6);
        g7 = (RadioGroup) findViewById(R.id.radioGroup7);
        g8 = (RadioGroup) findViewById(R.id.radioGroup8);
        g9 = (RadioGroup) findViewById(R.id.radioGroup9);
        g10 = (RadioGroup) findViewById(R.id.radioGroup10);
        g11 = (RadioGroup) findViewById(R.id.radioGroup11);
        g12 = (RadioGroup) findViewById(R.id.radioGroup12);
        g13 = (RadioGroup) findViewById(R.id.radioGroup13);
        g14 = (RadioGroup) findViewById(R.id.radioGroup14);
        g15 = (RadioGroup) findViewById(R.id.radioGroup15);
        g16 = (RadioGroup) findViewById(R.id.radioGroup16);
        g17 = (RadioGroup) findViewById(R.id.radioGroup17);
        g18 = (RadioGroup) findViewById(R.id.radioGroup18);
        g19 = (RadioGroup) findViewById(R.id.radioGroup19);
        g20 = (RadioGroup) findViewById(R.id.radioGroup20);
        g21 = (RadioGroup) findViewById(R.id.radioGroup21);
        g22 = (RadioGroup) findViewById(R.id.radioGroup22);
        g23 = (RadioGroup) findViewById(R.id.radioGroup23);
        g24 = (RadioGroup) findViewById(R.id.radioGroup24);
        g25 = (RadioGroup) findViewById(R.id.radioGroup25);


        b1 = (Button) findViewById(R.id.button137);
        b1.setOnClickListener(this);
        b2 = (Button) findViewById(R.id.button138);
        b2.setOnClickListener(this);
        b3 = (Button) findViewById(R.id.button139);
        b3.setOnClickListener(this);
        b4 = (Button) findViewById(R.id.button140);
        b4.setOnClickListener(this);
        b5 = (Button) findViewById(R.id.button141);
        b5.setOnClickListener(this);
        b6 = (Button) findViewById(R.id.button142);
        b6.setOnClickListener(this);
        b7 = (Button) findViewById(R.id.button143);
        b7.setOnClickListener(this);
        b8 = (Button) findViewById(R.id.button144);
        b8.setOnClickListener(this);
        b9 = (Button) findViewById(R.id.button145);
        b9.setOnClickListener(this);
        b10 = (Button) findViewById(R.id.button146);
        b10.setOnClickListener(this);
        b11 = (Button) findViewById(R.id.button147);
        b11.setOnClickListener(this);
        b12 = (Button) findViewById(R.id.button148);
        b12.setOnClickListener(this);
        b13 = (Button) findViewById(R.id.button149);
        b13.setOnClickListener(this);
        b14 = (Button) findViewById(R.id.button150);
        b14.setOnClickListener(this);
        b15 = (Button) findViewById(R.id.button151);
        b15.setOnClickListener(this);
        b16 = (Button) findViewById(R.id.button152);
        b16.setOnClickListener(this);
        b17 = (Button) findViewById(R.id.button153);
        b17.setOnClickListener(this);
        b18 = (Button) findViewById(R.id.button154);
        b18.setOnClickListener(this);
        b19 = (Button) findViewById(R.id.button155);
        b19.setOnClickListener(this);
        b20 = (Button) findViewById(R.id.button156);
        b20.setOnClickListener(this);
        b21 = (Button) findViewById(R.id.button157);
        b21.setOnClickListener(this);
        b22 = (Button) findViewById(R.id.button158);
        b22.setOnClickListener(this);
        b23 = (Button) findViewById(R.id.button159);
        b23.setOnClickListener(this);
        b24 = (Button) findViewById(R.id.button160);
        b24.setOnClickListener(this);
        b25 = (Button) findViewById(R.id.button161);
        b25.setOnClickListener(this);


        t1.setText("1) Which of the following is not a valid variable name declaration?");
        t2.setText("2) All keywords in C are in ____________");
        t3.setText("3) Which of the following is not a valid C variable name?");
        t4.setText("4) What is the problem in following variable declaration?\n" +
                "float 3Bedroom-Hall-Kitchen?;");
        t5.setText("5) The format identifier ‘%i’ is also used for _____ data type.");
        t6.setText("6) What is the size of an float data type?");
        t7.setText("7) What will be the final value of x in the following C code?\n" +
                "    #include <stdio.h>\n" +
                "    void main()\n" +
                "    {\n" +
                "        int x = 5 * 9 / 3 + 9;\n" +
                "    }");
        t8.setText("8) Which of the following declaration is illegal?");
        t9.setText("9) Which of the following is not a pointer declaration?");
        t10.setText("10)  Relational operators cannot be used on ____________");
        t11.setText("11) Which among the following is NOT a logical or relational operator?");
        t12.setText("12) What will be the output of the following C code?\n" +
                "    #include <stdio.h>\n" +
                "    int main()\n" +
                "    {\n" +
                "        int a = 1, b = 1, c;\n" +
                "        c = a++ + b;\n" +
                "        printf(\"%d, %d\", a, b);\n" +
                "    }");
        t13.setText("13) What will be the final value of c in the following C code snippet? (Initial values: a = 1, b = 2, c = 1)\n" +
                "       c += (-c) ? a : b;");
        t14.setText("14) What will be the output of the following C code?\n" +
                "    #include <stdio.h>\n" +
                "    int main()\n" +
                "    {\n" +
                "        int x = 0;\n" +
                "        if (x == 0)\n" +
                "            printf(\"true, \");\n" +
                "        else if (x = 10)\n" +
                "            printf(\"false, \");\n" +
                "        printf(\"%d\\n\", x);\n" +
                "    }");
        t15.setText("15) The C code ‘for(;;)’ represents an infinite loop. It can be terminated by ___________");
        t16.setText("16) How many times i value is checked in the following C code?\n" +
                "    #include <stdio.h>\n" +
                "    int main()\n" +
                "    {\n" +
                "        int i = 0;\n" +
                "        do {\n" +
                "            i++;\n" +
                "            printf(\"in while loop\\n\");\n" +
                "        } while (i < 3);\n" +
                "    }");
        t17.setText("17) What is the default return type if it is not specified in function definition?");
        t18.setText("18) Functions can return enumeration constants in C?");
        t19.setText("19) What is #include <stdio.h>?");
        t20.setText("20) C preprocessors can have compiler specific features.");
        t21.setText("21) Which of the following are C preprocessors?");
        t22.setText("22) #include statement must be written __________");
        t23.setText("23) What is the sequence for preprocessor to look for the file within <>?");
        t24.setText("24) Comment on the output of the following C code.\n" +
                "    #include <stdio.h>\n" +
                "    #include \"test.h\"\n" +
                "    #include \"test.h\"\n" +
                "    int main()\n" +
                "    {\n" +
                "        //some code\n" +
                "    }");
        t25.setText("25) The size of a union is determined by the size of the __________");


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Questions");
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimary)));
    }


    public void showMyToast(final Toast toast, final int delay) {
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                toast.show();
            }
        }, 0, 1500);
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                toast.cancel();
                timer.cancel();
            }
        }, delay);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onClick(View v) {
        if (v == b1) {
            int selectedId = g1.getCheckedRadioButtonId();
            ansredioBtn = (RadioButton) findViewById(selectedId);
            if (ansredioBtn == (RadioButton) findViewById(R.id.radioButton3)) {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.right, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            } else {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.wrong, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);
            }
        }

        if (v == b2) {
            int selectedId = g2.getCheckedRadioButtonId();
            ansredioBtn = (RadioButton) findViewById(selectedId);
            if (ansredioBtn == (RadioButton) findViewById(R.id.radioButton5)) {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.right, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            } else {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.wrong, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);
            }
        }

        if (v == b3) {
            int selectedId = g3.getCheckedRadioButtonId();
            ansredioBtn = (RadioButton) findViewById(selectedId);
            if (ansredioBtn == (RadioButton) findViewById(R.id.radioButton12)) {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.right, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            } else {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.wrong, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            }
        }

        if (v == b4) {
            int selectedId = g4.getCheckedRadioButtonId();
            ansredioBtn = (RadioButton) findViewById(selectedId);
            if (ansredioBtn == (RadioButton) findViewById(R.id.radioButton16)) {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.right, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            } else {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.wrong, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            }
        }

        if (v == b5) {
            int selectedId = g5.getCheckedRadioButtonId();
            ansredioBtn = (RadioButton) findViewById(selectedId);
            if (ansredioBtn == (RadioButton) findViewById(R.id.radioButton18)) {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.right, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            } else {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.wrong, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);
            }

        }

        if (v == b6) {
            int selectedId = g6.getCheckedRadioButtonId();
            ansredioBtn = (RadioButton) findViewById(selectedId);
            if (ansredioBtn == (RadioButton) findViewById(R.id.radioButton21)) {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.right, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            } else {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.wrong, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            }
        }

        if (v == b7) {
            int selectedId = g7.getCheckedRadioButtonId();
            ansredioBtn = (RadioButton) findViewById(selectedId);
            if (ansredioBtn == (RadioButton) findViewById(R.id.radioButton27)) {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.right, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            } else {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.wrong, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            }
        }

        if (v == b8) {
            int selectedId = g8.getCheckedRadioButtonId();
            ansredioBtn = (RadioButton) findViewById(selectedId);
            if (ansredioBtn == (RadioButton) findViewById(R.id.radioButton32)) {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.right, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            } else {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.wrong, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            }
        }

        if (v == b9) {
            int selectedId = g9.getCheckedRadioButtonId();
            ansredioBtn = (RadioButton) findViewById(selectedId);
            if (ansredioBtn == (RadioButton) findViewById(R.id.radioButton36)) {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.right, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            } else {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.wrong, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            }
        }

        if (v == b10) {
            int selectedId = g10.getCheckedRadioButtonId();
            ansredioBtn = (RadioButton) findViewById(selectedId);
            if (ansredioBtn == (RadioButton) findViewById(R.id.radioButton37)) {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.right, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            } else {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.wrong, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            }
        }

        if (v == b11) {
            int selectedId = g11.getCheckedRadioButtonId();
            ansredioBtn = (RadioButton) findViewById(selectedId);
            if (ansredioBtn == (RadioButton) findViewById(R.id.radioButton44)) {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.right, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            } else {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.wrong, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);
            }
        }

        if (v == b12) {
            int selectedId = g12.getCheckedRadioButtonId();
            ansredioBtn = (RadioButton) findViewById(selectedId);
            if (ansredioBtn == (RadioButton) findViewById(R.id.radioButton46)) {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.right, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            } else {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.wrong, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            }
        }

        if (v == b13) {
            int selectedId = g13.getCheckedRadioButtonId();
            ansredioBtn = (RadioButton) findViewById(selectedId);
            if (ansredioBtn == (RadioButton) findViewById(R.id.radioButton51)) {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.right, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            } else {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.wrong, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            }
        }

        if (v == b14) {
            int selectedId = g14.getCheckedRadioButtonId();
            ansredioBtn = (RadioButton) findViewById(selectedId);
            if (ansredioBtn == (RadioButton) findViewById(R.id.radioButton54)) {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.right, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            } else {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.wrong, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            }
        }

        if (v == b15) {
            int selectedId = g15.getCheckedRadioButtonId();
            ansredioBtn = (RadioButton) findViewById(selectedId);
            if (ansredioBtn == (RadioButton) findViewById(R.id.radioButton57)) {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.right, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            } else {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.wrong, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            }
        }

        if (v == b16) {
            int selectedId = g16.getCheckedRadioButtonId();
            ansredioBtn = (RadioButton) findViewById(selectedId);
            if (ansredioBtn == (RadioButton) findViewById(R.id.radioButton63)) {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.right, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            } else {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.wrong, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            }
        }

        if (v == b17) {
            int selectedId = g17.getCheckedRadioButtonId();
            ansredioBtn = (RadioButton) findViewById(selectedId);
            if (ansredioBtn == (RadioButton) findViewById(R.id.radioButton66)) {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.right, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            } else {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.wrong, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            }
        }

        if (v == b18) {
            int selectedId = g18.getCheckedRadioButtonId();
            ansredioBtn = (RadioButton) findViewById(selectedId);
            if (ansredioBtn == (RadioButton) findViewById(R.id.radioButton69)) {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.right, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            } else {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.wrong, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            }
        }

        if (v == b19) {
            int selectedId = g19.getCheckedRadioButtonId();
            ansredioBtn = (RadioButton) findViewById(selectedId);
            if (ansredioBtn == (RadioButton) findViewById(R.id.radioButton73)) {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.right, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            } else {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.wrong, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            }
        }

        if (v == b20) {
            int selectedId = g20.getCheckedRadioButtonId();
            ansredioBtn = (RadioButton) findViewById(selectedId);
            if (ansredioBtn == (RadioButton) findViewById(R.id.radioButton77)) {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.right, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            } else {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.wrong, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            }
        }

        if (v == b21) {
            int selectedId = g21.getCheckedRadioButtonId();
            ansredioBtn = (RadioButton) findViewById(selectedId);
            if (ansredioBtn == (RadioButton) findViewById(R.id.radioButton84)) {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.right, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            } else {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.wrong, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            }
        }

        if (v == b22) {
            int selectedId = g22.getCheckedRadioButtonId();
            ansredioBtn = (RadioButton) findViewById(selectedId);
            if (ansredioBtn == (RadioButton) findViewById(R.id.radioButton86)) {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.right, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            } else {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.wrong, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            }
        }

        if (v == b23) {
            int selectedId = g23.getCheckedRadioButtonId();
            ansredioBtn = (RadioButton) findViewById(selectedId);
            if (ansredioBtn == (RadioButton) findViewById(R.id.radioButton89)) {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.right, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            } else {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.wrong, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            }
        }

        if (v == b24) {
            int selectedId = g24.getCheckedRadioButtonId();
            ansredioBtn = (RadioButton) findViewById(selectedId);
            if (ansredioBtn == (RadioButton) findViewById(R.id.radioButton94)) {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.right, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            } else {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.wrong, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            }
        }

        if (v == b25) {
            int selectedId = g25.getCheckedRadioButtonId();
            ansredioBtn = (RadioButton) findViewById(selectedId);
            if (ansredioBtn == (RadioButton) findViewById(R.id.radioButton99)) {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.right, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            } else {
                Context context = getApplicationContext();
                LayoutInflater inflater = getLayoutInflater();

                View toastRoot = inflater.inflate(R.layout.wrong, null);

                Toast toast = new Toast(context);

                toast.setView(toastRoot);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                showMyToast(toast, 800);

            }
        }

    }
}
