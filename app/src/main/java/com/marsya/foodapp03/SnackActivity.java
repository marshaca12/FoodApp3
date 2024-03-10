package com.marsya.foodapp03;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SnackActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack);

        setTitle("Mie Level Maxca");

        Button DimsumAyamButton = findViewById(R.id.snack1_button);
        Button UdangKejuButton = findViewById(R.id.snack2_button);
        Button LumpiaUdangButton = findViewById(R.id.snack3_button);
        Button PangsitGorengButton = findViewById(R.id.snack4_button);
        Button UdangRambutanButton = findViewById(R.id.snack5_button);

        // Set onClickListener for each button
        DimsumAyamButton.setOnClickListener(this);
        UdangKejuButton.setOnClickListener(this);
        LumpiaUdangButton.setOnClickListener(this);
        PangsitGorengButton.setOnClickListener(this);
        UdangRambutanButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // Handle click events for each button
        if (v.getId() == R.id.snack1_button) {
            startDetailActivity("Dimsum Ayam", "Rp. 15.000", "Dimsum Ayam adalah makanan ringan yang terbuat dari daging ayam cincang yang dibungkus dengan adonan kulit dimsum, kemudian dikukus hingga matang. Nikmati kelezatan daging ayam yang lembut di dalam kulit dimsum yang kenyal.", "Reguler");
        } else if (v.getId() == R.id.snack2_button) {
            startDetailActivity("Udang Keju", "Rp. 15.000", "Udang Keju adalah makanan ringan yang terdiri dari udang yang dibalut dengan keju dan kemudian digoreng hingga kecokelatan. Rasakan kombinasi rasa gurih dan creamy dari keju yang meleleh di dalam udang yang juicy.", "Reguler");
        } else if (v.getId() == R.id.snack3_button) {
            startDetailActivity("Lumpia Udang", "Rp. 15.000", "Lumpia Udang adalah makanan ringan berupa kulit lumpia yang diisi dengan campuran udang dan sayuran yang kemudian digoreng hingga renyah. Rasakan sensasi kriuk dan gurihnya lumpia udang yang dipadu dengan aroma dan rasa segar dari sayuran.", "Reguler");
        } else if (v.getId() == R.id.snack4_button) {
            startDetailActivity("Pangsit Goreng", "Rp. 12.000", "Pangsit Goreng adalah makanan ringan berbentuk pangsit yang diisi dengan daging cincang dan bumbu kemudian digoreng hingga kecokelatan. Rasakan kelezatan pangsit goreng yang renyah di luar dan juicy di dalamnya.", "Reguler");
        } else if (v.getId() == R.id.snack5_button) {
            startDetailActivity("Udang Rambutan", "Rp. 12000", "Udang Rambutan adalah makanan ringan yang terdiri dari udang yang dibalut dengan adonan tepung dan kemudian digoreng hingga kecokelatan. Nikmati kelezatan udang yang juicy di dalam balutan tepung yang renyah.", "Reguler");
        }
    }

    private void startDetailActivity(String name, String price, String description, String size) {
        // Start the DetailActivity with appropriate data
        Intent intent = new Intent(SnackActivity.this, DetailDua.class);
        intent.putExtra("name", name);
        intent.putExtra("price", price);
        intent.putExtra("description", description);
        intent.putExtra("size", size);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK); // Tambahkan flag di sini
        startActivity(intent);
    }
}



