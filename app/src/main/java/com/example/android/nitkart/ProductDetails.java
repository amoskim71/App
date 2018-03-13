package com.example.android.nitkart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

public class ProductDetails extends AppCompatActivity {

    ImageView imageView;
    TextView producName, productPrice, productId, seller_name, seller_phone, seller_email, seller_block, seller_room, time_period;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        imageView = (ImageView) findViewById(R.id.image);
        producName = (TextView) findViewById(R.id.product_name);
        productPrice = (TextView) findViewById(R.id.product_price);

        Album album = (Album) getIntent().getSerializableExtra("Album");
        Picasso.with(this).load(MainActivity.domain + album.getUrl()).into(imageView);
        producName.setText(album.getProduct_name());
        productPrice.setText(album.getProduct_price());
        productId.setText(album.getProduct_id());
        seller_name.setText(album.getSeller_name());
        seller_phone.setText(album.getSeller_phone());
        seller_email.setText(album.getSeller_email());
        seller_block.setText(album.getSeller_block());
        seller_room.setText(album.getSeller_room());
        time_period.setText(album.getTime_period());
    }
}