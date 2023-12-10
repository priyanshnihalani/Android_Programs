package com.example.jsonfetching;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String apiUrl = "https://jsonplaceholder.typicode.com/todos/1";
        textView = findViewById(R.id.textView);

        new JsonFetch() {
            @Override
            protected void onPostExecute(String result) {
                if (result != null) {
                    // Handle the JSON data
                    textView.setText("JsonFetchActivity, "+ "JSON Result: " + result);
                } else {
                    textView.setText("JsonFetchActivity, "+ "Error fetching JSON data");
                }
            }
        }.execute(apiUrl);
    }
}