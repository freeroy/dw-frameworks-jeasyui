package org.developerworld.frameworks.jeasyui.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 树组件
 * 
 * @author Roy Huang 
 */
public class Tree {

	List<Node> nodes = new ArrayList<Node>();
	private final static ObjectMapper objectMapper = new ObjectMapper();

	public Tree addNode(Node node) {
		nodes.add(node);
		return this;
	}

	public String toJson() {
		try {
			return objectMapper.writeValueAsString(toList());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public List<Map<String, Object>> toList() {
		return toList(nodes);
	}

	private List<Map<String, Object>> toList(List<Node> nodes) {
		List<Map<String, Object>> rst = new ArrayList<Map<String, Object>>();
		for (Node node : nodes) {
			Map<String, Object> data = new HashMap<String, Object>();
			if (node.getId() != null)
				data.put("id", node.getId());
			if (node.getText() != null)
				data.put("text", node.getText());
			if (node.getState() != null)
				data.put("state", node.getState());
			if (node.getChecked() != null)
				data.put("checked", node.getChecked());
			if (node.getChildren() != null)
				data.put("children", toList(node.getChildren()));
			if (node.getAttributes() != null)
				data.put("attributes", node.getAttributes());
			rst.add(data);
		}
		return rst;
	}
}
