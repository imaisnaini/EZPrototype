package com.imaisnaini.ezprintprototype.ui;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.imaisnaini.ezprintprototype.R;
import com.imaisnaini.ezprintprototype.ui.adapter.TabAdapter;
import com.imaisnaini.ezprintprototype.ui.helper.DrawerMenuHelper;
import com.mikepenz.materialdrawer.Drawer;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailPesananActivity extends AppCompatActivity {
    private Drawer mDrawer;

    @BindView(R.id.activity_detail_pesanan_toolbar)
    Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pesanan);
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
