package com.pattern.ChainOfResponsibility.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunxuechao
 */
public class FilterChain implements Filter {

	List<Filter> filters = new ArrayList<Filter>();

	int index;
	/**
	 * @param filter
	 */
	public void addFilter(Filter filter) {
		filters.add(filter);
	}

	@Override
	public String doFilter(String str,Filter filter) {
		if(index < filters.size()){
			return filters.get(index++).doFilter(str, this);
		}
		return str;
	}
}
