package com.chinasoft.utils;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @Description TODO
 * @ClassName CommonUtils
 * @Author Jack.Shen
 * @Date 2020/2/27 10:49
 * @Version V1.0
 */
public class CommonUtils<E> {

    public static <E> E populate(E object, Map<String, String[]> parameterMap){
        try {
            BeanUtils.populate(object,parameterMap);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return object ;
    }
}
