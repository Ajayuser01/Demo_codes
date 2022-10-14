package com.adv.inheritance;

public class HierarchicalInheritanceChild2 extends HierarchicalInheritanceParent {

	public int hierDerivedTwo(int value) {
		int result = mutiplicationOfTen(value);
		System.out.println("Result in child2 method : "+result);
		return result;
	}
}
