package com.example.yuxuehai.wallpager.ui.fragment;

import com.example.yuxuehai.wallpager.base.BaseFragment;
import com.example.yuxuehai.wallpager.utils.Constants;

import java.util.HashMap;

/**
 * Created by yuxuehai on 17-12-11.
 */

public class FragmentFactory {

    private static HashMap<Integer, BaseFragment> mFragmentMap = new HashMap<Integer, BaseFragment>();


    public static BaseFragment getFragment(int position){
        BaseFragment fragment = mFragmentMap.get(position);


        //先从集合中取，如果没有才创建对象，可以提高性能
        if (fragment == null) {

            switch (position) {
                case 0:
                    fragment = new DemoFragment(Constants.CHANNLE_NEW);
                    break;
                case 1:
                    fragment = new DemoFragment(Constants.CHANNLE_PICK);
                    break;
                case 2:
                    fragment = new DemoFragment(Constants.CHANNLE_ARC);
                    break;
                case 3:
                    fragment = new DemoFragment(Constants.CHANNLE_FOOD);
                    break;
                case 4:
                    fragment = new DemoFragment(Constants.CHANNLE_NATURE);
                    break;
                case 5:
                    fragment = new DemoFragment(Constants.CHANNLE_GOOD);
                    break;
                case 6:
                    fragment = new DemoFragment(Constants.CHANNLE_PERSON);
                    break;
                case 7:
                    fragment = new DemoFragment(Constants.CHANNLE_TECH);
                    break;
                default:
                    break;
            }

            mFragmentMap.put(position, fragment);
        }


        return fragment;
    }
}