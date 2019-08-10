package com.app.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.consumer.CardConsumer;
import com.app.model.CardInfo;
import com.app.util.JsonUtil;

public class CardPayInfoServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//1. read form data
		String txid=req.getParameter("txid");
		//2. call card payment consumer
		String rsp=CardConsumer.getOneTx(txid);
		//3. json to Object
		CardInfo ob=JsonUtil.convertJsonToSingleObj(rsp);
		//4. set to variable
		req.setAttribute("ob", ob);
		//5. Goto UI back
		RequestDispatcher rd=req.getRequestDispatcher("ViewInfo.jsp");
		//6. call UI Page
		rd.forward(req, resp);
	
	}
}
