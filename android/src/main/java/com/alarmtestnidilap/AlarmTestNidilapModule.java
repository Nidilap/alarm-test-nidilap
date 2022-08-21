package com.alarmtestnidilap;

import androidx.annotation.NonNull;

import android.content.Context;
import android.widget.Toast;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = AlarmTestNidilapModule.NAME)
public class AlarmTestNidilapModule extends ReactContextBaseJavaModule {
    public static final String NAME = "AlarmTestNidilap";

    public AlarmTestNidilapModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    @NonNull
    public String getName() {
        return NAME;
    }


    // Example method
    // See https://reactnative.dev/docs/native-modules-android
    @ReactMethod
    public void multiply(double a, double b, Promise promise) {
        promise.resolve(a * b);
    }


    @ReactMethod
    public void show(String text) {
      Context context = getReactApplicationContext();
      Toast.makeText(context, text, Toast.LENGTH_LONG).show();
    }

}
