package com.sudocode.util.date;

import com.sudocode.exception.SudocodeException;
import com.sudocode.util.text.TextUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Sudocode
 * Author: Jomer Pangilinan
 * Date: 8/6/13
 * Time: 4:39 PM
 */
public class DateUtil {

    private static ThreadLocal<SimpleDateFormat> threadLocal = new ThreadLocal<SimpleDateFormat>() {
        /**
         * Returns the current thread's "initial value" for this
         * thread-local variable.  This method will be invoked the first
         * time a thread accesses the variable with the {@link #get}
         * method, unless the thread previously invoked the {@link #set}
         * method, in which case the <tt>initialValue</tt> method will not
         * be invoked for the thread.  Normally, this method is invoked at
         * most once per thread, but it may be invoked again in case of
         * subsequent invocations of {@link #remove} followed by {@link #get}.
         * <p/>
         * <p>This implementation simply returns <tt>null</tt>; if the
         * programmer desires thread-local variables to have an initial
         * value other than <tt>null</tt>, <tt>ThreadLocal</tt> must be
         * subclassed, and this method overridden.  Typically, an
         * anonymous inner class will be used.
         *
         * @return the initial value for this thread-local
         */
        @Override
        protected SimpleDateFormat initialValue() {
            return super.initialValue();
        }

        /**
         * Returns the value in the current thread's copy of this
         * thread-local variable.  If the variable has no value for the
         * current thread, it is first initialized to the value returned
         * by an invocation of the {@link #initialValue} method.
         *
         * @return the current thread's value of this thread-local
         */
        @Override
        public SimpleDateFormat get() {
            return super.get();
        }

        /**
         * Sets the current thread's copy of this thread-local variable
         * to the specified value.  Most subclasses will have no need to
         * override this method, relying solely on the {@link #initialValue}
         * method to set the values of thread-locals.
         *
         * @param value the value to be stored in the current thread's copy of
         *              this thread-local.
         */
        @Override
        public void set(SimpleDateFormat value) {
            super.set(value);
        }

        /**
         * Removes the current thread's value for this thread-local
         * variable.  If this thread-local variable is subsequently
         * {@linkplain #get read} by the current thread, its value will be
         * reinitialized by invoking its {@link #initialValue} method,
         * unless its value is {@linkplain #set set} by the current thread
         * in the interim.  This may result in multiple invocations of the
         * <tt>initialValue</tt> method in the current thread.
         *
         * @since 1.5
         */
        @Override
        public void remove() {
            super.remove();
        }
    };

    public DateUtil() {
        throw new UnsupportedOperationException();
    }

    /**
     * <p/>
     * Format desired date
     *
     * @param date     String date format.
     * @param dateType Date class type
     * @param pattern  String date pattern
     * @return Return date
     */
    public static <T extends Date> T format(String date, final String pattern, Class<T> dateType) throws SudocodeException {

        threadLocal.set(new SimpleDateFormat(pattern, Locale.US));
        Date dateEntry;

        try {
            if ("".equals(TextUtil.isNullOrEmpty(date))) {
            }

            dateEntry = threadLocal.get().parse(date);
            return dateType.cast(dateEntry);
        } catch (ParseException e) {
            throw new SudocodeException(new StringBuilder("Unable to parse date:: ").append(date).toString(), e);
        }

    }

}
