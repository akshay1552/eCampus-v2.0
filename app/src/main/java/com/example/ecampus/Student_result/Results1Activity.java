package com.example.ecampus.Student_result;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.ecampus.Model.StudentData;
import com.example.ecampus.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Results1Activity extends AppCompatActivity {

    EditText enrollno;
    TextView subone, subtwo, subthree, subfour, subsix, subseven;
    Button btn_upload;
    String number;
    FirebaseDatabase database;
    DatabaseReference show_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resulrs1);

        database = FirebaseDatabase.getInstance();
        show_data = database.getReference("Sem 1");
        enrollno = (EditText)findViewById(R.id.enroll);
        subone = (TextView)findViewById(R.id.sub1);
        subtwo = (TextView)findViewById(R.id.sub2);
        subthree = (TextView)findViewById(R.id.sub3);
        subfour = (TextView)findViewById(R.id.sub4);
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

                        StudentData studentData = dataSnapshot.getValue(StudentData.class);
                        enrollno.setText(studentData.getStudent_Enroll_No());
                        subone.setText(studentData.getEngineering_Physics());
                        subtwo.setText(studentData.getMaths_I());
                        subthree.setText(studentData.getBasics_of_Communication());
                        subfour.setText(studentData.getFundamentals_of_Electrical_Engg());
                        subsix.setText(studentData.getBasics_of_Computer_Engg());
                        subseven.setText(studentData.getComputer_Workshop());

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });


    }
}
