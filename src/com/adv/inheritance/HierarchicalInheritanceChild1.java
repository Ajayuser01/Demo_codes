package com.adv.inheritance;

public class HierarchicalInheritanceChild1 extends HierarchicalInheritanceParent {

	public int hierDerivedOne(int value) {
		int result = mutiplicationOfTen(value);
		System.out.println("Result in child1 method : "+result);
		return result;
	}
}
