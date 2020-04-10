package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ExceptionHandler;
import org.apache.struts.config.ExceptionConfig;

public class ArithmeticExceptionHandler extends ExceptionHandler {

	@Override
	public ActionForward execute(Exception ex, ExceptionConfig exc, ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws ServletException {
		
		int fn = Integer.parseInt(request.getParameter("fn"));
		int sn = Integer.parseInt(request.getParameter("sn"));

		if (sn == 0) {
			request.setAttribute("res", fn);
		} else {
			request.setAttribute("res", fn/sn);
		}
		System.out.println("Exception Handler Logic...");
		
		return mapping.findForward("success");
	}
	
}
