package org.developerworld.frameworks.jeasyui.datagrid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 数据格子
 * 
 * @author Roy
 * 
 */
public class DataGrid<T> {

	private long total;
	private List<T> rows = new ArrayList<T>();
	private final static ObjectMapper objectMapper = new ObjectMapper();

	public DataGrid() {

	}

	public DataGrid(long total, List<T> rows) {
		total(total).rows(rows);
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public DataGrid<T> total(long total) {
		setTotal(total);
		return this;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	public DataGrid<T> rows(List<T> rows) {
		this.rows = rows;
		return this;
	}

	public DataGrid<T> addRow(T data) {
		rows.add(data);
		return this;
	}

	public Map<String,Object> toMap() {
		Map<String,Object> rst = new HashMap<String,Object>();
		rst.put("total", total);
		rst.put("rows", rows);
		return rst;
	}

	public String toJson() {
		try {
			return objectMapper.writeValueAsString(toMap());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
