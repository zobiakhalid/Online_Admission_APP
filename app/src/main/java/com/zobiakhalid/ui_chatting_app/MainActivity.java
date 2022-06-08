package com.zobiakhalid.ui_chatting_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentTransaction;

;

public class MainActivity extends AppCompatActivity {
   // Button btn1;
    CardView c1,c2,c3,c4,c5;
    Button login,reg;
    LinearLayout LL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c1=findViewById(R.id.dash);
        c2=findViewById(R.id.per);
        c3=findViewById(R.id.edu);
        c4=findViewById(R.id.pro);
        c5=findViewById(R.id.challan);
        LL=findViewById(R.id.LL);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DashboardFragment dashboardFragment=new DashboardFragment();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.LL, dashboardFragment).addToBackStack(null);
                transaction.commit();
            }
        });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnlineFormFragment onlineFormFragment=new OnlineFormFragment();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.LL, onlineFormFragment).addToBackStack(null);
                transaction.commit();
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EducationalMFragment educationalMFragment=new EducationalMFragment();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.LL, educationalMFragment).addToBackStack(null);
                transaction.commit();
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProgramFragment programFragment=new ProgramFragment();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.LL, programFragment).addToBackStack(null);
                transaction.commit();
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChallanFragment challanFragment=new ChallanFragment();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.LL, challanFragment).addToBackStack(null);
                transaction.commit();
            }
        });
    }
}