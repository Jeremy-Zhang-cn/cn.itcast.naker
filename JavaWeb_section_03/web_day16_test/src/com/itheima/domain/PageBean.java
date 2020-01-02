package com.itheima.domain;

import java.util.List;

public class PageBean<T> {

	/*
		分页对象
	 */

	private int totalCount; 	//总记录数
	private int totalPage; 		//总页码
	private List<T> list; 		//每页的数据
	private int currentPage; 	//当前页码
	private int rows; 			//每页显示的记录数

	public PageBean() {
	}

	public PageBean(int totalCount, int totalPage, List<T> list, int currentPage, int rows) {
		this.totalCount = totalCount;
		this.totalPage = totalPage;
		this.list = list;
		this.currentPage = currentPage;
		this.rows = rows;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

}
