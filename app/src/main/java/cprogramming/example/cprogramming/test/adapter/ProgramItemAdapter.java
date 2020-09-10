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

public class ProgramItemAdapter extends RecyclerView.Adapter<ProgramItemAdapter.ProgramItemViewHolder> {

    private Context context;
    private String[] data;
    private int[] image;

    public ProgramItemAdapter(Context context, String[] data, int[] image) {
        this.context = context;
        this.data = data;
        this.image = image;
    }

    public ProgramItemAdapter(Context context, String[] data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public ProgramItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_line, parent, false);
        return new ProgramItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ProgramItemViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        String Title = data[position];
//        int TitleImage = image[position];
        holder.ItemText.setText(Title);
//        holder.ItemImage.setImageResource(TitleImage);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), P1.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), P2.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), P3.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), P4.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), P5.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), P6.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 6) {
                    Intent myIntent = new Intent(view.getContext(), P7.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 7) {
                    Intent myIntent = new Intent(view.getContext(), P8.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 8) {
                    Intent myIntent = new Intent(view.getContext(), P9.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 9) {
                    Intent myIntent = new Intent(view.getContext(), P10.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 10) {
                    Intent myIntent = new Intent(view.getContext(), P11.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 11) {
                    Intent myIntent = new Intent(view.getContext(), P12.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 12) {
                    Intent myIntent = new Intent(view.getContext(), P13.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 13) {
                    Intent myIntent = new Intent(view.getContext(), P14.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 14) {
                    Intent myIntent = new Intent(view.getContext(), P15.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 15) {
                    Intent myIntent = new Intent(view.getContext(), P16.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 16) {
                    Intent myIntent = new Intent(view.getContext(), P17.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 17) {
                    Intent myIntent = new Intent(view.getContext(), P18.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 18) {
                    Intent myIntent = new Intent(view.getContext(), P19.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 19) {
                    Intent myIntent = new Intent(view.getContext(), P20.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 20) {
                    Intent myIntent = new Intent(view.getContext(), P21.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 21) {
                    Intent myIntent = new Intent(view.getContext(), P22.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 22) {
                    Intent myIntent = new Intent(view.getContext(), P23.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 23) {
                    Intent myIntent = new Intent(view.getContext(), P24.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 24) {
                    Intent myIntent = new Intent(view.getContext(), P25.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 25) {
                    Intent myIntent = new Intent(view.getContext(), P26.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 26) {
                    Intent myIntent = new Intent(view.getContext(), P27.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 27) {
                    Intent myIntent = new Intent(view.getContext(), P28.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 28) {
                    Intent myIntent = new Intent(view.getContext(), P29.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 29) {
                    Intent myIntent = new Intent(view.getContext(), P30.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 30) {
                    Intent myIntent = new Intent(view.getContext(), P31.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 31) {
                    Intent myIntent = new Intent(view.getContext(), P32.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 32) {
                    Intent myIntent = new Intent(view.getContext(), P33.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 33) {
                    Intent myIntent = new Intent(view.getContext(), P34.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 34) {
                    Intent myIntent = new Intent(view.getContext(), P35.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 35) {
                    Intent myIntent = new Intent(view.getContext(), P36.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 36) {
                    Intent myIntent = new Intent(view.getContext(), P37.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 37) {
                    Intent myIntent = new Intent(view.getContext(), P38.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 38) {
                    Intent myIntent = new Intent(view.getContext(), P39.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 39) {
                    Intent myIntent = new Intent(view.getContext(), P40.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 40) {
                    Intent myIntent = new Intent(view.getContext(), P41.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 41) {
                    Intent myIntent = new Intent(view.getContext(), P42.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 42) {
                    Intent myIntent = new Intent(view.getContext(), P43.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 43) {
                    Intent myIntent = new Intent(view.getContext(), P44.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 44) {
                    Intent myIntent = new Intent(view.getContext(), P45.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 45) {
                    Intent myIntent = new Intent(view.getContext(), P46.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 46) {
                    Intent myIntent = new Intent(view.getContext(), P47.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 47) {
                    Intent myIntent = new Intent(view.getContext(), P48.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 48) {
                    Intent myIntent = new Intent(view.getContext(), P49.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 49) {
                    Intent myIntent = new Intent(view.getContext(), P50.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 50) {
                    Intent myIntent = new Intent(view.getContext(), P51.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 51) {
                    Intent myIntent = new Intent(view.getContext(), P52.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 52) {
                    Intent myIntent = new Intent(view.getContext(), P53.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 53) {
                    Intent myIntent = new Intent(view.getContext(), P54.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 54) {
                    Intent myIntent = new Intent(view.getContext(), P55.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 55) {
                    Intent myIntent = new Intent(view.getContext(), P56.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 56) {
                    Intent myIntent = new Intent(view.getContext(), P57.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 57) {
                    Intent myIntent = new Intent(view.getContext(), P58.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 58) {
                    Intent myIntent = new Intent(view.getContext(), P59.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 59) {
                    Intent myIntent = new Intent(view.getContext(), P60.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 60) {
                    Intent myIntent = new Intent(view.getContext(), P61.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 61) {
                    Intent myIntent = new Intent(view.getContext(), P62.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 62) {
                    Intent myIntent = new Intent(view.getContext(), P63.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 63) {
                    Intent myIntent = new Intent(view.getContext(), P64.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 64) {
                    Intent myIntent = new Intent(view.getContext(), P65.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 65) {
                    Intent myIntent = new Intent(view.getContext(), P66.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 66) {
                    Intent myIntent = new Intent(view.getContext(), P67.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 67) {
                    Intent myIntent = new Intent(view.getContext(), P68.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 68) {
                    Intent myIntent = new Intent(view.getContext(), P69.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 69) {
                    Intent myIntent = new Intent(view.getContext(), P70.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 70) {
                    Intent myIntent = new Intent(view.getContext(), P71.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 71) {
                    Intent myIntent = new Intent(view.getContext(), P72.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 72) {
                    Intent myIntent = new Intent(view.getContext(), P73.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 73) {
                    Intent myIntent = new Intent(view.getContext(), P74.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 74) {
                    Intent myIntent = new Intent(view.getContext(), P75.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 75) {
                    Intent myIntent = new Intent(view.getContext(), P76.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 76) {
                    Intent myIntent = new Intent(view.getContext(), P77.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 77) {
                    Intent myIntent = new Intent(view.getContext(), P78.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 78) {
                    Intent myIntent = new Intent(view.getContext(), P79.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 79) {
                    Intent myIntent = new Intent(view.getContext(), P80.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 80) {
                    Intent myIntent = new Intent(view.getContext(), P81.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 81) {
                    Intent myIntent = new Intent(view.getContext(), P82.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 82) {
                    Intent myIntent = new Intent(view.getContext(), P83.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 83) {
                    Intent myIntent = new Intent(view.getContext(), P84.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 84) {
                    Intent myIntent = new Intent(view.getContext(), P85.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 85) {
                    Intent myIntent = new Intent(view.getContext(), P86.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 86) {
                    Intent myIntent = new Intent(view.getContext(), P87.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 87) {
                    Intent myIntent = new Intent(view.getContext(), P88.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 88) {
                    Intent myIntent = new Intent(view.getContext(), P89.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 89) {
                    Intent myIntent = new Intent(view.getContext(), P90.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 90) {
                    Intent myIntent = new Intent(view.getContext(), P91.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 91) {
                    Intent myIntent = new Intent(view.getContext(), P92.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 92) {
                    Intent myIntent = new Intent(view.getContext(), P93.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 93) {
                    Intent myIntent = new Intent(view.getContext(), P94.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 94) {
                    Intent myIntent = new Intent(view.getContext(), P95.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 95) {
                    Intent myIntent = new Intent(view.getContext(), P96.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 96) {
                    Intent myIntent = new Intent(view.getContext(), P97.class);
                    view.getContext().startActivity(myIntent);
                }
                if (position == 97) {
                    Intent myIntent = new Intent(view.getContext(), P98.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 98) {
                    Intent myIntent = new Intent(view.getContext(), P99.class);
                    view.getContext().startActivity(myIntent);
                }

                if (position == 99) {
                    Intent myIntent = new Intent(view.getContext(), P100.class);
                    view.getContext().startActivity(myIntent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ProgramItemViewHolder extends RecyclerView.ViewHolder {

        ImageView ItemImage;
        TextView ItemText;

        public ProgramItemViewHolder(@NonNull View itemView) {
            super(itemView);
            ItemImage = itemView.findViewById(R.id.item_line_image);
            ItemText = itemView.findViewById(R.id.item_line_text);
        }
    }
}