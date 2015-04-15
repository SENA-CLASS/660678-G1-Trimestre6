package edu.co.sena.ejemplo1.relaciones.unoamuchos;

import edu.co.sena.ejemplo1.relaciones.unoamuchos.Estudiante3;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-10T11:57:50")
@StaticMetamodel(Materia3.class)
public class Materia3_ { 

    public static volatile SingularAttribute<Materia3, String> descripcion;
    public static volatile SingularAttribute<Materia3, String> idMateria;
    public static volatile CollectionAttribute<Materia3, Estudiante3> estudiantes;
    public static volatile SingularAttribute<Materia3, String> nombre;

}