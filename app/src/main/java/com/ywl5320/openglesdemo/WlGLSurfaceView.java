package com.ywl5320.openglesdemo;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

public class WlGLSurfaceView extends GLSurfaceView {
    private WlGlRender wlGlRender;

    public WlGLSurfaceView(Context context) {
        super(context);
    }

    public WlGLSurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        wlGlRender = new WlGlRender();
        setRenderer(wlGlRender);
    }
}
