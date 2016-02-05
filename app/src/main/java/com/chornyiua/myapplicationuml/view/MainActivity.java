package com.chornyiua.myapplicationuml.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.chornyiua.myapplicationuml.R;
import com.chornyiua.myapplicationuml.presenter.Presenter;
import com.chornyiua.myapplicationuml.presenter.PresenterImpl;

public class MainActivity extends AppCompatActivity {

    private Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new PresenterImpl();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void onClickFAB (){

    }
}
