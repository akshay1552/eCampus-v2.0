package com.example.ecampus.Student_ndrawer.Student_notice;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.ecampus.NoticeData;
import com.example.ecampus.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class StudentNoticeActivity extends AppCompatActivity {

    TextView notice_no;
    TextView notice_date;
    TextView notice;
    EditText notice_num;
    Button btn_view;
    String number;
    FirebaseDatabase database;
    DatabaseReference notice_data;
    ListView listView;
    ArrayList<String> list;
    ArrayAdapter<String> Adapter;
    NoticeData noticeData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentnotice);

        noticeData = new NoticeData();

        notice_data= FirebaseDatabase.getInstance().getReference("Notice");
        listView=(ListView)findViewById(R.id.myListView);
        list= new ArrayList<>();
        Adapter= new ArrayAdapter<String>(this,R.layout.notice_info,R.id.noticeInfo,list);
        listView.setAdapter(Adapter);
        notice_data.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for(DataSnapshot ds: dataSnapshot.getChildren())
                {
                    noticeData= ds.getValue(NoticeData.class);
                    list.add(noticeData.getNoticeDate().toString()+" -                                  "+ noticeData.getNotice().toString());
                }
                listView.setAdapter(Adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


    }
}
