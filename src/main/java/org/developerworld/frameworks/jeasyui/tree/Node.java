package org.developerworld.frameworks.jeasyui.tree;

import java.util.List;
import java.util.Map;

public class Node {

	private Long id;
	private String text;
	private NodeState state;
	private Boolean checked;
	private Map<String, Object> attributes;
	private List<Node> children;

	public Node() {

	}

	public Node(Long id, String text) {
		id(id).text(text);
	}

	public Node(Long id, String text, NodeState state, Boolean checked,
			Map<String, Object> attributes, List<Node> children) {
		id(id).text(text).state(state).checked(checked).attributes(attributes)
				.children(children);
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Node id(Long id) {
		setId(id);
		return this;
	}

	public Long getId() {
		return id;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Node text(String text) {
		setText(text);
		return this;
	}

	public String getText() {
		return text;
	}

	public void setState(NodeState state) {
		this.state = state;
	}

	public Node state(NodeState state) {
		setState(state);
		return this;
	}

	public NodeState getState() {
		return state;
	}

	public void setChecked(Boolean checked) {
		this.checked = checked;
	}

	public Node checked(Boolean checked) {
		setChecked(checked);
		return this;
	}

	public Boolean getChecked() {
		return checked;
	}

	public void setAttributes(Map<String, Object> attributes) {
		this.attributes = attributes;
	}

	public Node attributes(Map<String, Object> attributes) {
		setAttributes(attributes);
		return this;
	}

	public Map<String, Object> getAttributes() {
		return attributes;
	}

	public void setChildren(List<Node> children) {
		this.children = children;
	}

	public Node children(List<Node> children) {
		setChildren(children);
		return this;
	}

	public List<Node> getChildren() {
		return children;
	}

	@Override
	public String toString() {
		return "Node [id=" + id + ", text=" + text + ", state=" + state
				+ ", checked=" + checked + ", attributes=" + attributes
				+ ", children=" + children + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((attributes == null) ? 0 : attributes.hashCode());
		result = prime * result + ((checked == null) ? 0 : checked.hashCode());
		result = prime * result
				+ ((children == null) ? 0 : children.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((text == null) ? 0 : text.hashCode());
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
		Node other = (Node) obj;
		if (attributes == null) {
			if (other.attributes != null)
				return false;
		} else if (!attributes.equals(other.attributes))
			return false;
		if (checked == null) {
			if (other.checked != null)
				return false;
		} else if (!checked.equals(other.checked))
			return false;
		if (children == null) {
			if (other.children != null)
				return false;
		} else if (!children.equals(other.children))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (state != other.state)
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}



}
