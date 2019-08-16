package com.example.msanii;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class adapter extends RecyclerView.Adapter<adapter.DealAdapterViewHolder>
{
        private List<publicinfomod> infoperson = new ArrayList<>();
        private Context mContext;
    private clicklistener_interface ckListener;

    @NonNull
    @Override
    public DealAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
           LayoutInflater inflater = LayoutInflater.from(context);
            boolean shouldAttachToParentImmediately = false;
            View view = inflater.inflate(R.layout.xmladapter,parent,shouldAttachToParentImmediately);
            DealAdapterViewHolder publicinfo = new DealAdapterViewHolder(view);
        return publicinfo;
    }

    @Override
    public void onBindViewHolder(@NonNull DealAdapterViewHolder holder, int position) {
        publicinfomod publicinfomod = infoperson.get(position);
        holder.act.setText(String.valueOf(publicinfomod.getActor()));
        holder.music.setText(String.valueOf(publicinfomod.getMu()));
        holder.hiphop.setText(String.valueOf(publicinfomod.getHip()));
        holder.rnb.setText(String.valueOf(publicinfomod.getRn()));
        holder.model.setText(String.valueOf(publicinfomod.getMo()));
        holder.vixen.setText(String.valueOf(publicinfomod.getActor()));
        holder.meme.setText(String.valueOf(publicinfomod.getMe()));
        holder.script.setText(String.valueOf(publicinfomod.getSc()));

    }
    @Override
    public int getItemCount() {
        return  infoperson.size();
    }

    public void setClickListener(clicklistener_interface itemClickListener)
    {
        this.ckListener= itemClickListener;
    }

    public void setDealList(List<publicinfomod> dealListList)
        {
            this.infoperson = dealListList;
            notifyDataSetChanged();
      }
        class DealAdapterViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
        {
            TextView act;
            TextView music;
            TextView hiphop;
            TextView rnb;
            TextView model;
            TextView vixen;
            TextView meme;
            TextView script;



            public DealAdapterViewHolder(View itemView)
            {
                super(itemView);
                act= (TextView) itemView.findViewById(R.id.one);
                music = (TextView) itemView.findViewById(R.id.two);
                hiphop= (TextView)itemView.findViewById(R.id.three);
                rnb= (TextView) itemView.findViewById(R.id.four);
                model = (TextView)itemView.findViewById(R.id.five);
                vixen= (TextView)itemView.findViewById(R.id.six);
                meme= (TextView)itemView.findViewById(R.id.seven);
                script = (TextView)itemView.findViewById(R.id.eight);
            }

            @Override
            public void onClick(View view) {
                   ckListener.onClick(view,getAdapterPosition());
                  Log.d("Clicking","On clicking has been called ");
            }

            }
        }


