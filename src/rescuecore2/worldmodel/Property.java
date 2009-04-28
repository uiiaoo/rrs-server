package rescuecore2.worldmodel;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

/**
   Interface for the properties that make up an entity.
 */
public interface Property {
    /**
       Get the ID number of this property.
       @return The ID of this property.
     */
    int getID();

    /**
       Does this property have a defined value?
       @return True if a value has been set for this property, false otherwise.
     */
    boolean isDefined();

    /**
       Write this property to a stream.
       @param out The stream to write to.
       @throws IOException If the write fails.
     */
    void write(OutputStream out) throws IOException;

    /**
       Read this property from a stream.
       @param in The stream to read from.
       @throws IOException If the read fails.
     */
    void read(InputStream in) throws IOException;
}