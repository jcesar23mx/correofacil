package com.dixsys.daos;

import com.dixsys.models.m_inbox;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by jcesar23mx on 15/05/2018.
 */
public class m_inboxMapper implements ResultSetMapper<m_inbox> {
    @Override
    public m_inbox map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {
        return new m_inbox(
                resultSet.getInt("inboxID"),
                resultSet.getInt("inboxUsuario"),
                resultSet.getString("inboxCategoria")
        );
    }
}
