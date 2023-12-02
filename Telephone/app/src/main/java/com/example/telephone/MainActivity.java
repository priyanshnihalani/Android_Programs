package com.example.telephone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView number, network;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number = findViewById(R.id.number);
        network = findViewById(R.id.network);

        TelephonyHelper telephonyHelper = new TelephonyHelper(this);
        String PhoneNumber = telephonyHelper.getPhoneNumber();
        if (PhoneNumber != null)
        {
            number.setText("Phone Number: " + PhoneNumber);
        }
        else {
            number.setText("Phone Number not Available");
        }

        String networkOperator = telephonyHelper.getNetworkOperatorName();
        if (networkOperator != null)
        {
            network.setText("Network Operator: " + networkOperator);
        }
        else {
            network.setText("Network Operator not found");
        }
    }
}