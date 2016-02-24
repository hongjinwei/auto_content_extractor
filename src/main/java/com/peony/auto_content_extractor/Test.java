package com.peony.auto_content_extractor;

import com.peony.util.http.HttpQuery;

public class Test {

	private static String getHtml(String url) throws Exception {
		return HttpQuery.getInstance().get(url).asString();
	}
	
	private static String cleanHtml(String content){
		return content.replaceAll("<[^>]*>", "");
	}
	
	public static void main(String[] args) throws Exception{
		System.out.println(cleanHtml(getHtml("http://news.sina.com.cn/c/2015-09-15/191232311078.shtml")));
	}
	
	
}
