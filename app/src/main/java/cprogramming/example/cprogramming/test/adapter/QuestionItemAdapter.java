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

public class QuestionItemAdapter extends RecyclerView.Adapter<QuestionItemAdapter.QuestionItemViewHolder> {

    private Context context;
    private String[] data;
    private int[] image;

    public QuestionItemAdapter(Context context, String[] data, int[] image) {
        this.context = context;
        this.data = data;
        this.image = image;
    }

    public QuestionItemAdapter(Context context, String[] data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public QuestionItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_line, parent, false);
        return new QuestionItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final QuestionItemViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        String Title = data[position];
//        int TitleImage = image[position];
        holder.ItemText.setText(Title);
//        holder.ItemImage.setImageResource(TitleImage);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class QuestionItemViewHolder extends RecyclerView.ViewHolder {

        ImageView ItemImage;
        TextView ItemText;

        public QuestionItemViewHolder(@NonNull View itemView) {
            super(itemView);
            ItemImage = itemView.findViewById(R.id.item_line_image);
            ItemText = itemView.findViewById(R.id.item_line_text);
        }
    }
}