/*
 * XML Type:  SellerMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SellerMessage
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * An XML SellerMessage(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public interface SellerMessage extends com.cdiscount.www.ServiceBaseAPIMessage
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SellerMessage.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("sellermessagec8cftype");
    
    /**
     * Gets the "DeliveryModes" element
     */
    com.cdiscount.www.ArrayOfDeliveryModeInformation getDeliveryModes();
    
    /**
     * Tests for nil "DeliveryModes" element
     */
    boolean isNilDeliveryModes();
    
    /**
     * True if has "DeliveryModes" element
     */
    boolean isSetDeliveryModes();
    
    /**
     * Sets the "DeliveryModes" element
     */
    void setDeliveryModes(com.cdiscount.www.ArrayOfDeliveryModeInformation deliveryModes);
    
    /**
     * Appends and returns a new empty "DeliveryModes" element
     */
    com.cdiscount.www.ArrayOfDeliveryModeInformation addNewDeliveryModes();
    
    /**
     * Nils the "DeliveryModes" element
     */
    void setNilDeliveryModes();
    
    /**
     * Unsets the "DeliveryModes" element
     */
    void unsetDeliveryModes();
    
    /**
     * Gets the "OfferPoolList" element
     */
    com.cdiscount.www.ArrayOfOfferPool getOfferPoolList();
    
    /**
     * Tests for nil "OfferPoolList" element
     */
    boolean isNilOfferPoolList();
    
    /**
     * True if has "OfferPoolList" element
     */
    boolean isSetOfferPoolList();
    
    /**
     * Sets the "OfferPoolList" element
     */
    void setOfferPoolList(com.cdiscount.www.ArrayOfOfferPool offerPoolList);
    
    /**
     * Appends and returns a new empty "OfferPoolList" element
     */
    com.cdiscount.www.ArrayOfOfferPool addNewOfferPoolList();
    
    /**
     * Nils the "OfferPoolList" element
     */
    void setNilOfferPoolList();
    
    /**
     * Unsets the "OfferPoolList" element
     */
    void unsetOfferPoolList();
    
    /**
     * Gets the "Seller" element
     */
    com.cdiscount.www.Seller getSeller();
    
    /**
     * Tests for nil "Seller" element
     */
    boolean isNilSeller();
    
    /**
     * True if has "Seller" element
     */
    boolean isSetSeller();
    
    /**
     * Sets the "Seller" element
     */
    void setSeller(com.cdiscount.www.Seller seller);
    
    /**
     * Appends and returns a new empty "Seller" element
     */
    com.cdiscount.www.Seller addNewSeller();
    
    /**
     * Nils the "Seller" element
     */
    void setNilSeller();
    
    /**
     * Unsets the "Seller" element
     */
    void unsetSeller();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.SellerMessage newInstance() {
          return (com.cdiscount.www.SellerMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.SellerMessage newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.SellerMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.SellerMessage parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SellerMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.SellerMessage parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SellerMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.SellerMessage parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SellerMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.SellerMessage parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SellerMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.SellerMessage parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SellerMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.SellerMessage parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SellerMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.SellerMessage parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SellerMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.SellerMessage parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SellerMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.SellerMessage parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SellerMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.SellerMessage parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.SellerMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.SellerMessage parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SellerMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.SellerMessage parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SellerMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.SellerMessage parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SellerMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.SellerMessage parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.SellerMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.SellerMessage parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.SellerMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.SellerMessage parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.SellerMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
