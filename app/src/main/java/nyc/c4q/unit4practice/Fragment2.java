package nyc.c4q.unit4practice;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment2 extends Fragment {
    private TextView textView;
    private Bundle bundle;
    private String str;

    public Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment2, container, false);

        textView = view.findViewById(R.id.fragment_text2);
        bundle = getArguments();
        str = bundle.getString("text");
        textView.setText(str);

        return view;
    }

}
