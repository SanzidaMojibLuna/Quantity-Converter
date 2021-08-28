package com.example.tcc.converter;

import android.content.DialogInterface;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.app.AlertDialog;
import android.widget.Spinner;

public class mainpage extends Activity {
    private Button button3;
    CheckBox ch1,ch2,ch3,ch4,ch5,ch6,ch7;
    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7,ed8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);
        Spinner dropdown = findViewById(R.id.spinner1);
        String[] items = new String[]{"Mtr", "NMi", "Mile","Yd","Ft","Sqft","In"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);
        ch1=(CheckBox)findViewById(R.id.checkBox);
        ch2=(CheckBox)findViewById(R.id.checkBox2);
        ch3=(CheckBox)findViewById(R.id.checkBox3);
        ch4=(CheckBox)findViewById(R.id.checkBox4);
        ch5=(CheckBox)findViewById(R.id.checkBox5);
        ch6=(CheckBox)findViewById(R.id.checkBox6);
        ch7=(CheckBox)findViewById(R.id.checkBox7);
        ed1=(EditText)findViewById(R.id.editText1);
        ed2=(EditText)findViewById(R.id.editText2);
        ed3=(EditText)findViewById(R.id.editText3);
        ed4=(EditText)findViewById(R.id.editText4);
        ed5=(EditText)findViewById(R.id.editText5);
        ed6=(EditText)findViewById(R.id.editText6);
        ed7=(EditText)findViewById(R.id.editText7);
        ed8=(EditText)findViewById(R.id.editText8);
        final EditText editText = (EditText)findViewById(R.id.editText2);

        button3 = findViewById(R.id.button3);
        dropdown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedClass = parent.getItemAtPosition(position).toString();
                switch (selectedClass) {
                    case "Mtr":
                        ed1.setHint("Meter");
                        break;

                    case "NMi":
                        ed1.setHint("Nauticle Mile");
                        break;

                    case "Mile":
                        ed1.setHint("Mile");
                        break;

                    case "Yd":
                        ed1.setHint("Yard");
                        break;

                    case "Ft":
                        ed1.setHint("Feet");
                        break;

                    case "Sqft":
                        ed1.setHint("Square Foot");
                        break;

                    case "In":
                        ed1.setHint("Inch");
                        break;


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {
                ed1.setHint("");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s =ed1.getText().toString();
                if (s.matches("")) {
                    new AlertDialog.Builder(mainpage.this)
                            .setTitle("No Input!!")
                            .setMessage("Please enter an input to convert")
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {

                                    dialog.cancel();
                                }
                            }).show();
                }
                else {
                    double res;
                    if(ed1.getHint().toString()=="Meter"){
                    if (ch1.isChecked()) {
                        String value = ed1.getText().toString();
                        double a;
                        a = Double.parseDouble(value);
                        res = calculator.mtr2nmi(a);
                        String r = String.valueOf(res);
                        ed2.setText(r);
                    } else if (ch1.isChecked() == false) {
                        ed2.setText("");
                    }
                    if (ch2.isChecked()) {
                        String value = ed1.getText().toString();
                        double a;
                        a = Double.parseDouble(value);
                        res = calculator.mtr2miles(a);
                        String r = String.valueOf(res);
                        ed3.setText(r);
                    } else if (ch2.isChecked() == false) {
                        ed3.setText("");
                    }

                    if (ch3.isChecked()) {
                        String value = ed1.getText().toString();
                        double a;
                        a = Double.parseDouble(value);
                        res = calculator.mtr2yd(a);
                        String r = String.valueOf(res);
                        ed4.setText(r);
                    } else if (ch3.isChecked() == false) {
                        ed4.setText("");
                    }
                    if (ch4.isChecked()) {
                        String value = ed1.getText().toString();
                        double a;
                        a = Double.parseDouble(value);
                        res = calculator.mtr2ft(a);
                        String r = String.valueOf(res);
                        ed5.setText(r);
                    } else if (ch4.isChecked() == false) {
                        ed5.setText("");
                    }
                    if (ch5.isChecked()) {
                        String value = ed1.getText().toString();
                        double a;
                        a = Double.parseDouble(value);
                        res = calculator.mtr2in(a);
                        String r = String.valueOf(res);
                        ed6.setText(r);
                    } else if (ch5.isChecked() == false) {
                        ed6.setText("");
                    }
                    if (ch6.isChecked()) {
                        String value = ed1.getText().toString();
                        double a;
                        a = Double.parseDouble(value);
                        res = calculator.mtr2sqft(a);
                        String r = String.valueOf(res);
                        ed7.setText(r);
                    } else if (ch6.isChecked() == false) {
                        ed7.setText("");
                    }
                        if (ch7.isChecked()) {
                            String value = ed1.getText().toString();
                            double a;
                            a = Double.parseDouble(value);
                            res = calculator.mtr2mtr(a);
                            String r = String.valueOf(res);
                            ed8.setText(r);
                        } else if (ch7.isChecked() == false) {
                            ed8.setText("");
                        }

                    }
                   else if(ed1.getHint().toString()=="Nauticle Mile"){
                        if (ch1.isChecked()) {
                            String value = ed1.getText().toString();
                            double a;
                            a = Double.parseDouble(value);
                            res = calculator.mtr2mtr(a);
                            String r = String.valueOf(res);
                            ed2.setText(r);
                        } else if (ch1.isChecked() == false) {
                            ed2.setText("");
                        }
                        if (ch2.isChecked()) {
                            String value = ed1.getText().toString();
                            double a;
                            a = Double.parseDouble(value);
                            res = calculator.nmi2mile(a);
                            String r = String.valueOf(res);
                            ed3.setText(r);
                        } else if (ch2.isChecked() == false) {
                            ed3.setText("");
                        }

                        if (ch3.isChecked()) {
                            String value = ed1.getText().toString();
                            double a;
                            a = Double.parseDouble(value);
                            res = calculator.nmi2yd(a);
                            String r = String.valueOf(res);
                            ed4.setText(r);
                        } else if (ch3.isChecked() == false) {
                            ed4.setText("");
                        }
                        if (ch4.isChecked()) {
                            String value = ed1.getText().toString();
                            double a;
                            a = Double.parseDouble(value);
                            res = calculator.nmi2ft(a);
                            String r = String.valueOf(res);
                            ed5.setText(r);
                        } else if (ch4.isChecked() == false) {
                            ed5.setText("");
                        }
                        if (ch5.isChecked()) {
                            String value = ed1.getText().toString();
                            double a;
                            a = Double.parseDouble(value);
                            res = calculator.nmi2in(a);
                            String r = String.valueOf(res);
                            ed6.setText(r);
                        } else if (ch5.isChecked() == false) {
                            ed6.setText("");
                        }
                        if (ch6.isChecked()) {
                            String value = ed1.getText().toString();
                            double a;
                            a = Double.parseDouble(value);
                            res = calculator.nmi2sqft(a);
                            String r = String.valueOf(res);
                            ed7.setText(r);
                        } else if (ch6.isChecked() == false) {
                            ed7.setText("");
                        }
                        if (ch7.isChecked()) {
                            String value = ed1.getText().toString();
                            double a;
                            a = Double.parseDouble(value);
                            res = calculator.nmi2mtr(a);
                            String r = String.valueOf(res);
                            ed8.setText(r);
                        } else if (ch7.isChecked() == false) {
                            ed8.setText("");
                        }
                    }
                    else if(ed1.getHint().toString()=="Mile"){
                        if (ch1.isChecked()) {
                            String value = ed1.getText().toString();
                            double a;
                            a = Double.parseDouble(value);
                            res = calculator.mile2nmi(a);
                            String r = String.valueOf(res);
                            ed2.setText(r);
                        } else if (ch1.isChecked() == false) {
                            ed2.setText("");
                        }
                        if (ch2.isChecked()) {
                            String value = ed1.getText().toString();
                            double a;
                            a = Double.parseDouble(value);
                            res = calculator.mtr2mtr(a);
                            String r = String.valueOf(res);
                            ed3.setText(r);
                        } else if (ch2.isChecked() == false) {
                            ed3.setText("");
                        }

                        if (ch3.isChecked()) {
                            String value = ed1.getText().toString();
                            double a;
                            a = Double.parseDouble(value);
                            res = calculator.mile2yd(a);
                            String r = String.valueOf(res);
                            ed4.setText(r);
                        } else if (ch3.isChecked() == false) {
                            ed4.setText("");
                        }
                        if (ch4.isChecked()) {
                            String value = ed1.getText().toString();
                            double a;
                            a = Double.parseDouble(value);
                            res = calculator.mile2ft(a);
                            String r = String.valueOf(res);
                            ed5.setText(r);
                        } else if (ch4.isChecked() == false) {
                            ed5.setText("");
                        }
                        if (ch5.isChecked()) {
                            String value = ed1.getText().toString();
                            double a;
                            a = Double.parseDouble(value);
                            res = calculator.mile2in(a);
                            String r = String.valueOf(res);
                            ed6.setText(r);
                        } else if (ch5.isChecked() == false) {
                            ed6.setText("");
                        }
                        if (ch6.isChecked()) {
                            String value = ed1.getText().toString();
                            double a;
                            a = Double.parseDouble(value);
                            res = calculator.mile2sqft(a);
                            String r = String.valueOf(res);
                            ed7.setText(r);
                        } else if (ch6.isChecked() == false) {
                            ed7.setText("");
                        }
                        if (ch7.isChecked()) {
                            String value = ed1.getText().toString();
                            double a;
                            a = Double.parseDouble(value);
                            res = calculator.mile2mtr(a);
                            String r = String.valueOf(res);
                            ed8.setText(r);
                        } else if (ch7.isChecked() == false) {
                            ed8.setText("");
                        }
                    }
                    else if(ed1.getHint().toString()=="Feet"){
                        if (ch1.isChecked()) {
                            String value = ed1.getText().toString();
                            double a;
                            a = Double.parseDouble(value);
                            res = calculator.ft2nmi(a);
                            String r = String.valueOf(res);
                            ed2.setText(r);
                        } else if (ch1.isChecked() == false) {
                            ed2.setText("");
                        }
                        if (ch2.isChecked()) {
                            String value = ed1.getText().toString();
                            double a;
                            a = Double.parseDouble(value);
                            res = calculator.ft2mile(a);
                            String r = String.valueOf(res);
                            ed3.setText(r);
                        } else if (ch2.isChecked() == false) {
                            ed3.setText("");
                        }

                        if (ch3.isChecked()) {
                            String value = ed1.getText().toString();
                            double a;
                            a = Double.parseDouble(value);
                            res = calculator.ft2yd(a);
                            String r = String.valueOf(res);
                            ed4.setText(r);
                        } else if (ch3.isChecked() == false) {
                            ed4.setText("");
                        }
                        if (ch4.isChecked()) {
                            String value = ed1.getText().toString();
                            double a;
                            a = Double.parseDouble(value);
                            res = calculator.mtr2mtr(a);
                            String r = String.valueOf(res);
                            ed5.setText(r);
                        } else if (ch4.isChecked() == false) {
                            ed5.setText("");
                        }
                        if (ch5.isChecked()) {
                            String value = ed1.getText().toString();
                            double a;
                            a = Double.parseDouble(value);
                            res = calculator.ft2in(a);
                            String r = String.valueOf(res);
                            ed6.setText(r);
                        } else if (ch5.isChecked() == false) {
                            ed6.setText("");
                        }
                        if (ch6.isChecked()) {
                           /* String value = ed1.getText().toString();
                            double a;
                            a = Double.parseDouble(value);
                            res = calculator.ft2sqft(a);
                            String r = String.valueOf(res);*/
                            ed7.setText("not convertable");
                        } else if (ch6.isChecked() == false) {
                            ed7.setText("");
                        }
                        if (ch7.isChecked()) {
                            String value = ed1.getText().toString();
                            double a;
                            a = Double.parseDouble(value);
                            res = calculator.ft2mtr(a);
                            String r = String.valueOf(res);
                            ed8.setText(r);
                        } else if (ch7.isChecked() == false) {
                            ed8.setText("");
                        }
                    }
                    else if(ed1.getHint().toString()=="Inch"){
                        if (ch1.isChecked()) {
                            String value = ed1.getText().toString();
                            double a;
                            a = Double.parseDouble(value);
                            res = calculator.in2nmi(a);
                            String r = String.valueOf(res);
                            ed2.setText(r);
                        } else if (ch1.isChecked() == false) {
                            ed2.setText("");
                        }
                        if (ch2.isChecked()) {
                            String value = ed1.getText().toString();
                            double a;
                            a = Double.parseDouble(value);
                            res = calculator.in2mile(a);
                            String r = String.valueOf(res);
                            ed3.setText(r);
                        } else if (ch2.isChecked() == false) {
                            ed3.setText("");
                        }

                        if (ch3.isChecked()) {
                            String value = ed1.getText().toString();
                            double a;
                            a = Double.parseDouble(value);
                            res = calculator.in2yd(a);
                            String r = String.valueOf(res);
                            ed4.setText(r);
                        } else if (ch3.isChecked() == false) {
                            ed4.setText("");
                        }
                        if (ch4.isChecked()) {
                            String value = ed1.getText().toString();
                            double a;
                            a = Double.parseDouble(value);
                            res = calculator.in2ft(a);
                            String r = String.valueOf(res);
                            ed5.setText(r);
                        } else if (ch4.isChecked() == false) {
                            ed5.setText("");
                        }
                        if (ch5.isChecked()) {
                            String value = ed1.getText().toString();
                            double a;
                            a = Double.parseDouble(value);
                            res = calculator.mtr2mtr(a);
                            String r = String.valueOf(res);
                            ed6.setText(r);
                        } else if (ch5.isChecked() == false) {
                            ed6.setText("");
                        }
                        if (ch6.isChecked()) {
                            String value = ed1.getText().toString();
                            double a;
                            a = Double.parseDouble(value);
                            res = calculator.in2sqft(a);
                            String r = String.valueOf(res);
                            ed7.setText(r);
                        } else if (ch6.isChecked() == false) {
                            ed7.setText("");
                        }
                        if (ch7.isChecked()) {
                            String value = ed1.getText().toString();
                            double a;
                            a = Double.parseDouble(value);
                            res = calculator.in2mtr(a);
                            String r = String.valueOf(res);
                            ed8.setText(r);
                        } else if (ch7.isChecked() == false) {
                            ed8.setText("");
                        }
                    }
                    else if(ed1.getHint().toString()=="Square Foot"){
                        if (ch1.isChecked()) {
                            String value = ed1.getText().toString();
                            double a;
                            a = Double.parseDouble(value);
                            res = calculator.sqft2nmi(a);
                            String r = String.valueOf(res);
                            ed2.setText(r);
                        } else if (ch1.isChecked() == false) {
                            ed2.setText("");
                        }
                        if (ch2.isChecked()) {
                            String value = ed1.getText().toString();
                            double a;
                            a = Double.parseDouble(value);
                            res = calculator.sqft2mile(a);
                            String r = String.valueOf(res);
                            ed3.setText(r);
                        } else if (ch2.isChecked() == false) {
                            ed3.setText("");
                        }

                        if (ch3.isChecked()) {
                            String value = ed1.getText().toString();
                            double a;
                            a = Double.parseDouble(value);
                            res = calculator.sqft2yd(a);
                            String r = String.valueOf(res);
                            ed4.setText(r);
                        } else if (ch3.isChecked() == false) {
                            ed4.setText("");
                        }
                        if (ch4.isChecked()) {
                            /*String value = ed1.getText().toString();
                            double a;
                            a = Double.parseDouble(value);
                            res = calculator.yd2ft(a);
                            String r = String.valueOf(res);*/
                            ed5.setText("not convertable");
                        } else if (ch4.isChecked() == false) {
                            ed5.setText("");
                        }
                        if (ch5.isChecked()) {
                            String value = ed1.getText().toString();
                            double a;
                            a = Double.parseDouble(value);
                            res = calculator.sqft2in(a);
                            String r = String.valueOf(res);
                            ed6.setText(r);
                        } else if (ch5.isChecked() == false) {
                            ed6.setText("");
                        }
                        if (ch6.isChecked()) {
                            String value = ed1.getText().toString();
                            double a;
                            a = Double.parseDouble(value);
                            res = calculator.mtr2mtr(a);
                            String r = String.valueOf(res);
                            ed7.setText(r);
                        } else if (ch6.isChecked() == false) {
                            ed7.setText("");
                        }
                        if (ch7.isChecked()) {
                            String value = ed1.getText().toString();
                            double a;
                            a = Double.parseDouble(value);
                            res = calculator.sqft2mtr(a);
                            String r = String.valueOf(res);
                            ed8.setText(r);
                        } else if (ch7.isChecked() == false) {
                            ed8.setText("");
                        }
                    }
                    else if(ed1.getHint().toString()=="Yard"){
                        if (ch1.isChecked()) {
                            String value = ed1.getText().toString();
                            double a;
                            a = Double.parseDouble(value);
                            res = calculator.yd2nmi(a);
                            String r = String.valueOf(res);
                            ed2.setText(r);
                        } else if (ch1.isChecked() == false) {
                            ed2.setText("");
                        }
                        if (ch2.isChecked()) {
                            String value = ed1.getText().toString();
                            double a;
                            a = Double.parseDouble(value);
                            res = calculator.yd2mile(a);
                            String r = String.valueOf(res);
                            ed3.setText(r);
                        } else if (ch2.isChecked() == false) {
                            ed3.setText("");
                        }

                        if (ch3.isChecked()) {
                            String value = ed1.getText().toString();
                            double a;
                            a = Double.parseDouble(value);
                            res = calculator.mtr2mtr(a);
                            String r = String.valueOf(res);
                            ed4.setText(r);
                        } else if (ch3.isChecked() == false) {
                            ed4.setText("");
                        }
                        if (ch4.isChecked()) {
                            String value = ed1.getText().toString();
                            double a;
                            a = Double.parseDouble(value);
                            res = calculator.yd2ft(a);
                            String r = String.valueOf(res);
                            ed5.setText(r);
                        } else if (ch4.isChecked() == false) {
                            ed5.setText("");
                        }
                        if (ch5.isChecked()) {
                            String value = ed1.getText().toString();
                            double a;
                            a = Double.parseDouble(value);
                            res = calculator.yd2in(a);
                            String r = String.valueOf(res);
                            ed6.setText(r);
                        } else if (ch5.isChecked() == false) {
                            ed6.setText("");
                        }
                        if (ch6.isChecked()) {
                            String value = ed1.getText().toString();
                            double a;
                            a = Double.parseDouble(value);
                            res = calculator.yd2sqft(a);
                            String r = String.valueOf(res);
                            ed7.setText(r);
                        } else if (ch6.isChecked() == false) {
                            ed7.setText("");
                        }
                        if (ch7.isChecked()) {
                            String value = ed1.getText().toString();
                            double a;
                            a = Double.parseDouble(value);
                            res = calculator.yd2mtr(a);
                            String r = String.valueOf(res);
                            ed8.setText(r);
                        } else if (ch7.isChecked() == false) {
                            ed8.setText("");
                        }
                    }
                    if (ch1.isChecked() == false && ch2.isChecked() == false && ch3.isChecked() == false &&
                            ch4.isChecked() == false && ch5.isChecked() == false && ch6.isChecked() == false
                            && ch7.isChecked() == false) {

                        new AlertDialog.Builder(mainpage.this)
                                .setTitle("Can not convert!!")
                                .setMessage("Please select at least one unit")
                                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {

                                        dialog.cancel();
                                    }
                                }).show();
                    }
                }

                }
        });
    }

}
