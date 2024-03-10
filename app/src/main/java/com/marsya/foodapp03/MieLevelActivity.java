package com.marsya.foodapp03;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MieLevelActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mie_level);

        setTitle("Mie Level Maxca");

        Button mieAyamButton = findViewById(R.id.mie1_button);
        Button mieGorengButton = findViewById(R.id.mie2_button);
        Button mieRebusButton = findViewById(R.id.mie3_button);
        Button mieKuahButton = findViewById(R.id.mie4_button);
        Button mieInstanButton = findViewById(R.id.mie5_button);
        Button backButton = findViewById(R.id.back_button);

        // Set onClickListener for each button
        mieAyamButton.setOnClickListener(this);
        mieGorengButton.setOnClickListener(this);
        mieRebusButton.setOnClickListener(this);
        mieKuahButton.setOnClickListener(this);
        mieInstanButton.setOnClickListener(this);
        backButton.setOnClickListener(this);



// Dan seterusnya untuk setiap jenis mie

    }

    @Override
    public void onClick(View v) {
        // Handle click events for each button\
        if (v.getId() == R.id.mie1_button) {
            startDetailActivity("Mie Carbonara", "Rp. 40.000", "Rasakan kenikmatan cita rasa Mie Carbonara yang khas dengan tekstur lembut pasta, diselimuti dengan saus krim lezat dan taburan keju parmesan yang melimpah. Setiap gigitan membawa Anda pada petualangan rasa yang tak terlupakan.", "Reguler");
        } else if (v.getId() == R.id.mie2_button) {
            startDetailActivity("Mie Spicy Chicken", "Rp. 48.000", "Hadirkan sensasi pedas dan kelezatan dalam setiap suapan dengan Mie Spicy Chicken kami. Dibuat dengan ayam berkualitas tinggi yang disajikan dengan bumbu pedas yang meresap hingga ke dalam setiap helai mie. Pengalaman gastronomi yang memicu selera!", "Reguler");
        } else if (v.getId() == R.id.mie3_button) {
            startDetailActivity("Mie Spicy Buldak", "Rp. 39.000", "Temukan puncak kepedasan yang menggoda dengan Mie Spicy Buldak kami. Setiap gigitan memberikan sensasi pedas yang menggigit, diperkuat dengan cita rasa buldak yang khas. Mie yang membuat Anda ketagihan untuk mencoba lagi dan lagi.", "Reguler");
        } else if (v.getId() == R.id.mie4_button) {
            startDetailActivity("Mie Curry Beef", "Rp. 45.000", "Jelajahi kelezatan Mie Curry Beef yang memikat dengan rempah-rempah khas Asia. Siramkan saus kari yang harum dan lembut di atas daging sapi empuk, menyatu dengan mie yang gurih. Setiap suapan membawa Anda ke negeri rasa yang kaya dan memuaskan.", "Reguler");
        } else if (v.getId() == R.id.mie5_button) {
            startDetailActivity("Mie Niku", "Rp. 35.000", "Rasakan kesederhanaan yang luar biasa dalam Mie Niku kami. Dengan daging sapi berkualitas tinggi yang dimasak dengan sempurna, di atas sehelai mie yang kenyal. Setiap suapan memberikan kepuasan yang tiada tara, memberikan kenikmatan yang langsung terasa.", "Reguler");
        } else if (v.getId() == R.id.back_button) {
            // Handle kembali button click
            finish();
        }
    }

    private void startDetailActivity(String name, String price, String description, String size) {
        // Start the DetailActivity with appropriate data
        Intent intent = new Intent(MieLevelActivity.this, DetailDua.class);
        intent.putExtra("name", name);
        intent.putExtra("price", price);
        intent.putExtra("description", description);
        intent.putExtra("size", size);



        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK); // Tambahkan flag di sini
        startActivity(intent);
    }
}

