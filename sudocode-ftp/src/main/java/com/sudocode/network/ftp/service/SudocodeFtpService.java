package com.sudocode.network.ftp.service;

import com.sudocode.exception.network.SudocodeNetworkException;
import com.sudocode.network.ftp.domain.SudocodeFtpDomain;

import java.util.List;

/**
 * Sudocode
 * Author: Jomer Pangilinan
 * Date: 8/5/13
 * Time: 7:07 PM
 */
public interface SudocodeFtpService {

    /**
     * <p/>
     * Sends file to the FTP server given with the proper details of the FTP server.
     *
     * @param t Domain object containing the FTP details.
     */
    <T extends SudocodeFtpDomain> boolean sendFile(T t) throws SudocodeNetworkException;


    /**
     * <p/>
     * Retrieves file from the FTP server.
     *
     * @param t Domain object containing the FTP details.
     */
    <T extends SudocodeFtpDomain> List<T> getFiles(T t) throws SudocodeNetworkException;
}
