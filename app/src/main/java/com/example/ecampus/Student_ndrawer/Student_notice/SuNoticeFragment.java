package com.example.ecampus.Student_ndrawer.Student_notice;

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

public class SuNoticeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sunotice,container,false);

        Button Noticeview = (Button)view.findViewById(R.id.notice_view_connect);
        Noticeview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent noticevintent = new Intent(getActivity(), StudentNoticeActivity.class);
                startActivity(noticevintent);
            }
        });

        return view;
    }
}
