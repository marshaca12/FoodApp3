package com.marsya.foodapp03;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DetailDua extends AppCompatActivity {


    private String name;
    private String price;
    private String description;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newactivity);


        name = getIntent().getStringExtra("name");
        price = getIntent().getStringExtra("price");
        description = getIntent().getStringExtra("description");
        String size = getIntent().getStringExtra("size");


        TextView nameTextView = findViewById(R.id.name_text);
        TextView priceTextView = findViewById(R.id.price_text);
        TextView descriptionTextView = findViewById(R.id.description_text);
        TextView sizeTextView = findViewById(R.id.size_text);


        nameTextView.setText(name);
        priceTextView.setText(price);
        descriptionTextView.setText(description);
        sizeTextView.setText(size);

        findViewById(R.id.share_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareButtonClicked();
            }
        });
    }

    // Method untuk menangani klik tombol bagikan
    private void shareButtonClicked() {
        // Membuat Intent dengan tipe ACTION_SEND
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);

        // Menambahkan data yang ingin dibagikan ke Intent
        sendIntent.putExtra(Intent.EXTRA_TEXT, "Nama: " + name + "\nHarga: " + price + "\nDeskripsi: " + description );
        sendIntent.setType("text/plain");

        // Memilih aplikasi yang akan menangani Intent (WhatsApp, Instagram, dll)
        sendIntent.setPackage("com.whatsapp"); // Ganti dengan paket aplikasi yang diinginkan

        // Memulai aktivitas untuk mengirim Intent
        try {
            startActivity(sendIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(this, "Aplikasi WhatsApp tidak ditemukan", Toast.LENGTH_SHORT).show();
        }
    }

}