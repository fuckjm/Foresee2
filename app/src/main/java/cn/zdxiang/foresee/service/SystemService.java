package cn.zdxiang.foresee.service;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

import cn.zdxiang.invoker.service.BaseBizService;

/**
 * @author Jm
 * @date 17-7-10下午4:06
 */
public class SystemService extends BaseBizService {

    public static void start(Context context) {
        Intent intent = new Intent(context, SystemService.class);
        context.startService(intent);
    }

    @Override
    public Boolean shouldStopService(Intent intent, int i, int i1) {
        return null;
    }

    @Override
    public void startWork(Intent intent, int i, int i1) {

    }

    @Override
    public void stopWork(Intent intent, int i, int i1) {

    }

    @Override
    public Boolean isWorkRunning(Intent intent, int i, int i1) {
        return null;
    }

    @Override
    public IBinder onBind(Intent intent, Void aVoid) {
        return null;
    }

    @Override
    public void onServiceKilled(Intent intent) {

    }
}
