package adhanjas.com.example.intense;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import adhanjas.com.example.intense.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        mainBinding.btnStartActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,HomeActivity.class);
                startActivity(intent);
            }
        });
        mainBinding.btnStartCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string="+254021540934";
                Intent intent =new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",string,null));
                startActivity(intent);

            }
        });
        mainBinding.btnStartText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri sms_uri=Uri.parse("smsto:+254021540934");
                Intent intent=new Intent(Intent.ACTION_SENDTO,sms_uri);
                intent.putExtra("sms_body","good morning");
                startActivity(intent);

            }
        });
        mainBinding.btnGoToGithub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.github.com/brandy-kay"));
                startActivity(intent);

            }
        });
    }
}