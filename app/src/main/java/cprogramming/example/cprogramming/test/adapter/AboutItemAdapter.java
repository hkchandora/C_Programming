package cprogramming.example.cprogramming.test.adapter;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import cprogramming.example.cprogramming.test.About;
import cprogramming.example.cprogramming.test.R;
import cprogramming.example.cprogramming.test.Reference;
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

public class AboutItemAdapter extends RecyclerView.Adapter<AboutItemAdapter.TutorialItemViewHolder> {

    private Context context;
    private String[] data;
    private int[] image;

    public AboutItemAdapter(Context context, String[] data, int[] image) {
        this.context = context;
        this.data = data;
        this.image = image;
    }

    public AboutItemAdapter(Context context, String[] data) {
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
                    Uri uri = Uri.parse("market://details?id=" + view.getContext().getPackageName());
                    Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
                    // To count with Play market backstack, After pressing back button,
                    // to taken back to our application, we need to add following flags to intent.
                    goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                            Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
                            Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                    try {
                        view.getContext().startActivity(goToMarket);
                    } catch (ActivityNotFoundException e) {
                        view.getContext().startActivity(new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://play.google.com/store/apps/details?id=" + view.getContext().getPackageName())));
                    }
                }

                if (position == 1) {
                    Uri uri = Uri.parse("https://play.google.com/store/apps/collection/cluster?clp=igNLChkKEzYwOTgwMzIwMzQ0NzQ0MDAzMzUQCBgDEiwKJmNwcm9ncmFtbWluZy5leGFtcGxlLmNwcm9ncmFtbWluZy50ZXN0EAEYAxgB:S:ANO1ljLFf9Q&gsr=Ck6KA0sKGQoTNjA5ODAzMjAzNDQ3NDQwMDMzNRAIGAMSLAomY3Byb2dyYW1taW5nLmV4YW1wbGUuY3Byb2dyYW1taW5nLnRlc3QQARgDGAE%3D:S:ANO1ljJkbvk");
                    Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
                    // To count with Play market backstack, After pressing back button,
                    // to taken back to our application, we need to add following flags to intent.
                    goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                            Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
                            Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                    try {
                        view.getContext().startActivity(goToMarket);
                    } catch (ActivityNotFoundException e) {
                        view.getContext().startActivity(new Intent(Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/collection/cluster?clp=igNLChkKEzYwOTgwMzIwMzQ0NzQ0MDAzMzUQCBgDEiwKJmNwcm9ncmFtbWluZy5leGFtcGxlLmNwcm9ncmFtbWluZy50ZXN0EAEYAxgB:S:ANO1ljLFf9Q&gsr=Ck6KA0sKGQoTNjA5ODAzMjAzNDQ3NDQwMDMzNRAIGAMSLAomY3Byb2dyYW1taW5nLmV4YW1wbGUuY3Byb2dyYW1taW5nLnRlc3QQARgDGAE%3D:S:ANO1ljJkbvk")));
                    }
                }

                if (position == 2) {
                    Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                            "mailto", "chandorahimanshu@email.com", null));
                    intent.putExtra(Intent.EXTRA_TEXT, "Hello");
                    view.getContext().startActivity(Intent.createChooser(intent, "Choose an Email client :"));
                }
                if (position == 3) {
                    Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                    sharingIntent.setType("text/plain");
                    String shareBody = "This is C Programming App.\nHere, We can Easy to Learn C Programming Language.\n" +
                            "Best Proper Tutorials, 100+ Programs with output, And Many Questions-Answers & Exam Questions also.\n" +
                            "Download it :-\n\n" +
                            "https://play.google.com/store/apps/details?id=cprogramming.example.cprogramming.test";
                    String shareSub = "C Programming App";
                    sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, shareSub);
                    sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                    view.getContext().startActivity(Intent.createChooser(sharingIntent, "Share using"));
                }
                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), Reference.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), About.class);
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