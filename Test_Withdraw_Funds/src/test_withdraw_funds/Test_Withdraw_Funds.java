/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_withdraw_funds;

import chkSum.ChkSum_InquireCard;
import data.DataInquireCard;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author CPU01661-local
 */
public class Test_Withdraw_Funds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        // TODO code application logic here
        ChkSum_InquireCard chkSum_InquireCard = new ChkSum_InquireCard();
        chkSum_InquireCard.setCaller("MICODE");
        chkSum_InquireCard.setSecrectKey("a");
        DataInquireCard dataInquireCard = new DataInquireCard();
        dataInquireCard.setTid(Long.toString(System.currentTimeMillis()));
        chkSum_InquireCard.setData(dataInquireCard);
        String chkSum = chkSum_InquireCard.createCheckSum();
        
    }
    
}
