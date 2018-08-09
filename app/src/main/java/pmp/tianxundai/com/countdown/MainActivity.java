package pmp.tianxundai.com.countdown;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * 创建人： Nine tails fox
 * 创建时间： 2018/8/9 12:00
 * 功能描述：倒计时
 * 联系方式：1037438704@qq.com
 *
 * @author dell-pc
 */
public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private VerificationTimer verificationTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        textView = findViewById(R.id.textView);
//        verificationTimer = new VerificationTimer(5000, 1000, textView, R.drawable.bg_shape_false, R.drawable.bg_shape_true);
        verificationTimer = new VerificationTimer(5000, 1000, textView);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verificationTimer.start();
            }
        });
    }
}
