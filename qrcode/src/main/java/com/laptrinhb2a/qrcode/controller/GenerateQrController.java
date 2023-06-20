package com.laptrinhb2a.qrcode.controller;

import com.laptrinhb2a.qrcode.dto.UserLoginSdi;
import com.laptrinhb2a.qrcode.service.QrCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenerateQrController {

    @Autowired
    private QrCodeService qrCodeService;

    @PostMapping(value = "generateQRCode")
    public String generateQRCode(@RequestBody UserLoginSdi sdi) {
        return qrCodeService.generateQrCode(sdi);
    }
}
