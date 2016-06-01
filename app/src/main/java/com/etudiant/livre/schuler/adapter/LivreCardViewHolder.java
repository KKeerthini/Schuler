package com.etudiant.livre.schuler.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.etudiant.livre.schuler.R;

/**
 * Created by KEERTHINI on 6/1/2016.
 */
    public class LivreCardViewHolder extends RecyclerView.ViewHolder {
        private static TextView itemTextView;

        public LivreCardViewHolder(final View parent) {
            super(parent);
          //  mItemTextView = itemTextView;
        }
        public static LivreCardViewHolder newInstance(View parent) {
             itemTextView = (TextView) parent.findViewById(R.id.person_name);
            return new LivreCardViewHolder(parent);
        }
        public void setItemText(CharSequence text) {
            itemTextView.setText(text);
        }

    }

