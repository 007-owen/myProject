/*
 * XML Type:  OfferListPaginatedMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OfferListPaginatedMessage
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * An XML OfferListPaginatedMessage(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public interface OfferListPaginatedMessage extends com.cdiscount.www.OfferListMessage
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OfferListPaginatedMessage.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("offerlistpaginatedmessage02a3type");
    
    /**
     * Gets the "CurrentPageNumber" element
     */
    int getCurrentPageNumber();
    
    /**
     * Gets (as xml) the "CurrentPageNumber" element
     */
    org.apache.xmlbeans.XmlInt xgetCurrentPageNumber();
    
    /**
     * True if has "CurrentPageNumber" element
     */
    boolean isSetCurrentPageNumber();
    
    /**
     * Sets the "CurrentPageNumber" element
     */
    void setCurrentPageNumber(int currentPageNumber);
    
    /**
     * Sets (as xml) the "CurrentPageNumber" element
     */
    void xsetCurrentPageNumber(org.apache.xmlbeans.XmlInt currentPageNumber);
    
    /**
     * Unsets the "CurrentPageNumber" element
     */
    void unsetCurrentPageNumber();
    
    /**
     * Gets the "NumberOfPages" element
     */
    int getNumberOfPages();
    
    /**
     * Gets (as xml) the "NumberOfPages" element
     */
    org.apache.xmlbeans.XmlInt xgetNumberOfPages();
    
    /**
     * True if has "NumberOfPages" element
     */
    boolean isSetNumberOfPages();
    
    /**
     * Sets the "NumberOfPages" element
     */
    void setNumberOfPages(int numberOfPages);
    
    /**
     * Sets (as xml) the "NumberOfPages" element
     */
    void xsetNumberOfPages(org.apache.xmlbeans.XmlInt numberOfPages);
    
    /**
     * Unsets the "NumberOfPages" element
     */
    void unsetNumberOfPages();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.OfferListPaginatedMessage newInstance() {
          return (com.cdiscount.www.OfferListPaginatedMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.OfferListPaginatedMessage newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.OfferListPaginatedMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.OfferListPaginatedMessage parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OfferListPaginatedMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.OfferListPaginatedMessage parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OfferListPaginatedMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.OfferListPaginatedMessage parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OfferListPaginatedMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.OfferListPaginatedMessage parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OfferListPaginatedMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.OfferListPaginatedMessage parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OfferListPaginatedMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.OfferListPaginatedMessage parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OfferListPaginatedMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.OfferListPaginatedMessage parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OfferListPaginatedMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.OfferListPaginatedMessage parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OfferListPaginatedMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.OfferListPaginatedMessage parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OfferListPaginatedMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.OfferListPaginatedMessage parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OfferListPaginatedMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.OfferListPaginatedMessage parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OfferListPaginatedMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.OfferListPaginatedMessage parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OfferListPaginatedMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.OfferListPaginatedMessage parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OfferListPaginatedMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.OfferListPaginatedMessage parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OfferListPaginatedMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.OfferListPaginatedMessage parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.OfferListPaginatedMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.OfferListPaginatedMessage parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.OfferListPaginatedMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
