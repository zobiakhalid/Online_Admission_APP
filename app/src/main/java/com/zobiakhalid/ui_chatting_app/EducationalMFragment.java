package com.zobiakhalid.ui_chatting_app;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class EducationalMFragment extends Fragment {
    Button Next,uf;
    public EducationalMFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_educational_m, container, false);
        Next=view.findViewById(R.id.Next);
        uf=view.findViewById(R.id.UploadFiles);
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EducationalIFragment educationalIFragment=new EducationalIFragment();
                FragmentTransaction transaction=getFragmentManager().beginTransaction();
                transaction.replace(R.id.LL, educationalIFragment).addToBackStack(null);
                transaction.commit();
            }
        });
        uf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(), "Certificates Uploaded successfully", Toast.LENGTH_SHORT).show();

            }
        });
        return view;
    }
}