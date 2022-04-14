package com.example.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
     Button btn;
    EditText e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.btn);

        e = (EditText)findViewById(R.id.e);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               /* String url=e.getText().toString();
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);*/

                Uri number = Uri.parse("tel:5551234");
                Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                startActivity(callIntent);

            }
        });
    }
}
