package com.jatin.preferences;

import android.os.Bundle;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import com.jatin.preferences.ui.main.Fragment_App;
import com.jatin.preferences.ui.main.SectionsPagerAdapter;
import com.jatin.preferences.ui.main.ViewAdapter;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppBarLayout appBarLayout = findViewById(R.id.appbar);
        ViewPager viewPager = findViewById(R.id.viewpager);
        TabLayout tabs = findViewById(R.id.tablayout);
        ViewAdapter adapter = new ViewAdapter(getSupportFragmentManager());
        adapter.AddFragment(new Fragment_Match(),"Match Preferences");
        adapter.AddFragment(new Fragment_App(),"App Preferences");
        viewPager.setAdapter(adapter);
        tabs.setupWithViewPager(viewPager);
        SeekBar seekBar = findViewById(R.id.seek);
        final TextView textView = findViewById(R.id.textView18);
        /*seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textView.setText(Integer.toString(progress) + "yrs");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });*/



    }
}