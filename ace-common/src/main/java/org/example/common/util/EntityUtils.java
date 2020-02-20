package org.example.common.util;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.net.URLDecoder;

public class EntityUtils {

    public static <T> void setCreateAndUpdateInfo(T entity) {

    }

    public static <T> void setCreateInfo(T entity) {
        HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
        String hostIp = "";
        String name = "";
        String id = "";
        if (request != null) {
            hostIp = StringUtils.defaultIfBlank(request.getHeader("userHost"), ClientUtil.getClientIp(request));
            name = StringUtils.trimToEmpty(request.getHeader("userName"));
            name = URLDecoder.decode(name);
            id = StringUtils.trimToEmpty(request.getHeader("id"));

        }

    }


}
