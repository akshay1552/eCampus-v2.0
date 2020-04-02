package com.example.ecampus.Teacher_ndrawer.Teacher_notice;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.ecampus.R;

public class TeNoticeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tenotice,container,false);

        Button NoticeConnect = (Button)view.findViewById(R.id.notice_upload_connect);
        NoticeConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent noticeintent = new Intent(getActivity(),TeacherNoticeActivity.class);
                startActivity(noticeintent);
            }
        });

        return view;
    }
}
