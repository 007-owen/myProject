/*
 * An XML document type.
 * Localname: SecurityDescriptor
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages
 * Java type: org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptorDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages;


/**
 * A document containing one SecurityDescriptor(@http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages) element.
 *
 * This is a complex type.
 */
public interface SecurityDescriptorDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SecurityDescriptorDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("securitydescriptorf837doctype");
    
    /**
     * Gets the "SecurityDescriptor" element
     */
    org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptor getSecurityDescriptor();
    
    /**
     * Tests for nil "SecurityDescriptor" element
     */
    boolean isNilSecurityDescriptor();
    
    /**
     * Sets the "SecurityDescriptor" element
     */
    void setSecurityDescriptor(org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptor securityDescriptor);
    
    /**
     * Appends and returns a new empty "SecurityDescriptor" element
     */
    org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptor addNewSecurityDescriptor();
    
    /**
     * Nils the "SecurityDescriptor" element
     */
    void setNilSecurityDescriptor();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptorDocument newInstance() {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptorDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptorDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptorDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptorDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptorDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptorDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptorDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptorDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptorDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptorDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptorDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptorDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptorDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptorDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptorDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptorDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptorDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityDescriptorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
