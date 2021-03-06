import java.util.ArrayList;

/**
 * SEPT
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
    //private boolean indexValido;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<String>();
        //indexValido = true;
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(validIndex( index)) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(validIndex( index)) {
            files.remove(index);
        }
    }
    
    /**
     * mt para comprobar que el rango del par�metro se ajusta al atributo "files".
     */
    public void checkIndex(int index){
        if(index < 0 || index >= files.size()){
            System.out.println("Error el valor pasado no est� entre [0 y " + (files.size()-1)+ "]"   );
        }
    }
    
    /**
     *que devuelva un valor booleano en funci�n de si su par�metro entero es un �ndice v�lido o no para el atributo 
     *files
     */
    public boolean  validIndex(int index){
        boolean indexValido = true;
        if(index < 0 || index >= files.size()){
            indexValido = false;
        }
        return indexValido;
    } 
}

    













