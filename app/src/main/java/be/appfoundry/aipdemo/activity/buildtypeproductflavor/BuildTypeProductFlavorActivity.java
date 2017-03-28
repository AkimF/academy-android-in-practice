package be.appfoundry.aipdemo.activity.buildtypeproductflavor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import be.appfoundry.aipdemo.BuildConfig;
import be.appfoundry.aipdemo.R;

public class BuildTypeProductFlavorActivity extends AppCompatActivity {

    private TextView urlText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_build_type_product_flavor);

        urlText = (TextView) findViewById(R.id.text_url);

        urlText.setText(BuildConfig.URL);
    }

}