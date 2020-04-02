package com.example.ecampus.Admin_ndrawer.Course_reg;

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
import com.example.ecampus.admin_course_view.ViewCourse2Activity;
import com.example.ecampus.admin_course_view.ViewCourse3Activity;
import com.example.ecampus.admin_course_view.ViewCourse4Activity;
import com.example.ecampus.admin_course_view.ViewCourse5Activity;
import com.example.ecampus.admin_course_view.ViewCourse6Activity;

public class CourseFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_course,container,false);

        Button csem1 = (Button) view.findViewById(R.id.sem1course);
        csem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1 = new Intent(getActivity(), ViewCourse1Activity.class);
                startActivity(in1);
            }
        });

        Button csem2 = (Button) view.findViewById(R.id.sem2course);
        csem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2 = new Intent(getActivity(), ViewCourse2Activity.class);
                startActivity(in2);
            }
        });

        Button csem3 = (Button) view.findViewById(R.id.sem3course);
        csem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in3 = new Intent(getActivity(), ViewCourse3Activity.class);
                startActivity(in3);
            }
        });

        Button csem4 = (Button) view.findViewById(R.id.sem4course);
        csem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in4 = new Intent(getActivity(), ViewCourse4Activity.class);
                startActivity(in4);
            }
        });

        Button csem5 = (Button) view.findViewById(R.id.sem5course);
        csem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in5 = new Intent(getActivity(), ViewCourse5Activity.class);
                startActivity(in5);
            }
        });

        Button csem6 = (Button) view.findViewById(R.id.sem6course);
        csem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in6 = new Intent(getActivity(), ViewCourse6Activity.class);
                startActivity(in6);
            }
        });

        return view;

    }
}