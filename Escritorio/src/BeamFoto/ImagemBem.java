/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BeamFoto;

import java.io.File;
import java.nio.file.Path;

/**
 *
 * @author Kauezitos
 */
public class ImagemBem {
    private String filePath;
    private String nomeImage;
    private Path caminho;
    private File foto;


    public File getFoto() {
        return foto;
    }

    public void setFoto(File foto) {
        this.foto = foto;
    }
    

    public Path getCaminho() {
        return caminho;
    }

    public void setCaminho(Path caminho) {
        this.caminho = caminho;
    }
    

    public String getNomeImage() {
        return nomeImage;
    }

    public void setNomeImage(String nomeImage) {
        this.nomeImage = nomeImage;
    }
    
    

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    
}
