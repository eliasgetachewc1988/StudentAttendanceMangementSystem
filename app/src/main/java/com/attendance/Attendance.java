package com.attendance;

import android.app.Application;

import com.androidnetworking.AndroidNetworking;
import com.attendance.misc.utils.Extras;
import com.attendance.ui.fragments.SubjectFragment;


public class Attendance extends Application {

    private static Attendance istance;
    private Extras pref;
    public static int rno=0;

    @Override
    public void onCreate() {

        super.onCreate();
        istance = this;
        AndroidNetworking.initialize(this);
        pref = new Extras(this);
        pref.setrollNo(rno);
    }

    /**
     * Instance of this class
     * @return
     */
    public static Attendance getInstance() {
        return istance;
    }

}

