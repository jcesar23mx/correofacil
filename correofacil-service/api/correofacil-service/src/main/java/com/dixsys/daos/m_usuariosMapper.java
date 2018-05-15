package com.dixsys.daos;

import com.dixsys.models.m_usuarios;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by jcesar23mx on 10/05/2018.
 */
public class m_usuariosMapper implements ResultSetMapper<m_usuarios> {
    @Override
    public m_usuarios map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {
        return new m_usuarios(
                resultSet.getString("usuCuenta"),
                resultSet.getString("usuContrasena"),
                resultSet.getString("usuCorreo"),
                resultSet.getString("usuEstatus"),
                resultSet.getString("usuNombre"),
                resultSet.getString("usuImagen")
        );
    }
}
