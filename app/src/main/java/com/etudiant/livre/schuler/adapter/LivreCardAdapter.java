package com.etudiant.livre.schuler.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.etudiant.livre.schuler.R;

import java.util.List;

/**
 * Created by KEERTHINI on 6/1/2016.
 */
public class LivreCardAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<String> mItemList;

    public LivreCardAdapter(List<String> itemList) {
        mItemList = itemList;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_livre, parent, false);
        return LivreCardViewHolder.newInstance(view);
    }
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        LivreCardViewHolder holder = (LivreCardViewHolder) viewHolder;
        String itemText = mItemList.get(position);
        holder.setItemText(itemText);
    }
    @Override
    public int getItemCount() {
        return mItemList == null ? 0 : mItemList.size();
    }

}
