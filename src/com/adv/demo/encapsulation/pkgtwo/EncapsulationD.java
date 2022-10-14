package com.adv.demo.encapsulation.pkgtwo;

import com.adv.demo.encapsulation.pkgone.EncapsulationA;

public class EncapsulationD extends EncapsulationA {

	public String ProtectName(String dept) {
		String deptName=protectedName(dept);
		return deptName;
	}

}
