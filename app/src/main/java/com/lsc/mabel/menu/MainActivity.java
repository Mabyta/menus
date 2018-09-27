package com.lsc.mabel.menu;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton buttonPopup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPopup=(ImageButton) findViewById(R.id.button_popup);

        buttonPopup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final PopupMenu popup = new PopupMenu(MainActivity.this,buttonPopup);
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            case R.id.item:
                                Toast.makeText(getApplicationContext(), "Popup Toast",Toast.LENGTH_SHORT).show();
                                return true;
                            case R.id.item2:
                                Toast.makeText(getApplicationContext(), "Toast two", Toast.LENGTH_SHORT).show();
                                return true;
                            case R.id.item3:
                                Toast.makeText(getApplicationContext(), "Toast 3", Toast.LENGTH_SHORT).show();
                                return true;
                            default:
                                return false;
                        }

                    }
                });
                popup.show();
            }
        });
        TabLayout tabLayout=(TabLayout) findViewById(R.id.tab);
    }
}
