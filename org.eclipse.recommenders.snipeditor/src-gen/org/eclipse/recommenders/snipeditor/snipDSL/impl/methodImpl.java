/**
 */
package org.eclipse.recommenders.snipeditor.snipDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.recommenders.snipeditor.snipDSL.SnipDSLPackage;
import org.eclipse.recommenders.snipeditor.snipDSL.Visibility;
import org.eclipse.recommenders.snipeditor.snipDSL.method;
import org.eclipse.recommenders.snipeditor.snipDSL.parameter;

import org.eclipse.xtext.common.types.JvmTypeReference;

import org.eclipse.xtext.xbase.XExpression;

import org.eclipse.xtext.xbase.impl.XExpressionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.recommenders.snipeditor.snipDSL.impl.methodImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.eclipse.recommenders.snipeditor.snipDSL.impl.methodImpl#getJType <em>JType</em>}</li>
 *   <li>{@link org.eclipse.recommenders.snipeditor.snipDSL.impl.methodImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.recommenders.snipeditor.snipDSL.impl.methodImpl#getParams <em>Params</em>}</li>
 *   <li>{@link org.eclipse.recommenders.snipeditor.snipDSL.impl.methodImpl#getThrowExceptions <em>Throw Exceptions</em>}</li>
 *   <li>{@link org.eclipse.recommenders.snipeditor.snipDSL.impl.methodImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class methodImpl extends XExpressionImpl implements method
{
  /**
   * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisibility()
   * @generated
   * @ordered
   */
  protected static final Visibility VISIBILITY_EDEFAULT = Visibility.PROTECTED;

  /**
   * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisibility()
   * @generated
   * @ordered
   */
  protected Visibility visibility = VISIBILITY_EDEFAULT;

  /**
   * The cached value of the '{@link #getJType() <em>JType</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJType()
   * @generated
   * @ordered
   */
  protected JvmTypeReference jType;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<parameter> params;

  /**
   * The cached value of the '{@link #getThrowExceptions() <em>Throw Exceptions</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThrowExceptions()
   * @generated
   * @ordered
   */
  protected EList<String> throwExceptions;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected XExpression body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected methodImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SnipDSLPackage.Literals.METHOD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Visibility getVisibility()
  {
    return visibility;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVisibility(Visibility newVisibility)
  {
    Visibility oldVisibility = visibility;
    visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SnipDSLPackage.METHOD__VISIBILITY, oldVisibility, visibility));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmTypeReference getJType()
  {
    return jType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetJType(JvmTypeReference newJType, NotificationChain msgs)
  {
    JvmTypeReference oldJType = jType;
    jType = newJType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SnipDSLPackage.METHOD__JTYPE, oldJType, newJType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJType(JvmTypeReference newJType)
  {
    if (newJType != jType)
    {
      NotificationChain msgs = null;
      if (jType != null)
        msgs = ((InternalEObject)jType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SnipDSLPackage.METHOD__JTYPE, null, msgs);
      if (newJType != null)
        msgs = ((InternalEObject)newJType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SnipDSLPackage.METHOD__JTYPE, null, msgs);
      msgs = basicSetJType(newJType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SnipDSLPackage.METHOD__JTYPE, newJType, newJType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SnipDSLPackage.METHOD__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<parameter> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<parameter>(parameter.class, this, SnipDSLPackage.METHOD__PARAMS);
    }
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getThrowExceptions()
  {
    if (throwExceptions == null)
    {
      throwExceptions = new EDataTypeEList<String>(String.class, this, SnipDSLPackage.METHOD__THROW_EXCEPTIONS);
    }
    return throwExceptions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(XExpression newBody, NotificationChain msgs)
  {
    XExpression oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SnipDSLPackage.METHOD__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(XExpression newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SnipDSLPackage.METHOD__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SnipDSLPackage.METHOD__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SnipDSLPackage.METHOD__BODY, newBody, newBody));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SnipDSLPackage.METHOD__JTYPE:
        return basicSetJType(null, msgs);
      case SnipDSLPackage.METHOD__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
      case SnipDSLPackage.METHOD__BODY:
        return basicSetBody(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SnipDSLPackage.METHOD__VISIBILITY:
        return getVisibility();
      case SnipDSLPackage.METHOD__JTYPE:
        return getJType();
      case SnipDSLPackage.METHOD__NAME:
        return getName();
      case SnipDSLPackage.METHOD__PARAMS:
        return getParams();
      case SnipDSLPackage.METHOD__THROW_EXCEPTIONS:
        return getThrowExceptions();
      case SnipDSLPackage.METHOD__BODY:
        return getBody();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SnipDSLPackage.METHOD__VISIBILITY:
        setVisibility((Visibility)newValue);
        return;
      case SnipDSLPackage.METHOD__JTYPE:
        setJType((JvmTypeReference)newValue);
        return;
      case SnipDSLPackage.METHOD__NAME:
        setName((String)newValue);
        return;
      case SnipDSLPackage.METHOD__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends parameter>)newValue);
        return;
      case SnipDSLPackage.METHOD__THROW_EXCEPTIONS:
        getThrowExceptions().clear();
        getThrowExceptions().addAll((Collection<? extends String>)newValue);
        return;
      case SnipDSLPackage.METHOD__BODY:
        setBody((XExpression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SnipDSLPackage.METHOD__VISIBILITY:
        setVisibility(VISIBILITY_EDEFAULT);
        return;
      case SnipDSLPackage.METHOD__JTYPE:
        setJType((JvmTypeReference)null);
        return;
      case SnipDSLPackage.METHOD__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SnipDSLPackage.METHOD__PARAMS:
        getParams().clear();
        return;
      case SnipDSLPackage.METHOD__THROW_EXCEPTIONS:
        getThrowExceptions().clear();
        return;
      case SnipDSLPackage.METHOD__BODY:
        setBody((XExpression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SnipDSLPackage.METHOD__VISIBILITY:
        return visibility != VISIBILITY_EDEFAULT;
      case SnipDSLPackage.METHOD__JTYPE:
        return jType != null;
      case SnipDSLPackage.METHOD__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SnipDSLPackage.METHOD__PARAMS:
        return params != null && !params.isEmpty();
      case SnipDSLPackage.METHOD__THROW_EXCEPTIONS:
        return throwExceptions != null && !throwExceptions.isEmpty();
      case SnipDSLPackage.METHOD__BODY:
        return body != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (visibility: ");
    result.append(visibility);
    result.append(", name: ");
    result.append(name);
    result.append(", throwExceptions: ");
    result.append(throwExceptions);
    result.append(')');
    return result.toString();
  }

} //methodImpl
