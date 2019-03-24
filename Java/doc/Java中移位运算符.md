##引言
Java中移位运算符一共有三种，**<<**(左移)、**>>**(右移)、**>>>**(无符号右移)。下面我分别介绍这三种移位运算符是如何操作整型int的。

#### <<(左移)
左移很简单，当左移n位时，在其低n位补0即可。当左移1位时，相当于乘上2，如下图。
![对num左移一位](https://upload-images.jianshu.io/upload_images/16233922-76594c00fc70dec2.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

#### >>(右移)
Java中**>>**,其实应该叫做**带符号右移**，如果int是正数，那么右移后补0，反之为负数，右移后补1。当右移1位时，相当于除于2，如下图
![当num=1时](https://upload-images.jianshu.io/upload_images/16233922-edfb7e315c069b8c.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
![当num=-1时](https://upload-images.jianshu.io/upload_images/16233922-5fba8b717ec2fa31.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

#### >>>(无符号右移)
无符号右移就是不管int是正数还是负数，全都补零。
![当num=-1时](https://upload-images.jianshu.io/upload_images/16233922-acc8d66a4c31400c.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

#### 移位32位
如果直接移位32位会是什么情况，这里很有意思，如果直接移位32位，数值不会变化，好像发生了循环（但实际上通过上面的补0或补1操作可知，Java中移位运算是不会发生循环的。**不然也不会补位了，直接循环不得了。**）。但是我同时写了一个for循环，每次只移位1位，一共移32位，得到的结果却和直接移32位不一样，如下。
![num=-10时直接带符号右移32位](https://upload-images.jianshu.io/upload_images/16233922-f20d8583ffde6c39.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
![num=-10时每次移1位带符号右移，共32位](https://upload-images.jianshu.io/upload_images/16233922-d4c2fd257a188f2b.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

**所以这点要特别注意。**




