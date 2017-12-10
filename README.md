# WaveView Android自定义水波纹百分比效果控件
Android 自定义控件实现动态百分比水波纹效果，支持修改波纹长度、波峰高度、颜色、是否需要边框、边框的颜色、大小、可以控制波纹的移动速度，支持矩形和圆形两种效果。所有属性可以通过布局文件设置，也可以在代码中设置。

## 自定义属性字段展示
	<!--自定义水波纹效果属性-->  
    <declare-styleable name="WaveView">  
        <!--波浪1的长度、高度、颜色和每次重绘的偏移量-->  
        <attr name="wave1Length" format="integer" />  
        <attr name="wave1Height" format="integer" />  
        <attr name="wave1Color" format="color" />  
        <attr name="wave1Offset" format="integer" />  
        <!--波浪2的长度、高度、颜色和每次重绘的偏移量-->  
        <attr name="wave2Length" format="integer" />  
        <attr name="wave2Height" format="integer" />  
        <attr name="wave2Color" format="color" />  
        <attr name="wave2Offset" format="integer" />  
        <!--边框的宽度和颜色-->  
        <attr name="borderWidth" format="dimension" />  
        <attr name="borderColor" format="color" />  
        <!--文字的大小和颜色-->  
        <attr name="textColor" format="color" />  
        <attr name="textSize" format="dimension" />  
        <!--水位高度的百分比-->  
        <attr name="precent" format="float" />  
        <!--两次重绘的间隔时间-->  
        <attr name="intervalTime" format="integer" />  
        <!--控件的显示形状，rect矩形、circle圆形-->  
        <attr name="showShape" format="enum">  
            <enum name="rect" value="0" />  
            <enum name="circle" value="1" />  
        </attr>  
    </declare-styleable>

## 使用
### 使用代码控制属性
**① 在布局文件中定义控件**

	<com.waveview.view.WaveView  
	    android:id="@+id/waveview"  
	    android:layout_width="200dp"  
	    android:layout_height="200dp"  
	    android:layout_marginTop="10dp"/>

**② 在代码中找到控件**

	WaveView waveview = (WaveView) findViewById(R.id.waveview);

**③ 通过控件设置属性**

	// 代码设置相关属性  
	waveview.setBorderWidth(2)  
        .setWaveColor1(Color.RED)  
        .setWaveColor2(Color.parseColor("#80ff0000"))  
        .setBorderColor(Color.GREEN)  
        .setTextColor(Color.BLUE)  
        .setShape(WaveView.ShowShape.RECT)  
        .setTextSize(36)  
        .setPrecent(0.65f)  
        .setTime(2);  

---
### 使用xml布局文件控制属性
	<com.waveview.view.WaveView  
        android:id="@+id/waveview"  
        android:layout_width="200dp"  
        android:layout_height="200dp"  
        android:layout_marginTop="10dp"  
        renj:borderColor="#00ff00"  
        renj:borderWidth="2dp"  
        renj:intervalTime="3"  
        renj:precent="0.6"  
        renj:showShape="circle"  
        renj:textColor="#0000ff"  
        renj:textSize="18sp"  
        renj:wave1Color="#ff0000"  
        renj:wave2Color="#80ff0000"/> 

***注意***  
> 使用xml文件控制属性时，注意添加属性名称空间`xmlns:renj="http://schemas.android.com/apk/res-auto"`

## 设置百分比变化监听
	waveview.setPrecentChangeListener(new WaveView.PrecentChangeListener() {  
            @Override  
            public void precentChange(double precent) {  
                tvPrecent.setText("当前进度：" + precent + "");  
            }  
        }); 

CSDN博客查看相关内容 [点击这里](http://blog.csdn.net/itrenj/article/details/53874219 "查看CSDN博客")

## 效果图展示
![Android水波纹圆形效果](https://github.com/itrenjunhua/WaveView/blob/master/images/circle.gif)             ![Android水波纹矩形效果](https://github.com/itrenjunhua/WaveView/blob/master/images/react.gif)
