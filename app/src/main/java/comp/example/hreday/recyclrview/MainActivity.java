package comp.example.hreday.recyclrview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    MyAdapter myAdapter;

    int images[]={R.drawable.arg,
             R.drawable.brazil,
            R.drawable.canada,
            R.drawable.china,
            R.drawable.germany,
            R.drawable.india,
            R.drawable.iraq,
            R.drawable.japan,
            R.drawable.pakistan,
            R.drawable.russia,
            R.drawable.spain,
            R.drawable.uk,

    };
    String[]country,desc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerViewiD);


        country=getResources().getStringArray(R.array.country_name);
        desc=getResources().getStringArray(R.array.country_desc);


        myAdapter=new MyAdapter(this,images,country,desc);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }
}
