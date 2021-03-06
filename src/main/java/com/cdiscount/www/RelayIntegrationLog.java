/*
 * XML Type:  RelayIntegrationLog
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.RelayIntegrationLog
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * An XML RelayIntegrationLog(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public interface RelayIntegrationLog extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RelayIntegrationLog.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("relayintegrationlog89f6type");
    
    /**
     * Gets the "Errors" element
     */
    com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring getErrors();
    
    /**
     * Tests for nil "Errors" element
     */
    boolean isNilErrors();
    
    /**
     * True if has "Errors" element
     */
    boolean isSetErrors();
    
    /**
     * Sets the "Errors" element
     */
    void setErrors(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring errors);
    
    /**
     * Appends and returns a new empty "Errors" element
     */
    com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring addNewErrors();
    
    /**
     * Nils the "Errors" element
     */
    void setNilErrors();
    
    /**
     * Unsets the "Errors" element
     */
    void unsetErrors();
    
    /**
     * Gets the "LogDate" element
     */
    java.util.Calendar getLogDate();
    
    /**
     * Gets (as xml) the "LogDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetLogDate();
    
    /**
     * True if has "LogDate" element
     */
    boolean isSetLogDate();
    
    /**
     * Sets the "LogDate" element
     */
    void setLogDate(java.util.Calendar logDate);
    
    /**
     * Sets (as xml) the "LogDate" element
     */
    void xsetLogDate(org.apache.xmlbeans.XmlDateTime logDate);
    
    /**
     * Unsets the "LogDate" element
     */
    void unsetLogDate();
    
    /**
     * Gets the "RelayReference" element
     */
    java.lang.String getRelayReference();
    
    /**
     * Gets (as xml) the "RelayReference" element
     */
    org.apache.xmlbeans.XmlString xgetRelayReference();
    
    /**
     * Tests for nil "RelayReference" element
     */
    boolean isNilRelayReference();
    
    /**
     * True if has "RelayReference" element
     */
    boolean isSetRelayReference();
    
    /**
     * Sets the "RelayReference" element
     */
    void setRelayReference(java.lang.String relayReference);
    
    /**
     * Sets (as xml) the "RelayReference" element
     */
    void xsetRelayReference(org.apache.xmlbeans.XmlString relayReference);
    
    /**
     * Nils the "RelayReference" element
     */
    void setNilRelayReference();
    
    /**
     * Unsets the "RelayReference" element
     */
    void unsetRelayReference();
    
    /**
     * Gets the "Validated" element
     */
    boolean getValidated();
    
    /**
     * Gets (as xml) the "Validated" element
     */
    org.apache.xmlbeans.XmlBoolean xgetValidated();
    
    /**
     * True if has "Validated" element
     */
    boolean isSetValidated();
    
    /**
     * Sets the "Validated" element
     */
    void setValidated(boolean validated);
    
    /**
     * Sets (as xml) the "Validated" element
     */
    void xsetValidated(org.apache.xmlbeans.XmlBoolean validated);
    
    /**
     * Unsets the "Validated" element
     */
    void unsetValidated();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.RelayIntegrationLog newInstance() {
          return (com.cdiscount.www.RelayIntegrationLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.RelayIntegrationLog newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.RelayIntegrationLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.RelayIntegrationLog parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.RelayIntegrationLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.RelayIntegrationLog parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.RelayIntegrationLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.RelayIntegrationLog parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.RelayIntegrationLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.RelayIntegrationLog parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.RelayIntegrationLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.RelayIntegrationLog parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.RelayIntegrationLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.RelayIntegrationLog parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.RelayIntegrationLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.RelayIntegrationLog parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.RelayIntegrationLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.RelayIntegrationLog parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.RelayIntegrationLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.RelayIntegrationLog parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.RelayIntegrationLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.RelayIntegrationLog parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.RelayIntegrationLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.RelayIntegrationLog parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.RelayIntegrationLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.RelayIntegrationLog parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.RelayIntegrationLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.RelayIntegrationLog parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.RelayIntegrationLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.RelayIntegrationLog parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.RelayIntegrationLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.RelayIntegrationLog parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.RelayIntegrationLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.RelayIntegrationLog parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.RelayIntegrationLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
