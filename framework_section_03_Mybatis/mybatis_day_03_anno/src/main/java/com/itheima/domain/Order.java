package com.itheima.domain;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {

	private Long id;
	private Date orderTime;
	private Double total;
	private Long uid;

	private User user;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Order{" +
				"id=" + id +
				", orderTime=" + orderTime +
				", total=" + total +
				", uid=" + uid +
				", user=" + user +
				'}';
	}
}
