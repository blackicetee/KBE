package de.htw_berlin.ai_bachelor.kbe.tree;

public class TreeTest {
	public static void main(String... a) {
		Tree<Integer> leftTree2 = new Tree<Integer>(65, null, null);
		Tree<Integer> rightTree1 = new Tree<Integer>(42, null, null);
		Tree<Integer> leftTree1 = new Tree<Integer>(23, leftTree2, null);
		Tree<Integer> rootTree = new Tree<Integer>(1, leftTree1, rightTree1);
		System.out.print(export(rootTree));
		System.out.println(TreeSum.sum(rootTree).toString());
	}
	
	public static String export(Tree<?> t) {
		String result = "";
		if (t != null) {
			result += "\n" + t.getValue();
			if (t.getLeft() != null){
				result += "\nLeftTree: " + t.getLeft().getValue();
			}
			else {
				result += "\nLeftTree: null";
			}
			if (t.getRight() != null) {
				result += "\nRightTree: " + t.getRight().getValue();
			}
			else {
				result += "\nRightTree: null";
			}
			result += export(t.getLeft());
			result += export(t.getRight());
		}
		return result;
	}
		
}
