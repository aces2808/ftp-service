package com.sudocode.exception.network;

import com.sudocode.exception.SudocodeException;

/**
 * Sudocode
 * Author: Jomer Pangilinan
 * Date: 8/5/13
 * Time: 7:01 PM
 */
public class SudocodeNetworkException extends SudocodeException {

    private static final long serialVersionUID = -2888321888496337310L;

    /**
     * Constructs a new exception with the specified detail message and
     * cause.  <p>Note that the detail message associated with
     * <code>cause</code> is <i>not</i> automatically incorporated in
     * this exception's detail message.
     *
     * @param message the detail message (which is saved for later retrieval
     *                by the {@link #getMessage()} method).
     * @param cause   the cause (which is saved for later retrieval by the
     *                {@link #getCause()} method).  (A <tt>null</tt> value is
     *                permitted, and indicates that the cause is nonexistent or
     *                unknown.)
     * @since 1.4
     */
    public SudocodeNetworkException(String message, Throwable cause) {
        super(message, cause);
    }
}
