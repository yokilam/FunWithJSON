package nyc.c4q.unit4practice;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by yokilam on 12/20/17.
 */

public class Adapter extends RecyclerView.Adapter<ViewHolder> {
    List<Pets1> pets1List;

    public Adapter(List <Pets1> pets1List) {
        this.pets1List = pets1List;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View childview= LayoutInflater.from(parent.getContext()).inflate(R.layout.itemview, parent, false);
        return new ViewHolder(childview);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.onBind(pets1List.get(position));
    }

    @Override
    public int getItemCount() {
        return pets1List.size();
    }
}
