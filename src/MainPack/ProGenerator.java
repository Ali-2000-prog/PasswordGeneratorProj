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
public class ProGenerator implements Generator{
    private  String characters[][] ={
                {"a","alpha","s*p"},{"b","beta","nnn*a"},{"c","charlie","mmm*a"},{"d","delta","cr@a"},{"e","echo","zll*a"}, //a,b,c,d,e
                {"f","foxtrot","wf*a"},{"g","gamma","na*a"},{"h","harim","jhh*a"},{"i","Indiana","zi*a"},{"j","Jojo","zj*a"}, // f,g,h,i,j
                {"k","Kremlin","wk*a"},{"l","lima","wl*a"},{"m","Mow","m*a"},{"n","nexus","n*a"},{"o","omaima","o*a"},  //k,l,m,n,o
                {"p","pnt","p*a"},{"q","quacken","q*a"},{"r","reee","r*a"},{"s","shit","s*a"},{"t","tensant","Tt*a"},   //p,q,r,s,t
                {"u","umaima","iou*a"},{"v","vienna","ouo*a"},{"w","welco","sos*a"},{"x","xxx","zox*a"},{"y","Yoto","y*a"}, //u,v,w,x,y
                {"z","zee","oz*a"},                         //z
                {" "," "," "},
                // numbers
                {"0","sifar","andha"},{"1","pehla","uno"},{"10","dswan","Ace"},{"11","ghiarwan","hathi"},{"100","soo","qu*een"}, //0,1,2,3,4
                {"101","aiksooaik","a*k"},{"110","aiksoodss","ak"},{"111","aissooghayrahn","Nani"},{"1000","hazar","M*ooky"},{"1001","aikhazaaraik","jock*y"}, // 5,6,7,8,9
                // Capital Alphabets    
                {"Z","the","Zuba"},{"X","and","Xubab"},{"C","for","Cubac"},{"V","are","Valud"},{"B","but","Butae"},//A,B,C,D,E
                {"N","not","nubf"},{"M","all","Mubg"},{"L","any","Lubh"},{"K","can","Kubi"},{"J","had","Jubj"},    //F,G,H,I,J
                {"H","her","Hubk"},{"G","was","Gubl"},{"F","one","Fubm"},{"D","our","Dubn"},{"S","out","Subo"},    //K,L,M,N,O,
                {"A","day","Aubp"},{"Q","get","Qubq"},{"W","has","Wubr"},{"E","him","Eubs"},{"R","his","Rubt"},    //P,Q,R,S,T,
                {"T","how","Tubu"},{"Y","man","Yubv"},{"U","new","Uubw"},{"I","now","Iubx"},{"O","old","Ouby"},    //U,V,W,X,Y
                {"P","see","Pubz"}
    };
    
    @Override
    public String GeneratePassword(int len) {
        String code="";
        Random rand = new Random(); //instance of random class
        int upperbound = characters.length;
        
        for(int i=0;i<len;i++){
            int ran= rand.nextInt(upperbound);
            int ran2= rand.nextInt(3);
            code=code+characters[ran][ran2];
        }
//        System.out.println(code);
        return code;
    }
}
