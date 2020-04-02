package com.example.ecampus;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class StloginActivity extends AppCompatActivity {

    Button btn_login;
    EditText txtEmail, txtPassword;
    private FirebaseAuth firebaseAuth;
    FirebaseUser mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stlogin);

        btn_login = findViewById(R.id.stlogin_btn);

        txtEmail=(EditText)findViewById(R.id.studentid);
        txtPassword=(EditText)findViewById(R.id.studentpw);
        btn_login=(Button) findViewById(R.id.stlogin_btn);
        firebaseAuth=FirebaseAuth.getInstance();

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email=txtEmail.getText().toString().trim();
                String password= txtPassword.getText().toString().trim();

                if (TextUtils.isEmpty(email)){
                    Toast.makeText(StloginActivity.this, "Please Enter Email", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(password)){
                    Toast.makeText(StloginActivity.this, "Please Enter Password", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (password.length()<6){
                    Toast.makeText(StloginActivity.this, "Password too short", Toast.LENGTH_SHORT).show();
                }

                firebaseAuth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener(StloginActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {

                                    if (firebaseAuth.getCurrentUser().isEmailVerified()){
                                        startActivity(new Intent(getApplicationContext(),StudentActivity.class));
                                    }else {
                                        Toast.makeText(StloginActivity.this, "Please verify your email address ", Toast.LENGTH_SHORT).show();

                                    }

                                } else {
                                    Toast.makeText(StloginActivity.this, "Login Failed or User not Available ", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });


            }
        });

    }

    }
