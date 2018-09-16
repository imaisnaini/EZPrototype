package com.imaisnaini.ezprintprototype.ui.dialog;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.InputType;
import android.widget.Toast;

import com.afollestad.materialdialogs.MaterialDialog;

/**
 * Created by bits on 13/09/16.
 */
public class DialogBuilder {

    public static MaterialDialog showLoadingDialog(Context ctx, String title, String content, boolean isCircularProgress) {
        MaterialDialog.Builder dialog = new MaterialDialog.Builder(ctx)
                .title(title)
                .content(content)
                .progress(true, 0)
                .progressIndeterminateStyle(isCircularProgress);
        return dialog.show();
    }

    public static void showErrorDialog(Context ctx, String content) {
        new MaterialDialog.Builder(ctx)
                .title("Error")
                .content(content)
                .positiveText("OK")
                .show();
    }

    public static MaterialDialog showListDialog(Context context, RecyclerView.Adapter adapter){
        MaterialDialog.Builder dialog = new MaterialDialog.Builder(context)
                .adapter(adapter, null);
        return dialog.show();
    }

    public static MaterialDialog showInputDialog(final Context context, int resTitle, int resHint, MaterialDialog.InputCallback callback){
        MaterialDialog.Builder builder = new MaterialDialog.Builder(context)
                .title(resTitle)
                .inputType(InputType.TYPE_CLASS_TEXT)
                .input(resHint, 0, false, callback)
                .cancelable(false);
        return builder.show();
    }
}
