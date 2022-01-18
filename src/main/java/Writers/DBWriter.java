package Writers;

import Parsers.LabTestSerology;

import java.util.HashSet;
import java.util.LinkedList;
import java.sql.*;

public class DBWriter implements Writer{

    @Override
    public void writeData(LinkedList t) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=LabResults");
            HashSet<LabTestSerology> labTestSerologies = (HashSet<LabTestSerology>) t.getFirst();
            int count = 1;
            for (LabTestSerology labTestSerology: labTestSerologies){
                addToBatch(labTestSerology, connection, count);
                count++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addToBatch(LabTestSerology labTestSerology, Connection connection, int count){
        String insertQuery = "INSERT INTO LabResults_SerologyKits VALUES(?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1,labTestSerology.getIDnum());
            preparedStatement.setInt(2,labTestSerology.getIDType());
            preparedStatement.setString(3, labTestSerology.getFirstName());
            preparedStatement.setString(4, labTestSerology.getLastName());
            preparedStatement.setDate(5,labTestSerology.getResultDate());
            preparedStatement.setDate(6,labTestSerology.getBirthDate());
            preparedStatement.setString(7, labTestSerology.getLabCode());
            preparedStatement.setString(8, labTestSerology.getStickerNumber());
            preparedStatement.setInt(9,labTestSerology.getAntidotes());
            preparedStatement.setInt(10,labTestSerology.getKitNumber());
            preparedStatement.execute();
            System.out.println("inserted " + count);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
