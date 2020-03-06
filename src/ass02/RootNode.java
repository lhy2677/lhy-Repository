package ass02;

import java.util.Collection;

public class RootNode extends Node{
	private int min;
	private int max;
	private Collection<Node> nodes;
	public RootNode(int min,int max,Collection<Node> nodes) {
		this.min=min;
		this.max=max;
		this.nodes=nodes;
	}
	public boolean search(int value) {
		for (Node node:this.nodes) {
			if(value<min||value>max) {
				continue;
			}
			if(node.search(value)==true) {
				return true;
			}
		}
		return false;
	}
}
