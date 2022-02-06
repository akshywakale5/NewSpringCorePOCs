package com.akshay.score;

import java.util.Date;

public class WishMsgGeneratePOJO {

	private String name;
	private Date date;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WishMsgGeneratePOJO other = (WishMsgGeneratePOJO) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "WishMsgGeneratePOJO [name=" + name + ", date=" + date + "]";
	}
	
	public String msgGenerate() {
		return "Hello "+name+" today is "+date;
	}
	public WishMsgGeneratePOJO(String name, Date date) {
		super();
		this.name = name;
		this.date = date;
	}
	
}
