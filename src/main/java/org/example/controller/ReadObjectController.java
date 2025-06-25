

package org.example.controller;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.util.Base64;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReadObjectController {

    @RequestMapping({"/deserialize"})
    public String JavaReadObject(@RequestParam("ser") String ser) throws Exception {
        byte[] bytes = Base64.getDecoder().decode(ser);
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        ois.readObject();
        ois.close();
        return "deserialization success";
    }
}