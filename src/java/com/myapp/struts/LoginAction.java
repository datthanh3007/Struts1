/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Dell7450
 */
public class LoginAction extends org.apache.struts.action.Action {

   
    private static final String SUCCESS = "success";
    private static final String FAILE = "faile";

   
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        LoginActionForm loginActionForm = (LoginActionForm) form;
        if(loginActionForm.getUsername().equals("TD") && loginActionForm.getPassword().equals("YT"))
        return mapping.findForward(SUCCESS);
        else 
            return mapping.findForward(FAILE);
    }
}
