package com.kyu.image.test;

import com.kyu.image.ImageHandler;
import com.kyu.image.core.ImageInfoData;
import com.kyu.image.core.ImageType;

/**
 * @FileName : Main.java
 * @Project : sample_project
 * @Date : 2012. 7. 26.
 * @작성자 : 이남규
 * @프로그램설명 :
 */
public class Main {

	/**
	 * <pre>
	 * main
	 *
	 * <pre>
	 * @param args
	 */
	public static void main(String[] args) {
		ImageHandler handler = new ImageHandler();
		ImageInfoData data = makeDate();
		boolean isSucess = handler.job(data);
		System.out.println("##main## (이미지 생성) isSucess=" + isSucess);
	}

	/**
	 * <pre>
	 * makeDate
	 *
	 * <pre>
	 * @return
	 */
	public static ImageInfoData makeDate() {
		ImageInfoData data = new ImageInfoData();
		data.setImageType(ImageType.BAR_BANNER);
		data.setOrgImgPath("E:\\test\\resize\\img\\test.png");
		return data;
	}
}
