package com.mermaidline.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Title.
 * <p/>
 * Description.
 *
 * @author Bill Lv {@literal <billcc.lv@hotmail.com>}
 * @version 1.0
 * @since 2014-12-17
 */
@Controller
@RequestMapping("/content")
public class ContentController {
    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "content/index";
    }
}
