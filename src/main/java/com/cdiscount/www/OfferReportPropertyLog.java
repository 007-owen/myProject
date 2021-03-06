/*
 * XML Type:  OfferReportPropertyLog
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OfferReportPropertyLog
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * An XML OfferReportPropertyLog(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public interface OfferReportPropertyLog extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OfferReportPropertyLog.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("offerreportpropertylogc266type");
    
    /**
     * Gets the "LogMessage" element
     */
    java.lang.String getLogMessage();
    
    /**
     * Gets (as xml) the "LogMessage" element
     */
    org.apache.xmlbeans.XmlString xgetLogMessage();
    
    /**
     * Tests for nil "LogMessage" element
     */
    boolean isNilLogMessage();
    
    /**
     * True if has "LogMessage" element
     */
    boolean isSetLogMessage();
    
    /**
     * Sets the "LogMessage" element
     */
    void setLogMessage(java.lang.String logMessage);
    
    /**
     * Sets (as xml) the "LogMessage" element
     */
    void xsetLogMessage(org.apache.xmlbeans.XmlString logMessage);
    
    /**
     * Nils the "LogMessage" element
     */
    void setNilLogMessage();
    
    /**
     * Unsets the "LogMessage" element
     */
    void unsetLogMessage();
    
    /**
     * Gets the "Name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "Name" element
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * Tests for nil "Name" element
     */
    boolean isNilName();
    
    /**
     * True if has "Name" element
     */
    boolean isSetName();
    
    /**
     * Sets the "Name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "Name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Nils the "Name" element
     */
    void setNilName();
    
    /**
     * Unsets the "Name" element
     */
    void unsetName();
    
    /**
     * Gets the "PropertyCode" element
     */
    java.lang.String getPropertyCode();
    
    /**
     * Gets (as xml) the "PropertyCode" element
     */
    org.apache.xmlbeans.XmlString xgetPropertyCode();
    
    /**
     * Tests for nil "PropertyCode" element
     */
    boolean isNilPropertyCode();
    
    /**
     * True if has "PropertyCode" element
     */
    boolean isSetPropertyCode();
    
    /**
     * Sets the "PropertyCode" element
     */
    void setPropertyCode(java.lang.String propertyCode);
    
    /**
     * Sets (as xml) the "PropertyCode" element
     */
    void xsetPropertyCode(org.apache.xmlbeans.XmlString propertyCode);
    
    /**
     * Nils the "PropertyCode" element
     */
    void setNilPropertyCode();
    
    /**
     * Unsets the "PropertyCode" element
     */
    void unsetPropertyCode();
    
    /**
     * Gets the "PropertyError" element
     */
    java.lang.String getPropertyError();
    
    /**
     * Gets (as xml) the "PropertyError" element
     */
    org.apache.xmlbeans.XmlString xgetPropertyError();
    
    /**
     * Tests for nil "PropertyError" element
     */
    boolean isNilPropertyError();
    
    /**
     * True if has "PropertyError" element
     */
    boolean isSetPropertyError();
    
    /**
     * Sets the "PropertyError" element
     */
    void setPropertyError(java.lang.String propertyError);
    
    /**
     * Sets (as xml) the "PropertyError" element
     */
    void xsetPropertyError(org.apache.xmlbeans.XmlString propertyError);
    
    /**
     * Nils the "PropertyError" element
     */
    void setNilPropertyError();
    
    /**
     * Unsets the "PropertyError" element
     */
    void unsetPropertyError();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.OfferReportPropertyLog newInstance() {
          return (com.cdiscount.www.OfferReportPropertyLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.OfferReportPropertyLog newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.OfferReportPropertyLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.OfferReportPropertyLog parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OfferReportPropertyLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.OfferReportPropertyLog parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OfferReportPropertyLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.OfferReportPropertyLog parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OfferReportPropertyLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.OfferReportPropertyLog parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OfferReportPropertyLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.OfferReportPropertyLog parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OfferReportPropertyLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.OfferReportPropertyLog parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OfferReportPropertyLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.OfferReportPropertyLog parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OfferReportPropertyLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.OfferReportPropertyLog parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OfferReportPropertyLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.OfferReportPropertyLog parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OfferReportPropertyLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.OfferReportPropertyLog parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.OfferReportPropertyLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.OfferReportPropertyLog parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OfferReportPropertyLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.OfferReportPropertyLog parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OfferReportPropertyLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.OfferReportPropertyLog parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OfferReportPropertyLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.OfferReportPropertyLog parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.OfferReportPropertyLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.OfferReportPropertyLog parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.OfferReportPropertyLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.OfferReportPropertyLog parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.OfferReportPropertyLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
