package com.mycompany.flavorsdemo.flavorsdemo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.mycompany.flavorsdemo.mylibrary.CustomerType;
import com.mycompany.flavorsdemo.mylibrary.MyAPi;
import com.mycompany.flavorsdemo.mylibrary.MyApiImpl;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //you had to rebuild the project when changing the build variants
        MyAPi api = new MyApiImpl();
        if(api.getCustomerType() == CustomerType.CUSTOMER1) {
            Log.d("xxx", "Customer version");
        } else {
            Log.d("xxx", "Internal version");
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
