package com.laptrinhb2a.qrcode.service;

import com.laptrinhb2a.qrcode.dto.UserLoginSdi;

public interface QrCodeService {
    String generateQrCode(UserLoginSdi sdi);
}
