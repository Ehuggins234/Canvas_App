package com.example.android.minipaint

import android.graphics.Color
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.View

class OnDoubleTapListener(private val view: View) : GestureDetector.SimpleOnGestureListener() {
    override fun onDoubleTap(e: MotionEvent?): Boolean {
        view.setBackgroundColor(Color.RED)
        return true
    }
}

fun View.onDoubleTap() {
    val gestureDetector = GestureDetector(context, OnDoubleTapListener(this))
    setOnTouchListener { _, event ->
        gestureDetector.onTouchEvent(event)
        true
    }
}
