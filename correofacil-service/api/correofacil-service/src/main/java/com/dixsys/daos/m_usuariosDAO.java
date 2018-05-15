package com.dixsys.daos;

import com.dixsys.models.m_usuarios;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

/**
 * Created by jcesar23mx on 10/05/2018.
 */
@RegisterMapper(m_usuariosMapper.class)
public interface m_usuariosDAO {
    @SqlQuery("SELECT usuID,\n" +
            "    usuCuenta,\n" +
            "    usuContrasena,\n" +
            "    usuCorreo,\n" +
            "    usuFechaCreacion,\n" +
            "    usuEstatus,\n" +
            "    usuNombre,\n" +
            "    usuImagen\n" +
            "FROM usuarios;")
    List<m_usuarios> getm_usuarios();


    @SqlQuery("SELECT  usuCuenta,\n" +
            "    usuContrasena,\n" +
            "    usuCorreo,\n" +
            "    usuEstatus,\n" +
            "    usuNombre,\n" +
            "    usuImagen\n" +
            "FROM usuarios\n" +
            "WHERE usuCuenta = :usucuenta and usuContrasena = :usucontra;")
    m_usuarios loginUser(@Bind("usucuenta") String usucuenta,
                         @Bind("usucontra") String usucontra);

}
