package com.mermaidline.repository.po;

import java.io.Serializable;

/**
 * Title.
 * <p>
 * Description.
 *
 * @author Bill Lv {@literal <billcc.lv@hotmail.com>}
 * @version 1.0
 * @since 2016-05-04
 */
public class Admin implements Serializable {
    Long    id;
    String  username;
    String  password;
    Boolean enabled;
    String  authority;
    String  email;
    String  phone;
    String  sinaAccount;
    String  weixinAccount;
    String  qqAccount;
    String  avatar;
    String  description;

    public Admin() {
    }

    public Admin(Long id, String username, String password, Boolean enabled, String authority, String email, String phone, String sinaAccount, String weixinAccount, String qqAccount, String avatar, String description) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.authority = authority;
        this.email = email;
        this.phone = phone;
        this.sinaAccount = sinaAccount;
        this.weixinAccount = weixinAccount;
        this.qqAccount = qqAccount;
        this.avatar = avatar;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSinaAccount() {
        return sinaAccount;
    }

    public void setSinaAccount(String sinaAccount) {
        this.sinaAccount = sinaAccount;
    }

    public String getWeixinAccount() {
        return weixinAccount;
    }

    public void setWeixinAccount(String weixinAccount) {
        this.weixinAccount = weixinAccount;
    }

    public String getQqAccount() {
        return qqAccount;
    }

    public void setQqAccount(String qqAccount) {
        this.qqAccount = qqAccount;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", enabled=" + enabled +
                ", authority='" + authority + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", sinaAccount='" + sinaAccount + '\'' +
                ", weixinAccount='" + weixinAccount + '\'' +
                ", qqAccount='" + qqAccount + '\'' +
                ", avatar='" + avatar + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
