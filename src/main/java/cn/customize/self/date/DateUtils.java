package cn.customize.self.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @description: 时间工具类
 * @auther: bald ass
 * @date: 2020/6/1 10:11
 */
public class DateUtils {
    public static final String DEFAULT_PATTERN = "yyyy-MM-dd HH:mm:ss";
    public static final String DAY_PATTERN = "yyyy-MM-dd";

    public static void main(String[] args) {
        System.out.println(isToday(new Date()));
    }

    /**
     * 判断传入的Date是否为今天
     *
     * @param date
     * @return
     */
    public static boolean isToday(Date date) {
        return sameDay(date, new Date());
    }

    /**
     * 检查两个日期是否是同一天
     *
     * @author cgj
     */
    public static boolean sameDay(Date day1, Date day2) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(day1);
        int y1 = cal.get(Calendar.YEAR);
        int d1 = cal.get(Calendar.DAY_OF_YEAR);

        cal.setTime(day2);
        int y2 = cal.get(Calendar.YEAR);
        int d2 = cal.get(Calendar.DAY_OF_YEAR);
        if ((y1 == y2) && (d1 == d2)) {
            return true;
        }
        return false;
    }

    /**
     * 调整时间到origin之后day天
     *
     * @author cgj
     */
    public static Date mDay(Date origin, int day) {
        return mTime(origin, day, Calendar.DAY_OF_MONTH);
    }

    /**
     * 调整时间到origin之后hour小时
     *
     * @author cgj
     */
    public static Date mHour(Date origin, int hour) {
        return mTime(origin, hour, Calendar.HOUR);
    }

    /**
     * 调整时间到origin之后minute分钟
     *
     * @author cgj
     */
    public static Date mMinute(Date origin, int minute) {
        return mTime(origin, minute, Calendar.MINUTE);
    }

    /**
     * 调整时间到origin之后second秒钟
     *
     * @author cgj
     */
    public static Date mSecond(Date origin, int second) {
        return mTime(origin, second, Calendar.SECOND);
    }

    /**
     * 调整时间到origin之后的unit格式的时间之后
     *
     * @author cgj
     */
    public static Date mTime(Date origin, int count, int unit) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(origin);
        cal.add(unit, count);
        return cal.getTime();
    }


    /**
     * Date转String
     *
     * @author cgj
     */
    public static String date2String(Date date) {
        return date2String(date, DEFAULT_PATTERN);
    }

    /**
     * 根据pattern的格式将Date转为String
     *
     * @author cgj
     */
    public static String date2String(Date date, String pattern) {
        if (date == null) return null;
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }

    /**
     * String转Date
     *
     * @return
     * @author cgj
     */
    public static Date string2Date(String param) throws ParseException {
        return string2Date(param, DEFAULT_PATTERN);
    }

    /**
     * 根据pattern的格式将String转为Date
     *
     * @author cgj
     */
    private static Date string2Date(String source, String pattern) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.parse(source);
    }
}
