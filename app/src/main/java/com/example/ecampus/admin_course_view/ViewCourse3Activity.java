package com.example.ecampus.admin_course_view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ecampus.R;
import com.example.ecampus.student_course_reg.CourseData3;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ViewCourse3Activity extends AppCompatActivity {

    TextView courseone, coursetwo, coursethree, coursefour, coursefive, coursesix;
    EditText enrollno;
    Button btn_load;
    FirebaseDatabase database;
    DatabaseReference course_data3;
    String number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_course3);

        courseone = (TextView)findViewById(R.id.course1);
        coursetwo = (TextView)findViewById(R.id.course2);
        coursethree = (TextView)findViewById(R.id.course3);
        coursefour = (TextView)findViewById(R.id.course4);
        coursefive = (TextView)findViewById(R.id.course5);
        coursesix = (TextView)findViewById(R.id.course6);
        enrollno = (EditText)findViewById(R.id.enroll);
        database = FirebaseDatabase.getInstance();
        course_data3 = database.getReference("Course3");
        btn_load = (Button)findViewById(R.id.CourseviewBtn);

        btn_load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                number = enrollno.getText().toString();

                course_data3.child(number).addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                        CourseData3 courseData3 = dataSnapshot.getValue(CourseData3.class);
                        enrollno.setText(courseData3.getEnrollment_No());
                        courseone.setText(courseData3.getCourse_1());
                        coursetwo.setText(courseData3.getCourse_2());
                        coursethree.setText(courseData3.getCourse_3());
                        coursefour.setText(courseData3.getCourse_4());
                        coursefive.setText(courseData3.getCourse_5());
                        coursesix.setText(courseData3.getCourse_6());
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });

    }
}
