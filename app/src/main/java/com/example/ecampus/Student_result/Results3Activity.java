package com.example.ecampus.Student_result;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ecampus.Model.StudentData;
import com.example.ecampus.Model.StudentData3;
import com.example.ecampus.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Results3Activity extends AppCompatActivity {

    EditText enrollno;
    TextView subone, subtwo, subthree, subfour, subsix, subseven;
    Button btn_upload;
    String number;
    FirebaseDatabase database;
    DatabaseReference show_data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results3);


        database = FirebaseDatabase.getInstance();
        show_data = database.getReference("Sem 3");
        enrollno = (EditText)findViewById(R.id.enroll);
        subone = (TextView)findViewById(R.id.sub1);
        subtwo = (TextView)findViewById(R.id.sub2);
        subthree = (TextView)findViewById(R.id.sub3);
        subfour = (TextView)findViewById(R.id.sub4);
        subsix = (TextView)findViewById(R.id.sub5);
        subseven = (TextView)findViewById(R.id.sub6);
        btn_upload = (Button)findViewById(R.id.resubmit);

        btn_upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                number = enrollno.getText().toString();

                show_data.child(number).addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                        StudentData3 studentData = dataSnapshot.getValue(StudentData3.class);
                        enrollno.setText(studentData.getStudent_Enroll_No());
                        subone.setText(studentData.getData_Structures());
                        subtwo.setText(studentData.getDigital_Technique());
                        subthree.setText(studentData.getComputer_Hardware());
                        subfour.setText(studentData.getObject_Oriented_Prog());
                        subsix.setText(studentData.getPDBMS());
                        subseven.setText(studentData.getEVS());

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });




    }
}
