package com.ihandy.a2014011446.ui.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.ihandy.a2014011446.biz.NewsItemBiz;


public class BaseFragment extends Fragment {
    protected NewsItemBiz mNewsItemBiz;
//    protected NewsTypeBiz mNewsTypeBiz;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mNewsItemBiz = new NewsItemBiz(getActivity());
//        mNewsItemBiz = new NewsItemBiz(getActivity());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mNewsItemBiz != null){
        }
    }
}
