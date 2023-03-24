import android.os.Bundle;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity1 extends AppCompatActivity {

    ListView ListView;
    String name={"A-108 Lecture Hall","A-106 Lecture Hall","A-104 Basic Electronic Lab","A-102 Staff Room","A-101 Visitors' Room","A-103 Staff Room","A-105 Language Lab","A-107 Lecture Hall","A-109 Lecture Hall",
            "A-308 Lecture Hall","A-306 Lecture Hall","A-304 Lecture Hall","A-102 HOD","A-301 Staff Room","A-303 Chemistry Lab Physics LAb","A-305 Lecture Hall","A-307 Lecture Hall"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        MenuItem menuItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setQuery("Type here to search");
        searchView.setOnQueryTextListner(new SearchView.OnQueryTextListener()){
            @Override
            public boolean onQuerryTextSubmit(String Querry){
                return false;
            }
            @Override
            public boolean onQueryTextChange(String newText){



                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }
}