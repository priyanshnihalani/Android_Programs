package com.example.telephone;

import android.content.Context;
import android.telephony.TelephonyManager;

import java.security.Permission;

public class TelephonyHelper {
    private final Context context;
    private final TelephonyManager telephonyManager;
    public TelephonyHelper(Context context){
        this.context = context;
        this.telephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
    }
    public String getPhoneNumber()
    {
        if(telephonyManager != null)
        {
            return null /*telephonyManager.getLine1Number()*/;
        }
        else {
            return null;
        }
    }
    public String getNetworkOperatorName(){
        if (telephonyManager != null){
            return telephonyManager.getNetworkOperatorName();
        }
        else {
            return null;
        }
    }
}
