package com.marsya.foodapp03;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MinumanActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minuman);

        setTitle("Mie Level Maxca");

        Button EsKelapaButton = findViewById(R.id.drink1_button);
        Button EsDogerButton = findViewById(R.id.drink2_button);
        Button EsCampurButton = findViewById(R.id.drink3_button);
        Button OchaDrinkButton = findViewById(R.id.drink4_button);
        Button LemonTeaButton = findViewById(R.id.drink5_button);

        // Set onClickListener for each button
        EsKelapaButton.setOnClickListener(this);
        EsDogerButton.setOnClickListener(this);
        EsCampurButton.setOnClickListener(this);
        OchaDrinkButton.setOnClickListener(this);
        LemonTeaButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // Handle click events for each button
        if (v.getId() == R.id.drink1_button) {
            startDetailActivity("Es Kelapa", "Rp. 15.000", "Es Kelapa adalah minuman segar yang terbuat dari air kelapa muda yang dipadukan dengan potongan kelapa dan gula merah. Menyegarkan dengan rasa manis alami dari kelapa muda.", "Reguler/ Big + 3k");
        } else if (v.getId() == R.id.drink2_button) {
            startDetailActivity("Es Doger", "Rp. 15000", "Es Doger adalah minuman khas Indonesia yang terdiri dari campuran es serut, santan, gula merah cair, alpukat, cincau, dan kelapa muda. Nikmati kesegaran es campuran ini dengan cita rasa yang unik dan kaya. ", "Large/ Big + 3k");
        } else if (v.getId() == R.id.drink3_button) {
            startDetailActivity("Es Campur", "Rp. 20000", "Es Campur adalah minuman yang terdiri dari campuran berbagai macam bahan seperti es serut, agar-agar, buah nangka, kelapa muda, dan sirup. Menyajikan sensasi segar dan manis dalam setiap tegukan.", "Reguler/ Big + 3k");
        } else if (v.getId() == R.id.drink4_button) {
            startDetailActivity("Ocha Drink", "Rp. 10000", "Ocha Drink adalah minuman teh hijau asli Jepang yang disajikan dingin. Nikmati kelezatan teh hijau dengan aroma yang segar dan rasa yang lembut.", "Large/ Big + 3k");
        } else if (v.getId() == R.id.drink5_button) {
            startDetailActivity("Lemon Tea", "Rp. 12.000", "Lemon Tea adalah minuman teh hitam yang segar dengan tambahan perasan lemon untuk memberikan aroma dan rasa yang menyegarkan. Cocok untuk menghilangkan dahaga dan menyegarkan tenggorokan.", "/ Big + 3ka");
        }
    }

    private void startDetailActivity(String name, String price, String description, String size) {
        // Start the DetailActivity with appropriate data
        Intent intent = new Intent(MinumanActivity.this, DetailDua.class);
        intent.putExtra("name", name);
        intent.putExtra("price", price);
        intent.putExtra("description", description);
        intent.putExtra("size", size);

        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK); // Tambahkan flag di sini
        startActivity(intent);
    }
}
