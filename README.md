# PopupWindowHelper
Show popup window at any location with animation

With popupWindowHelper, you can easily popup window below or above a view, and form top or bottom of a screen. 

![这里写图片描述](https://raw.githubusercontent.com/weidongjian/PopupWindowHelper/master/art/screenShot.gif)

**Useage**

- add denpency in project
```
dependencies {
 compile 'cn.weidongjian.android:popupWindowHelper:0.5'
}
```
add above codes into your build.gradle file

 - initialize
```
private PopupWindowHelper popupWindowHelper;
private View popView;
popView = LayoutInflater.from(this).inflate(R.layout.popupview, null);
        popupWindowHelper = new PopupWindowHelper(popView);
```
you can define popView in your XML file

- show above a view

```
popupWindowHelper.showAsPopUp(view);
```


- show below a view

```
popupWindowHelper.showAsDropDown(view);
```


- show from top of screen

```
popupWindowHelper.showFromTop(view);
```

- show from bottm of screen

```
popupWindowHelper.showFromBottom(v);
```

and you can use origin popupWindow meathod
