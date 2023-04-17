package com.example.parulcampusdrive;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Mapsactivity extends AppCompatActivity implements OnMapReadyCallback {
GoogleMap gMap;
FrameLayout map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapsactivity);
        map=findViewById(R.id.map);
        SupportMapFragment mapFragment= (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        this.gMap =googleMap;
        LatLng mapindia=new LatLng(22.2887,73.3634);
        this.gMap.addMarker(new MarkerOptions().position(mapindia).title("Marker in india "));
        this.gMap.moveCamera(CameraUpdateFactory.newLatLng(mapindia));
    }
}