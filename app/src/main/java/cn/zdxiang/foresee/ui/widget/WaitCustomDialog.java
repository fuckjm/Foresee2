package cn.zdxiang.foresee.ui.widget;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import cn.zdxiang.foresee.R;


/**
 * Refactor by jm
 *
 * @date 20170524
 */
public class WaitCustomDialog extends Dialog {

    private TextView textView;
    private ProgressBar dialog_progress;

    public WaitCustomDialog(Context context) {
        super(context, R.style.NoFrameDialog);
        init(context);
    }

    public WaitCustomDialog(Context context, boolean canCancel) {
        super(context, R.style.NoFrameDialog);
        setCanceledOnTouchOutside(canCancel);
        setCancelable(canCancel);
        init(context);

    }

    private void init(Context context) {
        View view = LayoutInflater.from(context).inflate(R.layout.dialog_loading, null);
        textView = (TextView) view.findViewById(R.id.dialog_text);
        dialog_progress = (ProgressBar) view.findViewById(R.id.dialog_progress);
        setContentView(view);
    }


    public void setText(String text) {
        if (text != null && !text.equals("")) {
            dialog_progress.setVisibility(View.VISIBLE);
            textView.setText(text);
            textView.setVisibility(View.VISIBLE);
        } else {
            dialog_progress.setVisibility(View.VISIBLE);
            textView.setVisibility(View.GONE);
        }
    }

    public void resetText() {
        textView.setText("正在加载中...");
    }

    public void showDialog() {
        if (!isShowing()) {
            show();
        }
    }

    public void closeDialog() {
        dismiss();
    }
}
