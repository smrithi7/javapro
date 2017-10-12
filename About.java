package com.example.vidhya.melange;

import android.app.Activity;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class About extends Activity implements OnMapReadyCallback {
    private GoogleMap googleMap;
    TextView tv,tv3,tv4,tv5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        MapFragment mapFragment = (MapFragment) getFragmentManager()
                .findFragmentById(R.id.map);

        mapFragment.getMapAsync(this);
        ViewGroup.LayoutParams params = mapFragment.getView().getLayoutParams();
        params.height = 650;
        mapFragment.getView().setLayoutParams(params);


        tv=(TextView)findViewById(R.id.txt1);
        Typeface face=Typeface.createFromAsset(getAssets(), "fonts/villa.ttf");
        tv.setTypeface(face);
        tv3=(TextView)findViewById(R.id.txt3);
        Typeface face3=Typeface.createFromAsset(getAssets(), "fonts/villa.ttf");
        tv3.setTypeface(face3);
        tv4=(TextView)findViewById(R.id.txt4);
        Typeface face4=Typeface.createFromAsset(getAssets(), "fonts/chub.ttf");
        tv4.setTypeface(face4);
        tv5=(TextView)findViewById(R.id.txt5);
        Typeface face5=Typeface.createFromAsset(getAssets(), "fonts/chub.ttf");
        tv5.setTypeface(face5);

    }

    @Override
    public void onMapReady(GoogleMap map) {
        googleMap = map;

        setUpMap();

    }
    public void setUpMap(){

        googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        //  googleMap.setMyLocationEnabled(true);
        googleMap.setTrafficEnabled(true);
        googleMap.setIndoorEnabled(true);
        googleMap.setBuildingsEnabled(true);
        googleMap.getUiSettings().setZoomControlsEnabled(true);
        LatLng eec = new LatLng(13.0331324,80.1777231);
        googleMap.addMarker(new MarkerOptions().position(eec)
                .title("Easwari Engineering College"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(eec));
        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(eec, 17.0f));
    }
}
