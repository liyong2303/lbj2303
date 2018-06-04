package com.ky.lebron.text;

public class StringText {
	
	public static void main(String[] args) {
		String bigPic = "https://c2.hoopchina.com.cn/uploads/star/event/images/180603/2ce53989f6dd07d6192480184867410ded8c47ab.jpg";
		String smallPic = bigPic.substring(0,bigPic.lastIndexOf("/") ) + "/thumbnail-" + bigPic.substring(bigPic.lastIndexOf("/")+1);
		System.out.println(smallPic);
	}
}
