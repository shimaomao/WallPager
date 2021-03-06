package com.example.yuxuehai.wallpager.data;

import com.example.yuxuehai.wallpager.data.net.HttpHelperImpl;
import com.example.yuxuehai.wallpager.data.net.HttpManage;

/**
 * Created by yuxuehai on 17-12-2.
 */

public class NetModel{

    private volatile static NetModel mNetModel;

    public HttpHelperImpl getHttpHelper() {
        return mHttpHelper;
    }

    private HttpHelperImpl mHttpHelper;

    public static NetModel getNetModel(){

        if (mNetModel == null){
            synchronized (NetModel.class){
                if (mNetModel == null){
                    mNetModel = new NetModel();
                }
            }
        }
        return mNetModel;
    }

    public NetModel(){
        //获取api类
        mHttpHelper = new HttpHelperImpl(HttpManage.getHttpManage().getWallPagerApis());
    }


}
