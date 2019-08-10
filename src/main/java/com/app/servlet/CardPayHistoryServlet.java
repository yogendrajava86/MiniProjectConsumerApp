package com.app.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.consumer.CardConsumer;
import com.app.model.CardInfo;
import com.app.util.JsonUtil;

public class CardPayHistoryServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//1. call card payment consumer
			String rsp=CardConsumer.viewAllTx();
		//2. convert to Object
			List<CardInfo> clist=JsonUtil.convertJsonToObj(rsp);
		//3. set to UI.
			req.setAttribute("list", clist);
		//4. Return Back to UI
			RequestDispatcher rd=req.getRequestDispatcher("PaymentHistory.jsp");
			rd.forward(req, resp);
	}
}
