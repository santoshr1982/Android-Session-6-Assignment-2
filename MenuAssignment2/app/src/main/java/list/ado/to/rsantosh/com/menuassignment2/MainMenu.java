package list.ado.to.rsantosh.com.menuassignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    //This code has been written to create the options menu.
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        //Declaration and initialisation of the menu.
        MenuInflater menuInflater = getMenuInflater();
        //Creating the menu by extracting the menu items fro the XML files.
        menuInflater.inflate(R.menu.main_menu,menu);

        return true;
    }

    //This code has been written to initialise the menu click.
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        //Switch statement.
        switch (item.getItemId()){

            //Case to display the toast as per the menu clicked.
            case R.id.help:

                Toast.makeText(getApplicationContext(),"" + item,Toast.LENGTH_SHORT).show();
                return true;

            //Case to display the toast as per the menu clicked.
            case R.id.about:

                Toast.makeText(getApplicationContext(),"" + item,Toast.LENGTH_SHORT).show();
                return true;

        }

        return super.onOptionsItemSelected(item);
    }
}
