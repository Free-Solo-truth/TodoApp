package com.example.todoapp

import android.content.Context


/**
 * dp值转换为px值
 */
fun dp2x(context: Context, dp: Int):Int{
    return (context.resources.displayMetrics.density*dp).toInt()
}