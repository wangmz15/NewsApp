package com.ihandy.a2014011446.ui;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.SearchView;
import android.widget.TextView;

import com.ihandy.a2014011446.R;
import com.ihandy.a2014011446.ui.widget.GestureFrameLayout;

/**
 * Created by Starry Sky on 2017/9/10.
 */

public class SearchActivity extends BaseActivity {
    private GestureFrameLayout mGestureFrameLayout;  //滑动返回
    private SearchView mSearchView;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);


        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_arrow_back_black_18dp));
        setSupportActionBar(mToolbar);
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SearchActivity.this.finish();
            }
        });

        mSearchView = (SearchView)findViewById(R.id.searchview);
        mSearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                        // 当点击搜索按钮时触发该方法
                @Override
                public boolean onQueryTextSubmit(String query){
                    ViewInit(query);
                }

                @Override
                public boolean onQueryTextChange(String s) {
                    return false;
                }
            });
        mGestureFrameLayout = (GestureFrameLayout) findViewById(R.id.search_gesture_layout);
        mGestureFrameLayout.attachToActivity(this);
    }

}
