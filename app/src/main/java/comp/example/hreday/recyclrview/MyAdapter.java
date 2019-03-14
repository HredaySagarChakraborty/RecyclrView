package comp.example.hreday.recyclrview;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {


    Context context;
    int[] images;
    String[] country, desc;

    MyAdapter(Context context, int[] images, String[] country, String[] desc) {
        this.context = context;
        this.images = images;
        this.country = country;
        this.desc = desc;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(R.layout.sample, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.title.setText(country[position]);
        holder.title2.setText(desc[position]);
        holder.img.setImageResource(images[position]);

    }

    @Override
    public int getItemCount() {
        return country.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {


        TextView title, title2;
        ImageView img;

        public MyViewHolder(View itemView) {
            super(itemView);


            title = itemView.findViewById(R.id.textViewId);
            title2 = itemView.findViewById(R.id.textView2Id);


            img = itemView.findViewById(R.id.imageViewId);
        }
    }
}
