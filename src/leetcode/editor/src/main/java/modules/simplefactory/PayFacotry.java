package modules.simplefactory;

import modules.simplefactory.constants.FactoryConstant;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/4/27 16:20
 */
public class PayFacotry {
    public static Strategy getStrategy(String name) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class cls = Class.forName(FactoryConstant.PACKAGE_NAME + name);
        Constructor constructor = cls.getConstructor();
        return (Strategy) constructor.newInstance();
    }


}
