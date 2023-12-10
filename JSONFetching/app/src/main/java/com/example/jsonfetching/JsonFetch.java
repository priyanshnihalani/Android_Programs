package com.example.jsonfetching;

import android.os.AsyncTask;


import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class JsonFetch extends AsyncTask<String, Void, String> {

    @Override
    protected String doInBackground(String... params) {
    try {
        URL url = new URL(params[0]);
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

        try {
            InputStream inputStream = urlConnection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder result = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                result.append(line);
            }
            return result.toString();
        } finally {
            urlConnection.disconnect();
        }
    } catch (IOException e) {
        return null;
    }
    }
}
