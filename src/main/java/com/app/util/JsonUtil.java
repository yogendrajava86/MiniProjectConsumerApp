package com.app.util;

import java.util.Arrays;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

import com.app.model.CardInfo;

public class JsonUtil {

	public static String convertObjToJson(CardInfo ci) {
		String json=null;
		try {			
			ObjectMapper om=new ObjectMapper();
			json=om.writeValueAsString(ci);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return json;
	}
	
	public static List<CardInfo> convertJsonToObj(String jsndata) {
		List<CardInfo> list=null;
		try {			
			ObjectMapper om=new ObjectMapper();
			// 1. convert JSON array to Array objects
			//CardInfo[] pp1 = om.readValue(jsndata, CardInfo[].class);
			// 2. convert JSON array to List of objects
			 list =Arrays.asList(om.readValue(jsndata, CardInfo[].class));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static CardInfo convertJsonToSingleObj(String jsndata) {
		CardInfo ci=null;
		try {			
			ObjectMapper om=new ObjectMapper();
			// 1. convert JSON to object
			 ci=om.readValue(jsndata, CardInfo.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ci;
	}

}
