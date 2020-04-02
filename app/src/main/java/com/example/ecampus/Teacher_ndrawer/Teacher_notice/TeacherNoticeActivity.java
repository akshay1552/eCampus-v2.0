package com.example.ecampus.Teacher_ndrawer.Teacher_notice;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.ecampus.NoticeData;
import com.example.ecampus.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class TeacherNoticeActivity extends AppCompatActivity {

    EditText notice_no;
    EditText notice_date;
    EditText notice;
    Button btn_uploadNotice;
    FirebaseDatabase database;
    DatabaseReference notice_data;
    String noticeno, noticedate, notices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teachernotice);

        notice_no = (EditText) findViewById(R.id.notice_no);
        notice_date = (EditText) findViewById(R.id.notice_date);
        notice = (EditText) findViewById(R.id.notice);
        btn_uploadNotice = (Button) findViewById(R.id.btn_upload_notice);
        database = FirebaseDatabase.getInstance();
        notice_data = database.getReference("Notice");


        btn_uploadNotice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                noticeno = notice_no.getText().toString();
                noticedate = notice_date.getText().toString();
                notices = notice.getText().toString();

                notice_data.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                        if (noticeno.isEmpty())
                        {
                            notice_no.setError("Please enter Notice Number");
                            notice_no.requestFocus();
                        }
                        else if (noticedate.isEmpty())
                        {
                            notice_date.setError("Please enter Notice Date");
                            notice_date.requestFocus();
                        }
                        else if (notices.isEmpty())
                        {
                            notice.setError("Please neter your Notice");
                            notice.requestFocus();
                        }
                        else
                        {
                            NoticeData notice = new NoticeData(noticeno,noticedate,notices);
                            notice_data.child(noticeno).setValue(notice);
                            Toast.makeText(TeacherNoticeActivity.this,"Notice Uploaded. ", Toast.LENGTH_SHORT).show();
                        }


                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });

    }
}
