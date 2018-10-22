package com.imaisnaini.ezprintprototype.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.imaisnaini.ezprintprototype.R;
import com.imaisnaini.ezprintprototype.ui.DetailPesananActivity;
import com.imaisnaini.ezprintprototype.ui.MitraActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PesananAdapter extends RecyclerView.Adapter<PesananAdapter.ViewHolder>{
    private List<String> mList = new ArrayList<>();
    Context ctx;

    public PesananAdapter(Context ctx) {
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pesanan, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvTittle.setText(mList.get(position));
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.item_pesanan_tvMitra)
        TextView tvTittle;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        @OnClick(R.id.item_pesanan_cardView) public void onClick(){
            Intent intent = new Intent(ctx, DetailPesananActivity.class);
            ctx.startActivity(intent);
        }
    }

    public void generate(List<String> list) {
        clear();
        this.mList = list;
        notifyDataSetChanged();
    }

    public void clear() {
        mList.clear();
        notifyDataSetChanged();
    }
}
