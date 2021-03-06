/*
 * An XML document type.
 * Localname: GetParcelShopListResponse
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.GetParcelShopListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * A document containing one GetParcelShopListResponse(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public interface GetParcelShopListResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetParcelShopListResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("getparcelshoplistresponse6033doctype");
    
    /**
     * Gets the "GetParcelShopListResponse" element
     */
    com.cdiscount.www.GetParcelShopListResponseDocument.GetParcelShopListResponse getGetParcelShopListResponse();
    
    /**
     * Sets the "GetParcelShopListResponse" element
     */
    void setGetParcelShopListResponse(com.cdiscount.www.GetParcelShopListResponseDocument.GetParcelShopListResponse getParcelShopListResponse);
    
    /**
     * Appends and returns a new empty "GetParcelShopListResponse" element
     */
    com.cdiscount.www.GetParcelShopListResponseDocument.GetParcelShopListResponse addNewGetParcelShopListResponse();
    
    /**
     * An XML GetParcelShopListResponse(@http://www.cdiscount.com).
     *
     * This is a complex type.
     */
    public interface GetParcelShopListResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetParcelShopListResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("getparcelshoplistresponsedbb3elemtype");
        
        /**
         * Gets the "GetParcelShopListResult" element
         */
        com.cdiscount.www.ParcelShopListMessage getGetParcelShopListResult();
        
        /**
         * Tests for nil "GetParcelShopListResult" element
         */
        boolean isNilGetParcelShopListResult();
        
        /**
         * True if has "GetParcelShopListResult" element
         */
        boolean isSetGetParcelShopListResult();
        
        /**
         * Sets the "GetParcelShopListResult" element
         */
        void setGetParcelShopListResult(com.cdiscount.www.ParcelShopListMessage getParcelShopListResult);
        
        /**
         * Appends and returns a new empty "GetParcelShopListResult" element
         */
        com.cdiscount.www.ParcelShopListMessage addNewGetParcelShopListResult();
        
        /**
         * Nils the "GetParcelShopListResult" element
         */
        void setNilGetParcelShopListResult();
        
        /**
         * Unsets the "GetParcelShopListResult" element
         */
        void unsetGetParcelShopListResult();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.cdiscount.www.GetParcelShopListResponseDocument.GetParcelShopListResponse newInstance() {
              return (com.cdiscount.www.GetParcelShopListResponseDocument.GetParcelShopListResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.cdiscount.www.GetParcelShopListResponseDocument.GetParcelShopListResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.cdiscount.www.GetParcelShopListResponseDocument.GetParcelShopListResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.GetParcelShopListResponseDocument newInstance() {
          return (com.cdiscount.www.GetParcelShopListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.GetParcelShopListResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.GetParcelShopListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.GetParcelShopListResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetParcelShopListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.GetParcelShopListResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetParcelShopListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.GetParcelShopListResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetParcelShopListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.GetParcelShopListResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetParcelShopListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.GetParcelShopListResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetParcelShopListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.GetParcelShopListResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetParcelShopListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.GetParcelShopListResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetParcelShopListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.GetParcelShopListResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetParcelShopListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.GetParcelShopListResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetParcelShopListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.GetParcelShopListResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.GetParcelShopListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.GetParcelShopListResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetParcelShopListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.GetParcelShopListResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetParcelShopListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.GetParcelShopListResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetParcelShopListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.GetParcelShopListResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.GetParcelShopListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.GetParcelShopListResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.GetParcelShopListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.GetParcelShopListResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.GetParcelShopListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
