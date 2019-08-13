// Copyright 2016-2101 Pica.
package com.wechat_study.demo.util;

import javax.net.ssl.X509TrustManager;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/**
 * @ClassName MyX509TrustManager
 * @Description TODO
 * @Author caijia.rao
 * @Date 2019/8/13 10:36
 * @ModifyDate 2019/8/13 10:36
 * @Version 1.0
 */
public class MyX509TrustManager implements X509TrustManager {
    @Override
    public void checkClientTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {

    }

    @Override
    public void checkServerTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {

    }

    @Override
    public X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}
