package com.android.jwt;

/**
 * @author ankitkumar (ankitdroiddeveloper@gmail.com) on 12/09/2018
 */
public class DecodeException extends RuntimeException {

    DecodeException(String message) {
        super(message);
    }

    DecodeException(String message, Throwable cause) {
        super(message, cause);
    }
}