package org.launchcode.Controllers;

import com.sun.org.apache.xpath.internal.objects.XString;
import org.apache.tomcat.websocket.WsRemoteEndpointImplBase;
import org.launchcode.models.SeniorProperties;
import org.launchcode.models.data.SeniorPropertiesDao;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class AbstractController {

    @Autowired
    protected SeniorPropertiesDao seniorPropertiesDao;

    public static final String userSessionKey = "seniorPropertiesId";

    protected SeniorProperties getSeniorPropertiesFromSession(HttpSession session) {
        Integer seniorPropertiesId = (Integer) session.getAttribute(userSessionKey);
        return seniorPropertiesId == null ? null : seniorPropertiesDao.findById(seniorPropertiesId).get();
    }

/*
    protected void setSeniorPropertiesInSession(HttpSession session, SeniorProperties seniorProperties){
        session.setAttribute(seniorPropertiesSessionKey, seniorProperties.getSeniorPropertiesId());
    }
*/















}
