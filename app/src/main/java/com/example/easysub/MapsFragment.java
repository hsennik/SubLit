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
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsFragment extends Fragment {
    public static int decidingvar;
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
                LatLng uwaterloo = new LatLng(43.4723, -80.5449);
                LatLng lester = new LatLng(43.472707, -80.533738);
                LatLng keats = new LatLng(43.461408,-80.546474);
                LatLng laurier = new LatLng(43.472295, -80.525170);
                LatLng uptown = new LatLng(43.468747, -80.522165);
                CameraPosition cameraPosition = new CameraPosition.Builder().target(uwaterloo).zoom(12).build();
                if (Global.decidingvar==1) {
                    // For dropping a marker at a point on the Map
                    Marker m1 = googleMap.addMarker(new MarkerOptions().position(uwaterloo).title("University of Waterloo").snippet("FOR RENT"));
                    Marker m2 = googleMap.addMarker(new MarkerOptions().position(lester).title("203 Lester Street").snippet("PARTY CENTRAL"));
                    // For zooming automatically to the location of the marker
                    //CameraPosition cameraPosition = new CameraPosition.Builder().target(uwaterloo).zoom(12).build();
                }
                if (Global.decidingvar==2){
                    Marker m2 = googleMap.addMarker(new MarkerOptions().position(lester).title("203 Lester Street").snippet("PARTY CENTRAL"));
                    // For zooming automatically to the location of the marker
                    cameraPosition = new CameraPosition.Builder().target(lester).zoom(12).build();}
                if((Global.decidingvar==3)||(Global.decidingvar==6)){
                    Marker m3= googleMap.addMarker(new MarkerOptions().position(keats).title("111 Keats Way Place").snippet("Nice place"));// For zooming automatically to the location of the marker
                    cameraPosition = new CameraPosition.Builder().target(keats).zoom(12).build();
                }
                if(Global.decidingvar==4){
                    //else if this is checked

                    Marker m4 = googleMap.addMarker(new MarkerOptions().position(laurier).title("16 Ezra Avenue").snippet("St. Patties..."));// For zooming automatically to the location of the marker
                    cameraPosition = new CameraPosition.Builder().target(laurier).zoom(12).build();
                }
                if((Global.decidingvar==5)||(Global.decidingvar==6)){

                    Marker m5 = googleMap.addMarker(new MarkerOptions().position(uptown).title("17 Young Street East").snippet("Not THAT far"));
                    cameraPosition = new CameraPosition.Builder().target(uptown).zoom(12).build();
                    // For zooming automatically to the location of the marker
                }

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
