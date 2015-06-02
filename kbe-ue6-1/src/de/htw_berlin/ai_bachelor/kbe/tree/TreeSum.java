package de.htw_berlin.ai_bachelor.kbe.tree;

public class TreeSum {
	public static Integer sum(Tree<?> tree) {
		int result = 0;
		if (tree != null) {
			result = (Integer) tree.getValue() + sum(tree.getLeft()) + sum(tree.getRight());
		}
		return result;
	}
}
