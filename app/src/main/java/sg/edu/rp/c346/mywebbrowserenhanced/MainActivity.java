package sg.edu.rp.c346.mywebbrowserenhanced;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnLoadURL;
    WebView wvMyPage;
    EditText edURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLoadURL  = findViewById(R.id.buttonLoad);
        edURL = findViewById(R.id.editTextURL);
        wvMyPage = findViewById(R.id.webViewMyPage);

        wvMyPage.setWebViewClient(new WebViewClient());
        wvMyPage.getSettings().setJavaScriptEnabled(true);
        wvMyPage.getSettings().setAllowFileAccess(false);
        wvMyPage.getSettings().setDisplayZoomControls(true);


        btnLoadURL.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String url = edURL.getText().toString();
                wvMyPage.loadUrl(url);
            }
        });
    }
}
