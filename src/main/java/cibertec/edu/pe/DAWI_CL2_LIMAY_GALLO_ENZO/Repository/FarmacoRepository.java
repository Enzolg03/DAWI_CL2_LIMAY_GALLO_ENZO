package cibertec.edu.pe.DAWI_CL2_LIMAY_GALLO_ENZO.Repository;

import cibertec.edu.pe.DAWI_CL2_LIMAY_GALLO_ENZO.Model.bd.Farmaco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmacoRepository extends JpaRepository<Farmaco,
        Integer> {
}
