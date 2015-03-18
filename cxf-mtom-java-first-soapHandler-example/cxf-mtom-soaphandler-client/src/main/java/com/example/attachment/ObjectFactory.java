
package com.example.attachment;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.attachment package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAttachment_QNAME = new QName("http://attachment.example.com/", "getAttachment");
    private final static QName _GetAttachmentResponse_QNAME = new QName("http://attachment.example.com/", "getAttachmentResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.attachment
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAttachment }
     * 
     */
    public GetAttachment createGetAttachment() {
        return new GetAttachment();
    }

    /**
     * Create an instance of {@link GetAttachmentResponse }
     * 
     */
    public GetAttachmentResponse createGetAttachmentResponse() {
        return new GetAttachmentResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAttachment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://attachment.example.com/", name = "getAttachment")
    public JAXBElement<GetAttachment> createGetAttachment(GetAttachment value) {
        return new JAXBElement<GetAttachment>(_GetAttachment_QNAME, GetAttachment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAttachmentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://attachment.example.com/", name = "getAttachmentResponse")
    public JAXBElement<GetAttachmentResponse> createGetAttachmentResponse(GetAttachmentResponse value) {
        return new JAXBElement<GetAttachmentResponse>(_GetAttachmentResponse_QNAME, GetAttachmentResponse.class, null, value);
    }

}
