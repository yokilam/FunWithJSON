package nyc.c4q.unit4practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv=findViewById(R.id.rv);
        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rv.setLayoutManager(linearLayoutManager);


        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("name", "yoke");
            jsonObject.put("Pet",new JSONArray().put(new JSONObject().put("Dog", "Luna"))
                    .put(new JSONObject().put("Dog", "Ginger"))
                            .put(new JSONObject().put("Dog", "Bread")));
            jsonObject.put("pets2",new JSONArray().put("Dog").put("Cat").put("JellyFish").put("hamster"));
            Log.e("HELLOYOKE", jsonObject.toString());

        } catch (JSONException e) {
            e.printStackTrace();
        }
        Adapter adapter= new Adapter(parseJSONArray(jsonObject));
        rv.setAdapter(adapter);
    }

    private List<Pets1> parseJSONArray(JSONObject jsonObject) {
        List<Pets1> tester = new ArrayList<>();


        try {
            JSONArray jsonArray = jsonObject.getJSONArray("Pet");
            Log.e("JSONARRAY", jsonArray.toString());
            for (int i = 0; i < jsonArray.length() ; i++) {
                Pets1 pets1 = new Pets1();
                JSONObject dogObject = (JSONObject) jsonArray.get(i);
                String objectName= dogObject.getString("Dog");
                pets1.setDog(objectName);
                tester.add(pets1);
                Log.e("WEEEEEEEEEE", objectName  );
            }


            
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return tester;
    }

}
