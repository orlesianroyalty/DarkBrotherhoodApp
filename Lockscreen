package com.example.orles.darkbrotherhoodlockscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Lockscreen extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.DarkBrotherhoodLockscreen.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lockscreen);

    // Example of a call to a native method
   // TextView tv = (TextView) findViewById(R.id.sample_text);
    //tv.setText(stringFromJNI());
    }

    /**
     * Called when the user taps the send button.
     */
    public void sendMessage(View view) {
        //do something in response to button
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }
}
