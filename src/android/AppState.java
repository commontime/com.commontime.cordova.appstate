package com.commontime.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class AppState extends CordovaPlugin {

    private boolean isVisible;

    @Override
    public boolean execute(String action, final JSONArray data, final CallbackContext callbackContext) throws JSONException
    {
        if ( action.equals("isAppInForeground")) {
            PluginResult pluginResult = new PluginResult(PluginResult.Status.OK, isVisible);
            callbackContext.sendPluginResult(pluginResult);
        }
        return true;
    }

    @Override
    public void onPause(boolean multitasking) {
        super.onPause(multitasking);
        isVisible = false;
    }

    @Override
    public void onResume(boolean multitasking) {
        super.onResume(multitasking);
        isVisible = true;
    }
}