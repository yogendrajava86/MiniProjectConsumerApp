package com.app.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

import com.app.consumer.CardConsumer;
import com.app.model.CardInfo;
import com.app.util.JsonUtil;


public class CardPayServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//1. read form data
		String cname=req.getParameter("cname");
		String cnum=req.getParameter("cnum");
		String cvvs=req.getParameter("cvv");
		String expDate=req.getParameter("expDate");
		String amts=req.getParameter("amt");
		//2. parse data
		int cvv=Integer.parseInt(cvvs);
		double amt=Double.parseDouble(amts);
		//3. convert to Object
			CardInfo ci=new CardInfo(cname, cnum, cvv, expDate, amt);
		//4. Object to json
			String jsondata=JsonUtil.convertObjToJson(ci);
		//5. call card payment consumer
		String rsp=CardConsumer.createTx(jsondata);		
		//6. set to variable
		req.setAttribute("message", rsp);
		//7. Goto UI back
		RequestDispatcher rd=req.getRequestDispatcher("CardUi.jsp");
				
		//8. call UI Page
		rd.forward(req, resp);
		
	}
}
