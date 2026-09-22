import java.sql.*;
import java.util.ArrayList;

public class Simpeltdatabaseeksempel {
    public static void main(String[] args) throws Exception {
        String db="jdbc:mysql://localhost:3306/SimpeltDatabaseeksempel";
        String user="root";
        String pw="Vrk38vwx";
        Connection connection=null;
        try {
            connection = DriverManager.getConnection(db, user, pw);
            System.out.println("Connection OK");
        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(1);
        }

        KundeRepo kundeRepo = new KundeRepo(connection);
        kundeRepo.sletAltData();
        kundeRepo.loadTestData();
        try {
            ArrayList<Kunde> kundeList = kundeRepo.getKunde();
            System.out.println(kundeList);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        kundeRepo.getKundeFraNavn("Mateusz");

        kundeRepo.addKunde(new Kunde("Mateusz", 67));
        System.out.println(kundeRepo.getKundeFraNavn("Mateusz"));

        System.out.println(kundeRepo.kunderMedMinus());

        kundeRepo.addKunde(new Kunde("Anna", -2000));
        System.out.println(kundeRepo.kunderMedMinus());

    }


}