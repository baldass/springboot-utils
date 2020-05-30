package cn.customize.self.common;

/**
 * @description: 判空工具
 * @auther: bald ass
 * @date: 2020/5/30 20:43
 */
public class EmptyUtils {
    /**
     * 查看字符串是否是空的
     * 抄的org.apache.commons.lang3包的StringUtils判空
     * <p>
     * CharSequence为interface;String,StringBuffer和StringBuilder均实现了该接口
     *
     * @param param 入参
     * @return boolean
     */
    public static boolean isEmpty(CharSequence param) {
        return param == null || param.length() == 0;
    }

    /**
     * 判断是不是非空
     * @param param 入参
     * @return boolean
     * @author cgj
     */
    public static boolean isNotEmpty(CharSequence param) {
        return !isEmpty(param);
    }

    /***
     * 查看字符串是否是空字符
     * @param param 入参
     * @return boolean
     * @author cgj
     */
    public static boolean isBlank(CharSequence param) {
        int strLen;
        if (param != null && (strLen = param.length()) != 0) {
            for (int i = 0; i < strLen; ++i) {
                if (!Character.isWhitespace(param.charAt(i))) {
                    return false;
                }
            }
            return true;
        } else {
            return true;
        }
    }
    /***
     * 查看字符串是否不是空字符
     * @param param 入参
     * @return boolean
     * @author cgj
     */
    public static boolean isNotBlank(CharSequence param) {
        return !isBlank(param);
    }
    /***
     * 查看对象是否为空
     * @param param 入参
     * @return boolean
     * @author cgj
     */
    public static boolean isEmpty(Object param) {
        return param == null;
    }
    /***
     * 查看对象是否不为空
     * @param param 入参
     * @return boolean
     * @author cgj
     */
    public static boolean isNotEmpty(Object param) {
        return !isEmpty(param);
    }

}
