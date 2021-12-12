package com.example.belajarbahasajawa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle( "Beranda");
        setContentView(R.layout.activity_home);
    }

    public void Hewan(View view) {
        startActivity(new Intent(this, AnimalActivity.class));
    }

    public void Daily(View view) { startActivity(new Intent(this, DailyActivity.class));
    }

    public void Angka(View view) { startActivity(new Intent(this, NumberActivity.class));
    }

    public void Warna(View view) { startActivity(new Intent(this, ColorActivity.class));
    }

    public void Transportasi(View view) { startActivity(new Intent(this, TransportActivity.class));
    }

    public void Tubuh(View view) { startActivity(new Intent(this, BodyActivity.class));
    }

    public void Buah(View view) { startActivity(new Intent(this, FruitActivity.class));
    }

}

