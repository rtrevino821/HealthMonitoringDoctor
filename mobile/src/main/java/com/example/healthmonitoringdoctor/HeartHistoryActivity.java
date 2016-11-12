package com.example.healthmonitoringdoctor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HeartHistoryActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;
    private List<Patient> patients;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_history);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        intializeData();
        intializeAdapter();
    }

    private void intializeData() {
        patients = new ArrayList<>();
        patients.add(new Patient("Trevino, Rodolfo", "8/29/2016", "120"));
        patients.add(new Patient("Wayne, Bruce", "5/9/2016", "190"));
        patients.add(new Patient("Jones, Mike", "8/2/2010", "80"));
        patients.add(new Patient("Brady, Tom", "10/22/2016", "140"));
        patients.add(new Patient("Trump, Dump", "11/9/2016", "60"));
        patients.add(new Patient("Tyson, Mike", "4/3/2016", "150"));
        patients.add(new Patient("Jolie, Angelina", "8/29/2016", "90"));
        patients.add(new Patient("Marino, Dan", "6/2/2012", "140"));
        patients.add(new Patient("Vergara, Sophia", "5/29/2014", "110"));
        patients.add(new Patient("Madison, Billy", "1/6/2013", "90"));
    }

    private void intializeAdapter() {
        adapter = new RecyclerAdapter(patients);
        recyclerView.setAdapter(adapter);
    }
}
