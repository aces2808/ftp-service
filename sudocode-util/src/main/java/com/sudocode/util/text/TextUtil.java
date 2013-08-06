package com.sudocode.util.text;

/**
 * Sudocode
 * Author: Jomer Pangilinan
 * Date: 8/6/13
 * Time: 4:35 PM
 */
public class TextUtil {

    public TextUtil() {
        throw new UnsupportedOperationException();
    }

    /**
     * <p/>
     * Returns strValue if it isn't null, otherwise, it returns strDefault
     *
     * @param strValue   the value to be checked if null
     * @param strDefault the value to be returned if strValue is null
     * @return strValue if it's not null, strDefault otherwise
     */
    public static String ifNull(String strValue, String strDefault) {

        if (strValue == null) return strDefault;
        else return strValue;

    }

    /**
     * <p/>
     * Returns strValue if it isn't null, otherwise, it returns strDefault
     *
     * @param strValue   the value to be checked if null
     * @param dblDefault the double value to be returned if strValue is null
     * @return strValue if it's not null, strDefault otherwise
     */
    public static double ifNull(String strValue, double dblDefault) {
        if (strValue != null) return Double.parseDouble(strValue);
        else return dblDefault;
    }

    /**
     * <p/>
     * Returns strValue if it isn't null, otherwise, it returns strDefault
     *
     * @param strValue   the value to be checked if null
     * @param intDefault the integer value to be returned if strValue is null
     * @return strValue if it's not null, strDefault otherwise
     */
    public static int ifNull(String strValue, int intDefault) {
        if (strValue != null) return Integer.parseInt(strValue);
        else return intDefault;
    }

    /**
     * <p/>
     * Returns strValue if it isn't null, otherwise, it returns strDefault
     *
     * @param strValue    the value to be checked if null
     * @param longDefault the long value to be returned if strValue is null
     * @return strValue if it's not null, strDefault otherwise
     */
    public static long ifNull(String strValue, long longDefault) {
        if (strValue != null) return Long.parseLong(strValue);
        else return longDefault;
    }

    /**
     * <p/>
     * Returns strValue if it isn't '', otherwise, it returns strDefault
     *
     * @param strValue   the value to be checked if ''
     * @param strDefault the value to be return if strValue is ''
     * @return strValue if it's not blank, strDefault otherwise
     */
    public static String ifBlank(String strValue, String strDefault) {

        if ("".equals(strValue)) return strDefault;
        else return strValue;
    }

    /**
     * <p/>
     * Returns strValue if it isn't null nor blank, otherwise, it returns
     * strDefault
     *
     * @param strValue   the value to be checked if null
     * @param strDefault the value to be return if strValue is null
     * @return strValue if it's not null, strDefault otherwise
     */
    public static String ifNullOrBlank(String strValue, String strDefault) {

        if (strValue == null || "".equals(strValue)) return strDefault;
        else return strValue;
    }

    /**
     * <p/>
     * Returns strValue if it isn't null, otherwise, it returns strDefault
     *
     * @param strValue   the value to be checked if null
     * @param strDefault the value to be returned if strValue is null
     * @return strValue if it's not null, strDefault otherwise
     */
    public static Object ifNull(String strValue, Object strDefault) {

        if (strValue == null) return strDefault;
        else return strValue;
    }

    /**
     * <p/>
     * Returns strValue if it isn't null, otherwise, it returns strDefault
     *
     * @param strValue   the value to be checked if null
     * @param strDefault the value to be returned if strValue is null
     * @return strValue if it's not null, strDefault otherwise
     */
    public static String ifNull(Object strValue, String strDefault) {

        if (strValue == null) return strDefault;
        else return strValue.toString();
    }

    /**
     * <p/>
     * Returns strValue if it isn't null, otherwise, it returns strDefault
     *
     * @param strValue   the value to be checked if null
     * @param strDefault the value to be returned if strValue is null
     * @return strValue if it's not null, strDefault otherwise
     */
    public static int ifNull(Object strValue, int strDefault) {

        if (strValue == null) return strDefault;
        else return Integer.parseInt(strValue.toString());
    }

    /**
     * <p/>
     * Returns strValue if it isn't null nor blank, otherwise, it returns
     * strDefault
     *
     * @param strValue   the value to be checked if null
     * @param strDefault the value to be return if strValue is null
     * @return strValue if it's not null, strDefault otherwise
     */
    public static String ifNullStringOrNull(String strValue, String strDefault) {

        if ("".equals(strValue) || strValue == null) return strDefault;
        else return strValue;

    }

    public static final boolean isNullOrEmpty(final String string) {
        return string == null || string.isEmpty();
    }

}
