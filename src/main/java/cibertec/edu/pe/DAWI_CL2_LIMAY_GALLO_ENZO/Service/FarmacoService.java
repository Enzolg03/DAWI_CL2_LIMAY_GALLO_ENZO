package cibertec.edu.pe.DAWI_CL2_LIMAY_GALLO_ENZO.Service;

import cibertec.edu.pe.DAWI_CL2_LIMAY_GALLO_ENZO.Model.bd.Farmaco;
import cibertec.edu.pe.DAWI_CL2_LIMAY_GALLO_ENZO.Repository.FarmacoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FarmacoService {

    private FarmacoRepository farmacoRepository;

    public List<Farmaco> listadoFarmacos(){
        return farmacoRepository.findAll();
    }

    public boolean registrarFarmaco(Farmaco estado){
        return farmacoRepository.save(estado)!=null;
    }

    public void eliminarFarmaco(Integer idestado){
        farmacoRepository.deleteById(idestado);
    }
}

