package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class CalculatorController extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
	
		int fn = Integer.parseInt(request.getParameter("fn"));
		int sn = Integer.parseInt(request.getParameter("sn"));
		int tn = fn/sn; 
		
		request.setAttribute("response", tn);
		
		return mapping.findForward("success");
	}
	
}
