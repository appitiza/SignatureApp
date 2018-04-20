# Signature/Drawing pad

powerful and easy to integrate Signature/Drawing pad library for Android.
## Getting Started
You can use this library either by downloading the drawingpad module or by importing it directly as shown below.
## Import
**Sptep 1.** Add jitpack to your root `build.gradle`:
```gradle
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
**Step 2.** Add the dependency:
```gradle
dependencies {
     implementation 'com.github.appitiza:SignatureApp:-SNAPSHOT'
}
```


### Usage
#### To use the signaturepad
Copy the below code to use signnaturepad

```<net.appitiza.android.drawingpad.drawpad.views.SignatureView
        android:id="@+id/signature_view"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        attr:clearOnDoubleTap="true"
        attr:penColor="@android:color/holo_blue_dark"
        attr:penMaxWidth="9dp"
        attr:penMinWidth="5dp"
        attr:speedimpressionWeight=".1" />
```

You can use attributes to adjust the fetures of signaturepad
Example 
```
        attr:penMaxWidth="9dp"
        attr:penMinWidth="5dp"
```
With above code you can adjust the pen width

#### To use the drawingpad
Copy the below code to use drawingpad

```<net.appitiza.android.drawingpad.drawpad.views.DrawingView
        android:id="@+id/drawing_view"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
```


## ScreenShot

![Alt Text](https://github.com/appitiza/SignatureApp/blob/master/images/drawing.gif)
![Alt Text](https://github.com/appitiza/SignatureApp/blob/master/images/signature.gif)

[Demo Download](https://github.com/appitiza/SignatureApp/blob/master/apk/signatureapp.apk)

## Authors

* **Billie Thompson** - *Initial work* - [PurpleBooth](https://github.com/PurpleBooth)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone who's code was used
* Inspiration
* etc
