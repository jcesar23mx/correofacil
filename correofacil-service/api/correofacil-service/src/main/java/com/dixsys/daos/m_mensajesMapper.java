package com.dixsys.daos;

import com.dixsys.models.m_mensajes;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class m_mensajesMapper implements ResultSetMapper<m_mensajes> {
    @Override
    public m_mensajes map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {
        return new m_mensajes(
                resultSet.getInt("msjID"),
                resultSet.getString("msjAsunto"),
                resultSet.getString("msjTexto"),
                resultSet.getString("msjFechaOficio"),
                resultSet.getString("msjFechaRecibido"),
                resultSet.getString("msjFechaCaptura"),
                resultSet.getInt("inboxID"),
                resultSet.getString("inboxName"),
                resultSet.getInt("sentID"),
                resultSet.getString("sentName"),
                resultSet.getInt("remitenteID"),
                resultSet.getString("rmtRazonSocial"),
                resultSet.getInt("msjEstatus")
        );
    }
}
