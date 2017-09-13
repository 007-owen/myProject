/*
 * XML Type:  AcceptationStateEnum
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.AcceptationStateEnum
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www;


/**
 * An XML AcceptationStateEnum(@http://www.cdiscount.com).
 *
 * This is an atomic type that is a restriction of com.cdiscount.www.AcceptationStateEnum.
 */
public interface AcceptationStateEnum extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AcceptationStateEnum.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("acceptationstateenum3280type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum NONE = Enum.forString("None");
    static final Enum ACCEPTED_BY_SELLER = Enum.forString("AcceptedBySeller");
    static final Enum REFUSED_BY_SELLER = Enum.forString("RefusedBySeller");
    static final Enum SHIPPED_BY_SELLER = Enum.forString("ShippedBySeller");
    static final Enum REFUNDED_AFTER_SHIPPING = Enum.forString("RefundedAfterShipping");
    static final Enum SHIPMENT_REFUSED_BY_SELLER = Enum.forString("ShipmentRefusedBySeller");
    static final Enum REFUNDED_AFTER_SHIPMENT_REFUSED = Enum.forString("RefundedAfterShipmentRefused");
    static final Enum CANCELLED_BEFORE_NOTIFICATION_BY_CUSTOMER = Enum.forString("CancelledBeforeNotificationByCustomer");
    static final Enum CANCELLED_BEFORE_PAYMENT_BY_CUSTOMER = Enum.forString("CancelledBeforePaymentByCustomer");
    static final Enum CANCELLATION_REQUEST_PENDING = Enum.forString("CancellationRequestPending");
    static final Enum CANCELLED_AFTER_PAYMENT_BY_CUSTOMER = Enum.forString("CancelledAfterPaymentByCustomer");
    static final Enum REFUNDED_AFTER_CUSTOMER_CANCELLATION = Enum.forString("RefundedAfterCustomerCancellation");
    static final Enum PAYMENT_REFUSED = Enum.forString("PaymentRefused");
    
    static final int INT_NONE = Enum.INT_NONE;
    static final int INT_ACCEPTED_BY_SELLER = Enum.INT_ACCEPTED_BY_SELLER;
    static final int INT_REFUSED_BY_SELLER = Enum.INT_REFUSED_BY_SELLER;
    static final int INT_SHIPPED_BY_SELLER = Enum.INT_SHIPPED_BY_SELLER;
    static final int INT_REFUNDED_AFTER_SHIPPING = Enum.INT_REFUNDED_AFTER_SHIPPING;
    static final int INT_SHIPMENT_REFUSED_BY_SELLER = Enum.INT_SHIPMENT_REFUSED_BY_SELLER;
    static final int INT_REFUNDED_AFTER_SHIPMENT_REFUSED = Enum.INT_REFUNDED_AFTER_SHIPMENT_REFUSED;
    static final int INT_CANCELLED_BEFORE_NOTIFICATION_BY_CUSTOMER = Enum.INT_CANCELLED_BEFORE_NOTIFICATION_BY_CUSTOMER;
    static final int INT_CANCELLED_BEFORE_PAYMENT_BY_CUSTOMER = Enum.INT_CANCELLED_BEFORE_PAYMENT_BY_CUSTOMER;
    static final int INT_CANCELLATION_REQUEST_PENDING = Enum.INT_CANCELLATION_REQUEST_PENDING;
    static final int INT_CANCELLED_AFTER_PAYMENT_BY_CUSTOMER = Enum.INT_CANCELLED_AFTER_PAYMENT_BY_CUSTOMER;
    static final int INT_REFUNDED_AFTER_CUSTOMER_CANCELLATION = Enum.INT_REFUNDED_AFTER_CUSTOMER_CANCELLATION;
    static final int INT_PAYMENT_REFUSED = Enum.INT_PAYMENT_REFUSED;
    
    /**
     * Enumeration value class for com.cdiscount.www.AcceptationStateEnum.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_NONE
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
        
        static final int INT_NONE = 1;
        static final int INT_ACCEPTED_BY_SELLER = 2;
        static final int INT_REFUSED_BY_SELLER = 3;
        static final int INT_SHIPPED_BY_SELLER = 4;
        static final int INT_REFUNDED_AFTER_SHIPPING = 5;
        static final int INT_SHIPMENT_REFUSED_BY_SELLER = 6;
        static final int INT_REFUNDED_AFTER_SHIPMENT_REFUSED = 7;
        static final int INT_CANCELLED_BEFORE_NOTIFICATION_BY_CUSTOMER = 8;
        static final int INT_CANCELLED_BEFORE_PAYMENT_BY_CUSTOMER = 9;
        static final int INT_CANCELLATION_REQUEST_PENDING = 10;
        static final int INT_CANCELLED_AFTER_PAYMENT_BY_CUSTOMER = 11;
        static final int INT_REFUNDED_AFTER_CUSTOMER_CANCELLATION = 12;
        static final int INT_PAYMENT_REFUSED = 13;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("None", INT_NONE),
                new Enum("AcceptedBySeller", INT_ACCEPTED_BY_SELLER),
                new Enum("RefusedBySeller", INT_REFUSED_BY_SELLER),
                new Enum("ShippedBySeller", INT_SHIPPED_BY_SELLER),
                new Enum("RefundedAfterShipping", INT_REFUNDED_AFTER_SHIPPING),
                new Enum("ShipmentRefusedBySeller", INT_SHIPMENT_REFUSED_BY_SELLER),
                new Enum("RefundedAfterShipmentRefused", INT_REFUNDED_AFTER_SHIPMENT_REFUSED),
                new Enum("CancelledBeforeNotificationByCustomer", INT_CANCELLED_BEFORE_NOTIFICATION_BY_CUSTOMER),
                new Enum("CancelledBeforePaymentByCustomer", INT_CANCELLED_BEFORE_PAYMENT_BY_CUSTOMER),
                new Enum("CancellationRequestPending", INT_CANCELLATION_REQUEST_PENDING),
                new Enum("CancelledAfterPaymentByCustomer", INT_CANCELLED_AFTER_PAYMENT_BY_CUSTOMER),
                new Enum("RefundedAfterCustomerCancellation", INT_REFUNDED_AFTER_CUSTOMER_CANCELLATION),
                new Enum("PaymentRefused", INT_PAYMENT_REFUSED),
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
        public static com.cdiscount.www.AcceptationStateEnum newValue(java.lang.Object obj) {
          return (com.cdiscount.www.AcceptationStateEnum) type.newValue( obj ); }
        
        public static com.cdiscount.www.AcceptationStateEnum newInstance() {
          return (com.cdiscount.www.AcceptationStateEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.cdiscount.www.AcceptationStateEnum newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.cdiscount.www.AcceptationStateEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.cdiscount.www.AcceptationStateEnum parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.AcceptationStateEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.cdiscount.www.AcceptationStateEnum parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.AcceptationStateEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.cdiscount.www.AcceptationStateEnum parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.AcceptationStateEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.cdiscount.www.AcceptationStateEnum parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.AcceptationStateEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.cdiscount.www.AcceptationStateEnum parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.AcceptationStateEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.cdiscount.www.AcceptationStateEnum parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.AcceptationStateEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.cdiscount.www.AcceptationStateEnum parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.AcceptationStateEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.cdiscount.www.AcceptationStateEnum parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.AcceptationStateEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.cdiscount.www.AcceptationStateEnum parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.AcceptationStateEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.cdiscount.www.AcceptationStateEnum parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.cdiscount.www.AcceptationStateEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.cdiscount.www.AcceptationStateEnum parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.AcceptationStateEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.cdiscount.www.AcceptationStateEnum parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.AcceptationStateEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.cdiscount.www.AcceptationStateEnum parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.AcceptationStateEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.cdiscount.www.AcceptationStateEnum parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.cdiscount.www.AcceptationStateEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.AcceptationStateEnum parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.AcceptationStateEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.cdiscount.www.AcceptationStateEnum parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.cdiscount.www.AcceptationStateEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
