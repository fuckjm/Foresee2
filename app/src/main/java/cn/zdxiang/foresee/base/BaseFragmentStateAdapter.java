package cn.zdxiang.foresee.base;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * @author jm
 * @date 16-12-13.下午2:34
 * @description BaseFragmentStateAdapter
 */

public class BaseFragmentStateAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> fragments;

    public BaseFragmentStateAdapter(List<Fragment> list, FragmentManager fm) {
        super(fm);
        this.fragments = list;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments == null ? 0 : fragments.size();
    }
}
