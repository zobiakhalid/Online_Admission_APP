package com.zobiakhalid.ui_chatting_app;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class ChallanFragment extends Fragment {
    Button download,upload,create,submit;
    public ChallanFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_challan, container, false);
        create=view.findViewById(R.id.Create);
        download=view.findViewById(R.id.Download);
        upload=view.findViewById(R.id.Upload);
        submit=view.findViewById(R.id.Submit);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(), "Challan Created", Toast.LENGTH_SHORT).show();

            }
        });
        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(), "Challan Downloaded", Toast.LENGTH_SHORT).show();

            }
        });
        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(), "Challan Uploaded", Toast.LENGTH_SHORT).show();

            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(), "Form Submitted Successfully! Under Review", Toast.LENGTH_SHORT).show();

            }
        });
        return view;
    }
}