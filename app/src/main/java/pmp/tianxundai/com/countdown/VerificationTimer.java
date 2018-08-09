package pmp.tianxundai.com.countdown;

import android.os.CountDownTimer;
import android.util.Log;
import android.widget.TextView;

/**
 * 创建人： Nine tails fox
 * 创建时间： 2018/8/9 12:00
 * 功能描述：功能
 * 联系方式：1037438704@qq.com
 *
 * @author dell-pc
 */

public class VerificationTimer extends CountDownTimer {
    private TextView textView;
    private int one, tow;


    /**
     * @param millisInFuture    The number of millis in the future from the call
     *                          to {@link #start()} until the countdown is done and {@link #onFinish()}
     *                          is called.
     * @param countDownInterval The interval along the way to receive
     *                          {@link #onTick(long)} callbacks.
     */
    public VerificationTimer(long millisInFuture, long countDownInterval, TextView textView) {
        super(millisInFuture, countDownInterval);
        this.textView = textView;
    }

    public VerificationTimer(long millisInFuture, long countDownInterval, TextView textView, int one, int tow) {
        super(millisInFuture, countDownInterval);
        this.textView = textView;
        this.one = one;
        this.tow = tow;
    }

    @Override
    public void onTick(long millisUntilFinished) {
        if (one != 0) {
            textView.setBackgroundResource(one);
        }
        textView.setText(millisUntilFinished / 1000 + "s");
        textView.setEnabled(false);
    }

    @Override
    public void onFinish() {
        if (tow != 0) {
            textView.setBackgroundResource(tow);
        }
        textView.setEnabled(true);
        textView.setText("获取验证码");
    }
}
