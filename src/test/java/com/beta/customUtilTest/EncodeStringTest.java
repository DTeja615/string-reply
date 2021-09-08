package com.beta.customUtilTest;

import com.beta.customUtil.EncodeString;
import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class EncodeStringTest {
    @Test
    public void testEncoding() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        assertEquals("0fafeaae780954464c1b29f765861fad", EncodeString.encode("kbzw9ru"));
    }

    @Test
    public void invalidEncoding() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        assertNotEquals("0fafeaae780954464c1b29f765861fae", EncodeString.encode("kbzw9ru"));
    }
}