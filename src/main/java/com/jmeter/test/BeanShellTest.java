package com.jmeter.test;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class BeanShellTest {
    public String demo1(String name,int age){
        return name+age;
    }
    //系统编码+密钥+时间戳信息
    public static String getMd5(String sysCode,String key) {
        return getSHAHash(sysCode+key+ System.currentTimeMillis());
    }

    private static String getSHAHash(String source) {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        if (null != md) {
            byte[] origBytes = source.getBytes();
            md.update(origBytes);
            byte[] digestRes = md.digest();
            String digestStr = getDigestStr(digestRes);
            return digestStr;
        }
        return null;
    }

    private static String getDigestStr(byte[] origBytes) {
        String tempStr = null;
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < origBytes.length; i++) {
            tempStr = Integer.toHexString(origBytes[i] & 0xff);
            if (tempStr.length() == 1) {
                stb.append("0");
            }
            stb.append(tempStr);
        }
        return stb.toString();
    }
}
