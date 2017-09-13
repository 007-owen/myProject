/*
 * XML Type:  CloseDiscussionResult
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.CloseDiscussionResult
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML CloseDiscussionResult(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class CloseDiscussionResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.CloseDiscussionResult
{
    private static final long serialVersionUID = 1L;
    
    public CloseDiscussionResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISCUSSIONID$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "DiscussionId");
    private static final javax.xml.namespace.QName OPERATIONSTATUS$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OperationStatus");
    
    
    /**
     * Gets the "DiscussionId" element
     */
    public long getDiscussionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCUSSIONID$0, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "DiscussionId" element
     */
    public org.apache.xmlbeans.XmlLong xgetDiscussionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(DISCUSSIONID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "DiscussionId" element
     */
    public boolean isSetDiscussionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISCUSSIONID$0) != 0;
        }
    }
    
    /**
     * Sets the "DiscussionId" element
     */
    public void setDiscussionId(long discussionId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCUSSIONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISCUSSIONID$0);
            }
            target.setLongValue(discussionId);
        }
    }
    
    /**
     * Sets (as xml) the "DiscussionId" element
     */
    public void xsetDiscussionId(org.apache.xmlbeans.XmlLong discussionId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(DISCUSSIONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(DISCUSSIONID$0);
            }
            target.set(discussionId);
        }
    }
    
    /**
     * Unsets the "DiscussionId" element
     */
    public void unsetDiscussionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISCUSSIONID$0, 0);
        }
    }
    
    /**
     * Gets the "OperationStatus" element
     */
    public com.cdiscount.www.CloseDiscussionStatus.Enum getOperationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONSTATUS$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.CloseDiscussionStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "OperationStatus" element
     */
    public com.cdiscount.www.CloseDiscussionStatus xgetOperationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CloseDiscussionStatus target = null;
            target = (com.cdiscount.www.CloseDiscussionStatus)get_store().find_element_user(OPERATIONSTATUS$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "OperationStatus" element
     */
    public boolean isSetOperationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATIONSTATUS$2) != 0;
        }
    }
    
    /**
     * Sets the "OperationStatus" element
     */
    public void setOperationStatus(com.cdiscount.www.CloseDiscussionStatus.Enum operationStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONSTATUS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATIONSTATUS$2);
            }
            target.setEnumValue(operationStatus);
        }
    }
    
    /**
     * Sets (as xml) the "OperationStatus" element
     */
    public void xsetOperationStatus(com.cdiscount.www.CloseDiscussionStatus operationStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CloseDiscussionStatus target = null;
            target = (com.cdiscount.www.CloseDiscussionStatus)get_store().find_element_user(OPERATIONSTATUS$2, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.CloseDiscussionStatus)get_store().add_element_user(OPERATIONSTATUS$2);
            }
            target.set(operationStatus);
        }
    }
    
    /**
     * Unsets the "OperationStatus" element
     */
    public void unsetOperationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATIONSTATUS$2, 0);
        }
    }
}
