package com.laptrinhb2a.qrcode.service;

import com.laptrinhb2a.qrcode.dto.UserLoginSdi;
import com.laptrinhb2a.qrcode.util.AppUtils;
import org.springframework.stereotype.Service;

@Service
public class QrCodeServiceImpl implements QrCodeService{
    private static final int ORDER_QR_CODE_SIZE_WIDTH = 300;
    private static final int ORDER_QR_CODE_SIZE_HEIGHT = 300;

    @Override
    public String generateQrCode(UserLoginSdi sdi) {
        String prettyData = AppUtils.prettyObject(sdi);

        String qrCode = AppUtils.generateQrCode(prettyData, ORDER_QR_CODE_SIZE_WIDTH, ORDER_QR_CODE_SIZE_HEIGHT);
        return qrCode;
    }
}
