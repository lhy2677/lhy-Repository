package ass02;

import java.util.Collection;

public class LeafNode extends Node {
	private Collection<Integer> values;

	public LeafNode(Collection<Integer> values) {
		this.values = values;
	}

	public boolean search(int value) {
		return values.contains(value);
	}

}
