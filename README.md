# Signature/Drawing pad

powerful and easy to integrate Signature/Drawing pad library for Android.
## Getting Started
You can use this library either by downloading the drawing pad module or by importing it directly as shown below.
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

```
<net.appitiza.android.drawingpad.drawpad.views.SignatureView
        android:id="@+id/signature_view"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        attr:clearOnDoubleTap="true"
        attr:penColor="@android:color/holo_blue_dark"
        attr:penMaxWidth="9dp"
        attr:penMinWidth="5dp"
        attr:speedimpressionWeight=".1" />
```

You can use attributes to adjust the features of signature pad
Example 
```
        attr:penMaxWidth="9dp"
        attr:penMinWidth="5dp"
```
With above code, you can adjust the pen width

#### To use the drawingpad
Copy the below code to use drawingpad

```
<net.appitiza.android.drawingpad.drawpad.views.DrawingView
        android:id="@+id/drawing_view"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
```


## ScreenShot

![Alt Text](https://github.com/appitiza/SignatureApp/blob/master/images/drawing.gif)
![Alt Text](https://github.com/appitiza/SignatureApp/blob/master/images/signature.gif)

[Demo Download](https://github.com/appitiza/SignatureApp/blob/master/apk/signatureapp.apk)

## License

This project is licensed under the MIT License

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.


