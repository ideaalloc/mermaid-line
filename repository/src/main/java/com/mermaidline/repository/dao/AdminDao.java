package com.mermaidline.repository.dao;

import com.mermaidline.repository.po.Admin;

/**
 * Title.
 * <p>
 * Description.
 *
 * @author Bill Lv {@literal <billcc.lv@hotmail.com>}
 * @version 1.0
 * @since 2016-05-04
 */
public interface AdminDao {
    Admin findByUsername(String username);
}
