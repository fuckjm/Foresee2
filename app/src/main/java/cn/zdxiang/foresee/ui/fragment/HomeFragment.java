package cn.zdxiang.foresee.ui.fragment;

import android.os.Bundle;

import cn.zdxiang.foresee.R;
import cn.zdxiang.foresee.base.BasePresenterImpl;
import cn.zdxiang.foresee.base.MvpFragment;

/**
 * @author Jm
 * @date 17-7-10下午3:34
 */
public class HomeFragment extends MvpFragment {

    public static HomeFragment newInstance() {

        Bundle args = new Bundle();

        HomeFragment fragment = new HomeFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.home_frag;
    }

    @Override
    protected BasePresenterImpl createPresenter() {
        return null;
    }
}
