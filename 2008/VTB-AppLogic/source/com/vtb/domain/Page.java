package com.vtb.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Page implements Serializable {

	// XXX
	/*
	 * public static final Page EMPTY_PAGE = new Page(Collections.EMPTY_LIST, 0,
	 * 0);
	 */
	public static final Page EMPTY_PAGE = new Page(Collections.EMPTY_LIST, 0,
			false);

	List objects;

	int start;

	// XXX
	// int containingListSize;
	boolean hasNext;

	// XXX
	/*
	 * public Page(List l, int s, int cls) {
	 */
	public Page(List l, int s, boolean hasNext) {
		objects = new ArrayList(l);
		start = s;
		// XXX
		// containingListSize = cls;
		this.hasNext = hasNext;
	}

	public List getList() {
		return objects;
	}

	public boolean isNextPageAvailable() {
		// XXX
		/*
		 * return (start + objects.size()) < containingListSize;
		 */
		return hasNext;
	}

	public boolean isPreviousPageAvailable() {
		return start > 0;
	}

	public int getStartOfNextPage() {
		return start + objects.size();
	}

	public int getStartOfPreviousPage() {
		return Math.max(start - objects.size(), 0);
	}

	public int getSize() {
		return objects.size();
	}

}
