package com.example.alumno.clase07;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;

/**
 * Created by alumno on 04/05/2017.
 */

public class MiDialogFragment extends DialogFragment{



    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(this.getContext());

        builder.setTitle("Atencion!");
        builder.setMessage("Mensaje nuevo");

        AlertaListener listener= new AlertaListener();
        builder.setPositiveButton("Positivo", listener );
        builder.setNegativeButton("Negativo", listener );
        builder.setNeutralButton("Neutral", listener );

        return builder.create();
    }
}
