package com.imaisnaini.ezprintprototype.ui;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.imaisnaini.ezprintprototype.R;
import com.imaisnaini.ezprintprototype.ui.adapter.TabAdapter;
import com.imaisnaini.ezprintprototype.ui.fragment.SigninFragment;
import com.imaisnaini.ezprintprototype.ui.fragment.SignupFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity {
    private TabAdapter adapter;

    @BindView(R.id.activity_login_viewPager) ViewPager viewPager;
    @BindView(R.id.activity_login_tabLayout) TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        init();
    }

    private void init(){
        adapter = new TabAdapter(getSupportFragmentManager());
        adapter.addFragment(new SigninFragment(), getString(R.string.tab_sign_in));
        adapter.addFragment(new SignupFragment(), getString(R.string.tab_sign_up));
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
