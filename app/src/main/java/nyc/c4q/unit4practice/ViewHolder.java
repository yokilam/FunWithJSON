package nyc.c4q.unit4practice;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by yokilam on 12/20/17.
 */

public class ViewHolder extends RecyclerView.ViewHolder {
    private TextView text;
    private Context context;

    public ViewHolder(View itemView) {
        super(itemView);

        text = itemView.findViewById(R.id.text);
        context = itemView.getContext();
    }

    public void onBind(Pets1 pets1) {
        text.setText(pets1.getDog());
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("text", text.getText().toString());
                Log.e("asdfsd", text.getText().toString() );
                Fragment1 fragment1 = new Fragment1();
                fragment1.setArguments(bundle);
                FragmentManager fragmentManager= ((FragmentActivity) context).getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.addToBackStack(null).replace(R.id.fragment_container, fragment1);
                fragmentTransaction.commit();

            }
        });
    }
}
