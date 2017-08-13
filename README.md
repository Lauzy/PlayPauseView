##   PlayPauseView  让播放、暂停按钮优雅的过渡

## 效果图

<img src="/Screenshot/20170812PlayPauseView.gif" alt="screenshot" title="screenshot" width="100" height="100" />

## 博客介绍

简书 ： [http://www.jianshu.com/p/74f38e9b16fc](http://www.jianshu.com/p/74f38e9b16fc)

## 下载

```java
    allprojects {
	    repositories {
		    ...
		    maven { url 'https://jitpack.io' }
	    }
	}

    dependencies {
        compile 'com.github.Lauzy:PlayPauseView:1.0.0'
	}
```

## 用法

基本用法:

在xml文件中使用：

```java

    <com.freedom.lauzy.playpauseviewlib.PlayPauseView
        android:id="@+id/play_pause_view"
        android:layout_width="80dp"
        android:layout_height="80dp"
        app:anim_direction="positive"
        app:anim_duration="300"
        app:bg_color="#E0E0E0"
        app:btn_color="#000000"
        app:gap_width="30"/>

```

代码控制事件：

```java

        playPauseView.setPlayPauseListener(new PlayPauseView.PlayPauseListener() {
            @Override
            public void play() {
                // do something
                Toast.makeText(MainActivity.this, "Play", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void pause() {
                // do something
                Toast.makeText(MainActivity.this, "Pause", Toast.LENGTH_SHORT).show();
            }
        });

```

自定义属性：

|xml                |java           |说明           |
|-------------------|---------------|---------------|
|app:bg_color       |setBgColor(int color)|按钮的背景颜色，默认为白色
|app:btn_color      |setBtnColor(int color)|暂停播放按钮颜色，默认为黑色
|app:gap_width      |setGapWidth(int width)|暂停时两个竖条的距离，默认为暂停时竖条的宽度
|app:space_padding  |setSpacePadding(float space)|按钮边缘与播放暂停按钮的距离
|app:anim_duration  |setAnimDuration(int duration)|动画时长，默认为200ms
|app:anim_direction |setDirection(Direction direction)|动画旋转方向，默认为顺时针。
属性值：PlayPauseView.Direction.POSITIVE（顺时针），PlayPauseView.Direction.NEGATIVE（逆时针）


## 开源协议
```
Copyright 2017 Lauzy

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
