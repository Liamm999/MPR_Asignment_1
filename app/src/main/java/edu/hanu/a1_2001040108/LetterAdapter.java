package edu.hanu.a1_2001040108;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

public class LetterAdapter extends BaseAdapter {
    Context context;
    int layout;
    List<Letter> letters;

    public LetterAdapter(Context context, int layout, List<Letter> letters) {
        this.context = context;
        this.layout = layout;
        this.letters = letters;
    }

    @Override
    public int getCount() {
        return letters.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder {
        TextView textView;
        ImageView imageView;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        ViewHolder hViewHolder;
        ViewHolder kViewHolder;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout, null);
            hViewHolder = new ViewHolder();

            // mapping
            hViewHolder.imageView = (ImageView) convertView.findViewById(R.id.imageView);

            convertView.setTag(hViewHolder);
        } else {
            hViewHolder = (ViewHolder) convertView.getTag();

        }

        hViewHolder.imageView.setImageResource(letters.get(i).getImage());

        return convertView;
    }
}
