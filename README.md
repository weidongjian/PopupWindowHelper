# PopupWindowHelper
Show popup window at any location with animation

基于popupWindow制作了这个库，可以实现在按钮下面弹出弹窗，在按钮上面弹出弹窗，或者在页面的底部或者顶部弹出弹窗，弹窗都带有动画效果，另外默认点击弹窗外面区域，自动关闭弹窗，也可以关闭该功能，请先看效果图：

![这里写图片描述](https://raw.githubusercontent.com/weidongjian/PopupWindowHelper/master/art/screenShot.gif)

**使用方法**

- 添加依赖
```
dependencies {
 compile 'cn.weidongjian.android:popupWindowHelper:0.5'
}
```
在项目的build.gradle中添加如上一行代码，就可以把库文件包含在你的项目中了

 - 初始化
```
private PopupWindowHelper popupWindowHelper;
private View popView;
popView = LayoutInflater.from(this).inflate(R.layout.popupview, null);
        popupWindowHelper = new PopupWindowHelper(popView);
```
popView就是要弹窗的视图，可以自己在xml中定义

- 在按钮的上方显示弹窗

```
popupWindowHelper.showAsPopUp(view);
```

其中view接受点击事件的按钮

- 在按钮的下方显示弹窗

```
popupWindowHelper.showAsDropDown(view);
```
这个调用的是popupWindow的原生方法，没什么可说的

- 从顶部下拉显示

```
popupWindowHelper.showFromTop(view);
```

- 从底部弹出显示

```
popupWindowHelper.showFromBottom(v);
```

另外还保留的原生的popupwindow方法
