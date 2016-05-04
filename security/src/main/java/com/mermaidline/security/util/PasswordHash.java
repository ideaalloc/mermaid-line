package com.mermaidline.security.util;

import org.mindrot.jbcrypt.BCrypt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Title.
 * <p/>
 * Description.
 *
 * @author Bill Lv {@literal <billcc.lv@hotmail.com>}
 * @version 1.0
 * @since 2015-03-14
 */
public class PasswordHash {
    static final Logger LOGGER = LoggerFactory.getLogger(PasswordHash.class);

    public static String hash(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    public static boolean check(String plaintextPassword, String hashedPassword) {
        return BCrypt.checkpw(plaintextPassword, hashedPassword);
    }

    public static void main(String[] args) {
        final String hash = PasswordHash.hash("888888");
        // $2a$10$D2BBxpELbnys8NsJ6xB6IOEVvwH..Pt3JL7DY2KqNULDEb9pQeAGK
        LOGGER.info("hash: " + hash);
    }
}
