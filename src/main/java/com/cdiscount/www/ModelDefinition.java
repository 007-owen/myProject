/*
 * XML Type:  ModelDefinition
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ModelDefinition
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * An XML ModelDefinition(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public interface ModelDefinition extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ModelDefinition.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("modeldefinitionaf3btype");
    
    /**
     * Gets the "ListProperties" element
     */
    com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 getListProperties();
    
    /**
     * Tests for nil "ListProperties" element
     */
    boolean isNilListProperties();
    
    /**
     * True if has "ListProperties" element
     */
    boolean isSetListProperties();
    
    /**
     * Sets the "ListProperties" element
     */
    void setListProperties(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 listProperties);
    
    /**
     * Appends and returns a new empty "ListProperties" element
     */
    com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 addNewListProperties();
    
    /**
     * Nils the "ListProperties" element
     */
    void setNilListProperties();
    
    /**
     * Unsets the "ListProperties" element
     */
    void unsetListProperties();
    
    /**
     * Gets the "MandatoryModelProperties" element
     */
    com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring getMandatoryModelProperties();
    
    /**
     * Tests for nil "MandatoryModelProperties" element
     */
    boolean isNilMandatoryModelProperties();
    
    /**
     * True if has "MandatoryModelProperties" element
     */
    boolean isSetMandatoryModelProperties();
    
    /**
     * Sets the "MandatoryModelProperties" element
     */
    void setMandatoryModelProperties(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring mandatoryModelProperties);
    
    /**
     * Appends and returns a new empty "MandatoryModelProperties" element
     */
    com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring addNewMandatoryModelProperties();
    
    /**
     * Nils the "MandatoryModelProperties" element
     */
    void setNilMandatoryModelProperties();
    
    /**
     * Unsets the "MandatoryModelProperties" element
     */
    void unsetMandatoryModelProperties();
    
    /**
     * Gets the "MultipleFreeTextProperties" element
     */
    com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 getMultipleFreeTextProperties();
    
    /**
     * Tests for nil "MultipleFreeTextProperties" element
     */
    boolean isNilMultipleFreeTextProperties();
    
    /**
     * True if has "MultipleFreeTextProperties" element
     */
    boolean isSetMultipleFreeTextProperties();
    
    /**
     * Sets the "MultipleFreeTextProperties" element
     */
    void setMultipleFreeTextProperties(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 multipleFreeTextProperties);
    
    /**
     * Appends and returns a new empty "MultipleFreeTextProperties" element
     */
    com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 addNewMultipleFreeTextProperties();
    
    /**
     * Nils the "MultipleFreeTextProperties" element
     */
    void setNilMultipleFreeTextProperties();
    
    /**
     * Unsets the "MultipleFreeTextProperties" element
     */
    void unsetMultipleFreeTextProperties();
    
    /**
     * Gets the "SingleFreeTextProperties" element
     */
    com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 getSingleFreeTextProperties();
    
    /**
     * Tests for nil "SingleFreeTextProperties" element
     */
    boolean isNilSingleFreeTextProperties();
    
    /**
     * True if has "SingleFreeTextProperties" element
     */
    boolean isSetSingleFreeTextProperties();
    
    /**
     * Sets the "SingleFreeTextProperties" element
     */
    void setSingleFreeTextProperties(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 singleFreeTextProperties);
    
    /**
     * Appends and returns a new empty "SingleFreeTextProperties" element
     */
    com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 addNewSingleFreeTextProperties();
    
    /**
     * Nils the "SingleFreeTextProperties" element
     */
    void setNilSingleFreeTextProperties();
    
    /**
     * Unsets the "SingleFreeTextProperties" element
     */
    void unsetSingleFreeTextProperties();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.ModelDefinition newInstance() {
          return (com.cdiscount.www.ModelDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.ModelDefinition newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.ModelDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.ModelDefinition parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ModelDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.ModelDefinition parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ModelDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.ModelDefinition parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ModelDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.ModelDefinition parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ModelDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.ModelDefinition parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ModelDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.ModelDefinition parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ModelDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.ModelDefinition parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ModelDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.ModelDefinition parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ModelDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.ModelDefinition parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ModelDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.ModelDefinition parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ModelDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.ModelDefinition parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ModelDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.ModelDefinition parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ModelDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.ModelDefinition parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ModelDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.ModelDefinition parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ModelDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.ModelDefinition parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.ModelDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.ModelDefinition parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.ModelDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
