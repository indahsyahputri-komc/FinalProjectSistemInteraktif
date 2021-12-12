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

public class DailyActivity extends AppCompatActivity {
    final Context context = this;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle( "Percakapan Sehari - Hari");
        setContentView(R.layout.activity_daily);

        Button daily_quiz = (Button) findViewById(R.id.daily_quiz);
        // add button listener
        daily_quiz.setOnClickListener(new View.OnClickListener(){

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
                                intent.setData(Uri.parse("https://wordwall.net/id/resource/25275245"));
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

    public void showPopupMenu_D(View view) {
    }
}
