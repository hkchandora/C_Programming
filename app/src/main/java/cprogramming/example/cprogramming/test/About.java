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
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class About extends AppCompatActivity {

    private CardView HireMe;
    private CircleImageView GitHub, LinkedIn, Facebook, WhatsApp, Twitter, Instagram;
    private String number = "7665773775";
    private String whatappNumber = "917665773775";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        getSupportActionBar().hide();

        HireMe = findViewById(R.id.hire_me_btn);
        GitHub = findViewById(R.id.github);
        LinkedIn = findViewById(R.id.linkedin);
        Facebook = findViewById(R.id.facebook);
        WhatsApp = findViewById(R.id.whatsapp);
        Twitter = findViewById(R.id.twitter);
        Instagram = findViewById(R.id.instagram);


        HireMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:" + number));
                startActivity(callIntent);
            }
        });


        GitHub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/hkchandora"));
                startActivity(intent);
            }
        });


        LinkedIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/himanshu-kumawat-b802bb16b/"));
                startActivity(intent);
            }
        });


        Facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String urlFb = "https://www.facebook.com/himanshchandora";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(urlFb));
                final PackageManager packageManager = getPackageManager();
                List<ResolveInfo> list = packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY);
                final String urlBrowser = "https://www.facebook.com/himanshchandora";
                intent.setData(Uri.parse(urlBrowser));
                startActivity(intent);
            }
        });


        WhatsApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://api.whatsapp.com/send?phone=" + whatappNumber;
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });


        Twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/HimanshChandora?s=09"));
                startActivity(intent);
            }
        });


        Instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String USER_INSTA = "its_only_himansh";
                Uri uri = Uri.parse("http://instagram.com/_u/" + USER_INSTA);
                Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);
                likeIng.setPackage("com.instagram.android");
                try {
                    startActivity(likeIng);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/" + USER_INSTA)));
                }
            }
        });
    }
}
