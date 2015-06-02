package de.htw_berlin.ai_bachelor.kbe.tree;

public class Tree<E> {
	private final E value;
	private final Tree<?> left;
	private final Tree<?> right;

	public Tree(E v, Tree<?> l, Tree<?> r) {
		this.value = v;
		this.left = l;
		this.right = r;
	}

	public E getValue() {
		return this.value;
	}

	public Tree<?> getLeft() {
		return this.left;
	}

	public Tree<?> getRight() {
		return this.right;
	}
}
