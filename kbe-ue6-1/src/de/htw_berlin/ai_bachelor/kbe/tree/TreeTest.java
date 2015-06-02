package de.htw_berlin.ai_bachelor.kbe.tree;

import java.util.ArrayList;
import java.util.List;

public class TreeTest {
	public static void main(String... a) {
		Tree<Integer> leftTree2 = new Tree<Integer>(65, null, null);
		Tree<Integer> rightTree1 = new Tree<Integer>(42, null, null);
		Tree<Integer> leftTree1 = new Tree<Integer>(23, leftTree2, null);
		Tree<Integer> rootTree = new Tree<Integer>(1, leftTree1, rightTree1);
		System.out.println(export(rootTree));
		System.out.println(TreeSum.sum(rootTree).toString());
		TreePredicate<Integer> tp = new ComparePredicate<Integer>(5, 40);
		System.out.println(tp.isOK(leftTree2));
	}
	
	public static <V extends Comparable<V>> java.util.Collection<V> filterElements(ComparePredicate<V> cp, Tree<V> t) {
		List<V> l = new ArrayList<V>();  
		if (cp.isOK(t)){
			
		}
		return l;
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
