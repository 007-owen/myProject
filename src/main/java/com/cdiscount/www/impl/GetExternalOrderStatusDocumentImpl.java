/*
 * An XML document type.
 * Localname: GetExternalOrderStatus
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetExternalOrderStatusDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one GetExternalOrderStatus(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class GetExternalOrderStatusDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetExternalOrderStatusDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetExternalOrderStatusDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETEXTERNALORDERSTATUS$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "GetExternalOrderStatus");
    
    
    /**
     * Gets the "GetExternalOrderStatus" element
     */
    public com.cdiscount.www.GetExternalOrderStatusDocument.GetExternalOrderStatus getGetExternalOrderStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetExternalOrderStatusDocument.GetExternalOrderStatus target = null;
            target = (com.cdiscount.www.GetExternalOrderStatusDocument.GetExternalOrderStatus)get_store().find_element_user(GETEXTERNALORDERSTATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetExternalOrderStatus" element
     */
    public void setGetExternalOrderStatus(com.cdiscount.www.GetExternalOrderStatusDocument.GetExternalOrderStatus getExternalOrderStatus)
    {
        generatedSetterHelperImpl(getExternalOrderStatus, GETEXTERNALORDERSTATUS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetExternalOrderStatus" element
     */
    public com.cdiscount.www.GetExternalOrderStatusDocument.GetExternalOrderStatus addNewGetExternalOrderStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.GetExternalOrderStatusDocument.GetExternalOrderStatus target = null;
            target = (com.cdiscount.www.GetExternalOrderStatusDocument.GetExternalOrderStatus)get_store().add_element_user(GETEXTERNALORDERSTATUS$0);
            return target;
        }
    }
    /**
     * An XML GetExternalOrderStatus(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public static class GetExternalOrderStatusImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.GetExternalOrderStatusDocument.GetExternalOrderStatus
    {
        private static final long serialVersionUID = 1L;
        
        public GetExternalOrderStatusImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HEADERMESSAGE$0 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "headerMessage");
        private static final javax.xml.namespace.QName REQUEST$2 = 
            new javax.xml.namespace.QName("http://www.cdiscount.com", "request");
        
        
        /**
         * Gets the "headerMessage" element
         */
        public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage getHeaderMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage)get_store().find_element_user(HEADERMESSAGE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "headerMessage" element
         */
        public boolean isNilHeaderMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage)get_store().find_element_user(HEADERMESSAGE$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "headerMessage" element
         */
        public boolean isSetHeaderMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HEADERMESSAGE$0) != 0;
            }
        }
        
        /**
         * Sets the "headerMessage" element
         */
        public void setHeaderMessage(org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage headerMessage)
        {
            generatedSetterHelperImpl(headerMessage, HEADERMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "headerMessage" element
         */
        public org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage addNewHeaderMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage)get_store().add_element_user(HEADERMESSAGE$0);
                return target;
            }
        }
        
        /**
         * Nils the "headerMessage" element
         */
        public void setNilHeaderMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage)get_store().find_element_user(HEADERMESSAGE$0, 0);
                if (target == null)
                {
                    target = (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage)get_store().add_element_user(HEADERMESSAGE$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "headerMessage" element
         */
        public void unsetHeaderMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HEADERMESSAGE$0, 0);
            }
        }
        
        /**
         * Gets the "request" element
         */
        public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusRequest getRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusRequest target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusRequest)get_store().find_element_user(REQUEST$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "request" element
         */
        public boolean isNilRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusRequest target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusRequest)get_store().find_element_user(REQUEST$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "request" element
         */
        public boolean isSetRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REQUEST$2) != 0;
            }
        }
        
        /**
         * Sets the "request" element
         */
        public void setRequest(org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusRequest request)
        {
            generatedSetterHelperImpl(request, REQUEST$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "request" element
         */
        public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusRequest addNewRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusRequest target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusRequest)get_store().add_element_user(REQUEST$2);
                return target;
            }
        }
        
        /**
         * Nils the "request" element
         */
        public void setNilRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusRequest target = null;
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusRequest)get_store().find_element_user(REQUEST$2, 0);
                if (target == null)
                {
                    target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusRequest)get_store().add_element_user(REQUEST$2);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "request" element
         */
        public void unsetRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REQUEST$2, 0);
            }
        }
    }
}
