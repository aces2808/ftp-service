package com.sudocode.network.ftp.test;

import com.sudocode.exception.network.SudocodeNetworkException;
import com.sudocode.network.ftp.service.SudocodeFtpService;
import com.sudocode.network.ftp.service.impl.SudocodeFtpServiceImpl;
import org.testng.annotations.Test;

/**
 * Sudocode
 * Author: Jomer Pangilinan
 * Date: 8/6/13
 * Time: 8:05 PM
 */
public class TestFtpService {

    private SudocodeFtpService ftpService;

    @Test
    public void testSendFile() throws SudocodeNetworkException {
        ftpService = SudocodeFtpServiceImpl.getService();
        ftpService.sendFile(null);
    }
}
