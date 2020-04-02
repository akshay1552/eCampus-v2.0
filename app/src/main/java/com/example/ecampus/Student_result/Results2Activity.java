package com.example.ecampus.Student_result;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.ecampus.Model.StudentData;
import com.example.ecampus.Model.StudentData2;
import com.example.ecampus.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Results2Activity extends AppCompatActivity {

    EditText enrollno;
    TextView subone, subtwo, subthree, subfour, subfive, subsix, subseven;
    Button btn_upload;
    String number;
    FirebaseDatabase database;
    DatabaseReference show_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results2);

        database = FirebaseDatabase.getInstance();
        show_data = database.getReference("Sem 2");
        enrollno = (EditText)findViewById(R.id.enroll);
        subone = (TextView)findViewById(R.id.sub1);
        subtwo = (TextView)findViewById(R.id.sub2);
        subthree = (TextView)findViewById(R.id.sub3);
        subfour = (TextView)findViewById(R.id.sub4);
        subfive = (TextView)findViewById(R.id.sub5);
        subsix = (TextView)findViewById(R.id.sub6);
        subseven = (TextView)findViewById(R.id.sub7);
        btn_upload = (Button)findViewById(R.id.resubmit);

        btn_upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                number = enrollno.getText().toString();

                show_data.child(number).addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                        StudentData2 studentData = dataSnapshot.getValue(StudentData2.class);
                        enrollno.setText(studentData.getStudent_Enroll_No());
                        subone.setText(studentData.getEngg_Chemistry());
                        subtwo.setText(studentData.getMaths_2());
                        subthree.setText(studentData.getBCE());
                        subfour.setText(studentData.getProgramming_In_C());
                        subfive.setText(studentData.getCommunication_Skills());
                        subsix.setText(studentData.getGeneric_Skills());
                        subseven.setText(studentData.getWPD());

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });

    }
}
