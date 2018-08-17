MyTabLayout
---

# 简介
在做项目的时候发现有些需求官方TabLayout不能满足，所以就把TabLayout源码拔出来，自定义了一个MyTabLayout添加了一些属性(可以修改下划线宽度，新增底部分割线和竖直分割线)，其他功能跟官方完全相同，只是多出了几个新属性。

添加新属性：
- tabIndicatorWidth - 下滑线的宽度
- dividerWidth - 竖直分割线的宽
- dividerHeight - 竖直分割线的高
- dividerColor - 竖直分割线的颜色
- bottomLineHeight - 底部分隔栏的高
- bottomLineColor - 底部分隔栏的颜色

# 效果展示
![运行效果](images/AndroidTest.jpg)

# 使用方式

## 声明仓库
确保在你的根项目的build.gradle中对`jitpack`的声明：
```gradle
allprojects {
	repositories {
        ...
		maven { url 'https://jitpack.io' }
    }
}
```

## 声明依赖
在你要使用的module的`build.gradle`文件中声明以下依赖：
```gradle
implementation 'com.github.yangyizhen404:MyTabLayout:1.1'
```

## 代码调用
```
app:tabIndicatorWidth="0dp"
app:bottomLineHeight="1dp"
app:bottomLineColor="@color/colorPrimaryDark"
app:dividerColor="@color/colorPrimaryDark"
app:dividerWidth="1dp"
app:dividerHeight="40dp"
```

## API文档
![《自定义TabLayout（可以修改下划线宽度，新增底部分割线和竖直分割线）》](https://www.jianshu.com/p/ac3c7130d37c)

