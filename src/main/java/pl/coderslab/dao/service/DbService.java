package pl.coderslab.dao.service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbService {


    private static String dbName = "mydb";
    private static String dbUser = "root";
    private static String dbPass = "coderslab";

    public static Connection createConn() throws SQLException {
        try{
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        String connUrl = "jdbc:mysql://localhost:3306/"+dbName+"?useSSL=false&characterEncoding=utf8&allowPublicKeyRetrieval=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        return DriverManager.getConnection(connUrl, dbUser, dbPass);
    }

    /**
     * Execute insert query and return id of created element, if not then null
     * @param query
     * @param params
     * @return id or null
     * @throws SQLException
     */
    public static Integer insertIntoDatabase(String query, List<String> params) throws SQLException {

        try(Connection conn = createConn()){

            String[] generatedColumns = {"id"};
            PreparedStatement pst = conn.prepareStatement(query, generatedColumns);
            if(params != null) {
                int i = 1;
                for (String p : params) {
                    pst.setString(i++, p);
                }
            }

            pst.executeUpdate();

            ResultSet res = pst.getGeneratedKeys();

            if(res.next())
                return res.getInt(1);
            else
                return null;
        }catch (SQLException e ){
            throw e;
        }

    }

    public static List<String[]> getData(String query, List<String> params) throws SQLException{

        try(Connection conn = createConn()){

            //prepare query
            PreparedStatement st = getPreparedStatement(query, params, conn);
            //execute and get results
            ResultSet rs = st.executeQuery();

            //get columns from query
            ResultSetMetaData columns = rs.getMetaData();

            //prepare list of results
            List<String[]> result = new ArrayList<>();

            while(rs.next()){

                //New String array for row data
                String[] row = new String[columns.getColumnCount()];

                for(int j=1; j<=columns.getColumnCount(); j++){
                    row[j-1] = rs.getString( columns.getColumnName(j) );
                }

                result.add(row);
            }

            return result;

        }catch (SQLException e){
            throw e;
        }

    }

    private static PreparedStatement getPreparedStatement(String query, List<String> params, Connection conn) throws SQLException {
        PreparedStatement st = conn.prepareStatement(query);
        if(params!=null) {
            int i = 1;
            for (String p : params) {
                st.setString(i++, p);
            }
        }
        return st;
    }

    public static int executeQuery(String query, List<String> params)
            throws SQLException{
        try(Connection conn = createConn()) {
            PreparedStatement st = getPreparedStatement(query, params, conn);
            return st.executeUpdate();
        }catch(SQLException e){
            throw e;
        }
    }


}
