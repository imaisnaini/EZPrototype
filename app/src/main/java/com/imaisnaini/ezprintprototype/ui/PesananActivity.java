package com.imaisnaini.ezprintprototype.ui;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.imaisnaini.ezprintprototype.R;
import com.imaisnaini.ezprintprototype.ui.adapter.TabAdapter;
import com.imaisnaini.ezprintprototype.ui.fragment.KategoriFragment;
import com.imaisnaini.ezprintprototype.ui.fragment.LocationFragment;
import com.imaisnaini.ezprintprototype.ui.fragment.PesananFragment;
import com.imaisnaini.ezprintprototype.ui.fragment.PesananSelesaiFragment;
import com.imaisnaini.ezprintprototype.ui.helper.DrawerMenuHelper;
import com.mikepenz.materialdrawer.Drawer;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PesananActivity extends AppCompatActivity {
    private TabAdapter mAdapter;
    private Drawer mDrawer;

    @BindView(R.id.activity_pesanan_viewPager)
    ViewPager mViewPager;
    @BindView(R.id.activity_pesanan_tabLayout)
    TabLayout mTabLayout;
    @BindView(R.id.activity_pesanan_toolbar)
    android.support.v7.widget.Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesanan);
        ButterKnife.bind(this);
        init();
    }

    private void init(){
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        mAdapter = new TabAdapter(getSupportFragmentManager());
        mDrawer = DrawerMenuHelper.createDrawer(this, mToolbar);

        mAdapter.addFragment(new PesananFragment(), getString(R.string.tab_progress));
        mAdapter.addFragment(new PesananSelesaiFragment(), getString(R.string.tab_done));
        mViewPager.setAdapter(mAdapter);
        mTabLayout.setupWithViewPager(mViewPager);

    }
}
