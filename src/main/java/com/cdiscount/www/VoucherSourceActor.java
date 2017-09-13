/*
 * XML Type:  VoucherSourceActor
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.VoucherSourceActor
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * An XML VoucherSourceActor(@http://www.cdiscount.com).
 *
 * This is an atomic type that is a restriction of com.cdiscount.www.VoucherSourceActor.
 */
public interface VoucherSourceActor extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(VoucherSourceActor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("vouchersourceactorfbd9type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum CUSTOMER = Enum.forString("Customer");
    static final Enum C_DISCOUNT = Enum.forString("CDiscount");
    static final Enum SELLER = Enum.forString("Seller");
    
    static final int INT_CUSTOMER = Enum.INT_CUSTOMER;
    static final int INT_C_DISCOUNT = Enum.INT_C_DISCOUNT;
    static final int INT_SELLER = Enum.INT_SELLER;
    
    /**
     * Enumeration value class for com.cdiscount.www.VoucherSourceActor.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_CUSTOMER
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_CUSTOMER = 1;
        static final int INT_C_DISCOUNT = 2;
        static final int INT_SELLER = 3;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("Customer", INT_CUSTOMER),
                new Enum("CDiscount", INT_C_DISCOUNT),
                new Enum("Seller", INT_SELLER),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.cdiscount.www.VoucherSourceActor newValue(java.lang.Object obj) {
          return (com.cdiscount.www.VoucherSourceActor) type.newValue( obj ); }
        
        public static com.cdiscount.www.VoucherSourceActor newInstance() {
          return (com.cdiscount.www.VoucherSourceActor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.VoucherSourceActor newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.VoucherSourceActor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.VoucherSourceActor parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.VoucherSourceActor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.VoucherSourceActor parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.VoucherSourceActor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.VoucherSourceActor parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.VoucherSourceActor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.VoucherSourceActor parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.VoucherSourceActor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.VoucherSourceActor parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.VoucherSourceActor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.VoucherSourceActor parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.VoucherSourceActor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.VoucherSourceActor parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.VoucherSourceActor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.VoucherSourceActor parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.VoucherSourceActor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.VoucherSourceActor parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.VoucherSourceActor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.VoucherSourceActor parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.VoucherSourceActor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.VoucherSourceActor parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.VoucherSourceActor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.VoucherSourceActor parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.VoucherSourceActor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.VoucherSourceActor parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.VoucherSourceActor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.VoucherSourceActor parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.VoucherSourceActor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.VoucherSourceActor parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.VoucherSourceActor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.VoucherSourceActor parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.VoucherSourceActor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}