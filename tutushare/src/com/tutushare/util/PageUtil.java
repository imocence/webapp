package com.tutushare.util;

import java.util.List;

import org.springframework.data.domain.Page;

public class PageUtil {
	
	private int next;//下一页
	private int prev;//上一页
	private int end;//最后一页
	private int show;//是否显示...
	private int start;//首页
	private int number;//当前
	private int totalPage;//共有多少页
	private long total;//共有多少个
	private List lists;//内容页
	
	public PageUtil() {}
	
	public static PageUtil createPageUtil(Page page){
		PageUtil pageUtil = new PageUtil();
		int number = page.getNumber();
		int start = 1;
		int showCount = 9;
		boolean show = false;
		if(number >= showCount || page.getTotalElements() > showCount){
			start = number;
			show  = true;
			start = (page.getTotalPages() - showCount) < start ? page.getTotalPages() - showCount + 1: start;
		}
		start = start <= 0 ? 1 : start;
		int next = number <= 0 ? 1 : number;
		int prev = number + 1 >= page.getTotalPages() ? page.getTotalPages() : number + 2;
		int end = start + showCount - 1;
		end = end > page.getTotalPages() ? page.getTotalPages() : end;
		int totalPage = page.getTotalPages();
		long total = page.getTotalElements();
		List lists = page.getContent();
		pageUtil.setEnd(end);
		pageUtil.setNext(next);
		pageUtil.setPrev(prev);
		pageUtil.setNumber(number);
		pageUtil.setStart(start);
		pageUtil.setTotal(total);
		pageUtil.setTotalPage(totalPage);
		pageUtil.setLists(lists);
		return pageUtil;
	}
	
	public int getNext() {
		return next;
	}
	public void setNext(int next) {
		this.next = next;
	}
	public int getPrev() {
		return prev;
	}
	public void setPrev(int prev) {
		this.prev = prev;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public int getShow() {
		return show;
	}
	public void setShow(int show) {
		this.show = show;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public List getLists() {
		return lists;
	}
	public void setLists(List lists) {
		this.lists = lists;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	
}
