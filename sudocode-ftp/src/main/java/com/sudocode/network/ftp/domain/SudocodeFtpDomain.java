package com.sudocode.network.ftp.domain;

import java.io.Serializable;

/**
 * Sudocode
 * Author: Jomer Pangilinan
 * Date: 8/5/13
 * Time: 7:05 PM
 */
public class SudocodeFtpDomain implements Serializable {

    private static final long serialVersionUID = 3077372151079963705L;

    private String ftpHost;

    private String ftpPort;

    private String ftpUser;

    public String getFtpHost() {
        return ftpHost;
    }

    public void setFtpHost(String ftpHost) {
        this.ftpHost = ftpHost;
    }

    public String getFtpPort() {
        return ftpPort;
    }

    public void setFtpPort(String ftpPort) {
        this.ftpPort = ftpPort;
    }

    public String getFtpUser() {
        return ftpUser;
    }

    public void setFtpUser(String ftpUser) {
        this.ftpUser = ftpUser;
    }

    @Override
    public String toString() {
        return "SudocodeFtpDomain{" +
                "ftpHost='" + ftpHost + '\'' +
                ", ftpPort='" + ftpPort + '\'' +
                ", ftpUser='" + ftpUser + '\'' +
                '}';
    }
}
