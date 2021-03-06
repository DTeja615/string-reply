package com.beta.customUtil;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class EncodeString {
    private static final Charset UTF_8 = StandardCharsets.UTF_8;
    //private static final String OUTPUT_FORMAT = "%-20s:%s";

    private static byte[] digest(byte[] input) {
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalArgumentException(e);
        }
        byte[] result = md.digest(input);
        return result;
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

    public static String encode(String message) {
        byte[] md5InBytes = EncodeString.digest(message.getBytes(UTF_8));
        return bytesToHex(md5InBytes);
        //return (String.format(OUTPUT_FORMAT, "data ", bytesToHex(md5InBytes)));
    }
}
