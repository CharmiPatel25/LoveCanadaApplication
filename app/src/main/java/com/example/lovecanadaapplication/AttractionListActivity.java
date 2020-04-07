package com.example.lovecanadaapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.lovecanadaapplication.Adapters.AttractionsAdapter;
import com.example.lovecanadaapplication.Model.CanadaAttraction;

import java.util.ArrayList;

public class AttractionListActivity extends AppCompatActivity {
    private RecyclerView rvPlacesList;
    private ArrayList<CanadaAttraction> places;
    private AttractionsAdapter placesAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attraction_list);
        rvPlacesList = findViewById(R.id.rv_places_list);
        populatePlaces();
        placesAdapter = new AttractionsAdapter(places);
        RecyclerView.LayoutManager mLinearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rvPlacesList.setLayoutManager(mLinearLayoutManager);
        rvPlacesList.setAdapter(placesAdapter);

    }

    private void populatePlaces()
    {

        places = new ArrayList<>();
        places.add(new CanadaAttraction("1"," Niagara Falls","6650 Niagara Parkway. (River Rd) Niagara Falls","Toronto","Ontario",
                "Niagara Falls is Canada's most famous natural attraction bringing in millions of visitors each year","https://www.niagarafallstourism.com/",R.drawable.niagara));
        places.add(new CanadaAttraction("2","Banff National Park & the Rocky Mountains","029 Banff Ave, Banff, AB T1L 1H8","Banff","Alberta",
                "Turquoise-colored lakes, snow-capped peaks, and glaciers are all easily accessible in this stunning park","https://www.pc.gc.ca/en/pn-np/ab/banff",R.drawable.rocky));
        places.add(new CanadaAttraction("3","Toronto's CN Tower","029 Banff Ave, Banff, AB T1L 1H8","Banff","Alberta",
                "Turquoise-colored lakes, snow-capped peaks, and glaciers are all easily accessible in this stunning park","https://www.pc.gc.ca/en/pn-np/ab/banff",R.drawable.cntower));
        places.add(new CanadaAttraction("4","Old Quebec","029 Banff Ave, Banff, AB T1L 1H8","Banff","Alberta",
                "Turquoise-colored lakes, snow-capped peaks, and glaciers are all easily accessible in this stunning park","https://www.pc.gc.ca/en/pn-np/ab/banff",R.drawable.oldqubec));
        places.add(new CanadaAttraction("5","Whistler","029 Banff Ave, Banff, AB T1L 1H8","Banff","Alberta",
                "Turquoise-colored lakes, snow-capped peaks, and glaciers are all easily accessible in this stunning park","https://www.pc.gc.ca/en/pn-np/ab/banff",R.drawable.whistler));
        places.add(new CanadaAttraction("6","Ottawa's Parliament Hill","029 Banff Ave, Banff, AB T1L 1H8","Banff","Alberta",
                "Turquoise-colored lakes, snow-capped peaks, and glaciers are all easily accessible in this stunning park","https://www.pc.gc.ca/en/pn-np/ab/banff",R.drawable.parliamnethill));
        places.add(new CanadaAttraction("7","St. John's Signal Hill National Historic Site","029 Banff Ave, Banff, AB T1L 1H8","Banff","Alberta",
                "Turquoise-colored lakes, snow-capped peaks, and glaciers are all easily accessible in this stunning park","https://www.pc.gc.ca/en/pn-np/ab/banff",R.drawable.stjohn));
        places.add(new CanadaAttraction("8","Old Montreal","029 Banff Ave, Banff, AB T1L 1H8","Banff","Alberta",
                "Turquoise-colored lakes, snow-capped peaks, and glaciers are all easily accessible in this stunning park","https://www.pc.gc.ca/en/pn-np/ab/banff",R.drawable.oldmonteral));
        places.add(new CanadaAttraction("9","Polar Bears of Churchill","029 Banff Ave, Banff, AB T1L 1H8","Banff","Alberta",
                "Turquoise-colored lakes, snow-capped peaks, and glaciers are all easily accessible in this stunning park","https://www.pc.gc.ca/en/pn-np/ab/banff",R.drawable.bear));
        places.add(new CanadaAttraction("10","Vancouver Island","029 Banff Ave, Banff, AB T1L 1H8","Banff","Alberta",
                "Turquoise-colored lakes, snow-capped peaks, and glaciers are all easily accessible in this stunning park","https://www.pc.gc.ca/en/pn-np/ab/banff",R.drawable.vancourisland));
        places.add(new CanadaAttraction("11"," Bay of Fundy","029 Banff Ave, Banff, AB T1L 1H8","Banff","Alberta",
                "Turquoise-colored lakes, snow-capped peaks, and glaciers are all easily accessible in this stunning park","https://www.pc.gc.ca/en/pn-np/ab/banff",R.drawable.bayoffundy));
        places.add(new CanadaAttraction("12","Victoria's Inner Harbour","029 Banff Ave, Banff, AB T1L 1H8","Banff","Alberta",
                "Turquoise-colored lakes, snow-capped peaks, and glaciers are all easily accessible in this stunning park","https://www.pc.gc.ca/en/pn-np/ab/banff",R.drawable.harbour));
        places.add(new CanadaAttraction("13","Gros Morne National Park","029 Banff Ave, Banff, AB T1L 1H8","Banff","Alberta",
                "Turquoise-colored lakes, snow-capped peaks, and glaciers are all easily accessible in this stunning park","https://www.pc.gc.ca/en/pn-np/ab/banff",R.drawable.park));
        places.add(new CanadaAttraction("14","Vancouver's Stanley Park","029 Banff Ave, Banff, AB T1L 1H8","Banff","Alberta",
                "Turquoise-colored lakes, snow-capped peaks, and glaciers are all easily accessible in this stunning park","https://www.pc.gc.ca/en/pn-np/ab/banff",R.drawable.stanley));
        places.add(new CanadaAttraction("15","Calgary Stampede","029 Banff Ave, Banff, AB T1L 1H8","Banff","Alberta",
                "Turquoise-colored lakes, snow-capped peaks, and glaciers are all easily accessible in this stunning park","https://www.pc.gc.ca/en/pn-np/ab/banff",R.drawable.calagry));
    }
}
