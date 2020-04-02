package com.example.ecampus.Student_ndrawer.Student_course;

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
import com.example.ecampus.student_course_reg.StCourse1Activity;
import com.example.ecampus.student_course_reg.StCourse2Activity;
import com.example.ecampus.student_course_reg.StCourse3Activity;
import com.example.ecampus.student_course_reg.StCourse4Activity;
import com.example.ecampus.student_course_reg.StCourse5Activity;
import com.example.ecampus.student_course_reg.StCourse6Activity;

public class SuCourseFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sucourse,container,false);

        Button csem1 = (Button) view.findViewById(R.id.sem1course);
        csem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1 = new Intent(getActivity(), StCourse1Activity.class);
                startActivity(in1);
            }
        });

        Button csem2 = (Button) view.findViewById(R.id.sem2course);
        csem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2 = new Intent(getActivity(), StCourse2Activity.class);
                startActivity(in2);
            }
        });

        Button csem3 = (Button) view.findViewById(R.id.sem3course);
        csem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in3 = new Intent(getActivity(), StCourse3Activity.class);
                startActivity(in3);
            }
        });

        Button csem4 = (Button) view.findViewById(R.id.sem4course);
        csem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in4 = new Intent(getActivity(), StCourse4Activity.class);
                startActivity(in4);
            }
        });

        Button csem5 = (Button) view.findViewById(R.id.sem5course);
        csem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in5 = new Intent(getActivity(), StCourse5Activity.class);
                startActivity(in5);
            }
        });

        Button csem6 = (Button) view.findViewById(R.id.sem6course);
        csem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in6 = new Intent(getActivity(), StCourse6Activity.class);
                startActivity(in6);
            }
        });

        return view;
    }
}