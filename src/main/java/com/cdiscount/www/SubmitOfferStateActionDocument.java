/*
 * An XML document type.
 * Localname: SubmitOfferStateAction
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SubmitOfferStateActionDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * A document containing one SubmitOfferStateAction(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public interface SubmitOfferStateActionDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubmitOfferStateActionDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("submitofferstateaction54d2doctype");
    
    /**
     * Gets the "SubmitOfferStateAction" element
     */
    com.cdiscount.www.SubmitOfferStateActionDocument.SubmitOfferStateAction getSubmitOfferStateAction();
    
    /**
     * Sets the "SubmitOfferStateAction" element
     */
    void setSubmitOfferStateAction(com.cdiscount.www.SubmitOfferStateActionDocument.SubmitOfferStateAction submitOfferStateAction);
    
    /**
     * Appends and returns a new empty "SubmitOfferStateAction" element
     */
    com.cdiscount.www.SubmitOfferStateActionDocument.SubmitOfferStateAction addNewSubmitOfferStateAction();
    
    /**
     * An XML SubmitOfferStateAction(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public interface SubmitOfferStateAction extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubmitOfferStateAction.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("submitofferstateaction3031elemtype");
        
        /**
         * Gets the "headerMessage" element
         */
        org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage getHeaderMessage();
        
        /**
         * Tests for nil "headerMessage" element
         */
        boolean isNilHeaderMessage();
        
        /**
         * True if has "headerMessage" element
         */
        boolean isSetHeaderMessage();
        
        /**
         * Sets the "headerMessage" element
         */
        void setHeaderMessage(org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage headerMessage);
        
        /**
         * Appends and returns a new empty "headerMessage" element
         */
        org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage addNewHeaderMessage();
        
        /**
         * Nils the "headerMessage" element
         */
        void setNilHeaderMessage();
        
        /**
         * Unsets the "headerMessage" element
         */
        void unsetHeaderMessage();
        
        /**
         * Gets the "offerStateRequest" element
         */
        com.cdiscount.www.OfferStateActionRequest getOfferStateRequest();
        
        /**
         * Tests for nil "offerStateRequest" element
         */
        boolean isNilOfferStateRequest();
        
        /**
         * True if has "offerStateRequest" element
         */
        boolean isSetOfferStateRequest();
        
        /**
         * Sets the "offerStateRequest" element
         */
        void setOfferStateRequest(com.cdiscount.www.OfferStateActionRequest offerStateRequest);
        
        /**
         * Appends and returns a new empty "offerStateRequest" element
         */
        com.cdiscount.www.OfferStateActionRequest addNewOfferStateRequest();
        
        /**
         * Nils the "offerStateRequest" element
         */
        void setNilOfferStateRequest();
        
        /**
         * Unsets the "offerStateRequest" element
         */
        void unsetOfferStateRequest();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.cdiscount.www.SubmitOfferStateActionDocument.SubmitOfferStateAction newInstance() {
              return (com.cdiscount.www.SubmitOfferStateActionDocument.SubmitOfferStateAction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.cdiscount.www.SubmitOfferStateActionDocument.SubmitOfferStateAction newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.cdiscount.www.SubmitOfferStateActionDocument.SubmitOfferStateAction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.SubmitOfferStateActionDocument newInstance() {
          return (com.cdiscount.www.SubmitOfferStateActionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.SubmitOfferStateActionDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.SubmitOfferStateActionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.SubmitOfferStateActionDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SubmitOfferStateActionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.SubmitOfferStateActionDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SubmitOfferStateActionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.SubmitOfferStateActionDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SubmitOfferStateActionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.SubmitOfferStateActionDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SubmitOfferStateActionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.SubmitOfferStateActionDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SubmitOfferStateActionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.SubmitOfferStateActionDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SubmitOfferStateActionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.SubmitOfferStateActionDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SubmitOfferStateActionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.SubmitOfferStateActionDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SubmitOfferStateActionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.SubmitOfferStateActionDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SubmitOfferStateActionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.SubmitOfferStateActionDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SubmitOfferStateActionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.SubmitOfferStateActionDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SubmitOfferStateActionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.SubmitOfferStateActionDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SubmitOfferStateActionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.SubmitOfferStateActionDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SubmitOfferStateActionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.SubmitOfferStateActionDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SubmitOfferStateActionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.SubmitOfferStateActionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.SubmitOfferStateActionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.SubmitOfferStateActionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.SubmitOfferStateActionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
