package com.imaisnaini.ezprintprototype.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.imaisnaini.ezprintprototype.R;
import com.imaisnaini.ezprintprototype.ui.helper.DrawerMenuHelper;
import com.mikepenz.materialdrawer.Drawer;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MitraActivity extends AppCompatActivity {
    private Drawer mDrawer;

    @BindView(R.id.activity_mitra_toolbar)
    Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mitra);
        ButterKnife.bind(this);

        init();
    }

    private void init(){
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        mDrawer = DrawerMenuHelper.createDrawer(this, mToolbar);

    }
}
