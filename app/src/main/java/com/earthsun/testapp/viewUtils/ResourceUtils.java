package com.earthsun.testapp.viewUtils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.util.TypedValue;
import android.view.View;

import com.earthsun.testapp.TestApplication;


/**
 * 作者：谢青仂 on 2016/8/11
 * 邮箱：qingle6616@sina.com
 * <p>
 * 获取资源的工具类
 * 布局、获取R文件中的string、color
 */
public class ResourceUtils {
    public static Context getContext() {
        return TestApplication.getContext();
    }



    // /////////////////加载资源文件 ///////////////////////////


    // 获取整型
    public static int getInteger(int id) {
        return getContext().getResources().getInteger(id);
    }

    // 获取字符串
    public static String getString(int id) {
        return getContext().getResources().getString(id);
    }

    // 获取字符串数组
    public static String[] getStringArray(int id) {
        return getContext().getResources().getStringArray(id);
    }

    // 获取图片
    public static Drawable getDrawable(int id) {
        return getContext().getResources().getDrawable(id);
    }

    // 获取颜色
    public static int getColor(int id) {
        return getContext().getResources().getColor(id);
    }

    //根据id获取颜色的状态选择器
    public static ColorStateList getColorStateList(int id) {
        return getContext().getResources().getColorStateList(id);
    }

    // 获取尺寸
    public static int getDimen(int id) {
        return getContext().getResources().getDimensionPixelSize(id);// 返回具体像素值
    }


    // /////////////////加载布局文件//////////////////////////
    public static View inflate(int id) {
        return View.inflate(getContext(), id, null);
    }




    ////////////////////根据资源文件名字获取///////////////////////////////////////////

    /**
     * 获取 layout 布局文件
     *
     * @param context Context
     * @param resName layout xml 的文件名
     * @return layout
     */
    public static int getLayoutId(Context context, String resName) {
        return context.getResources().getIdentifier(resName, "layout",
                context.getPackageName());
    }

    /**
     * 获取 string 值
     *
     * @param context Context
     * @param resName string name的名称
     * @return string
     */
    public static int getStringId(Context context, String resName) {
        return context.getResources().getIdentifier(resName, "string",
                context.getPackageName());
    }

    /**
     * 获取 drawable
     *
     * @param context Context
     * @param resName drawable 的名称
     * @return drawable
     */
    public static int getDrawableId(Context context, String resName) {
        return context.getResources().getIdentifier(resName,
                "drawable", context.getPackageName());
    }

    /**
     * 获取 mipmap
     *
     * @param context
     * @param resName
     * @return
     */
    public static int getMipmapId(Context context, String resName) {
        return context.getResources().getIdentifier(resName,
                "mipmap", context.getPackageName());
    }


    /**
     * 获取 style
     *
     * @param context Context
     * @param resName style的名称
     * @return style
     */
    public static int getStyleId(Context context, String resName) {
        return context.getResources().getIdentifier(resName, "style",
                context.getPackageName());
    }

    public static Bitmap getBitmap(int bitmapSrc) {
        Drawable drawable = getContext().getResources().getDrawable(bitmapSrc);
        BitmapDrawable bd = (BitmapDrawable) drawable;
        return bd.getBitmap();
    }

    /**
     * 获取 styleable
     *
     * @param context Context
     * @param resName styleable 的名称
     * @return styleable
     */
    public static Object getStyleableId(Context context, String resName) {
        return context.getResources().getIdentifier(resName, "styleable",
                context.getPackageName());
    }


    /**
     * 获取 anim
     *
     * @param context Context
     * @param resName anim xml 文件名称
     * @return anim
     */
    public static int getAnimId(Context context, String resName) {
        return context.getResources().getIdentifier(resName, "anim",
                context.getPackageName());
    }

    /**
     * 获取 id
     *
     * @param context Context
     * @param resName id 的名称
     * @return
     */
    public static int getId(Context context, String resName) {
        return context.getResources().getIdentifier(resName, "id",
                context.getPackageName());
    }

    /**
     * color
     *
     * @param context Context
     * @param resName color 名称
     * @return
     */
    public static int getColorId(Context context, String resName) {
        return context.getResources().getIdentifier(resName, "color",
                context.getPackageName());
    }

    public static float getAttrFloatValue(Context context, int attrRes) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(attrRes, typedValue, true);
        return typedValue.getFloat();
    }

    public static int getAttrColor(Context context, int attrRes) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(attrRes, typedValue, true);
        return typedValue.data;
    }

    public static ColorStateList getAttrColorStateList(Context context, int attrRes) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(attrRes, typedValue, true);
        return ContextCompat.getColorStateList(context, typedValue.resourceId);
    }

    public static Drawable getAttrDrawable(Context context, int attrRes) {
        int[] attrs = new int[]{attrRes};
        TypedArray ta = context.obtainStyledAttributes(attrs);
        Drawable drawable = ta.getDrawable(0);
        ta.recycle();
        return drawable;
    }

    public static int getAttrDimen(Context context, int attrRes) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(attrRes, typedValue, true);
        return TypedValue.complexToDimensionPixelSize(typedValue.data, (DensityUtils.getDisplayMetrics(context)));
    }
}
