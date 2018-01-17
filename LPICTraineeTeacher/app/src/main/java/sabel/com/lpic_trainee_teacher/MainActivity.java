package sabel.com.lpic_trainee_teacher;

import android.app.Activity;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    // DATA FIELDS

    private Button btn_start, btn_import, btn_close;
    private TextView tv_choose, tv_version;
    private DropBoxManager dbm_theme;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // btn_start = findViewById(R.id.btn);

    } // END protected void onCreate(Bundle savedInstanceState)




} // END CLASS MAIN