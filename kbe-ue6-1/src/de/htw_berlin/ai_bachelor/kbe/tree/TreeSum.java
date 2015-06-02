package de.htw_berlin.ai_bachelor.kbe.tree;

public class TreeSum {
	public static Integer sum(Tree<?> tree) {
		int result = 0;
		if (tree != null) {
			if (tree.getValue().getClass().equals(Integer.class)) {
				result = (Integer) tree.getValue() + sum(tree.getLeft()) + sum(tree.getRight());
			}
			else {
				throw new IllegalArgumentException("The value of the tree is not an Integer, but it sould be.");
			}
		}
		return result;
	}
}
