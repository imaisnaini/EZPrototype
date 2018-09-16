package com.imaisnaini.ezprintprototype.ui.helper;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.imaisnaini.ezprintprototype.R;
import com.imaisnaini.ezprintprototype.ui.PesananActivity;
import com.imaisnaini.ezprintprototype.ui.ProfileActivity;
import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

public class DrawerMenuHelper {
    private static AccountHeader header(Activity activity){
        ProfileDrawerItem operator1 = new ProfileDrawerItem().withName("D3 IT A").withIcon(R.drawable.ic_account_circle_black_24dp);
        AccountHeaderBuilder mHeader = new AccountHeaderBuilder()
                .withActivity(activity)
                .withHeaderBackground(R.drawable.header_drawer)
                .addProfiles(
                        operator1
                );
        return mHeader.build();
    }

    public static Drawer createDrawer(final Activity activity, Toolbar toolbar){
        PrimaryDrawerItem profileItem = new PrimaryDrawerItem()
                .withIdentifier(0)
                .withName(R.string.menu_profile)
                .withIcon(R.drawable.ic_person_blue_24dp);
        PrimaryDrawerItem pesanItem = new PrimaryDrawerItem()
                .withIdentifier(1)
                .withName(R.string.menu_pesan)
                .withIcon(R.drawable.ic_mail_outline_blue_24dp);
        PrimaryDrawerItem notificationItem = new PrimaryDrawerItem()
                .withIdentifier(2)
                .withName(R.string.menu_notification)
                .withIcon(R.drawable.ic_notifications_none_blue_24dp);
        PrimaryDrawerItem historyItem = new PrimaryDrawerItem()
                .withIdentifier(3)
                .withName(R.string.menu_history)
                .withIcon(R.drawable.ic_history_blue_24dp);
        PrimaryDrawerItem helpItem = new PrimaryDrawerItem()
                .withIdentifier(4)
                .withName(R.string.menu_help)
                .withIcon(R.drawable.ic_live_help_blue_24dp);
        PrimaryDrawerItem infoItem = new PrimaryDrawerItem()
                .withIdentifier(5)
                .withName(R.string.menu_info)
                .withIcon(R.drawable.ic_info_outline_blue_24dp);
        PrimaryDrawerItem settingItem = new PrimaryDrawerItem()
                .withIdentifier(6)
                .withName(R.string.menu_setting)
                .withIcon(R.drawable.ic_settings_blue_24dp);

        DrawerBuilder mDrawer = new DrawerBuilder()
                .withActivity(activity)
                .withToolbar(toolbar)
                .withAccountHeader(header(activity))
                .withSelectedItem(-1)
                .addDrawerItems(
                        profileItem,
                        pesanItem,
                        notificationItem,
                        historyItem,
                        new DividerDrawerItem(),
                        helpItem,
                        infoItem,
                        settingItem
                )
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        long i = drawerItem.getIdentifier();
                        if (i == 0){
                            activity.startActivity(new Intent(activity, ProfileActivity.class));
                            activity.finish();
                        }else if (i == 1){

                        }else if (i == 2){

                        }else if (i == 3){
                            activity.startActivity(new Intent(activity, PesananActivity.class));
                            activity.finish();
                        }else if (i == 4){

                        }else if (i == 5){

                        }else if (i == 6){

                        }
                        return false;
                    }
                });
        return mDrawer.build();
    }
}
