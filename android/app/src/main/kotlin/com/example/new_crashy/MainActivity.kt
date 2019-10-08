package com.example.new_crashy

import android.os.Bundle

import io.flutter.app.FlutterActivity
import io.flutter.plugins.GeneratedPluginRegistrant
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;

class MainActivity: FlutterActivity(), MethodCallHandler{
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    GeneratedPluginRegistrant.registerWith(this)
    MethodChannel(this.getFlutterView(), "crashy-custom-channel")
    .setMethodCallHandler(this@MainActivity);
  }

  override fun onMethodCall(methodCall: MethodCall, result: Result) {
    throw IllegalStateException("This is Java exception")
  }
}
