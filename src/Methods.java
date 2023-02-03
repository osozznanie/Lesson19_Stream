import java.io.*;

public class Methods implements Serializable {

    public void serialize(File file, Serializable object) throws Exception {
        OutputStream os = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(object);
        oos.close();
    }

    public Object deserialize(File file) throws Exception {
        InputStream is = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(is);
        Serializable ob = (Serializable) ois.readObject();
        ois.close();
        is.close();

        return ob;
    }
}
