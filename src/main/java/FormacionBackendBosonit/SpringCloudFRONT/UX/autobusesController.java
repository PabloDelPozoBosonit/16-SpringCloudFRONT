package FormacionBackendBosonit.SpringCloudFRONT.UX;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class autobusesController {


    @GetMapping("/")
    public String index() {
        return "autobuses";
    }

}
