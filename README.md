# ceshdemo
### 1.[功能描述]
#### 这是一个工具类，有Toast工具类、Log日志工具类、状态栏白底黑字工具类
### 2.[demo测试]
#### 状态栏的调用
```
 StatusUtil.setStatusBarColor(this, android.R.color.white);
 StatusUtil.setStatue(this, true);
 ```
### 3.[使用说明]
```
 allprojects {
 	repositories {
 			...
 			maven { url 'https://jitpack.io' }
 		}
 	}
  ```
  ```
 dependencies {
	         implementation 'com.github.liutingwangrui:tool:v1.0'
 	}
  ```
