package tw.dora.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class Page2Activity extends AppCompatActivity {
    public Page2Activity() {
        Log.d("brad", "Page2Activity()");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
    }

    public void test2(View view){
        Intent intent = new Intent(this, MainActivity.class) ;
        startActivity(intent);
        Log.d("brad","onDestroy2");
        finish();
    }
}