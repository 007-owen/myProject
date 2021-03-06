/*
 * XML Type:  ClaimType
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ClaimType
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * An XML ClaimType(@http://www.cdiscount.com).
 *
 * This is an atomic type that is a restriction of com.cdiscount.www.ClaimType.
 */
public interface ClaimType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ClaimType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("claimtype5f01type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum PACKAGE_NOT_RECEIVED = Enum.forString("PackageNotReceived");
    static final Enum INCOMPLETE_PACKAGE = Enum.forString("IncompletePackage");
    static final Enum MISSING_ACCESSORIES = Enum.forString("MissingAccessories");
    static final Enum DAMAGED_PRODUCT = Enum.forString("DamagedProduct");
    static final Enum WRONG_PRODUCT_REFERENCE = Enum.forString("WrongProductReference");
    static final Enum WRONG_REFUND_AMOUNT = Enum.forString("WrongRefundAmount");
    static final Enum REFUND_NOT_RECEIVED = Enum.forString("RefundNotReceived");
    static final Enum PRODUCT_NOT_WORKING = Enum.forString("ProductNotWorking");
    static final Enum OTHER = Enum.forString("Other");
    static final Enum PRODUCT_CANCELING = Enum.forString("ProductCanceling");
    static final Enum ORDER_CANCELING = Enum.forString("OrderCanceling");
    static final Enum WISH_TO_WITHDRAW = Enum.forString("WishToWithdraw");
    static final Enum ORDER_NOT_SHIPPED = Enum.forString("OrderNotShipped");
    
    static final int INT_PACKAGE_NOT_RECEIVED = Enum.INT_PACKAGE_NOT_RECEIVED;
    static final int INT_INCOMPLETE_PACKAGE = Enum.INT_INCOMPLETE_PACKAGE;
    static final int INT_MISSING_ACCESSORIES = Enum.INT_MISSING_ACCESSORIES;
    static final int INT_DAMAGED_PRODUCT = Enum.INT_DAMAGED_PRODUCT;
    static final int INT_WRONG_PRODUCT_REFERENCE = Enum.INT_WRONG_PRODUCT_REFERENCE;
    static final int INT_WRONG_REFUND_AMOUNT = Enum.INT_WRONG_REFUND_AMOUNT;
    static final int INT_REFUND_NOT_RECEIVED = Enum.INT_REFUND_NOT_RECEIVED;
    static final int INT_PRODUCT_NOT_WORKING = Enum.INT_PRODUCT_NOT_WORKING;
    static final int INT_OTHER = Enum.INT_OTHER;
    static final int INT_PRODUCT_CANCELING = Enum.INT_PRODUCT_CANCELING;
    static final int INT_ORDER_CANCELING = Enum.INT_ORDER_CANCELING;
    static final int INT_WISH_TO_WITHDRAW = Enum.INT_WISH_TO_WITHDRAW;
    static final int INT_ORDER_NOT_SHIPPED = Enum.INT_ORDER_NOT_SHIPPED;
    
    /**
     * Enumeration value class for com.cdiscount.www.ClaimType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_PACKAGE_NOT_RECEIVED
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
        
        static final int INT_PACKAGE_NOT_RECEIVED = 1;
        static final int INT_INCOMPLETE_PACKAGE = 2;
        static final int INT_MISSING_ACCESSORIES = 3;
        static final int INT_DAMAGED_PRODUCT = 4;
        static final int INT_WRONG_PRODUCT_REFERENCE = 5;
        static final int INT_WRONG_REFUND_AMOUNT = 6;
        static final int INT_REFUND_NOT_RECEIVED = 7;
        static final int INT_PRODUCT_NOT_WORKING = 8;
        static final int INT_OTHER = 9;
        static final int INT_PRODUCT_CANCELING = 10;
        static final int INT_ORDER_CANCELING = 11;
        static final int INT_WISH_TO_WITHDRAW = 12;
        static final int INT_ORDER_NOT_SHIPPED = 13;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("PackageNotReceived", INT_PACKAGE_NOT_RECEIVED),
                new Enum("IncompletePackage", INT_INCOMPLETE_PACKAGE),
                new Enum("MissingAccessories", INT_MISSING_ACCESSORIES),
                new Enum("DamagedProduct", INT_DAMAGED_PRODUCT),
                new Enum("WrongProductReference", INT_WRONG_PRODUCT_REFERENCE),
                new Enum("WrongRefundAmount", INT_WRONG_REFUND_AMOUNT),
                new Enum("RefundNotReceived", INT_REFUND_NOT_RECEIVED),
                new Enum("ProductNotWorking", INT_PRODUCT_NOT_WORKING),
                new Enum("Other", INT_OTHER),
                new Enum("ProductCanceling", INT_PRODUCT_CANCELING),
                new Enum("OrderCanceling", INT_ORDER_CANCELING),
                new Enum("WishToWithdraw", INT_WISH_TO_WITHDRAW),
                new Enum("OrderNotShipped", INT_ORDER_NOT_SHIPPED),
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
        public static com.cdiscount.www.ClaimType newValue(java.lang.Object obj) {
          return (com.cdiscount.www.ClaimType) type.newValue( obj ); }
        
        public static com.cdiscount.www.ClaimType newInstance() {
          return (com.cdiscount.www.ClaimType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.ClaimType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.ClaimType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.ClaimType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ClaimType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.ClaimType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ClaimType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.ClaimType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ClaimType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.ClaimType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ClaimType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.ClaimType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ClaimType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.ClaimType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ClaimType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.ClaimType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ClaimType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.ClaimType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ClaimType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.ClaimType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ClaimType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.ClaimType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.ClaimType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.ClaimType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ClaimType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.ClaimType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ClaimType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.ClaimType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ClaimType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.ClaimType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.ClaimType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.ClaimType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.ClaimType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.ClaimType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.ClaimType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
