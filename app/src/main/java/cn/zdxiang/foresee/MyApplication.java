package cn.zdxiang.foresee;

import com.marswin89.marsdaemon.DaemonApplication;
import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * @author Jm
 * @date 17-7-10下午3:33
 */
public class MyApplication extends TinkerApplication {


    public MyApplication() {
        super(ShareConstants.TINKER_ENABLE_ALL, "cn.zdxiang.foresee.MyApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }
}
