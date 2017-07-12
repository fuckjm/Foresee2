package cn.zdxiang.foresee.base;

/**
 * @author jm
 * @date 16-12-6.下午3:17
 * @description BasePresenter
 */

public interface BasePresenter<V> {

    void attachView(V view);

    void detachView();

}
