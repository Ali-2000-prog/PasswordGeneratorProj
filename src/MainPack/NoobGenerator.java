/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainPack;

import java.util.Random;

/**
 *
 * @author Ali
 */
public class NoobGenerator implements Generator{
    private String characters[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"," ",
                                "0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P",
                                "Q","R","S","T","U","V","W","X","Y","Z",".","#","%","&","!",":"
                                };
    @Override
    public  String GeneratePassword(int len) {
        String code="";
        Random rand = new Random(); //instance of random class
        int upperbound = characters.length;
        for(int i=0;i<len;i++){
            int ran= rand.nextInt(upperbound);
            code=code+characters[ran];
        }
//        System.out.println(code);
        return code;
    }
}
