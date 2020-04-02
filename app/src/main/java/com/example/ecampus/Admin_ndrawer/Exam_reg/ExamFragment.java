package com.example.ecampus.Admin_ndrawer.Exam_reg;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.ecampus.R;
import com.example.ecampus.admin_course_view.ViewCourse1Activity;

public class ExamFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_exam,container,false);

        Button exam = (Button) view.findViewById(R.id.st_register);
        exam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1 = new Intent(getActivity(),ExamRegActivity.class);
                startActivity(in1);
            }
        });

        return view;

    }
}