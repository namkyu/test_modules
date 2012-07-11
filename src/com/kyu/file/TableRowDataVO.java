package com.kyu.file;

import java.util.Date;

/**
 * @FileName : TableRowDataVO.java
 * @Project : sample_project
 * @Date : 2012. 7. 11.
 * @작성자 : 이남규
 * @프로그램설명 :
 */
public class TableRowDataVO {

	private long imp;
	private int click;
	private String name;
	private double ctr;
	private Date regDate;

	public long getImp() {
		return imp;
	}

	public void setImp(long imp) {
		this.imp = imp;
	}

	public int getClick() {
		return click;
	}

	public void setClick(int click) {
		this.click = click;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCtr() {
		return ctr;
	}

	public void setCtr(double ctr) {
		this.ctr = ctr;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "TableRowDataVO [imp=" + imp + ", click=" + click + ", name=" + name + ", ctr=" + ctr + ", regDate="
				+ regDate + "]";
	}
}
