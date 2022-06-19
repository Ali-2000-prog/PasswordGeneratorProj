/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainPack;

/**
 *
 * @author Ali
 */
public class GenAdpt{
    Generator gn;
    private final String Mode;
    public GenAdpt(String Mode) {
        this.Mode=Mode;
        if(Mode.equalsIgnoreCase("noob")){
            gn= new NoobGenerator();
        }
        else if(Mode.equalsIgnoreCase("pro")){
            gn = new ProGenerator();
        }
    }
    
    String generatePW(int len){
        String pw = gn.GeneratePassword(len);
        return pw;
    }
}
