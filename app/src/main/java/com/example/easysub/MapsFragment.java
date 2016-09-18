package com.example.easysub;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.easysub.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsFragment extends Fragment {

    MapView mMapView;
    private GoogleMap googleMap;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_location, container, false);

        mMapView = (MapView) rootView.findViewById(R.id.mapView);
        mMapView.onCreate(savedInstanceState);

        mMapView.onResume(); // needed to get the map to display immediately

        try {
            MapsInitializer.initialize(getActivity().getApplicationContext());
        } catch (Exception e) {
            e.printStackTrace();
        }

        mMapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap mMap) {
                googleMap = mMap;

                //if this is checked
                    // For dropping a marker at a point on the Map
                    LatLng uwaterloo = new LatLng(43.4723, -80.5449);
                    googleMap.addMarker(new MarkerOptions().position(uwaterloo).title("University of Waterloo").snippet("FOR RENT"));
                    // For zooming automatically to the location of the marker
                    CameraPosition cameraPosition = new CameraPosition.Builder().target(uwaterloo).zoom(12).build();
               // else if this is checked
                    LatLng lester = new LatLng(43.472745,80.533844);
                    googleMap.addMarker(new MarkerOptions().position(lester).title("203 Lester Street").snippet("PARTY CENTRAL"));
                    // For zooming automatically to the location of the marker
                   // CameraPosition cameraPosition = new CameraPosition.Builder().target(lester).zoom(12).build();
                //else if this is checked
                    LatLng laurier = new LatLng(43.472130,80.525179);
                    googleMap.addMarker(new MarkerOptions().position(laurier).title("16 Ezra Avenue").snippet("St. Patties..."));// For zooming automatically to the location of the marker
                    //CameraPosition cameraPosition = new CameraPosition.Builder().target(laurier).zoom(12).build();
                //else if this is checked
                    LatLng uptown = new LatLng(43.472130,80.525179);
                    googleMap.addMarker(new MarkerOptions().position(uptown).title("17 Young Street East").snippet("Not THAT far"));// For zooming automatically to the location of the marker
                    //CameraPosition cameraPosition = new CameraPosition.Builder().target(uptown).zoom(12).build();
                //else
                    LatLng keats = new LatLng(43.472130,80.525179);
                    googleMap.addMarker(new MarkerOptions().position(keats).title("111 Keats Way Place").snippet("Nice place"));// For zooming automatically to the location of the marker
                    //CameraPosition cameraPosition = new CameraPosition.Builder().target(keats).zoom(12).build();
                //end

                googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
            }
        });

        return rootView;
    }

    @Override
    public void onResume() {
        super.onResume();
        mMapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mMapView.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mMapView.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mMapView.onLowMemory();
    }
}
