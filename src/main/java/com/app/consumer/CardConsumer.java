package com.app.consumer;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class CardConsumer {

	public static String createTx(String data) {
		String URL="http://localhost:8085/MiniProjectProducerApp/rest/payment/dopayment";
		String msg=null;
		try {
			Client c=Client.create();
			WebResource wr=c.resource(URL);
			ClientResponse cr=wr.header("Content-Type", "application/json")
			.post(ClientResponse.class,data);			
			int status=cr.getStatus();
			if(status==200) {
			 msg=cr.getEntity(String.class);
			}else {
				msg="Sorry something wrong, Please ask from Admin";
				}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}
	
	public static String viewAllTx() {
		String URL="http://localhost:8085/MiniProjectProducerApp/rest/payment/getall";
		String msg=null;
		try {
			Client c=Client.create();
			WebResource wr=c.resource(URL);
			ClientResponse cr=wr.header("Content-Type", "application/json")
					.header("Accept", "application/json")
			.get(ClientResponse.class);			
			int status=cr.getStatus();
			if(status==200) {
			 msg=cr.getEntity(String.class);
			}else {
				msg="Sorry something wrong, Please ask from Admin";
				}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}
	public static String getOneTx(String txid) {
		String URL="http://localhost:8085/MiniProjectProducerApp/rest/payment/getone?txid=";
		String msg=null;
		if(txid!=null) {
			try {
				Client c=Client.create();
				WebResource wr=c.resource(URL+txid);
				ClientResponse cr=wr.header("Content-Type", "application/json")
						.header("Accept", "application/json")
				.get(ClientResponse.class);			
				int status=cr.getStatus();
				if(status==200) {
				 msg=cr.getEntity(String.class);
				}else {
					msg="Sorry something wrong, Please ask from Admin";
					}			
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return msg;
	}
}
