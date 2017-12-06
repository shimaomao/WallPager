package com.example.yuxuehai.wallpager.presenter.dao;

import android.view.View;

/**
 * Created by yuxuehai on 17-12-3.
 */

public interface DemoPresenterDao {


    boolean hasNetWork();

    void getRecentPhotos();

    void loadMorePhotoes();

    void setClickEvent(View view);
}
