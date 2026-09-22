import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class KundeRepo {
    Connection con;

    // question: when initializing DB should we create the "kunder" table if not
    // CREATE DATABASE IF NOT EXISTS og DROP TABLE IF EXISTS og CREATE TABLE
    // når vi bare laver de her opgaver
    // Hvordan kan jeg se hvad min primary key er. tror ikke at jeg har sat en da jeg lavede db
    // brugte bare "create table kunder (NAVN varchar(32), KREDIT float);" til at lave db
    // er det bedre at bruge "create table kunder (NAVN varchar(32), KREDIT float, PRIMARY KEY (navn));"
    KundeRepo(Connection con) {
        this.con = con;
    }

    void sletAltData() throws SQLException{
        String sql = "truncate table kunder";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.executeUpdate(); //hvor mange flere er der?
    }

    void loadTestData() throws SQLException{
        String sql = "INSERT INTO kunder VALUES('Jakob', -1799), ('Brian', 0)";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.executeUpdate();
    }

    ArrayList<Kunde> getKunde() throws SQLException {
        ArrayList<Kunde> list = new ArrayList<>();
        String sql = "SELECT * FROM kunder";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String navn = rs.getString("navn");
            Double kredit = rs.getDouble("kredit");
            list.add(new Kunde(navn, kredit));
        }
        return list;
    }

    Kunde getKundeFraNavn(String n) throws SQLException {
        String sql = "SELECT navn, kredit FROM kunder WHERE navn= ?";

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, n);
        ResultSet rs = ps.executeQuery();

        if (rs.next()){
            return new Kunde(rs.getString("navn"), rs.getDouble("kredit"));
        } else {
            System.out.println(String.format("Ingen kunde med navnet: %s", n));
            return null;
        }
    }

    ArrayList<Kunde> kunderMedMinus() throws SQLException{
        ArrayList<Kunde> list = new ArrayList<>();

        String sql = "SELECT navn, kredit FROM kunder WHERE kredit < 0";

        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()){
            String navn = rs.getString("navn");
            Double kredit = rs.getDouble("kredit");
            list.add(new Kunde(navn, kredit));
        }
        return list;


    }

    void addKunde(Kunde kunde) throws SQLException {
        String sql = "INSERT INTO kunder(navn, kredit) VALUES(?,?);";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, kunde.navn);
        ps.setDouble(2, kunde.kredit);
        ps.executeUpdate();
    }
}