package cn.zdxiang.foresee.ui.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import cn.zdxiang.foresee.R;
import cn.zdxiang.foresee.base.BaseActivity;
import cn.zdxiang.foresee.base.BaseFragmentStateAdapter;
import cn.zdxiang.foresee.base.BasePresenterImpl;
import cn.zdxiang.foresee.ui.fragment.ForeseeFragment;
import cn.zdxiang.foresee.ui.fragment.HomeFragment;

public class MainActivity extends BaseActivity {

    @BindView(R.id.viewpager) ViewPager mViewPager;

    @BindView(R.id.navigation) BottomNavigationView bottomNavigationView;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mViewPager.setCurrentItem(0);
                    return true;
                case R.id.navigation_dashboard:
                    mViewPager.setCurrentItem(1);
                    return true;
                case R.id.navigation_notifications:
                    mViewPager.setCurrentItem(2);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initViewpager();
        initNavigation();
    }

    private void initNavigation() {
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    @Override
    protected BasePresenterImpl createPresenter() {
        return null;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    private void initViewpager() {
        List<Fragment> mTabs = new ArrayList<>();
        mTabs.add(HomeFragment.newInstance());
        mTabs.add(ForeseeFragment.newInstance());
        mTabs.add(ForeseeFragment.newInstance());
        mViewPager.setOffscreenPageLimit(mTabs.size());
        mViewPager.setAdapter(new BaseFragmentStateAdapter(mTabs, getSupportFragmentManager()));

        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0 :
                        bottomNavigationView.setSelectedItemId(R.id.navigation_home);
                        break;
                    case 1:
                        bottomNavigationView.setSelectedItemId(R.id.navigation_dashboard);
                        break;
                    case  2:
                        bottomNavigationView.setSelectedItemId(R.id.navigation_notifications);
                        break;
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
