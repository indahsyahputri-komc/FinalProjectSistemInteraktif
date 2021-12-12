package com.example.belajarbahasajawa;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class AnimalActivity extends AppCompatActivity {
    final Context context = this;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle( "HEWAN (ke - wan)");
        setContentView(R.layout.activity_animal);

        Button animal_quiz = (Button) findViewById(R.id.animal_quiz);
        // add button listener
        animal_quiz.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                // judul popup
                alertDialogBuilder.setTitle("PERINGATAN");
                // set isi popup
                alertDialogBuilder
                        .setMessage("Menekan tombol Ya akan membuat kamu keluar dari aplikasi, apakah kamu tetap akan menguji kemampuan?")
                        .setCancelable(false)
                        .setPositiveButton("Ya",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://wordwall.net/id/resource/24406811"));
                startActivity(intent);
         }
                        })
                        .setNegativeButton("Tidak",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                onResume();
                                dialog.cancel();
                            }
                        });
                // create alert dialog
                AlertDialog alertDialog = alertDialogBuilder.create();
                // show it
                alertDialog.show();
            }
        });
    }

    public void showPopupMenu(View view) {
    }
}
