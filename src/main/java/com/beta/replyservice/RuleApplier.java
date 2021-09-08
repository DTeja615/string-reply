package com.beta.replyservice;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

//import static com.beta.customUtil.StringEncoding.encodeToHex;
import static com.beta.customUtil.EncodeString.encode;
import static com.beta.customUtil.StringReverse.reverseString;

public class RuleApplier {
    public static String ruleApplier(String[] arr) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String rule1 = arr[0].substring(0,1);
        String rule2 = arr[0].substring(1);
        String[] ruleArray = {rule1, rule2};
        String outputString = arr[1];
        for (String element : ruleArray){
            if (element.equals("1")){
                outputString = reverseString(outputString);
            }
            else{
                outputString = encode(outputString);
                //outputString = encodeToHex(arr[1]);
            }
        }
        return outputString;
    }

}
