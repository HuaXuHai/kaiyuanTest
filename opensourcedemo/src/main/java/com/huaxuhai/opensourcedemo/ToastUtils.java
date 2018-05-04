package com.huaxuhai.opensourcedemo;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by huaxuhai on 2018/5/4.
 *
 * 吐司工具类
 */

public class ToastUtils {

    public static void show(Context context,String str){

        Toast.makeText(context,str,Toast.LENGTH_LONG).show();

    }
}
