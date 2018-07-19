package com.example.student_006.myloginscreenapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText userName,password;
    Button login,cancel;
    TextView textViewcounter;

    int count =3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userName=(EditText) findViewById(R.id.editTextUsername);
        password=(EditText) findViewById(R.id.editTextPassword);

        login=(Button) findViewById(R.id.btnLogin);
        cancel=(Button) findViewById(R.id.btnCancel);

        textViewcounter=(TextView) findViewById(R.id.textViewCounter);
        textViewcounter.setVisibility(View.GONE);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(userName.getText().toString().equals("admin") && password.getText().toString().equals("123"))
                {
                    Toast.makeText(LoginActivity.this, "Welcome", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    Toast.makeText(LoginActivity.this, "Please Enter Correct Password", Toast.LENGTH_SHORT).show();
                    textViewcounter.setVisibility(View.VISIBLE);
                    textViewcounter.setBackgroundColor(Color.RED);

                    count --;
                    textViewcounter.setText(Integer.toString(count));

                    if(count==0)
                    {
                        cancel.setEnabled(false);
                    }

                }


            }
        });



        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
