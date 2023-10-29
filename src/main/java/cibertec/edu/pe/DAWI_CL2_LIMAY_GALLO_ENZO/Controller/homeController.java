package cibertec.edu.pe.DAWI_CL2_LIMAY_GALLO_ENZO.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {
    @GetMapping("/home")
    public String home(){ return "home";}
}
