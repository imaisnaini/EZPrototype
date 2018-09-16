package com.imaisnaini.ezprintprototype.ui.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.imaisnaini.ezprintprototype.R;
import com.imaisnaini.ezprintprototype.ui.adapter.MitraAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class PesananSelesaiFragment extends Fragment {
    private MitraAdapter mAdapter;
    private List<String> mList = new ArrayList<>();

    @BindView(R.id.fragment_pesanan_selesai_recyclerView)
    RecyclerView mRvContent;


    public PesananSelesaiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pesanan_selesai, container, false);
        ButterKnife.bind(this, view);
        init();
        initData();

        return view;
    }

    public void init(){
        mAdapter = new MitraAdapter(getActivity());
        mAdapter.generate(mList);
        mRvContent.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRvContent.setAdapter(mAdapter);
    }

    public void initData(){
        String[] kategori = getResources().getStringArray(R.array.list_kategori);
        for (String s : kategori){
            mList.add(s);
        }
    }

}
