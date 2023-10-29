package cibertec.edu.pe.DAWI_CL2_LIMAY_GALLO_ENZO.Controller.administracion;

import cibertec.edu.pe.DAWI_CL2_LIMAY_GALLO_ENZO.Service.FarmacoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
@RequestMapping("/administracion/farmaco")
public class FarmacoController {

    private FarmacoService farmacoService;
    @GetMapping("/frmfarmaco")
    public String index(Model model){
        model.addAttribute("listafarmacos", farmacoService.listadoFarmacos());
        return "administracion/frmFarmaco";
    }
}
