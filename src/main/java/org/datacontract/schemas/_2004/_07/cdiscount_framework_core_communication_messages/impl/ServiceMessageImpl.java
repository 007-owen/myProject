/*
 * XML Type:  ServiceMessage
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages
 * Java type: org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ServiceMessage
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.impl;
/**
 * An XML ServiceMessage(@http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages).
 *
 * This is a complex type.
 */
public class ServiceMessageImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ServiceMessage
{
    private static final long serialVersionUID = 1L;
    
    public ServiceMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERRORMESSAGE$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "ErrorMessage");
    private static final javax.xml.namespace.QName OPERATIONSUCCESS$2 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "OperationSuccess");
    
    
    /**
     * Gets the "ErrorMessage" element
     */
    public java.lang.String getErrorMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ErrorMessage" element
     */
    public org.apache.xmlbeans.XmlString xgetErrorMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORMESSAGE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ErrorMessage" element
     */
    public boolean isNilErrorMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ErrorMessage" element
     */
    public boolean isSetErrorMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRORMESSAGE$0) != 0;
        }
    }
    
    /**
     * Sets the "ErrorMessage" element
     */
    public void setErrorMessage(java.lang.String errorMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORMESSAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERRORMESSAGE$0);
            }
            target.setStringValue(errorMessage);
        }
    }
    
    /**
     * Sets (as xml) the "ErrorMessage" element
     */
    public void xsetErrorMessage(org.apache.xmlbeans.XmlString errorMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORMESSAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERRORMESSAGE$0);
            }
            target.set(errorMessage);
        }
    }
    
    /**
     * Nils the "ErrorMessage" element
     */
    public void setNilErrorMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORMESSAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERRORMESSAGE$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ErrorMessage" element
     */
    public void unsetErrorMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRORMESSAGE$0, 0);
        }
    }
    
    /**
     * Gets the "OperationSuccess" element
     */
    public boolean getOperationSuccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONSUCCESS$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "OperationSuccess" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetOperationSuccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(OPERATIONSUCCESS$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "OperationSuccess" element
     */
    public boolean isSetOperationSuccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATIONSUCCESS$2) != 0;
        }
    }
    
    /**
     * Sets the "OperationSuccess" element
     */
    public void setOperationSuccess(boolean operationSuccess)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONSUCCESS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATIONSUCCESS$2);
            }
            target.setBooleanValue(operationSuccess);
        }
    }
    
    /**
     * Sets (as xml) the "OperationSuccess" element
     */
    public void xsetOperationSuccess(org.apache.xmlbeans.XmlBoolean operationSuccess)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(OPERATIONSUCCESS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(OPERATIONSUCCESS$2);
            }
            target.set(operationSuccess);
        }
    }
    
    /**
     * Unsets the "OperationSuccess" element
     */
    public void unsetOperationSuccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATIONSUCCESS$2, 0);
        }
    }
}
