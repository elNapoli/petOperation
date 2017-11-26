package napoli.baldomero.petoperation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

import napoli.baldomero.petoperation.adapters.PetAdapter;
import napoli.baldomero.petoperation.pojo.Pets;

public class MainActivity extends AppCompatActivity {
    ArrayList<Pets> misMascotas;
    private RecyclerView rvPet;
    PetAdapter miAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar actionBar = (Toolbar) findViewById(R.id.actionBar);

        setSupportActionBar(actionBar);
        rvPet = (RecyclerView) findViewById(R.id.rvPet);
        initPets();
        miAdapter = new PetAdapter(this,misMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvPet.setLayoutManager(llm);
        rvPet.setAdapter(miAdapter);
    }
    public void initPets(){
        misMascotas = new ArrayList<Pets>();
        misMascotas.add(new Pets("Burbuja",R.drawable.elefante));
        misMascotas.add(new Pets("Perry",R.drawable.jirafa));
        misMascotas.add(new Pets("Osoman",R.drawable.leon));
        misMascotas.add(new Pets("Mano Larga",R.drawable.mono));
        misMascotas.add(new Pets("Diego",R.drawable.tigre));

    }
}
