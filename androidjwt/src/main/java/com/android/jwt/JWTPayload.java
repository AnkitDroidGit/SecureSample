package com.android.jwt;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author ankitkumar (ankitdroiddeveloper@gmail.com) on 12/09/2018
 */
class JWTPayload {

    final String iss;
    final String sub;
    final Date exp;
    final Date nbf;
    final Date iat;
    final String jti;
    final List<String> aud;
    private final Map<String, Claim> tree;

    JWTPayload(String iss, String sub, Date exp, Date nbf, Date iat, String jti, List<String> aud, Map<String, Claim> tree) {
        this.iss = iss;
        this.sub = sub;
        this.exp = exp;
        this.nbf = nbf;
        this.iat = iat;
        this.jti = jti;
        this.aud = aud;
        this.tree = tree;
    }

    Claim claimForName(String name) {
        final Claim claim = this.tree.get(name);
        return claim != null ? claim : new BaseClaim();
    }
}