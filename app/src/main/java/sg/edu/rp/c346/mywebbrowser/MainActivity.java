package sg.edu.rp.c346.mywebbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    WebView wvMyPage;
    Button btnLoadURL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wvMyPage=findViewById(R.id.wbvw);
        wvMyPage.setWebViewClient(new WebViewClient());
        btnLoadURL=findViewById(R.id.buttonLoad);


        wvMyPage.getSettings().setJavaScriptEnabled(true);
        wvMyPage.getSettings().setAllowFileAccess(false);
        wvMyPage.getSettings().setBuiltInZoomControls(true);


        btnLoadURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="https://www.google.com/";
                wvMyPage.loadUrl(url);
            }
        });
    }
}
