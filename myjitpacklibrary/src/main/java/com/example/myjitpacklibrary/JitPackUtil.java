package com.example.myjitpacklibrary;

import android.content.Context;
import android.widget.Toast;

public class JitPackUtil {
    public static void show(Context context){
        if (context == null){
            return;
        }

        Toast.makeText(context,"JitPack测试",Toast.LENGTH_LONG).show();
    }
}
