package com.example.ecampus.admin_course_view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.autofill.UserData;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ecampus.R;
import com.example.ecampus.student_course_reg.CourseData;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ViewCourse1Activity extends AppCompatActivity {

    TextView courseone, coursetwo, coursethree, coursefour, coursefive, coursesix;
    EditText enrollno;
    Button btn_load;
    FirebaseDatabase database;
    DatabaseReference show_data;
    String number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_course1);

        courseone = (TextView)findViewById(R.id.course1);
        coursetwo = (TextView)findViewById(R.id.course2);
        coursethree = (TextView)findViewById(R.id.course3);
        coursefour = (TextView)findViewById(R.id.course4);
        coursefive = (TextView)findViewById(R.id.course5);
        coursesix = (TextView)findViewById(R.id.course6);
        enrollno = (EditText)findViewById(R.id.enroll);
        database = FirebaseDatabase.getInstance();
        show_data = database.getReference("Course1");
        btn_load = (Button)findViewById(R.id.CourseviewBtn);

        btn_load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                number = enrollno.getText().toString();

                show_data.child(number).addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                        CourseData userData = dataSnapshot.getValue(CourseData.class);
                        enrollno.setText(userData.getEnrollment_No());
                        courseone.setText(userData.getCourse_1());
                        coursetwo.setText(userData.getCourse_2());
                        coursethree.setText(userData.getCourse_3());
                        coursefour.setText(userData.getCourse_4());
                        coursefive.setText(userData.getCourse_5());
                        coursesix.setText(userData.getCourse_6());
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });

}
}
