package Homework40;

/*import java.beans.XMLDecoder; */
import java.beans.XMLEncoder;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class User {
    private int id;
    private String email;
    private String password;

    public void setId(int id){ this.id = id; };
    public int getId() { return this.id; }
    public void setEmail(String email){ this.email = email; };
    public String getEmail() { return this.email; }
    public void setPassword(String password){ this.password = password; };
    public String getPassword() { return this.password; }

    @Override
    public String toString(){ return this.id + " " + this.email + " " + this.password; }

    public void serializeXml(String xmlFile) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream(xmlFile);
        XMLEncoder s = new XMLEncoder(fos);
        s.writeObject(this);
        s.close();
    }
}

/*
    public static User deserializeXml(String xmlFile) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(xmlFile);
        XMLDecoder objIn = new XMLDecoder(fis);
        User u = (User)objIn.readObject();
        return u;
    }
}
*/
