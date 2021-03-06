/**
 * Copyright (C) 2010 INSA LYON http://www.insa-lyon.fr
 * Copyright (C) 2010 Esup Portail http://www.esup-portail.org
 * @Author (C) 2010 Olivier Franco <Olivier.Franco@insa-lyon.fr>
 * @Contributor (C) 2010 Doriane Dusart <Doriane.Dusart@univ-valenciennes.fr>
 * @Contributor (C) 2010 Jean-Pierre Tran <Jean-Pierre.Tran@univ-rouen.fr>
 * @Contributor (C) 2010 Vincent Bonamy <Vincent.Bonamy@univ-rouen.fr>
 *
 * Licensed under the GPL License, (please see the LICENCE file)
 */

package org.esupportail.sympa.domain.services;

import org.esupportail.sympa.domain.services.IDomainService.SympaListFields;

public class SympaListCriterion {
	private SympaListFields fieldName;
	private Object compareTo;
	
	public SympaListCriterion() {}
	public SympaListCriterion(SympaListFields fieldName, Object compareTo) {
		this.fieldName = fieldName;
		this.compareTo = compareTo;
	}
	/**
	 * @return the fieldName
	 */
	public SympaListFields getFieldName() {
		return fieldName;
	}
	/**
	 * @param fieldName the fieldName to set
	 */
	public void setFieldName(SympaListFields fieldName) {
		this.fieldName = fieldName;
	}
	/**
	 * @return the compareTo
	 */
	public Object getCompareTo() {
		return compareTo;
	}
	/**
	 * @param compareTo the compareTo to set
	 */
	public void setCompareTo(Object compareTo) {
		this.compareTo = compareTo;
	}
}
