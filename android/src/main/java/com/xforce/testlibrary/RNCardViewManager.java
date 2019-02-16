package com.xforce.testlibrary;

import android.support.v7.widget.CardView;

import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactProp;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;

/**
 * @ClassName: ${file_name}
 * @Description: ${todo}(描述该文件)
 * @version: V1.0
 * @Copyright: X-Force
 * @author: Your Name
 * @Date: ${date} ${time}
 */

public class RNCardViewManager extends ViewGroupManager <CardView> {
    @Override
    public String getName() {
        return null;
    }

    @Override
    protected CardView createViewInstance(ThemedReactContext reactContext) {
        return null;
    }

    @ReactProp(name = "cardElevation", defaultFloat = 0f)
    public void setCardElevation(CardView view, float cardElevation) {
        view.setCardElevation(PixelUtil.toPixelFromDIP(cardElevation));
    }
}
