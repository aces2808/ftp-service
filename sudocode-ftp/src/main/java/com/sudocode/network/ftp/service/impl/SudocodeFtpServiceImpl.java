package com.sudocode.network.ftp.service.impl;

import com.jcraft.jsch.*;
import com.sudocode.exception.network.SudocodeNetworkException;
import com.sudocode.network.ftp.domain.SudocodeFtpDomain;
import com.sudocode.network.ftp.service.SudocodeFtpService;

import java.util.List;
import java.util.Properties;

/**
 * Sudocode
 * Author: Jomer Pangilinan
 * Date: 8/6/13
 * Time: 7:25 PM
 */
public class SudocodeFtpServiceImpl implements SudocodeFtpService {


    private JSch securedChannel;
    private Session ftpSession;
    private Properties ftpProperties;
    private Channel ftpChannel;
    private ChannelSftp sftpChannel;

    public SudocodeFtpServiceImpl() {
    }

    /**
     * <p/>
     * Thread safe call of FTP service
     */
    public static SudocodeFtpService getService() {
        return FtpService.getInstance();
    }

    /**
     * <p/>
     * Sends file to the FTP server given with the proper details of the FTP server.
     *
     * @param ftpDetails Domain object containing the FTP details.
     */
    @Override
    public <T extends SudocodeFtpDomain> boolean sendFile(T ftpDetails) throws SudocodeNetworkException {


        securedChannel = new JSch();

        try {
            ftpSession = securedChannel.getSession(ftpDetails.getFtpUser(), ftpDetails.getFtpHost(), Integer.parseInt(ftpDetails.getFtpPort()));
        } catch (JSchException e) {
            throw new SudocodeNetworkException(new StringBuilder().append(ftpDetails.toString()).toString(), e);
        }

        return false;
    }

    /**
     * <p/>
     * Retrieves file from the FTP server.
     *
     * @param t Domain object containing the FTP details.
     */
    @Override
    public <T extends SudocodeFtpDomain> List<T> getFiles(T ftpDetails) throws SudocodeNetworkException {
        securedChannel = new JSch();

        try {
            ftpSession = securedChannel.getSession(ftpDetails.getFtpUser(), ftpDetails.getFtpHost(), Integer.parseInt(ftpDetails.getFtpPort()));
        } catch (JSchException e) {
            throw new SudocodeNetworkException(new StringBuilder().append(ftpDetails.toString()).toString(), e);
        }
        return null;
    }

    /**
     * Thread safe initialization
     */
    private static class FtpService {

        /*
         * Static instance of service
         **/
        private static SudocodeFtpService instance;

        private static final SudocodeFtpService getInstance() {
            if (instance == null) instance = new SudocodeFtpServiceImpl();
            return instance;
        }
    }
}
