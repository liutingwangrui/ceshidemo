ceshdemo
===
1.[功能描述]
-----
这是一个工具类，有Toast工具类、Log日志工具类、状态栏白底黑字工具类
Toast工具类通过ToastUtil直接调用相应的方法即可；
Log日志工具类通过LoUtil调用相应的方法；
状态栏工具类通过调用  
      StatusUtil.setStatusBarColor(this, android.R.color.white);
      StatusUtil.setStatue(this, true);
