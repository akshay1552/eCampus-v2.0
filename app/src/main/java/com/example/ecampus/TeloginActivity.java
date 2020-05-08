package com.example.ecampus;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ecampus.Teacher_ndrawer.Teacher_notice.TeacherNoticeActivity;

public class TeloginActivity extends AppCompatActivity {

    EditText teusername,tepassword;
    Button tebtnlogin;

    String teacher_id = "GPMSTAFF";
    String teacher_pw = "coteacher";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telogin);

        teusername = findViewById(R.id.teacherid);
        tepassword = findViewById(R.id.teacherpw);
        tebtnlogin = findViewById(R.id.telogin_btn);

        tebtnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //validate input

                if (TextUtils.isEmpty(teusername.getText().toString()) || TextUtils.isEmpty(tepassword.getText().toString())){

                    Toast.makeText(TeloginActivity.this,"Please Enter Username and Password",Toast.LENGTH_LONG).show();

                }else if (teusername.getText().toString().equals(teacher_id)){

                    //check password
                    if (tepassword.getText().toString().equals(teacher_pw)){

                        Toast.makeText(TeloginActivity.this,"Succesfully Login !!!",Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(TeloginActivity.this, TeacherActivity.class);
                        startActivity(intent);

                    }else {

                        Toast.makeText(TeloginActivity.this,"Login Failed",Toast.LENGTH_LONG).show();

                    }

                }else {

                    Toast.makeText(TeloginActivity.this,"Login Failed :(",Toast.LENGTH_LONG).show();

                }

            }
        });

    }
}
