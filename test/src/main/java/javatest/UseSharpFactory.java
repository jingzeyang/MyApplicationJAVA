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

public class UseSharpFactory {

    public static void main(String[] args) {
        Sharp shap1 = new ShapeFactory().getSharp("testImpl1");
        shap1.dorn();
        Sharp shap2 = new ShapeFactory().getSharp("testImpl2");
        shap2.dorn();
        Sharp shap3 = new ShapeFactory().getSharp("testImpl3");
        shap3.dorn();
        Sharp shap4 = new ShapeFactory().getSharp("testImpl4");
        shap4.dorn();
    }

}
