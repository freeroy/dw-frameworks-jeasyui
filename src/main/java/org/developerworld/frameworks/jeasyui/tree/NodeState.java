package org.developerworld.frameworks.jeasyui.tree;

public enum NodeState {
	
	OPEN("open"),CLOSED("closed");
	
	private String value;
	
	private NodeState(String value){
		this.value=value;
	}
	
	public String toString(){
		return value;
	}
}
