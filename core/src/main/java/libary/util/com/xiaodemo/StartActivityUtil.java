package libary.util.com.xiaodemo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.ArrayMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by liuting on 2018/4/6.
 * 跳转的Activity的工具类
 */

public class StartActivityUtil {

    /**
     * 简单的跳转
     * @param activity
     * @param cls
     */
   public static void startAnotherActivity(Activity activity,Class<? extends Activity> cls){
       Intent intent=new Intent(activity,cls);
       activity.startActivity(intent);
       activity.finish();
   }
   public static void startActivity(Context context, Class<? extends Activity> cls){
       Intent intent=new Intent(context,cls);
       context.startActivity(intent);
   }
    /**
     * 简单的跳转 不finish
     * @param activity
     * @param cls
     */
   public static void startAnotherActivityNoFinish(Activity activity,Class<? extends Activity> cls){
       Intent intent=new Intent(activity,cls);
       activity.startActivity(intent);
   }

    public static void skipAnotherActivity(Activity activity,
                                           Class<? extends Activity> cls,
                                           ArrayMap<String, ? extends Object> hashMap) {
        Intent intent = new Intent(activity, cls);
        Iterator<?> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            @SuppressWarnings("unchecked")
            Map.Entry<String, Object> entry = (Map.Entry<String, Object>) iterator
                    .next();
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                intent.putExtra(key, (String) value);
            }
            if (value instanceof Boolean) {
                intent.putExtra(key, (boolean) value);
            }
            if (value instanceof Integer) {
                intent.putExtra(key, (int) value);
            }
            if (value instanceof Float) {
                intent.putExtra(key, (float) value);
            }
            if (value instanceof Double) {
                intent.putExtra(key, (double) value);
            }
        }
        activity.startActivity(intent);
    }

    public static void skipAnotherActivity(Activity activity,
                                           Class<? extends Activity> cls,
                                           HashMap<String, ? extends Object> hashMap) {
        Intent intent = new Intent(activity, cls);
        Iterator<?> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            @SuppressWarnings("unchecked")
            Map.Entry<String, Object> entry = (Map.Entry<String, Object>) iterator
                    .next();
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                intent.putExtra(key, (String) value);
            }
            if (value instanceof Boolean) {
                intent.putExtra(key, (boolean) value);
            }
            if (value instanceof Integer) {
                intent.putExtra(key, (int) value);
            }
            if (value instanceof Float) {
                intent.putExtra(key, (float) value);
            }
            if (value instanceof Double) {
                intent.putExtra(key, (double) value);
            }
        }
        activity.startActivity(intent);
    }
    /**
     * 简单的跳转 不finish
     * @param activity
     * @param cls
     * @param type 类型
     */
   public static void startAnotherActivityNoFinishWithInt(Activity activity,Class<? extends Activity> cls, int type){
       Intent intent=new Intent(activity,cls);
       intent.putExtra("type",type);
       activity.startActivity(intent);
   }
}
