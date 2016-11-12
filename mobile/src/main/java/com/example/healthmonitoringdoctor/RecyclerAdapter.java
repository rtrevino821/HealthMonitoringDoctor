package com.example.healthmonitoringdoctor;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by rtrev on 10/23/2016.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    Context context;

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView itemPatientName;
        public TextView itemLastVisit;
        public TextView itemThreshold;

        public ViewHolder(View itemView) {
            super(itemView);
            itemPatientName = (TextView) itemView.findViewById(R.id.tv_Patient_Name);
            itemLastVisit = (TextView) itemView.findViewById(R.id.tv_Last_Visit);
            itemThreshold = (TextView) itemView.findViewById(R.id.tv_Current_Threshold);

        }
    }

    List<Patient> patients;

    RecyclerAdapter(List<Patient> patients){
        this.patients = patients;
    }


    public RecyclerAdapter(Context context) {
    }



    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row, viewGroup, false);
        RecyclerView.ViewHolder viewHolder = new ViewHolder(v);
        return (ViewHolder) viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.ViewHolder viewHolder, int position) {
        viewHolder.itemPatientName.setText(patients.get(position).name);
        viewHolder.itemLastVisit.setText("Last Visit: " + patients.get(position).lastVisit);
        viewHolder.itemThreshold.setText(patients.get(position).threshold);
    }

    @Override
    public int getItemCount() {
        return patients.size();
    }


}