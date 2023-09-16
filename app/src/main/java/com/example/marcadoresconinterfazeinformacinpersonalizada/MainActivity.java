package com.example.marcadoresconinterfazeinformacinpersonalizada;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.marcadoresconinterfazeinformacinpersonalizada.MainActivity2;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnMapClickListener {
    GoogleMap Mapas;

    public TextView txtview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {

        Mapas=googleMap;

        LatLng ltUteq= new LatLng(-1.024267389863566, -79.46621960993701);



        Mapas.getUiSettings().setZoomControlsEnabled(true);


        CameraUpdate camUpdUteq= CameraUpdateFactory.newLatLngZoom(ltUteq,15);
        Mapas.moveCamera(camUpdUteq);

        LatLng KFC = new LatLng(-1.0295454112544167, -79.46864520818968);
        Mapas.addMarker(new MarkerOptions().position(KFC).title("KFC - Quevedo").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconcomido2)));

       LatLng LOSMOROS = new LatLng(-1.023203577288594, -79.46571976799041);
        Mapas.addMarker(new MarkerOptions().position(LOSMOROS).title("Los Moros").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconcomido2)));

       LatLng SWETLAND = new LatLng(-1.0323756753779003, -79.46291451260221);
        Mapas.addMarker(new MarkerOptions().position(SWETLAND).title("Sweet Land").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconcomido2)));

        LatLng GORDOGLENN = new LatLng(-1.0145164766790888, -79.46715833292487);
        Mapas.addMarker(new MarkerOptions().position(GORDOGLENN).title("Gordo Glenn").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconcomido2)));

        Mapas.setInfoWindowAdapter(new MainActivity2(this));
    }
    @Override
    public void onMapClick(@NonNull LatLng latLng) {

    }

    private void  obtenerMarcadores(){

    }


}
