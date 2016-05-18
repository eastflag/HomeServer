package com.eastflag;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class GsonTest {
	@Ignore
	@Test
	public void gsonTest() {
		//json 만들기
		JsonObject con = new JsonObject();
		con.addProperty("seq", 1);
		
		JsonArray acpIds = new JsonArray();
		acpIds.add("ri_acp-d0e3949ca7fb4f16ab1fcf10811a1c60");
		acpIds.add("aaa");
		
		JsonObject object = new JsonObject();
		object.add("con", con);
		object.add("acpIds", acpIds);
		object.addProperty("label", "label1");
		String strObject = object.toString();
		System.out.println("object:" + strObject);
		
		//json 파싱
		JsonParser parser = new JsonParser();
		JsonObject json = parser.parse(strObject).getAsJsonObject();
		System.out.println("label: " + json.get("label").getAsString());
		System.out.println("seq: " + json.getAsJsonObject("con").get("seq").getAsInt());
		JsonArray array = json.getAsJsonArray("acpIds");
		for(int i=0; i<array.size(); ++i) {
			System.out.println("acpids: " + array.get(i).getAsString());
		}
	}

	@Ignore
	@Test
	public void gsonTest2() {
		//스트링 배열을 JsonArray로 변환
		JsonArray acpIds = new JsonArray();
		acpIds.add("ri_acp-d0e3949ca7fb4f16ab1fcf10811a1c60");
		acpIds.add("aaa");
		System.out.println("acpids:" + acpIds.toString());
		
		//string을 다시 gson Array로 역변환
		JsonParser parser = new JsonParser();
		JsonArray array = parser.parse(acpIds.toString()).getAsJsonArray();
		//List<String> acpIds = new ArrayList<String>();
		for(int i=0; i<array.size(); ++i) {
			acpIds.add(array.get(i).getAsString());
			System.out.println(array.get(i).getAsString());
		}
	}
}
