package cprogramming.example.cprogramming.test.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.Program.*;
import cprogramming.example.cprogramming.test.R;
import cprogramming.example.cprogramming.test.Tutorial.T1;
import cprogramming.example.cprogramming.test.Tutorial.T10;
import cprogramming.example.cprogramming.test.Tutorial.T11;
import cprogramming.example.cprogramming.test.Tutorial.T12;
import cprogramming.example.cprogramming.test.Tutorial.T13;
import cprogramming.example.cprogramming.test.Tutorial.T14;
import cprogramming.example.cprogramming.test.Tutorial.T15;
import cprogramming.example.cprogramming.test.Tutorial.T16;
import cprogramming.example.cprogramming.test.Tutorial.T17;
import cprogramming.example.cprogramming.test.Tutorial.T18;
import cprogramming.example.cprogramming.test.Tutorial.T19;
import cprogramming.example.cprogramming.test.Tutorial.T2;
import cprogramming.example.cprogramming.test.Tutorial.T20;
import cprogramming.example.cprogramming.test.Tutorial.T21;
import cprogramming.example.cprogramming.test.Tutorial.T22;
import cprogramming.example.cprogramming.test.Tutorial.T23;
import cprogramming.example.cprogramming.test.Tutorial.T24;
import cprogramming.example.cprogramming.test.Tutorial.T25;
import cprogramming.example.cprogramming.test.Tutorial.T26;
import cprogramming.example.cprogramming.test.Tutorial.T3;
import cprogramming.example.cprogramming.test.Tutorial.T4;
import cprogramming.example.cprogramming.test.Tutorial.T5;
import cprogramming.example.cprogramming.test.Tutorial.T6;
import cprogramming.example.cprogramming.test.Tutorial.T7;
import cprogramming.example.cprogramming.test.Tutorial.T8;
import cprogramming.example.cprogramming.test.Tutorial.T9;

public class TutorialItemAdapter extends RecyclerView.Adapter<TutorialItemAdapter.TutorialItemViewHolder> {

    private Context context;
    private String[] data;
    private int[] image;

    public TutorialItemAdapter(Context context, String[] data, int[] image) {
        this.context = context;
        this.data = data;
        this.image = image;
    }

    public TutorialItemAdapter(Context context, String[] data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public TutorialItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_line, parent, false);
        return new TutorialItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final TutorialItemViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        String Title = data[position];
//        int TitleImage = image[position];
        holder.ItemText.setText(Title);
//        holder.ItemImage.setImageResource(TitleImage);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), T1.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), T2.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), T3.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), T4.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), T5.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), T6.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 6) {
                    Intent myIntent = new Intent(view.getContext(), T7.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 7) {
                    Intent myIntent = new Intent(view.getContext(), T8.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 8) {
                    Intent myIntent = new Intent(view.getContext(), T9.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 9) {
                    Intent myIntent = new Intent(view.getContext(), T10.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 10) {
                    Intent myIntent = new Intent(view.getContext(), T11.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 11) {
                    Intent myIntent = new Intent(view.getContext(), T12.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 12) {
                    Intent myIntent = new Intent(view.getContext(), T13.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 13) {
                    Intent myIntent = new Intent(view.getContext(), T14.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 14) {
                    Intent myIntent = new Intent(view.getContext(), T15.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 15) {
                    Intent myIntent = new Intent(view.getContext(), T16.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 16) {
                    Intent myIntent = new Intent(view.getContext(), T17.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 17) {
                    Intent myIntent = new Intent(view.getContext(), T18.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 18) {
                    Intent myIntent = new Intent(view.getContext(), T19.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 19) {
                    Intent myIntent = new Intent(view.getContext(), T20.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 20) {
                    Intent myIntent = new Intent(view.getContext(), T21.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 21) {
                    Intent myIntent = new Intent(view.getContext(), T22.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 22) {
                    Intent myIntent = new Intent(view.getContext(), T23.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 23) {
                    Intent myIntent = new Intent(view.getContext(), T24.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 24) {
                    Intent myIntent = new Intent(view.getContext(), T25.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 25) {
                    Intent myIntent = new Intent(view.getContext(), T26.class);
                    view.getContext().startActivity(myIntent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class TutorialItemViewHolder extends RecyclerView.ViewHolder {

        ImageView ItemImage;
        TextView ItemText;

        public TutorialItemViewHolder(@NonNull View itemView) {
            super(itemView);
            ItemImage = itemView.findViewById(R.id.item_line_image);
            ItemText = itemView.findViewById(R.id.item_line_text);
        }
    }
}