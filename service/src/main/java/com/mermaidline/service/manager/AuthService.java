package com.mermaidline.service.manager;

import com.google.common.collect.ImmutableList;
import com.mermaidline.repository.dao.AdminDao;
import com.mermaidline.repository.po.Admin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.Collection;

/**
 * Title.
 * <p>
 * Description.
 *
 * @author Bill Lv {@literal <billcc.lv@hotmail.com>}
 * @version 1.0
 * @since 2015-04-28
 */
@Service
public class AuthService implements UserDetailsService, Serializable {
    static final Logger LOGGER = LoggerFactory.getLogger(AuthService.class);

    @Autowired
    AdminDao adminDao;

    @Transactional
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        LOGGER.info("you have got username {} to authenticate", username);
        final Admin admin = adminDao.findByUsername(username);
        if (admin == null) {
            throw new UsernameNotFoundException(String.format("User %s does not exist!", username));
        }
        return new UserDetails() {
            @Override
            public Collection<? extends GrantedAuthority> getAuthorities() {
                return ImmutableList.of((GrantedAuthority) () -> admin.getAuthority());
            }

            @Override
            public String getPassword() {
                return admin.getPassword();
            }

            @Override
            public String getUsername() {
                return username;
            }

            @Override
            public boolean isAccountNonExpired() {
                return true;
            }

            @Override
            public boolean isAccountNonLocked() {
                return true;
            }

            @Override
            public boolean isCredentialsNonExpired() {
                return true;
            }

            @Override
            public boolean isEnabled() {
                return true;
            }
        };
    }

}
