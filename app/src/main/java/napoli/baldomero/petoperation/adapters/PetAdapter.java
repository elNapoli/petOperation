package napoli.baldomero.petoperation.adapters;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import napoli.baldomero.petoperation.R;
import napoli.baldomero.petoperation.pojo.Pets;

/**
 * Created by elnapoli on 23-11-17.
 */

public class PetAdapter extends RecyclerView.Adapter<PetAdapter.PetViewHolder> {

    ArrayList<Pets> misMascotas;

    public PetAdapter(ArrayList<Pets> misMascotas){
        this.misMascotas = misMascotas;
    }

    @Override
    public PetViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_pet,parent,false);
        return new PetViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(PetViewHolder petViewHolder, int position) {
        Pets mascota = misMascotas.get(position);
        petViewHolder.ivProfile.setImageResource(mascota.getPhoto());
        petViewHolder.tvName.setText(mascota.getName());
        petViewHolder.tvRating.setText(String.valueOf( mascota.getLike()));
    }

    @Override
    public int getItemCount() {
        return misMascotas.size();
    }

    public  static class PetViewHolder extends RecyclerView.ViewHolder{

        private ImageView ivProfile;
        private TextView tvName;
        private TextView tvRating;

        public PetViewHolder(View itemView) {
            super(itemView);
            ivProfile = (ImageView) itemView.findViewById(R.id.ivProfile);
            tvName = (TextView) itemView.findViewById(R.id.tvName);
            tvRating = (TextView) itemView.findViewById(R.id.tvRating);
        }
    }
}
