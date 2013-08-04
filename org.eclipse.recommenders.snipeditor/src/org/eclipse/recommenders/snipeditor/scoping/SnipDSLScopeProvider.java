/*
 * generated by Xtext
 */
package org.eclipse.recommenders.snipeditor.scoping;

import org.eclipse.xtext.xbase.annotations.scoping.XbaseWithAnnotationsScopeProvider;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it 
 *
 */
public class SnipDSLScopeProvider extends XbaseWithAnnotationsScopeProvider {
	@Override
	public IScope getScope(EObject context, EReference reference) {
		System.out.println("#2  "+context.eClass().toString()  + "     "+ reference.getEReferenceType().getName());
		return super.getScope(context, reference);
		}
}
