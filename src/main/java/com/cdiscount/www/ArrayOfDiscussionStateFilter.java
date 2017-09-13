/*
 * XML Type:  ArrayOfDiscussionStateFilter
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfDiscussionStateFilter
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * An XML ArrayOfDiscussionStateFilter(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public interface ArrayOfDiscussionStateFilter extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ArrayOfDiscussionStateFilter.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("arrayofdiscussionstatefilter9fd4type");
    
    /**
     * Gets array of all "DiscussionStateFilter" elements
     */
    com.cdiscount.www.DiscussionStateFilter.Enum[] getDiscussionStateFilterArray();
    
    /**
     * Gets ith "DiscussionStateFilter" element
     */
    com.cdiscount.www.DiscussionStateFilter.Enum getDiscussionStateFilterArray(int i);
    
    /**
     * Gets (as xml) array of all "DiscussionStateFilter" elements
     */
    com.cdiscount.www.DiscussionStateFilter[] xgetDiscussionStateFilterArray();
    
    /**
     * Gets (as xml) ith "DiscussionStateFilter" element
     */
    com.cdiscount.www.DiscussionStateFilter xgetDiscussionStateFilterArray(int i);
    
    /**
     * Returns number of "DiscussionStateFilter" element
     */
    int sizeOfDiscussionStateFilterArray();
    
    /**
     * Sets array of all "DiscussionStateFilter" element
     */
    void setDiscussionStateFilterArray(com.cdiscount.www.DiscussionStateFilter.Enum[] discussionStateFilterArray);
    
    /**
     * Sets ith "DiscussionStateFilter" element
     */
    void setDiscussionStateFilterArray(int i, com.cdiscount.www.DiscussionStateFilter.Enum discussionStateFilter);
    
    /**
     * Sets (as xml) array of all "DiscussionStateFilter" element
     */
    void xsetDiscussionStateFilterArray(com.cdiscount.www.DiscussionStateFilter[] discussionStateFilterArray);
    
    /**
     * Sets (as xml) ith "DiscussionStateFilter" element
     */
    void xsetDiscussionStateFilterArray(int i, com.cdiscount.www.DiscussionStateFilter discussionStateFilter);
    
    /**
     * Inserts the value as the ith "DiscussionStateFilter" element
     */
    void insertDiscussionStateFilter(int i, com.cdiscount.www.DiscussionStateFilter.Enum discussionStateFilter);
    
    /**
     * Appends the value as the last "DiscussionStateFilter" element
     */
    void addDiscussionStateFilter(com.cdiscount.www.DiscussionStateFilter.Enum discussionStateFilter);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DiscussionStateFilter" element
     */
    com.cdiscount.www.DiscussionStateFilter insertNewDiscussionStateFilter(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DiscussionStateFilter" element
     */
    com.cdiscount.www.DiscussionStateFilter addNewDiscussionStateFilter();
    
    /**
     * Removes the ith "DiscussionStateFilter" element
     */
    void removeDiscussionStateFilter(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.ArrayOfDiscussionStateFilter newInstance() {
          return (com.cdiscount.www.ArrayOfDiscussionStateFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.ArrayOfDiscussionStateFilter newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.ArrayOfDiscussionStateFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.ArrayOfDiscussionStateFilter parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ArrayOfDiscussionStateFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.ArrayOfDiscussionStateFilter parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ArrayOfDiscussionStateFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.ArrayOfDiscussionStateFilter parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ArrayOfDiscussionStateFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.ArrayOfDiscussionStateFilter parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ArrayOfDiscussionStateFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.ArrayOfDiscussionStateFilter parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ArrayOfDiscussionStateFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.ArrayOfDiscussionStateFilter parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ArrayOfDiscussionStateFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.ArrayOfDiscussionStateFilter parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ArrayOfDiscussionStateFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.ArrayOfDiscussionStateFilter parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ArrayOfDiscussionStateFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.ArrayOfDiscussionStateFilter parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ArrayOfDiscussionStateFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.ArrayOfDiscussionStateFilter parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ArrayOfDiscussionStateFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.ArrayOfDiscussionStateFilter parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ArrayOfDiscussionStateFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.ArrayOfDiscussionStateFilter parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ArrayOfDiscussionStateFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.ArrayOfDiscussionStateFilter parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ArrayOfDiscussionStateFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.ArrayOfDiscussionStateFilter parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ArrayOfDiscussionStateFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.ArrayOfDiscussionStateFilter parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.ArrayOfDiscussionStateFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.ArrayOfDiscussionStateFilter parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.ArrayOfDiscussionStateFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
