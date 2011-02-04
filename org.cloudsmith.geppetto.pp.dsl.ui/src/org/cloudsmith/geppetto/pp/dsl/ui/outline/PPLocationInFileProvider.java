/**
 * Copyright (c) 2011 Cloudsmith Inc. and other contributors, as listed below.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Cloudsmith
 * 
 */
package org.cloudsmith.geppetto.pp.dsl.ui.outline;

import org.cloudsmith.geppetto.pp.PPPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.resource.DefaultLocationInFileProvider;

/**
 * Used to define the significant "short" locations for outline relevant elements.
 * (The defaults do not understand which nodes are "names").
 * 
 */
public class PPLocationInFileProvider extends DefaultLocationInFileProvider {

	@Override
	protected EStructuralFeature getIdentifierFeature(EObject obj) {
		// note, must check against EClass as the class id is not universally unique.
		EClass ec = obj.eClass();
		if(ec.equals(PPPackage.Literals.DEFINITION))
			return PPPackage.Literals.DEFINITION__CLASS_NAME;
		if(ec.equals(PPPackage.Literals.DOUBLE_QUOTED_STRING))
			return PPPackage.Literals.DOUBLE_QUOTED_STRING__TEXT_EXPRESSION;
		if(ec.equals(PPPackage.Literals.HOST_CLASS_DEFINITION))
			return PPPackage.Literals.DEFINITION__CLASS_NAME;
		if(ec.equals(PPPackage.Literals.IMPORT_EXPRESSION))
			return PPPackage.Literals.IMPORT_EXPRESSION__VALUES;
		if(ec.equals(PPPackage.Literals.RESOURCE_EXPRESSION))
			return PPPackage.Literals.RESOURCE_EXPRESSION__RESOURCE_EXPR;
		if(ec.equals(PPPackage.Literals.RESOURCE_BODY))
			return PPPackage.Literals.RESOURCE_BODY__NAME_EXPR;

		return super.getIdentifierFeature(obj);
	}

}
