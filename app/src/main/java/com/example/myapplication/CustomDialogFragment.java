package com.example.myapplication;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomDialogFragment extends DialogFragment {
    @NonNull
    public Dialog onCreateDialog(Bundle savedInst)
    {   long end = 0;
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        Long myParam = getArguments().getLong("Time");
        Date date;
        DateFormat formatter = new SimpleDateFormat("dd.MM.yy HH:mm");
        try {
            date = formatter.parse(String.valueOf(myParam));
            Date now = new Date();
             end =  now.getTime() - date.getTime() ;
        } catch (ParseException e) {
            e.printStackTrace();
        }



        return
//                builder.setView(R.layout.activity_main)
//                        .setTitle("Test title")
//                        .setMessage("This is same test...")
//                        .setIcon(R.drawable.ic_launcher_background)
//                        .setPositiveButton("+", null)
//                        .setNegativeButton("-", null)
//                        .create();

                builder.setTitle("?")
                        .setMessage("Сейчас " + String.valueOf(end))
                        .setIcon(R.drawable.ic_launcher_background)
                        .setPositiveButton("OK", null)
                        .create();

    }
}
