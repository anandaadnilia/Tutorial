import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.example.tutorial9.R;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng petogogan = new LatLng(-6.252828, 106.794783);
        mMap.addMarker(new MarkerOptions().position(petogogan).title("Jl. Petogogan I No. 41"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(petogogan));
    }
}

    Pada file layout google_maps_api.xml, isikan baris kodingan berikut:
<resources>
<!-- Ganti dengan API Key masing-masing -->
<string
        name="google_maps_key"
                templateMergeStrategy="preserve"
                translatable="false">AIzaSyBR0Dg3fRCVea1WYKrvi_9OTLR6ENizgKQ
</string>
</resources>
