package javatest;

/**
 * Created by 荆泽阳 on 2017/5/12.
 * .::::.
 * .::::::::.
 * :::::::::::  Goddess bless, never bug
 * ..:::::::::::'
 * '::::::::::::'
 * .::::::::::
 * '::::::::::::::..
 * ..::::::::::::.
 * ``::::::::::::::::
 * ::::``:::::::::'        .:::.
 * ::::'   ':::::'       .::::::::.
 * .::::'      ::::     .:::::::'::::.
 * .:::'       :::::  .:::::::::' ':::::.
 * .::'        :::::.:::::::::'      ':::::.
 * .::'         ::::::::::::::'         ``::::.
 * ...:::           ::::::::::::'              ``::.
 * ```` ':.          ':::::::::'                  ::::..
 * '.:::::'                    ':'````..
 */

public class ShapeFactory {

    public Sharp getSharp(String str) {
        if (str == null) {
            return null;

        }

        if (str.equals("testImpl1")) {
            return new testImpl1();
        } else if (str.equals("testImpl2")) {
            return new testImpl2();
        } else if (str.equals("testImpl3")) {
            return new testImpl3();
        } else if (str.equals("testImpl4")) {
            return new testImpl4();
        }

        return null;
    }

}
