package de.htw_berlin.ai_bachelor.kbe.tree;

public class Tree<E> {
	private final E value;
	private final Tree<E> left;
	private final Tree<E> right;

	public Tree(E v, Tree<E> l, Tree<E> r) {
		this.value = v;
		this.left = l;
		this.right = r;
	}

	public E getValue() {
		return this.value;
	}

	public Tree<E> getLeft() {
		return this.left;
	}

	public Tree<E> getRight() {
		return this.right;
	}
}
