package cprogramming.example.cprogramming.test;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class About extends AppCompatActivity implements View.OnClickListener {
    TextView t1,t2,t3;
    Button b1,b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        t1=(TextView) findViewById(R.id.textView);
        t2=(TextView) findViewById(R.id.textView2);
        t3=(TextView) findViewById(R.id.textView4);

        b1 = (Button) findViewById(R.id.button165);
        b1.setOnClickListener(this);
        b2 = (Button) findViewById(R.id.button166);
        b2.setOnClickListener(this);
        b3 = (Button) findViewById(R.id.button168);
        b3.setOnClickListener(this);
        b4 = (Button) findViewById(R.id.button169);
        b4.setOnClickListener(this);
        b5 = (Button) findViewById(R.id.button9);
        b5.setOnClickListener(this);


        t2.setText("Developed and Designed By :\nHimanshu Kumawat");
        t3.setText("#My 1st Application for C\n\nNo need to carry books for c programming.This app enables you to carry basic C programming tutorials in your android.\n" +
                "It contains about 100 Programs, many FAQ's and Exam Questions also.\n" +
                "This app has a very simple user interface and the contents can be easily understood by the users.\n" +
                "This will define help you for preparing for interviews,test and in many more ways.\n" +
                "Wherever and whenever you require any information about C you are just a click away.......\n\n" +
                "ALL THE BEST GUYS.....");



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("About");
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimary)));
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return  super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onClick(View v) {
        if(v == b1){
            Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                    "mailto","chandorahimanshu@email.com", null));
            intent.putExtra(Intent.EXTRA_TEXT, "Hello");
            startActivity(Intent.createChooser(intent, "Choose an Email client :"));

        }
        if(v == b2){
            final String urlFb = "fb://page/1504945662900284";
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(urlFb));
            final PackageManager packageManager = getPackageManager();
            List<ResolveInfo> list = packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY);
            final String urlBrowser = "https://www.facebook.com/himanshchandora";
            intent.setData(Uri.parse(urlBrowser));
            startActivity(intent);

        }
        if(v == b3){
            String USER_INSTA = "its_only_himansh";
            Uri uri = Uri.parse("http://instagram.com/_u/"+USER_INSTA);
            Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);
            likeIng.setPackage("com.instagram.android");
            try {
                startActivity(likeIng);
            } catch (ActivityNotFoundException e) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/"+USER_INSTA)));
            }
        }
        if(v == b4){
            Intent twitterIntent = null;
            String USER_ID = "HimanshChandora";
            try {
                this.getPackageManager().getPackageInfo("com.twitter.android", 0);
                twitterIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("twitter://user?user_id="+USER_ID));
                twitterIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            } catch (Exception e) {
                twitterIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/"+USER_ID));
            }
            this.startActivity(twitterIntent);
        }
        if(v == b5){
            String USER_INSTA = "in/himanshu-chandora-b802bb16b/";
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/"+USER_INSTA)));

        }
    }
}
