package com.example.ecampus.Admin_ndrawer.Exam_reg;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.ecampus.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class ExamRegActivity extends AppCompatActivity {

    EditText txtEmail, txtPassword, txtConfirmPassword;
    Button btn_register;
    ProgressBar progressBar;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_reg);

        txtEmail=(EditText)findViewById(R.id.txt_email);
        txtPassword=(EditText)findViewById(R.id.txt_password);
        txtConfirmPassword=(EditText)findViewById(R.id.txt_confirm_password);
        btn_register=(Button)findViewById(R.id.buttonRegister);
        progressBar=(ProgressBar)findViewById(R.id.progressBar);

        firebaseAuth=FirebaseAuth.getInstance();

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String email=txtEmail.getText().toString().trim();
                String password= txtPassword.getText().toString().trim();
                String confirmPassword=txtConfirmPassword.getText().toString().trim();

                if (TextUtils.isEmpty(email)){
                    Toast.makeText(ExamRegActivity.this, "Please Enter Email", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(password)){
                    Toast.makeText(ExamRegActivity.this, "Please Enter Password", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(confirmPassword)){
                    Toast.makeText(ExamRegActivity.this, "Please Enter Confirm Password", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (password.length()<6){
                    Toast.makeText(ExamRegActivity.this, "Password too short", Toast.LENGTH_SHORT).show();
                }
                progressBar.setVisibility(View.VISIBLE);

                if (password.equals(confirmPassword)){

                    firebaseAuth.createUserWithEmailAndPassword(email, password)
                            .addOnCompleteListener(ExamRegActivity.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {

                                    progressBar.setVisibility(View.GONE);
                                    if (task.isSuccessful()) {

                                        firebaseAuth.getCurrentUser().sendEmailVerification().addOnCompleteListener(new OnCompleteListener<Void>() {
                                            @Override
                                            public void onComplete(@NonNull Task<Void> task) {
                                                if (task.isSuccessful()){
                                                    Toast.makeText(ExamRegActivity.this, "Registered Successfully. Please check your email for verification", Toast.LENGTH_SHORT).show();
                                                    txtEmail.setText("");
                                                    txtPassword.setText("");
                                                }else {
                                                    Toast.makeText(ExamRegActivity.this, task.getException().getMessage(),Toast.LENGTH_LONG).show();
                                                }


                                            }
                                        });

                                        startActivity(new Intent(getApplicationContext(), ExamRegActivity.class));
                                        Toast.makeText(ExamRegActivity.this, "Registration Complete", Toast.LENGTH_SHORT).show();

                                    } else {
                                        Toast.makeText(ExamRegActivity.this, "Authentication Failed", Toast.LENGTH_SHORT).show();

                                    }
                                }

                                // ...
                            });

                }

            }
        });

    }
}
