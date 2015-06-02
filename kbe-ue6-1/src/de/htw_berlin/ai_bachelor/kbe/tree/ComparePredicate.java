package de.htw_berlin.ai_bachelor.kbe.tree;

public class ComparePredicate<V extends Comparable<V>> implements TreePredicate<V> {

	private V minEle = null;
	private V maxEle = null;
	
	public ComparePredicate(V minEle, V maxEle) {
		if (maxEle instanceof java.lang.Comparable<?> && minEle instanceof java.lang.Comparable<?>) {
			this.minEle = minEle;
			this.maxEle = maxEle;
		}
	}
	
	@Override
	public boolean isOK(Tree<V> t) {
		if (t.getValue().compareTo(minEle) > 0 && t.getValue().compareTo(maxEle) < 0) {
			return true;
		}
		else {
			return false;	
		}
	}

}
