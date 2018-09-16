package com.imaisnaini.ezprintprototype.ui;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toolbar;

import com.imaisnaini.ezprintprototype.R;
import com.imaisnaini.ezprintprototype.ui.adapter.TabAdapter;
import com.imaisnaini.ezprintprototype.ui.fragment.KategoriFragment;
import com.imaisnaini.ezprintprototype.ui.fragment.LocationFragment;
import com.imaisnaini.ezprintprototype.ui.helper.DrawerMenuHelper;
import com.mikepenz.materialdrawer.Drawer;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    private TabAdapter mAdapter;
    private Drawer mDrawer;

    @BindView(R.id.activity_main_viewPager) ViewPager mViewPager;
    @BindView(R.id.activity_main_tabLayout) TabLayout mTabLayout;
    @BindView(R.id.activity_main_toolbar)
    android.support.v7.widget.Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        init();
    }

    private void init(){
        mAdapter = new TabAdapter(getSupportFragmentManager());
        mDrawer = DrawerMenuHelper.createDrawer(this, mToolbar);

        mAdapter.addFragment(new LocationFragment(), getString(R.string.tab_location));
        mAdapter.addFragment(new KategoriFragment(), getString(R.string.tab_category));
        mViewPager.setAdapter(mAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
    }
}
