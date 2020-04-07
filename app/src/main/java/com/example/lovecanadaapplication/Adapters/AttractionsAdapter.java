package com.example.lovecanadaapplication.Adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lovecanadaapplication.Model.CanadaAttraction;
import com.example.lovecanadaapplication.PlaceDetails;
import com.example.lovecanadaapplication.R;

import java.util.ArrayList;

public class AttractionsAdapter extends RecyclerView.Adapter<AttractionsAdapter.AttractionViewHolder>
{
    ArrayList<CanadaAttraction> placesArrayList;


    public AttractionsAdapter(ArrayList<CanadaAttraction> placesArrayList) {
        this.placesArrayList = placesArrayList;
    }

    @NonNull
    @Override
    public AttractionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_attraction, parent, false);
        AttractionViewHolder mAttractionViewHolder = new AttractionViewHolder(mView);
        return mAttractionViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final AttractionViewHolder holder, final int position) {
        CanadaAttraction mCanadaAttraction = this.placesArrayList.get(position);
        holder.lblattractionName.setText(mCanadaAttraction.getPlaceName());
        holder.imgPlace.setImageResource(mCanadaAttraction.getImgPlace());
        holder.itemView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                CanadaAttraction atr = placesArrayList.get(position);
               // Toast.makeText(holder.itemView.getContext(), "C : " + atr.getDescription(), Toast.LENGTH_SHORT).show();
              //  Log.d("CLICK", "hello");
                CanadaAttraction mCanadaAttraction = placesArrayList.get(position);
                Intent mIntent = new Intent(holder.itemView.getContext(), PlaceDetails.class);
                //Add Parameter - Parcalble or serializable
                mIntent.putExtra("PlaceDetails", atr);
                holder.itemView.getContext().startActivity(mIntent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return this.placesArrayList.size();
    }


    public class AttractionViewHolder  extends RecyclerView.ViewHolder  {

        TextView lblattractionName;
        ImageView imgPlace;
        public AttractionViewHolder(@NonNull View itemView) {
            super(itemView);
            this.lblattractionName = itemView.findViewById(R.id.txt_attraction_name);
            this.imgPlace = itemView.findViewById(R.id.img_place);
        }
    }
}
